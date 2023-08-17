import subprocess
import random
from Utils import *

class JavaBCRunner():

    def __init__(self,
                 filepaths : FilePaths,
                 params : FuzzingParams,
                 compiler : str = 'default',
                 directions : str = 'unknown'):
        
        self.filepaths : FilePaths = filepaths
        self.params : FuzzingParams = params
        self.compiler : str = compiler
        self.directions : str = directions

    def run(self) -> None:
        '''
            Function runs the compilation and execution process for the given
            parameters and filepaths
        '''

        #TODO: add different JVM options

        # directions are unknown at compile time then compile each graph (paths are passed as params)
        if (self.directions=='unknown'):

            for i in range(self.params.n_graphs):

                # pre-compile wrapper and test together
                self.compile_no_ref(f'{i}')

                for j in range(self.params.n_paths):

                    self.execute_no_ref(test_number=i, path_name=f'input_graph_{i}_path{j}')

        # directions are known at compile time then compile each graph-path pair
        elif (self.directions=='known'):
            
            for i in range(self.params.n_graphs):

                for j in range(self.params.n_paths):

                    self.compile_no_ref(f'{i}_path_{j}')

                    # execute
                    self.execute(f'{i}_path_{j}', f'input_graph_{i}_path{j}')



    def compile_wrapper(self) -> None:
        cmd = [f'''./javabc/compile_wrapper_java.sh {self.filepaths.src_filepath}''']
        result = subprocess.run(cmd, shell=True)

    def compile_test(self, test_name : str) -> None:
        cmd = [f'''./javabc/compile_test_java.sh {self.filepaths.src_filepath} {test_name}''']
        result = subprocess.run(cmd, shell=True)

    def compile_no_ref(self, test_id : int) -> None:
        cmd = [f'''./javabc/compile_java_no_ref.sh {self.filepaths.src_filepath} {test_id}''']
        result = subprocess.run(cmd, shell=True)

    def execute(self, test_id : str, path_name : str, n_function_repeats : int) -> None:
        cmd = [f'''./javabc/execute_test_java.sh {self.filepaths.src_filepath} {test_id} {path_name} {self.filepaths.results_name} {self.filepaths.bug_results_name} {n_function_repeats}''']
        result = subprocess.run(cmd, shell=True)

    def execute_no_ref(self, test_id : str, path_name : str) -> None:
        cmd = [f'''./javabc/execute_java_no_ref.sh {self.filepaths.src_filepath} {test_id} {path_name} {self.filepaths.results_name} {self.filepaths.bug_results_name} {self.params.n_function_repeats}''']
        result = subprocess.run(cmd, shell=True)