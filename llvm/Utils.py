from enum import Enum

class Directions(Enum):

    def __eq__(self, other):
        return self.__class__ is other.__class__ and other.value == self.value
    
    DYNAMIC = 1
    STATIC_PTR = 2
    STATIC_ARR = 3 

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
                 bug_results_name : str,
                 graalvm_path : str,
                 llvm_filepath : str):
        
        self.base : str = base
        self.graph_filepath : str = graph_filepath
        self.program_filepath : str = program_filepath
        self.path_filepath : str = path_filepath
        self.output_filepath : str = output_filepath
        self.results_name : str = results_name
        self.bug_results_name : str = bug_results_name
        self.graalvm_path : str = graalvm_path
        self.llvm_filepath : str = llvm_filepath

        if output_filepath[0] == '/':
            self.exe_filepath : str = output_filepath
        else:
            self.exe_filepath : str = f'./{output_filepath}'

class FuzzingParams():

    '''
        Parameter struct to keep track of parameters
    '''
    def __init__(self,
                directions : Directions,
                n_graphs : int,
                n_paths : int,
                min_graph_size : int,
                max_graph_size : int,
                min_successors : int,
                max_successors : int,
                graph_approach : int, # can be 1 or 2
                max_path_length : int,
                n_optimisations : int):
        
        self.directions : Directions = directions
        self.n_graphs : int = n_graphs
        self.n_paths : int = n_paths
        self.min_graph_size : int = min_graph_size
        self.max_graph_size : int = max_graph_size
        self.min_successors : int = min_successors
        self.max_successors : int = max_successors
        self.graph_approach : int = graph_approach # can be 1 or 2
        self.max_path_length : int = max_path_length
        self.n_optimisations : int = n_optimisations
