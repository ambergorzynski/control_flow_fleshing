import subprocess
from pathlib import Path
from Utils import *

class CILRunner():

    def __init__(self,
                 filepaths : FilePaths,
                 params : FuzzingParams):
                
        self.filepaths : FilePaths = filepaths
        self.params : FuzzingParams = params

    def run(self, test_name : str, test_id : int, path_name : str) -> int:
        '''
            Function runs the compilation and execution process for the given
            parameters and filepaths
        '''

        wrapper_result = self.compile_wrapper()

        if wrapper_result != 0:
            print('Wrapper compilation failed!')
            return 1
        
        # compile test
        compile_test_result = self.compile_test(test_name)

        if compile_test_result != 0:
            print('Test compilation failed!')
            return 1

        # if we are using a decompiler, then include additional step to de- and re- compile test
        if self.filepaths.decompiler_path != None:
            
            print('Decompiling...')
            decompile_result = self.decompile_test(test_name)

            if decompile_result != 0:
                print('Decompilation failed!')
                return 1
            print('Decompilation produced file!')
            
            print('Recompiling...')
            recompile_result = self.recompile_test(test_name)

            if recompile_result != 0:
                print('Recompilation failed!')
                return 1
            print('Recompilation succeeded!')

        # execute test
        exe_result = self.execute_test(test_name=test_name, test_number=test_id, path_name=path_name)
        if exe_result != 0:
            print('Execution failed!')
            return 1
        
        return 0

    def compile_wrapper(self) -> int:

        # check if wrapper has already been compiled; only need to compile once
        wrapper_path = Path(f'{self.filepaths.program_filepath}/Wrapper.cs')

        if wrapper_path.exists():

            wrapper_cmd = [f'''./cil/compile_wrapper_cil.sh {self.filepaths.src_filepath}''']
            
            result = subprocess.run(wrapper_cmd, shell=True)

            return result.returncode
        
    def compile_test(self, test_name : str) -> int:

        cmd = [f'''./cil/compile_test_cil.sh {self.filepaths.src_filepath} {test_name}''']

        result = subprocess.run(cmd, shell=True)

        return result.returncode
    
    def decompile_test(self, test_name : str) -> int:
        
        cmd = [f'''./cil/decompile_test_cil.sh {self.filepaths.src_filepath}/testing {test_name} {self.filepaths.decompiler_path}''']

        result = subprocess.run(cmd, shell=True)

        return result.returncode
    
    def recompile_test(self, test_name : str) -> int:

        cmd = [f'''./cil/recompile_test_cil.sh {self.filepaths.src_filepath}/testing {test_name}''']

        result = subprocess.run(cmd, shell=True)

        return result.returncode
        
    def execute_test(self, test_name :str, test_number : int, path_name : str) -> int:

        # set absolute filepath to the test case based on whether it has be de- and re- compiled or not
        if self.filepaths.decompiler_path != None:
            full_path = f'self.filepaths.absolute_filepath/{test_name}_decomp'
        else:
            full_path = self.filepaths.absolute_filepath
        
        exe_cmd = [f'''./cil/execute_test_cil.sh {self.filepaths.src_filepath} \
                    {test_number} \
                    {path_name} \
                    {self.filepaths.results_name} \
                    {self.filepaths.bug_results_name} \
                    {self.params.n_function_repeats} \
                    {full_path} ''']
        
        exe_result = subprocess.run(exe_cmd, shell=True)

        return exe_result.returncode