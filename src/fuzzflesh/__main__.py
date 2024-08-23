import argparse 
import os
import glob
import subprocess
import pickle
import json
from pathlib import Path

from fuzzflesh.common.utils import Lang, Compiler, Program, RunnerReturn
from fuzzflesh.graph_generator.generator import generate_graph

from fuzzflesh.program_generator.flesher import ProgramFlesher
from fuzzflesh.program_generator.javabc.javabc_generator import JavaBCProgramGenerator
from fuzzflesh.program_generator.c.c_generator import CProgramGenerator
from fuzzflesh.program_generator.cil.cil_generator import CILProgramGenerator

from fuzzflesh.harness.runner import Runner
from fuzzflesh.harness.javabc.javabc_runner import JavaBCRunner
from fuzzflesh.harness.c.c_runner import CRunner
from fuzzflesh.harness.cil.cil_runner import CILRunner
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
    parser.add_argument("--tidy",action=argparse.BooleanOptionalAction,
                        help="Specifies whether to remove files if test passes")

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
    javabc_parser.add_argument("-decompiler_path",
                        default = None, 
                        type=str, 
                        help="Path to the decompiler under test.")  
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
    c_parser.add_argument("include_path",
                    help='Path to json.hpp include file.')
    c_parser.add_argument("--headless_path",
                    help='Path to headless analyser Ghidra script.')
    c_parser.add_argument("--decompiler_path",
                    default = None,
                    help = 'Path to decompiler under test.')
    
    # CIL parser args
    cil_parser = subparsers.add_parser('cil',
                    help='CIL help')
    cil_parser.add_argument("compiler",
                    choices=['ilspy'],
                    help='Compiler / decompiler toolchain under test.')
    cil_parser.add_argument("decompiler_path",
                    default = None,
                    help = 'Path to decompiler under test.')
    
    args = parser.parse_args()

    language : Lang = Lang[args.language.upper()]
    compiler : Compiler = get_compiler(args.compiler) 
    base_dir : Path = Path(args.base, 'out')
    graph_dir : Path = base_dir
    wrapper_dir = Path(__file__).parent.parent.resolve() / 'fuzzflesh' / 'wrappers'  

    log_path = Path(base_dir,'log.txt')
    if log_path.exists():
        log_path.unlink()
  

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
            result = run(args, language, compiler, programs, paths, base_dir, Path(graph_dir, f'graph_{graph_id}.p'))

        elif args.action == 'fuzz':
            (graph, programs, paths) = gen(args, language, graph_dir, graph_id)
            run(args, language, compiler, programs, paths, base_dir, graph)

def gen(args, 
    language : Lang, 
    graph_dir : Path, 
    graph_id : int,) -> tuple[Path, Path, list[Path]]:
    
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
    graph.save_graph(graph_path)

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

    return (Path(graph_path), prog_paths, path_paths)

def run(args, language : Lang, 
        compiler : Compiler, 
        programs : list[Path], 
        paths : list[Path], 
        base_dir : Path, 
        graph_path : Path):

    log_path = Path(base_dir,'log.txt')

    runner : Runner = get_runner(args, language, compiler, base_dir)

    # Indicator for whether any program derived from this particular graph has failed
    graph_has_failed : bool = False

    if args.dirs:
        assert(len(programs)==len(paths))
    
    for (i, prog) in enumerate(programs):
        log(log_path, f'Program: {prog}')

        # Compile
        compile_result = runner.compile(program=prog,path=paths[i])
        print(f'Result: {compile_result}')
        log(log_path, f'Compile result: {compile_result}')

        if compile_result != RunnerReturn.SUCCESS:
            print('Compilation fail!')
            graph_has_failed=True
            continue

        # Execute a single path with a single program
        # We pass the path so that the runner can compare the expected and actual result
        if args.dirs:
            exe_result = runner.execute(program=prog, path=paths[i])
            print(f'Result: {exe_result}')
            log(log_path, f'Execution result: {exe_result}')

            if exe_result == RunnerReturn.SUCCESS and args.tidy:
                delete_program(prog, language)
                delete_path(path=paths[i])

            else:
                graph_has_failed = True

        # Execute multiple paths with a single program
        else:
            for path in paths:

                exe_result = runner.execute(program=prog, path=path)
                print(f'Result: {exe_result}')
                log(log_path,f'Execution result: {exe_result}')

                if exe_result == RunnerReturn.SUCCESS and args.tidy:
                    delete_path(path)

                else:
                    graph_has_failed = True

            if not graph_has_failed:
                delete_program(prog, language)


    # If no programs associated with this graph fail, then tidy up by removing the graph
    if args.tidy and not graph_has_failed:
        delete_graph(graph_path)


