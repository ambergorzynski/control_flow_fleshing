import argparse 
import os
import subprocess

from pathlib import Path

from fuzzflesh.common.utils import Lang, Compiler
from fuzzflesh.graph_generator import generator
from fuzzflesh.cfg import CFG


def main():
    parser = argparse.ArgumentParser()

    # Common parser args
    parser.add_argument("action", choices=['gen', 'run'])

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
    parser.add_argument("-size", 
                        type=int,
                        default = 500,
                        help = 'Maximum graph size.')    
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
    parser.add_argument("-no_annotations", 
                        action=argparse.BooleanOptionalAction,
                        help = 'Do not add annotated edges to the graph.')
    parser.add_argument("-dirs", 
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
    base_dir : Path = Path(args.base/out)
    graph_dir : Path = Path(base_dir, 'graphs')
    path_dir : Path = Path(base_dir, 'paths')

    # Create folders
    base_dir.mkdir(exist_ok=True)
    graph_dir.mkdir(exist_ok=True)
    path_dir.mkdir(exist_ok=True)

    if not create_folders(base_dir, language):
        return(1)

    # Generate graph
    generate_graphs(graph_filepath = graph_dir,
                n_graphs = args.n_graphs,
                min_graph_size = args.min_size,
                max_graph_size = args.max_size,
                min_successors = args.min_successors, 
                max_successors = args.max_successors, 
                graph_generation_approach = args.graph_gen, 
                add_annotations= args.add_annotations,
                seed = None)

    # Generate paths for each graph
    for i in range(args.n_graphs):
        generate_path(graph_number = i,
                graph_filepath = graph_dir, 
                path_filepath = path_dir,
                graph_name = f'graph_{i}.p', 
                n_paths = params.n_paths, 
                max_path_length = args.max_path_length, 
                seed = None)

    # Flesh graphs

    # Run tests

    # Cleanup
    
def create_folders(base_dir : Path, language : Lang) -> bool:

    print('Setting up folders...')

    match language:
        case Lang.JAVABC:
            return create_javabc_folders(base_dir)
        case Lang.C:
            return create_c_folders(base_dir)
    
    return False

def create_javabc_folders(base_dir : Path, graph_dir : Path, path_dir : Path) -> bool:

    Path(base_dir,'out/output').mkdir(exist_ok=True)
    Path(base_dir,'out/testing').mkdir(exist_ok=True)

    # Put the wrapper in the relevant folder
    wrapper_dir = Path(__file__).parent.parent.resolve() / 'wrappers'
    cmd = ['cp',
        f'{wrapper_dir}/WrapperNoReflection.java',
        f'{base_dir}/WrapperNoReflection.java']
    
    result = subprocess.run(cmd)

    return True if result.returncode != 0 else False
    
if __name__ == "__main__":
    main()
