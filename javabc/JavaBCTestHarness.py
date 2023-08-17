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
    parser.add_argument("-c", type=str, default="default",
                        help="specifies which compiler to use: 'eclipse', 'graalvm' [NOT IN USE]")
    parser.add_argument("-dir", type=str, default="unknown",
                        help="specifies whether directions array is known or unknown at compile time [NOT IN USE]")
    args = parser.parse_args()

    #TODO: add argument validator
    
    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    basePath = f'javabc/fuzzing/{args.folder}'
    
    filepaths = FilePaths(base = basePath,
                            graph_filepath = f'{basePath}/graphs',
                            src_filepath = f'{basePath}/src',
                            program_filepath= f'{basePath}/src/testing',
                            path_filepath = f'{basePath}/src/paths',
                            output_filepath = f'{basePath}/output',
                            results_name = f'results_{time}',
                            bug_results_name = f'bugs_{time}')

    params = FuzzingParams(n_graphs = args.n_graphs,
                            n_paths = args.n_paths,
                            min_graph_size = 10,
                            max_graph_size = 500,
                            min_successors = 1,
                            max_successors = 3,
                            graph_approach = 2, # can be 1 or 2
                            max_path_length = 900,
                            n_function_repeats=5000)
    
    # Setup
    create_folders(args.folder)
  
    # Step 1 : generate graphs
    generate_graphs(graph_filepath = filepaths.graph_filepath,
                    n_graphs = params.n_graphs,
                    min_graph_size = params.min_graph_size,
                    max_graph_size = params.max_graph_size,
                    min_successors = params.min_successors, 
                    max_successors = params.max_successors, 
                    graph_generation_approach = params.graph_approach, 
                    n_annotations = None,
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
        
        # TODO: create java bc program generator with known directions array
        
        for i in range(params.n_graphs):
        
            # load graph                    
            graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            for p in range(params.n_paths):

                directions = read_in_dirs(i, p, filepaths)

                program_generator.fleshout_dirs_known(cfg, directions)

                # make directory for test case 
                subprocess.run(f'mkdir {filepaths.program_filepath}/test{i}_path_{p}', shell=True)

                program_generator.save_to_file(f'{filepaths.program_filepath}/test{i}_path_{p}/run_cfg_{i}_path_{p}.j')
        

    # directions are unknown at compile time - means we compile n_graphs programs (1 for each graph)
    elif(args.dir == 'unknown'):

        for i in range(params.n_graphs):
                
            graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            program_generator.fleshout_no_reflection(cfg, i)

            # make directory for test case 
            subprocess.run(f'mkdir {filepaths.program_filepath}/test{i}', shell=True)

            # save in separate folder for classpath
            program_generator.save_to_file(f'{filepaths.program_filepath}/test{i}/run_cfg_{i}.j')
    

    

    # Step 4 : run tests
    test = JavaBCRunner(filepaths, params, compiler = args.c, directions = args.dir)
    
    test.run()
    


def read_in_dirs(graph : nx.MultiDiGraph, path : int, filepaths : FilePaths) -> list[int]:
        
        with open(f'{filepaths.path_filepath}/input_graph_{graph}_path{path}.txt', 'r') as f:
            lines = f.readlines()

        # third line is directions list
        dirs = lines[2].split(' ')

        # convert str to int
        return [eval(i) for i in dirs]

def create_folders(folder_name : str) -> None:

    print('Setting up folders...')

    cmd = f'mkdir javabc/fuzzing/{folder_name}'
    cmd += f' ;mkdir javabc/fuzzing/{folder_name}/graphs'
    cmd += f' ;mkdir javabc/fuzzing/{folder_name}/src'
    cmd += f' ;mkdir javabc/fuzzing/{folder_name}/src/output'
    cmd += f' ;mkdir javabc/fuzzing/{folder_name}/src/paths'
    cmd += f' ;mkdir javabc/fuzzing/{folder_name}/src/testing'

    result = subprocess.run(cmd, shell=True)

    # copy the wrapper and test case interface to the relevant folder
    cmd = [f'''cp javabc/WrapperNoReflection.java javabc/fuzzing/{folder_name}/src/testing/WrapperNoReflection.java''']
    result = subprocess.run(cmd, shell=True)

    
if __name__ == "__main__":
    main()