import subprocess
import random
from Utils import *

class JavaBCRunner():

    def __init__(self,
                 filepaths : FilePaths,
                 params : FuzzingParams,
                 directions : str = 'unknown'):
        
        self.filepaths : FilePaths = filepaths
        self.params : FuzzingParams = params
        self.directions : str = directions

    def run(self, test_name : str, test_id : int, path_name : str) -> int:
        '''
            Function runs the compilation and execution process for the given
            parameters and filepaths
        '''

        print('Compiling...')
        compile_result = self.compile_test(test_name)

        if compile_result != 0:
            print('Compilation failed!')
            return 1
        print('Compilation succeeded!')
        
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
        
        print('Executing...')
        exe_result = self.execute_test(test_name, test_id, path_name)
        
        if exe_result != 0:
            print('Execution failed!')
            return 1
        
        print('Execution succeeded!')
        return 0

    def compile_test(self, test_name : str) -> int:

        if self.params.with_reflection:
            
            wrapper_cmd = [f'''./javabc/compile_wrapper_java.sh {self.filepaths.src_filepath} {self.filepaths.jvm}''']
            wrapper_result = subprocess.run(wrapper_cmd, shell=True)

            if wrapper_result.returncode != 0:
                return wrapper_result.returncode

            compile_cmd = [f'''./javabc/compile_test_java.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm} {self.filepaths.jasmin}''']
            compile_result = subprocess.run(compile_cmd, shell=True)

            return compile_result.returncode
        
        else:
            compile_cmd = [f'''./javabc/compile_java_no_ref.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm} {self.filepaths.jasmin}''']
            compile_result = subprocess.run(compile_cmd, shell=True)

            return compile_result.returncode
        
    def decompile_test(self, test_name : str) -> int:
            
            # decompilation syntax varies depending on which decompiler toolchain is used

            if self.params.decompiler.value == Decompiler.CFR.value:
            
                decompile_cmd = [f'''./javabc/decompile_test_cfr.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm} {self.filepaths.decompiler_path}''']
            
            elif self.params.decompiler.value == Decompiler.FERNFLOWER.value:

                decompile_cmd = [f'''./javabc/decompile_test_fernflower.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm} {self.filepaths.decompiler_path}''']
            
            # if decompilation cmd failed or decompilation threw exception
            decompile_result = subprocess.run(decompile_cmd, shell=True)

            if decompile_result.returncode != 0:
                return 1
            
            return 0


    def recompile_test(self, test_name : str) -> int:
            
            compile_cmd = [f'''./javabc/recompile_java_no_ref.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm}''']
            compile_result = subprocess.run(compile_cmd, shell=True)

            return compile_result.returncode
            
    def execute_test(self, test_name : str, test_id : int, path_name : str) -> int:
        
        if self.params.with_reflection:
            exe_cmd = [f'''./javabc/execute_test_java.sh {self.filepaths.src_filepath} {test_id} {path_name} {self.filepaths.results_name} {self.filepaths.bug_results_name} {self.params.n_function_repeats} {self.filepaths.jvm}''']

        else:
            exe_cmd = [f'''./javabc/execute_java_no_ref.sh {self.filepaths.src_filepath} {test_name} {path_name} {self.filepaths.results_name} {self.filepaths.bug_results_name} {self.params.n_function_repeats} {self.filepaths.jvm}''']
        
        result = subprocess.run(exe_cmd, shell=True)

        return result.returncode
