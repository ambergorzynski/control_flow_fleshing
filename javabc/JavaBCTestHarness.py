import argparse 
import sys
import networkx as nx
import subprocess

from datetime import datetime

#TODO: convert graph generator etc to package

sys.path.append('../control_flow_fleshing')

from GraphGenerator import *
from CFG import *
from JavaBCProgramGenerator import *
from JavaBCRunner import *
from Utils import *

def main():

    # parse args
    parser = argparse.ArgumentParser()

    parser.add_argument("n_graphs", type=int)
    parser.add_argument("n_paths", type=int)
    parser.add_argument("folder", type=str)
    parser.add_argument("jvm", type=str,
                        help="path to JVM to be used")
    parser.add_argument("jasmin", type=str,
                        help="path to Jasmin to be used")
    parser.add_argument("-dir", type=str, default="unknown",
                        help="specifies whether directions array is known or unknown at compile time [NOT IN USE]")
    parser.add_argument("-lab", type=bool, default=False,
                        help="True for lab computer, False for mac; used for different folder set-ups and compilation cmds")
    parser.add_argument("-graph", type=str, default="2",
                        help="specifies graph generation approach from '1', '2' or 'xml'.")
    parser.add_argument("-add_annotations", type = bool, default = True,
                        help='specifies whether graph approach should include annotations')
    parser.add_argument("-n_annotations", type = int, default = -1,
                        help="specifies the number of annotations to add. Default is to add 1/5 of the number of nodes in the graph")
    parser.add_argument("-ref", type=bool, default=False,
                        help="specifies whether the test cases should use reflection or be statically compiled")
    parser.add_argument("-decompiler", type=str, default=None,
                        help="specifies which decompiler is in use from 'cfr', 'fernflower'")
    parser.add_argument("-decompiler_path", type=str, default=None,
                        help="specifies the path to the decompiler")
    parser.add_argument("-successors", type=int, default=3,
                        help="max successor nodes added during graph generation")
    args = parser.parse_args()

    
    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    basePath = f'javabc/fuzzing/{args.folder}' if not args.lab else f'/vol/bitbucket/agg22/cfg/javabc/fuzz/{args.folder}' 
    
    # parsing args
    if(args.graph == 'xml'):
        g = 3
    else:
        g = int(args.graph)

    if args.decompiler == 'cfr':
        decompiler = Decompiler.CFR
    elif args.decompiler == 'fernflower':
        decompiler = Decompiler.FERNFLOWER
    else:
        decompiler = None

    filepaths = FilePaths(jvm = args.jvm,
                            jasmin = args.jasmin,
                            base = basePath,
                            graph_filepath = f'{basePath}/graphs',
                            src_filepath = f'{basePath}/src',
                            program_filepath= f'{basePath}/src/testing',
                            path_filepath = f'{basePath}/src/paths',
                            output_filepath = f'{basePath}/output',
                            results_name = f'results_{time}',
                            bug_results_name = f'bugs_{time}',
                            decompiler_path= args.decompiler_path)

    params = FuzzingParams(
                            n_graphs = args.n_graphs,
                            n_paths = args.n_paths,
                            min_graph_size = 10,
                            max_graph_size = 500,
                            min_successors = 1,
                            max_successors = args.successors,
                            graph_approach = g,
                            add_annotations = args.add_annotations,
                            n_annotations = args.n_annotations,
                            max_path_length = 900,
                            n_function_repeats=5000,
                            with_reflection=args.ref,
                            decompiler = decompiler)
    
    # Setup
    create_folders(basePath)
  
    # Step 1 : generate graphs
    generate_graphs(graph_filepath = filepaths.graph_filepath,
                    n_graphs = params.n_graphs,
                    min_graph_size = params.min_graph_size,
                    max_graph_size = params.max_graph_size,
                    min_successors = params.min_successors, 
                    max_successors = params.max_successors, 
                    graph_generation_approach = params.graph_approach, 
                    add_annotations= params.add_annotations,
                    n_annotations=params.n_annotations,
                    seed = None)

    # Step 2 : generate paths for each graph
    for i in range(params.n_graphs):
        generate_path(graph_number = i,
                        graph_filepath = filepaths.graph_filepath, 
                        path_filepath = filepaths.path_filepath,
                        graph_name = f'graph_{i}.p', 
                        n_paths = params.n_paths, 
                        max_path_length = params.max_path_length, 
                        seed = None)


    # Step 3 : flesh graphs
    program_generator = JavaBCProgramGenerator()

    # directions are known at compile time - means we flesh n_graphs*m_paths programs
    if(args.dir == 'known'):
                
        for i in range(params.n_graphs):
        
            # load graph                    
            graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            for p in range(params.n_paths):

                directions = read_in_dirs(i, p, filepaths)

                program_generator.fleshout_dirs_known(cfg, directions)

                # make directory for test case 
                subprocess.run(f'mkdir {filepaths.program_filepath}/run_cfg_{i}_path_{p}', shell=True)

                program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}_path_{p}/run_cfg_{i}_path_{p}.j')
        

    # directions are unknown at compile time - means we flesh n_graphs programs (1 for each graph)
    elif(args.dir == 'unknown'):

        for i in range(params.n_graphs):
                
            graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            program_generator.fleshout_no_reflection(cfg, i)

            # make directory for test case 
            subprocess.run(f'mkdir {filepaths.program_filepath}/run_cfg_{i}', shell=True)

            # save in separate folder for classpath
            program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}/run_cfg_{i}.j')
    

    

    # Step 4 : run tests
    test = JavaBCRunner(filepaths, params, directions = args.dir)

    if args.dir == 'known':
    
        for i in range(params.n_graphs):
            
            graph_passed_tests = True

            for j in range(params.n_paths):

                test_name = f'run_cfg_{i}_path_{j}'
        
                test_result = test.run(test_name=test_name, test_id=i, path_name=f'input_graph_{i}_path{j}')

                # remove files if test passed
                if test_result == 0:
                    clean_up(f'{filepaths.path_filepath}/input_graph_{i}_path{j}.txt')
                    clean_up_folder(f'{filepaths.program_filepath}/{test_name}')
                else:
                    graph_passed_tests=False

            if graph_passed_tests:
                clean_up(f'{filepaths.graph_filepath}/graph_{i}.p')


    else:
        for i in range(params.n_graphs):

            graph_passed_tests = True
            test_name = f'run_cfg_{i}'

            for j in range(params.n_paths):
        
                test_result = test.run(test_name=test_name, test_id=i, path_name=f'input_graph_{i}_path{j}')

                if test_result == 0:
                    clean_up(f'{filepaths.path_filepath}/input_graph{i}_path{j}.txt')
                else:
                    graph_passed_tests = False

            if graph_passed_tests:
                clean_up(f'{filepaths.program_filepath}/{test_name}*')
                clean_up(f'{filepaths.graph_filepath}/graph_{i}.p')

