import argparse
import sys
import networkx as nx

from datetime import datetime

#TODO: convert graph generator etc to package

sys.path.append('../control_flow_fleshing')

from GraphGenerator import *
from CFG import *
from LLVMProgramGenerator import *


class FilePaths():

    '''
        FilePath struct to keep track of fuzzing filepaths
    '''

    def __init__(self,
                 base : str,
                 graph_filepath : str,
                 program_filepath : str,
                 path_filepath : str,
                 output_filepath : str,
                 results_name : str,
                 bug_results_name : str):
        
        self.base : str = base
        self.graph_filepath : str = graph_filepath
        self.program_filepath : str = program_filepath
        self.path_filepath : str = path_filepath
        self.output_filepath : str = output_filepath
        self.results_name : str = results_name
        self.bug_results_name : str = bug_results_name

class FuzzingParams():

    '''
        Parameter struct to keep track of parameters
    '''
    def __init__(self,
                n_graphs : int,
                n_paths : int,
                min_graph_size : int,
                max_graph_size : int,
                min_successors : int,
                max_successors : int,
                graph_approach : int, # can be 1 or 2
                max_path_length : int,
                n_optimisations : int):
        
        self.n_graphs : int = n_graphs
        self.n_paths : int = n_paths
        self.min_graph_size : int = min_graph_size
        self.max_graph_size : int = max_graph_size
        self.min_successors : int = min_successors
        self.max_successors : int = max_successors
        self.graph_approach : int = graph_approach # can be 1 or 2
        self.max_path_length : int = max_path_length
        self.n_optimisations : int = n_optimisations

def main():

    # parse args
    parser = argparse.ArgumentParser()

    parser.add_argument("n_graphs", type=int)
    parser.add_argument("n_paths", type=int)
    parser.add_argument("folder", type=str)
    parser.add_argument("-c", type=str, default="llvm",
                        help="Specifies which compiler to use")
    parser.add_argument("-dir", type=str, default="unknown",
                        help="Specifies whether directions array is known or unknown at compile time")
    parser.add_argument("-opt", type=str, default="random_level",
                        help="Specifies the optimisation, which can be 'random_level' or a specific string list of optimisations e.g. 'breakcritedges', 'breakcritedges,adce'")

    args = parser.parse_args()

    #TODO: add argument validator
    
    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    basePath = f'llvm/fuzzing/{args.folder}'
    
    filepaths = FilePaths(base = basePath,
                            graph_filepath = f'{basePath}/graphs',
                            program_filepath = f'{basePath}/llvm',
                            path_filepath = f'{basePath}/input',
                            out_filepath = f'{basePath}/running',
                            results_name = f'results_{time}',
                            bad_results_name = f'bad_results_{time}')

    params = FuzzingParams(n_graphs = args.n_graphs,
                            n_paths = args.n_paths,
                            min_graph_size = 10,
                            max_graph_size = 15,
                            min_successors = 1,
                            max_successors = 3,
                            graph_approach = 2, # can be 1 or 2
                            max_path_length = 900,
                            n_optimisations = 1)
  
    # Step 1 : generate graphs
    generate_graphs(graph_filepath = filepaths.graph_path,
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
        generate_path(graph_filepath = filepaths.graph_filepath, 
                        output_filepath = filepaths.output_filepath,
                        graph_name = f'graph_{i}.p', 
                        n_paths = params.n_paths, 
                        max_path_length = params.max_path_length, 
                        seed = None)


    # Step 3 : flesh graphs
    program_generator = LLVMProgramGenerator()

    if(args.dir == 'known'):
        
        for i in range(params.n_graphs):
        
            # load graph                    
            graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            for p in range(params.n_paths):

                directions = read_in_dirs(i, p, filepaths)

                program_generator.fleshout_static(cfg, directions)

                program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}_path_{p}.ll')

    
    elif(args.dir == 'unknown'):
        pass

    # Step 4 : run tests

def read_in_dirs(graph : nx.MultiDiGraph, path : int, filepaths : FilePaths):
        
        with open(f'{filepaths.path_filepath}/input_graph_{graph}_path{path}.txt', 'r') as f:
            lines = f.readlines()

        # third line is directions list
        dirs = lines[2].split(' ')

        # convert str to int
        return [eval(i) for i in dirs]
    
if __name__ == "__main__":
    main()