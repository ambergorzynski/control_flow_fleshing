import argparse
import sys
import networkx as nx
import subprocess

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
    parser.add_argument("-c", type=str, default="default",
                        help="specifies which compiler to use [NOT IN USE]")
    parser.add_argument("-dir", type=str, default="unknown",
                        help="specifies whether directions array is known or unknown at compile time")
    parser.add_argument("-opt", type=str, default="random_level",
                        help="specifies the optimisation, which can be 'random_level' or a specific string list of optimisations e.g. 'breakcritedges', 'breakcritedges,adce'")
    parser.add_argument("-lab", type=bool, default=False,
                        help="True for lab computer, False for mac; used for different folder set-ups and compilation cmds")
    args = parser.parse_args()

    #TODO: add argument validator
    
    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    basePath = f'llvm/fuzzing/{args.folder}' if not args.lab else f'/vol/bitbucket/agg22/cfg/llvm/fuzzing/{args.folder}'

    filepaths = FilePaths(base = basePath,
                            graph_filepath = f'{basePath}/graphs',
                            program_filepath = f'{basePath}/llvm',
                            path_filepath = f'{basePath}/input',
                            output_filepath = f'{basePath}/running',
                            results_name = f'results_{time}',
                            bug_results_name = f'bugs_{time}')

    params = FuzzingParams(n_graphs = args.n_graphs,
                            n_paths = args.n_paths,
                            min_graph_size = 10,
                            max_graph_size = 15,
                            min_successors = 1,
                            max_successors = 3,
                            graph_approach = 2, # can be 1 or 2
                            max_path_length = 900,
                            n_optimisations = 1)
    
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

                program_generator.fleshout_static(cfg, directions)

                program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}_path_{p}.ll')

    # directions are unknown at compile time - means we compile n_graphs programs (1 for each graph)
    elif(args.dir == 'unknown'):

        for i in range(params.n_graphs):
                
                graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

                cfg = CFG(graph)

                program_generator.fleshout(cfg)

                program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}.ll')


    # Step 4 : run tests
    test = LLVMRunner(filepaths, params, compiler = args.c, directions = args.dir, optimisations = args.opt)
    
    test.run()


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
    cmd += f' ;mkdir {basePath}/llvm'
    cmd += f' ;mkdir {basePath}/running'

    result = subprocess.run(cmd, shell=True)

    
if __name__ == "__main__":
    main()