def clean_up(filepath : str):
    subprocess.run(f'rm {filepath}', shell=True)

def clean_up_folder(folderpath : str):
    subprocess.run(f'rm -rf {folderpath}', shell=True)

def read_in_dirs(graph : nx.MultiDiGraph, path : int, filepaths : FilePaths) -> list[int]:
        
        with open(f'{filepaths.path_filepath}/input_graph_{graph}_path{path}.txt', 'r') as f:
            lines = f.readlines()

        # third line is directions list
        dirs = lines[2].split(' ')

        # convert str to int
        return [eval(i) for i in dirs]

def create_folders(basePath : str) -> None:

    print('Setting up folders...')

    cmd = f'mkdir {basePath}'
    cmd += f' ;mkdir {basePath}/graphs'
    cmd += f' ;mkdir {basePath}/src'
    cmd += f' ;mkdir {basePath}/src/output'
    cmd += f' ;mkdir {basePath}/src/paths'
    cmd += f' ;mkdir {basePath}/src/testing'

    result = subprocess.run(cmd, shell=True)

    # copy the wrapper to the relevant folder
    cmd = [f'''cp javabc/WrapperNoReflection.java {basePath}/src/testing/WrapperNoReflection.java''']
    result = subprocess.run(cmd, shell=True)

    
if __name__ == "__main__":
    main()