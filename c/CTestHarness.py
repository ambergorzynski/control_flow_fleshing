import argparse
import sys
import networkx as nx
import subprocess

from datetime import datetime

#TODO: convert graph generator etc to package

sys.path.append('../control_flow_fleshing')

from GraphGenerator import *
from CFG import *
from CProgramGenerator import *
from CRunner import *
from Utils import *

def main():

    # parse args
    parser = argparse.ArgumentParser()

    parser.add_argument("n_graphs", type=int)
    parser.add_argument("n_paths", type=int)
    parser.add_argument("folder", type=str)
    parser.add_argument("base", type=str, default='c/fuzzing',
                        help='base path for folders')
    parser.add_argument("-graalvm", type=str, default=None,
                        help='specifies path to graalvm')
    parser.add_argument("-graph", type=str, default='default',
                        help='''specifies graph generation approach from '1' or '2'. default is 2''')
    parser.add_argument("-dir",type=str,default='known',
                        help='specifies whether directions are known at compile time or not')
    args = parser.parse_args()
    
    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    basePath = f'{args.base}/{args.folder}'

    filepaths = FilePaths(base = basePath,
                            graph_filepath = f'{basePath}/graphs',
                            program_filepath = f'{basePath}/c',
                            path_filepath = f'{basePath}/input',
                            output_filepath = f'{basePath}/running',
                            results_name = f'results_{time}',
                            bug_results_name = f'bugs_{time}',
                            graalvm_path=args.graalvm)

    params = FuzzingParams(directions=dir(args.dir),
                            n_graphs = args.n_graphs,
                            n_paths = args.n_paths,
                            min_graph_size = 10,
                            max_graph_size = 15,
                            min_successors = 1,
                            max_successors = 2,
                            graph_approach = 2 if args.graph == 'default' else 3,
                            max_path_length = 900,
                            n_optimisations=1)
    
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
    program_generator = CProgramGenerator(params)

    # directions are known at compile time - means we flesh n_graphs*m_paths programs
    for i in range(params.n_graphs):
    
        # load graph                    
        graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

        cfg = CFG(graph)

        for p in range(params.n_paths):

            directions = read_in_dirs(i, p, filepaths)

            program_generator.fleshout(cfg=cfg, directions=directions)

            program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}_path_{p}.ll')

    '''

    # Step 4 : run tests
    test = CRunner(filepaths, params, compiler = args.c, directions = args.dir, optimisations = args.opt)

    # if dirs are known at compile time, then loop over all graph*path combinations 
    if args.dir == 'known':

        for i in range(params.n_graphs):

            # use bool to keep track of whether we need to store the graph or can delete
            graph_passed_tests = True

            for j in range(params.n_paths):

                test_name = f'run_cfg_{i}_path_{j}' 

                test_result = test.run(test_name,f'input_graph_{i}_path{j}')

                # clean up and delete files if test compiled end executed OK
                if test_result == 0:
                     clean_up(f'{filepaths.program_filepath}/{test_name}.*')
                     clean_up(f'{filepaths.output_filepath}/{test_name}*')
                     clean_up(f'{filepaths.path_filepath}/input_graph_{i}_path{j}.txt')
                else:
                     graph_passed_tests = False
                     
            # if all tests passed for this graph, then remove graph
            if graph_passed_tests:
                clean_up(f'{filepaths.graph_filepath}/graph_{i}.p')


    else:
        for i in range(params.n_graphs):

            graph_passed_tests = True
            
            test_name = f'run_cfg_{i}'
            
            for j in range(params.n_paths):

                test_result = test.run(test_name,f'input_graph_{i}_path{j}')

                # clean up and delete path if test compiled end executed OK
                if test_result == 0:
                     clean_up(f'{filepaths.path_filepath}/input_graph_{i}_path{j}.txt')
                else:
                     graph_passed_tests = False

            # if all tests passed for this graph, then remove graph and corresponding test case
            if graph_passed_tests:
                clean_up(f'{filepaths.program_filepath}/{test_name}*')
                clean_up(f'{filepaths.output_filepath}/{test_name}*')
                clean_up(f'{filepaths.graph_filepath}/graph_{i}.p')

    '''


def clean_up(filepath : str):
     subprocess.run(f'rm {filepath}', shell=True)

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
    cmd += f' ;mkdir {basePath}/input'
    cmd += f' ;mkdir {basePath}/c'
    cmd += f' ;mkdir {basePath}/running'

    result = subprocess.run(cmd, shell=True)

def dir(dir : str) -> Directions:
     if dir == 'unknown':
          return Directions.DYNAMIC
     elif dir == 'known':
          return Directions.STATIC_ARR
         
if __name__ == "__main__":
    main()