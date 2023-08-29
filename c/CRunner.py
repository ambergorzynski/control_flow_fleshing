import subprocess
from pathlib import Path
from Utils import *

class CRunner():

    def __init__(self,
                 filepaths : FilePaths,
                 params : FuzzingParams):
                
        self.filepaths : FilePaths = filepaths
        self.params : FuzzingParams = params

    def run(self, test_name : str, path_name : str) -> int:
        '''
            Function runs the compilation and execution process for the given
            parameters and filepaths
        '''

        # compile test
        compile_test_result = self.compile_test(test_name)

        if compile_test_result != 0:
            print('Test compilation failed!')
            return 1

        # execute test
        exe_result = self.execute_test(test_name=test_name, path_name=path_name)
        if exe_result != 0:
            print('Execution failed!')
            return 1
        
        return 0

        
    def compile_test(self, test_name : str) -> int:

        #TODO: convert c++ wrapper to c so using clang instead of clang++
        cmd = [f'''./c/compile_test_c.sh \
                {self.filepaths.output_filepath} \
                {self.filepaths.program_filepath} \
                {test_name} \
                "-O3"''']

        result = subprocess.run(cmd, shell=True)

        return result.returncode
        
    def execute_test(self, test_name : int, path_name : str) -> int:
        
        exe_cmd = [f'''./{self.filepaths.output_filepath}/{test_name}_out \
                    {path_name}.txt \
                    {self.filepaths.results_name}.txt \
                    {self.filepaths.bug_results_name}.txt ''']
        
        exe_result = subprocess.run(exe_cmd, shell=True)

        return exe_result.returncode