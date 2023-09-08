import argparse
import sys
import networkx as nx
import subprocess
from typing import List

from datetime import datetime

#TODO: convert graph generator etc to package

sys.path.append('../control_flow_fleshing')

from GraphGenerator import *
from CFG import *
from LLVMProgramGenerator import *
from LLVMRunner import *
from Utils import *

def main():

    # parse args
    parser = argparse.ArgumentParser()

    parser.add_argument("n_graphs", type=int)
    parser.add_argument("n_paths", type=int)
    parser.add_argument("folder", type=str)
    parser.add_argument("llvm_path",type=str)
    parser.add_argument("-c", type=str, default="llvm",
                        help="specifies which compiler to use from 'llvm' or 'graalvm'")
    parser.add_argument("-graalvm", type=str, default=None,
                        help="specifies graalvm path")
    parser.add_argument("-dir", type=str, default="known",
                        help="specifies whether directions array is known or unknown at compile time")
    parser.add_argument("-opt", type=str, default="random_level",
                        help="specifies the optimisation, which can be 'random_level' or a specific string list of optimisations e.g. 'breakcritedges', 'breakcritedges,adce'")
    parser.add_argument("-lab", type=bool, default=False,
                        help="True for lab computer, False for mac; used for different folder set-ups and compilation cmds")
    parser.add_argument("-graph", type=str, default="default",
                        help="specifies graph generation approach from 'default', 'preset', 'xml'.")
    parser.add_argument("-clean_as_you_go",type=int,default=1,
                        help="specifies whether to remove non-bug-triggering files automatically")
    parser.add_argument("-opt_only",type=bool,default=False,
                        help="if set to true, will only run opt on the fleshing programs and will not compile to .o or executable")
    args = parser.parse_args()

    #TODO: add argument validator
    
    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    basePath = f'llvm/fuzzing/{args.folder}' if not args.lab else f'/vol/bitbucket/agg22/cfg/llvm/fuzz/{args.folder}'

    if args.graph == 'default':
         graph=2
    elif args.graph == 'preset':
         graph=-1
    else:
         graph=3
    
    filepaths = FilePaths(base = basePath,
                            graph_filepath = f'{basePath}/graphs',
                            program_filepath = f'{basePath}/llvm',
                            path_filepath = f'{basePath}/input',
                            output_filepath = f'{basePath}/running',
                            results_name = f'results_{time}',
                            bug_results_name = f'bugs_{time}',
                            graalvm_path=args.graalvm,
                            llvm_filepath=args.llvm_path)

    params = FuzzingParams(directions=dir(args.dir),
                            n_graphs = args.n_graphs,
                            n_paths = args.n_paths,
                            min_graph_size = 10,
                            max_graph_size = 500,
                            min_successors = 1,
                            max_successors = 3,
                            graph_approach = graph,
                            max_path_length = 900,
                            n_optimisations = 1,
                            opt_only=args.opt_only)
    
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
    program_generator = LLVMProgramGenerator(params)

    # directions are known at compile time - means we flesh n_graphs*m_paths programs
    if(args.dir == 'known'):
        
        for i in range(params.n_graphs):
        
            # load graph                    
            graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            for p in range(params.n_paths):

                directions = read_in_dirs(i, p, filepaths)

                program_generator.fleshout(cfg=cfg, directions=directions)

                program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}_path_{p}.ll')

    # directions are unknown at compile time - means we compile n_graphs programs (1 for each graph)
    elif(args.dir == 'unknown'):

        for i in range(params.n_graphs):
                
                graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

                cfg = CFG(graph)

                program_generator.fleshout(cfg=cfg)

                program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}.ll')


    # Step 4 : run tests
    test = LLVMRunner(filepaths, params, compiler = args.c, directions = args.dir, optimisations = args.opt)

    # if dirs are known at compile time, then loop over all graph*path combinations 
    if args.dir == 'known':

        for i in range(params.n_graphs):

            # use bool to keep track of whether we need to store the graph or can delete
            graph_passed_tests = True

            for j in range(params.n_paths):

                test_name = f'run_cfg_{i}_path_{j}' 

                test_result = test.compile(test_name,f'input_graph_{i}_path{j}')
                test_result = test.run(test_name,f'input_graph_{i}_path{j}')

                # clean up and delete files if test compiled end executed OK
                if test_result == 0 and args.clean_as_you_go:
                     print(f'here! {args.clean_as_you_go}')
                     clean_up(f'{filepaths.program_filepath}/{test_name}.*')
                     clean_up(f'{filepaths.output_filepath}/{test_name}*')
                     clean_up(f'{filepaths.path_filepath}/input_graph_{i}_path{j}.txt')
                else:
                     graph_passed_tests = False
                     
            # if all tests passed for this graph, then remove graph
            if graph_passed_tests and args.clean_as_you_go:
                clean_up(f'{filepaths.graph_filepath}/graph_{i}.p')


    else:
        for i in range(params.n_graphs):

            graph_passed_tests = True
            
            test_name = f'run_cfg_{i}'

            test_result = test.compile(test_name)

            for j in range(params.n_paths):

                test_result = test.run(test_name,f'input_graph_{i}_path{j}')

                # clean up and delete path if test compiled end executed OK
                if test_result == 0 and args.clean_as_you_go:
                     clean_up(f'{filepaths.path_filepath}/input_graph_{i}_path{j}.txt')
                else:
                     graph_passed_tests = False

            # if all tests passed for this graph, then remove graph and corresponding test case
            if graph_passed_tests and args.clean_as_you_go:
                clean_up(f'{filepaths.program_filepath}/{test_name}*')
                clean_up(f'{filepaths.output_filepath}/{test_name}*')
                clean_up(f'{filepaths.graph_filepath}/graph_{i}.p')




def clean_up(filepath : str):
     subprocess.run(f'rm {filepath}', shell=True)

def read_in_dirs(graph : nx.MultiDiGraph, path : int, filepaths : FilePaths) -> List[int]:
        
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
    cmd += f' ;mkdir {basePath}/llvm'
    cmd += f' ;mkdir {basePath}/running'

    result = subprocess.run(cmd, shell=True)

def dir(dir : str) -> Directions:
     if dir == 'unknown':
          return Directions.DYNAMIC
     elif dir == 'known':
          return Directions.STATIC_ARR
         
if __name__ == "__main__":
    main()
