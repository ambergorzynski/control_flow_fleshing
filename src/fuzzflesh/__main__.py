import argparse 
import os
import subprocess
import pickle
import json
from pathlib import Path

from fuzzflesh.common.utils import Lang, Compiler, Program
from fuzzflesh.graph_generator.generator import generate_graph
from fuzzflesh.program_generator.flesher import ProgramFlesher
from fuzzflesh.program_generator.javabc.javabc_generator import JavaBCProgramGenerator
from fuzzflesh.harness.runner import Runner
from fuzzflesh.harness.javabc.javabc_runner import JavaBCRunner
from fuzzflesh.cfg.CFG import CFG, Route


def main():
    parser = argparse.ArgumentParser()

    # Common parser args
    parser.add_argument("action", choices=['gen', 'run', 'fuzz'],
                        help='''Gen produces graphs and paths. 
                                Run runs existing graphs and paths.
                                Fuzz combines gen and run.''')
    
    parser.add_argument("-base",
                        type = str,
                        default = os.getcwd(),
                        help = 'Base path for output.')
    parser.add_argument("-graphs", 
                        type=int,
                        default = 1,
                        help = 'Number of graphs.')
    parser.add_argument("-paths", 
                        type=int,
                        default = 1,
                        help = 'Number of paths.')  
    parser.add_argument("-max_size", 
                        type=int,
                        default = 500,
                        help = 'Maximum graph size.')   
    parser.add_argument("-min_size", 
                        type=int,
                        default = 3,
                        help = 'Minimum graph size.')     
    parser.add_argument("-graph_gen", 
                        choices=['e-r','grow'],
                        default = 'e-r',
                        help = 'Graph generation approach: Erdős–Rényi (e-r) or growing.')
    parser.add_argument("-min_successors", 
                        type=int, 
                        default=0,
                        help="min successor nodes added during graph generation")
    parser.add_argument("-max_successors", 
                        type=int, 
                        default=3,
                        help="max successor nodes added during graph generation")
    parser.add_argument("-max_path_length", 
                        type=int,
                        default=900,
                        help = 'Maximum path length.')
    parser.add_argument("--no_annotations", 
                        action=argparse.BooleanOptionalAction,
                        help = 'Do not add annotated edges to the graph.')
    parser.add_argument("--dirs", 
                        action=argparse.BooleanOptionalAction,
                        help = 'Directions are known at compile time.')
    parser.add_argument("--no_tidy",action=argparse.BooleanOptionalAction,
                        help="specifies whether to remove files if test passes")

    # Subparser for language-specific arguments
    subparsers = parser.add_subparsers(dest='language',
                        help='Language to run',
                        required=True)

    # Java bytecode parser args
    javabc_parser = subparsers.add_parser('javabc',
                    help='Java bytecode help')
    javabc_parser.add_argument("compiler",
                        choices=['cfr','fernflower','procyon','hotspot','graalvm'],
                        help='Compiler / decompiler toolchain under test.')
    javabc_parser.add_argument("jvm", 
                        type=str,
                        help="Path to JVM to be used")
    parser.add_argument("jasmin", 
                        type=str,
                        help="Path to Jasmin to be used")
    parser.add_argument("compiler_path", 
                        type=str, 
                        help="Path to the (de)compiler")  
    parser.add_argument("-reflection", 
                        action=argparse.BooleanOptionalAction,
                        help='Use reflection instead of static compilation.')
    
    args = parser.parse_args()

    language : Lang = Lang[args.language.upper()]
    compiler : Compiler = Compiler[args.compiler.upper()]
    base_dir : Path = Path(args.base, 'out')
    graph_dir : Path = Path(base_dir, 'graphs')

    # Create folders
    base_dir.mkdir(exist_ok=True)
    graph_dir.mkdir(exist_ok=True)

    if not create_folders(base_dir, language):
        return(1)
    
    if args.action == 'gen':
        gen(args, language, graph_dir)

    elif args.action == 'run':
        run(args, language)

    elif args.action == 'fuzz':
        gen(args, language, graph_dir)
        run(args, language)

def gen(args, language, graph_dir):
    
    # Generate graphs
    for g in range(args.graphs):

        filepath = Path(graph_dir, f'graph_{g}')
        
        filepath.mkdir(exist_ok=True)
        
        graph = generate_graph(min_graph_size = args.min_size,
                    max_graph_size = args.max_size,
                    min_successors = args.min_successors, 
                    max_successors = args.max_successors, 
                    graph_generation_approach = args.graph_gen, 
                    add_annotations = False if args.no_annotations else True,
                    seed = None)
        
        pickle.dump(graph, open(f'{filepath}/graph_{g}.p', "wb"))

        # Generate paths for each graph
        all_paths = []

        for p in range(args.paths):

            path = graph.generate_path(max_path_length = args.max_path_length)

            all_paths.append(path)

        with open(f'{filepath}/inputs_graph_{g}_path_{p}.json', 'w') as f:
                json.dump(paths_to_dict(all_paths), f, indent=2)

        # Flesh graphs
        flesher : ProgramFlesher = get_flesher(language, graph, args.dirs)

        # If directions are known at compile time, then flesh separate programs for each path
        if args.dirs:
            for (p, path) in enumerate(all_paths):
                program : Program = flesher.fleshout_with_dirs(path.directions)
                program.write_to_file(filepath, filename=f'prog_{g}_path_{p}')
                
                
        # If directions are unknown, then only flesh one program that accepts a runtime direction array
        else:
            program : Program = flesher.fleshout_without_dirs()
            program.write_to_file(filepath, filename=f'prog_{g}')

def run(args, language):

    runner : Runner = get_runner(language, args.dirs)
    
    # If directions are known at compile time, then run separate programs for each path

    # If directions are unknown, then run one program with different inputs

    # Cleanup
    
def create_folders(base_dir : Path, language : Lang) -> bool:

    print('Setting up folders...')

    match language:
        case Lang.JAVABC:
            return create_javabc_folders(base_dir)
        case Lang.C:
            return create_c_folders(base_dir)
    
    return False

def create_javabc_folders(base_dir : Path) -> bool:

    Path(base_dir,'output').mkdir(exist_ok=True)
    Path(base_dir,'testing').mkdir(exist_ok=True)

    # Put the wrapper in the relevant folder
    wrapper_dir = Path(__file__).parent.parent.resolve() / 'fuzzflesh' / 'wrappers'
    cmd = ['cp',
        f'{wrapper_dir}/WrapperNoReflection.java',
        f'{base_dir}/WrapperNoReflection.java']
    
    result = subprocess.run(cmd)

    return True if result.returncode == 0 else False

def create_c_folders(base_dir : Path):
    pass

def get_flesher(language : Lang, cfg : CFG, dirs_known : bool) -> ProgramFlesher:

    match language:
        case Lang.JAVABC:
            return JavaBCProgramGenerator(cfg, dirs_known)

    return None


def get_runner(language : Lang) -> Runner:

    match language:
        case Lang.JAVABC:
            return JavaBCRunner()

    return None

def paths_to_dict(all_paths : list[Route]) -> dict:

    return {f'path_id_{i}' : route.to_dict() for i, route in enumerate(all_paths)}
        
if __name__ == "__main__":
    main()
