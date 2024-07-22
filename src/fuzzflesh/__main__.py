import argparse 
import os
import subprocess
import pickle
import json
from pathlib import Path

from fuzzflesh.common.utils import Lang, Compiler, Program, RunnerReturn
from fuzzflesh.graph_generator.generator import generate_graph
from fuzzflesh.program_generator.flesher import ProgramFlesher
from fuzzflesh.program_generator.javabc.javabc_generator import JavaBCProgramGenerator
from fuzzflesh.program_generator.c.c_generator import CProgramGenerator
from fuzzflesh.harness.runner import Runner
from fuzzflesh.harness.javabc.javabc_runner import JavaBCRunner
from fuzzflesh.harness.c.c_runner import CRunner
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
    javabc_parser.add_argument("jasmin", 
                        type=str,
                        help="Path to Jasmin to be used")
    javabc_parser.add_argument("json",
                        type=str,
                        help="Path to json simple jar")
    javabc_parser.add_argument("-compiler_path",
                        default = None, 
                        type=str, 
                        help="Path to the (de)compiler under test. Not required for testing JIT compiler e.g. HotSpot where the software under test is in the JVM path")  
    javabc_parser.add_argument("--reflection", 
                        action=argparse.BooleanOptionalAction,
                        help='Use reflection instead of static compilation.')

    # C parser args
    c_parser = subparsers.add_parser('c',
                    help='C help')
    c_parser.add_argument("compiler",
                    choices=['llvm','gcc','ghidra','g++'],
                    help='Compiler / decompiler toolchain under test.')
    c_parser.add_argument("compiler_path",
                    help='Path to C compiler.')
    c_parser.add_argument("--decompiler_path",
                    default = None,
                    help = 'Path to decompiler under test.')
    
    args = parser.parse_args()

    language : Lang = Lang[args.language.upper()]
    compiler : Compiler = get_compiler(args.compiler) 
    base_dir : Path = Path(args.base, 'out')
    graph_dir : Path = base_dir
    wrapper_dir = Path(__file__).parent.parent.resolve() / 'fuzzflesh' / 'wrappers'

    # Validity check args
    if not validity_check(args, language):
        print('Arguments invalid!')
        exit()

    # Create folders
    base_dir.mkdir(exist_ok=True)
    graph_dir.mkdir(exist_ok=True)

    if not create_folders(args, base_dir, language, wrapper_dir):
        return(1)
    
    for graph_id in range(args.graphs):
    
        if args.action == 'gen':
            gen(args, language, graph_dir, graph_id)

        elif args.action == 'run':
            run(args, language, graph_id, base_dir)

        elif args.action == 'fuzz':
            (programs, paths) = gen(args, language, graph_dir, graph_id)
            run(args, language, compiler, programs, paths, base_dir)
            #TODO:Cleanup as we go for fuzzing

def gen(args, language : Lang, graph_dir : Path, graph_id : int,) -> tuple[Path, list[Path]]:
    
    # Generate graph
    print(f'Generating graph {graph_id}...')

    filepath = Path(graph_dir, f'graph_{graph_id}')
    
    filepath.mkdir(exist_ok=True)
    
    graph = generate_graph(min_graph_size = args.min_size,
                max_graph_size = args.max_size,
                min_successors = args.min_successors, 
                max_successors = args.max_successors, 
                graph_generation_approach = args.graph_gen, 
                add_annotations = False if args.no_annotations else True,
                seed = None)
    
    graph_path = f'{filepath}/graph_{graph_id}.p'
    pickle.dump(graph, open(graph_path, "wb"))

    # Generate paths for each graph
    path_paths = []
    paths = []

    for p in range(args.paths):

        print(f'Generating path {p}...')

        path = graph.generate_path(max_path_length = args.max_path_length)
        
        path_path = f'{filepath}/inputs_graph_{graph_id}_path_{p}.json'

        with open(path_path, 'w') as f:
                json.dump(path.to_dict(), f, indent=2)

        paths.append(path)
        path_paths.append(path_path)

    # Flesh graphs
    flesher : ProgramFlesher = get_flesher(args, language, graph)

    # If directions are known at compile time, then flesh separate programs for each path
    prog_paths = []
    
    if args.dirs:
        for (p, path) in enumerate(paths):
            print(f'Fleshing graph {graph_id} with path {p}...')
            program : Program = flesher.fleshout_with_dirs(path.directions)
            prog_path = program.get_program_path(filepath,f'prog_{graph_id}_path_{p}')
            program.write_to_file(prog_path)
            prog_paths.append(prog_path)
            
            
    # If directions are unknown, then only flesh one program that accepts a runtime direction array
    else:
        print(f'Fleshing graph {graph_id}...')
        program : Program = flesher.fleshout_without_dirs()
        prog_path = program.get_program_path(filepath,f'prog_{graph_id}')
        program.write_to_file(prog_path)   
        prog_paths.append(prog_path)

    return (prog_paths, path_paths)