def delete_program(program : Path, language : Lang):
    '''
        Deletes program and associated language-specific files
    '''
    match language:
        case Lang.JAVABC:
            cmd = ['rm', '-rf', f'{str(program.parent)}/{str(program.stem)}']
            result = subprocess.run(cmd)

            cmd = ['rm', '-rf', f'{str(program.parent)}/{str(program.stem)}.j']
            result = subprocess.run(cmd)

        case Lang.C:
            files_to_delete = glob.glob(f'{str(program.parent)}/*{str(program.stem)}*')

            cmd = ['rm', '-f']
            cmd.extend(files_to_delete)

            result = subprocess.run(cmd)

def delete_graph(graph : Path):
    ''' 
        Deletes graph and graph folder
    '''
    cmd = ['rm', '-rf', str(graph.parent)]
    subprocess.run(cmd)

def delete_path(path : Path):
    cmd = ['rm', '-f', str(path)]
    subprocess.run(cmd)
    
def create_folders(args, base_dir : Path, language : Lang, wrapper_dir : Path) -> bool:

    print('Setting up folders...')

    match language:
        case Lang.JAVABC:
            return create_javabc_folders(base_dir, args.reflection, wrapper_dir, args.dirs)
        case Lang.C:
            return create_c_folders(base_dir, wrapper_dir, args.dirs)
        case Lang.CIL:
            return create_cil_folders(base_dir, wrapper_dir, args.dirs)
    
    return False

def create_javabc_folders(base_dir : Path, reflection: bool, wrapper_dir : Path, dirs) -> bool:

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
        if dirs:
            wrapper = 'WrapperNoReflectionStatic'
        else:
            wrapper = 'WrapperNoReflection'

    # Wrapper required for all cases
    cmd = ['cp',
        f'{wrapper_dir}/{wrapper}.java',
        f'{testing_dir}/Wrapper.java']
    
    result = subprocess.run(cmd)

    return True if result.returncode == 0 else False

def create_c_folders(base_dir : Path, wrapper_dir : Path, dirs_known : bool):

    wrapper = 'WrapperStatic' if dirs_known else 'WrapperDynamic'

    cmd = ['cp',
        f'{wrapper_dir}/{wrapper}.cpp',
        f'{base_dir}/Wrapper.cpp']
    
    result = subprocess.run(cmd)

    return True if result.returncode == 0 else False

def create_cil_folders(base_dir : Path, wrapper_dir : Path, dirs_known : bool):

    cmd = ['cp',
           f'{wrapper_dir}/Wrapper.cs',
           f'{base_dir}/Wrapper.cs']

    result = subprocess.run(cmd)

    return True if result.returncode == 0 else False


def get_flesher(args, language : Lang, cfg : CFG) -> ProgramFlesher:

    match language:
        case Lang.JAVABC:
            return JavaBCProgramGenerator(cfg, args.dirs, args.reflection)

        case Lang.C:
            return CProgramGenerator(cfg, args.dirs)
        
        case Lang.CIL:
            return CILProgramGenerator(cfg, args.dirs)

    return None


def get_runner(args, language : Lang, compiler : Compiler, base_dir : Path) -> Runner:

    match language:
        case Lang.JAVABC: 
            
            decompiler_path = Path(args.decompiler_path) if args.decompiler_path else None
            
            return JavaBCRunner(compiler, 
                        Path(args.jvm), 
                        Path(args.jasmin),
                        Path(args.json),
                        base_dir,
                        decompiler_path,
                        args.reflection)
        case Lang.C:
            decompiler_path = Path(args.decompiler_path) if args.decompiler_path != None else None

            return CRunner(compiler,
                        Path(args.compiler_path),
                        base_dir,
                        Path(args.include_path),
                        args.dirs,
                        args.headless_path,
                        decompiler_path)
        
        case Lang.CIL:

            return CILRunner(compiler,
                        Path(args.decompiler_path),
                        base_dir,
                        args.dirs)
        
    return None

def paths_to_dict(all_paths : list[Route]) -> dict:

    return {f'path_id_{i}' : route.to_dict() for i, route in enumerate(all_paths)}

def validity_check(args, language):

    if language == Lang.JAVABC:
        if args.compiler in set(['cfr','fernflower','procyon']) and args.decompiler_path is None:
            return False
    
    if language == Lang.C:
        if args.compiler in set(['ghidra']) and args.decompiler_path is None:
            return False
    return True

def get_compiler(compiler : str) -> Compiler:
    if compiler == 'g++':
        return Compiler.GPP
    else:
        return Compiler[compiler.upper()]

def log(log_path : Path, comment : str):
    with open(log_path,'a') as f:
        f.write(comment + '\n')

if __name__ == "__main__":
    main()
