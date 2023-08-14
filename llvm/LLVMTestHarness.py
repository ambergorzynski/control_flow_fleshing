from datetime import datetime
from GraphGenerator import *

class FilePaths():

    '''
        FilePath struct to keep track of fuzzing filepaths
    '''

    def __init__(self,
                 base : str,
                 graph_path : str,
                 program_path : str,
                 output_path : str,
                 results_name : str,
                 bug_results_name : str):
        
        self.base : str = base
        self.graph_path : str = graph_path
        self.program_path : str = program_path
        self.output_path : str = output_path
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



def llvm_test(n_tests, folder):

    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    basePath = f'llvm/fuzzing/{folder}'
    
    filepaths = FilePaths(base = basePath,
                            graph_filepath = f'{basePath}/graphs',
                            program_filepath = f'{basePath}/llvm',
                            path_filepath = f'{basePath}/input',
                            out_filepath = f'{basePath}/running',
                            results_name = f'results_{time}',
                            bad_results_name = f'bad_results_{time}')

    params = FuzzingParams(n_graphs = n_tests,
                            n_paths = 1,
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
    

    # Step 2 : flesh graphs
    fuzzer.flesh_graphs(n_graphs)

    # Step 3 : generate paths for each graph
    fuzzer.generate_paths(n_graphs, n_paths, max_path_length)

    # Step 4 : run tests
    fuzzer.run_tests_llvm(n_graphs, n_paths, n_optimisations)