def run(args, language : Lang, compiler : Compiler, programs : list[Path], paths : list[Path], base_dir : Path):

    runner : Runner = get_runner(args, language, compiler, base_dir)

    if args.dirs:
        assert(len(programs)==len(paths))
    
    for (i, prog) in enumerate(programs):

        # Compile
        compile_result = runner.compile(program=prog)
        print(f'Result: {compile_result}')

        if compile_result == RunnerReturn.COMPILATION_FAIL:
            return

        if args.dirs:
            exe_result = runner.execute(program=prog, path=paths[i])

            print(f'Result: {exe_result}')

        else:
            for path in paths:

                exe_result = runner.execute(program=prog, path=path)
            
                print(f'Result: {exe_result}')

    
def create_folders(args, base_dir : Path, language : Lang, wrapper_dir : Path) -> bool:

    print('Setting up folders...')

    match language:
        case Lang.JAVABC:
            return create_javabc_folders(base_dir, args.reflection, wrapper_dir)
        case Lang.C:
            return create_c_folders(base_dir, wrapper_dir)
    
    return False

def create_javabc_folders(base_dir : Path, reflection: bool, wrapper_dir : Path) -> bool:

    if reflection:
        testing_dir = Path(base_dir, 'testing')
        testing_dir.mkdir(exist_ok=True)
        wrapper = 'Wrapper'

        # Interface required for reflection
        cmd = ['cp',
            f'{wrapper_dir}/TestCaseInterface.java',
            f'{testing_dir}/']

        result_ifc = subprocess.run(cmd)

        if result_ifc.returncode != 0:
            return False
    
    else:
        testing_dir = base_dir
        wrapper = 'WrapperNoReflection'

    # Wrapper required for all cases
    cmd = ['cp',
        f'{wrapper_dir}/{wrapper}.java',
        f'{testing_dir}/Wrapper.java']
    
    result = subprocess.run(cmd)

    return True if result.returncode == 0 else False

def create_c_folders(base_dir : Path, wrapper_dir : Path):

    #TODO: add dynamic directions wrapper

    wrapper = 'WrapperStatic'

    cmd = ['cp',
        f'{wrapper_dir}/{wrapper}.cpp',
        f'{base_dir}/Wrapper.cpp']
    
    result = subprocess.run(cmd)

    return True if result.returncode == 0 else False

def get_flesher(args, language : Lang, cfg : CFG) -> ProgramFlesher:

    match language:
        case Lang.JAVABC:
            return JavaBCProgramGenerator(cfg, args.dirs, args.reflection)

        case Lang.C:
            return CProgramGenerator(cfg, args.dirs)

    return None


def get_runner(args, language : Lang, compiler : Compiler, base_dir : Path) -> Runner:

    match language:
        case Lang.JAVABC:
            return JavaBCRunner(compiler, 
                        Path(args.jvm), 
                        Path(args.jasmin),
                        Path(args.json),
                        base_dir,
                        Path(args.compiler_path),
                        args.reflection)
        case Lang.C:
            return CRunner(compiler,
                        Path(args.compiler_path),
                        base_dir,
                        args.dirs)
    return None

def paths_to_dict(all_paths : list[Route]) -> dict:

    return {f'path_id_{i}' : route.to_dict() for i, route in enumerate(all_paths)}

def validity_check(args, language):

    if language == Lang.JAVABC:
        if args.compiler in set(['cfr','fernflower','procyon']) and args.compiler_path is None:
            return False
    
    if language == Lang.C:
        if args.compiler in set(['ghidra']) and args.decompiler_path is None:
            return False
    return True

def get_compiler(compiler : str) -> Compiler:
    if compiler == 'g++':
        return Compiler.GPP
    else:
        return Compiler[args.compiler.upper()]

if __name__ == "__main__":
    main()
