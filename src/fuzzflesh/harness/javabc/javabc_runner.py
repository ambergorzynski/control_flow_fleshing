import subprocess
from pathlib import Path

from fuzzflesh.harness.runner import Runner
from fuzzflesh.common.utils import Compiler, Lang, RunnerReturn

class JavaBCRunner(Runner):

    def __init__(self, _toolchain : Compiler, _jvm : Path, _jasmin : Path, _output : Path):
        super(Runner, self).__init__()
        self.compiler : Compiler = _toolchain
        self.jvm : Path = Path(_jvm, 'java')
        self.javac : Path = Path(_jvm, 'javac')
        self.jasmin : Path = Path(_jasmin, 'jasmin.jar')
        self.wrapper : Path = Path(_output, 'WrapperNoReflection.java')
        self.n_function_repeats : int = 1000
        
    @property
    def language(self):
        return Lang.JAVABC
    
    @property
    def toolchain(self):
        return self.compiler
        
    def run(self, program : Path, path : Path = None) -> RunnerReturn:
        '''
            Function runs the compilation and execution process for the given
            parameters and filepaths
        '''
        if self.is_decompiler():
            return self.run_decompiler(program, path)
        else:
            return self.run_compiler(program, path)
        
    def run_compiler(self, program : Path, path : Path = None) -> RunnerReturn:
        
        compile_result = self.compile_test(program)

        if compile_result == RunnerReturn.COMPILATION_FAIL:
            return RunnerReturn.COMPILATION_FAIL
        
        exe_result = self.execute_test(program, path)
        
        if exe_result == RunnerReturn.EXECUTION_FAIL:
            return RunnerReturn.EXECUTION_FAIL

        return RunnerReturn.SUCCESS
        
             
    def run_decompiler(self, test_name : Path, path : Path = None) -> RunnerReturn:
        
        compile_result = self.compile_test(test_name)

        if compile_result != 0:
            return RunnerReturn.COMPILATION_FAIL
                    
        decompile_result = self.decompile_test(test_name)

        if decompile_result != 0:
            return RunnerReturn.DECOMPILATION_FAIL
        
        recompile_result = self.recompile_test(test_name)

        if recompile_result != 0:
            return RunnerReturn.RECOMPILATION_FAIL
        
        exe_result = self.execute_test(test_name, test_id, path_name)
        
        if exe_result != 0:
            return RunnerReturn.EXECUTION_FAIL
        
        return RunnerReturn.SUCCESS

    def is_decompiler(self):
        if self.toolchain in ['CFR', 'FERNFLOWER', 'PROCYON']:
            return True
        
        return False

    def compile_test(self, program : Path) -> int:

        #TODO: Add reflection

        return self.compile_test_without_reflection(program)

    def compile_test_without_reflection(self, program : Path) -> RunnerReturn:    

        class_location = f'{str(program.parent)}/{str(program.stem)}'

        compile_test_cmd = [f'{self.jvm}',
                    '-jar',
                    str(self.jasmin),
                    str(program),
                    '-d',
                    class_location]
        
        compile_test_result = subprocess.run(compile_test_cmd)

        if compile_test_result.returncode != 0:
            return RunnerReturn.COMPILATION_FAIL
    
        compile_wrapper_cmd = [str(self.javac),
                    '-cp',
                    f':{class_location}:/data/dev/java/json-simple-1.1.1.jar',
                    str(self.wrapper),
                    '-d',
                    class_location]
        
        compile_wrapper_result = subprocess.run(compile_wrapper_cmd)
        
        if compile_wrapper_result.returncode != 0:
            return RunnerReturn.COMPILATION_FAIL
        
        return RunnerReturn.SUCCESS
    
    def compile_test_with_reflection(self, test_name : str) -> int:   

        interface_cmd = [f'{self.filepaths.jvm}/javac',
                        f'{self.filepaths.src_filepath}/testing/TestCaseInterface.java']
                
        interface_result = subprocess.run(interface_cmd, shell=True)

        if interface_result.returncode != 0:
            return interface_result.returncode

        wrapper_cmd = [f'{self.filepaths.jvm}/javac',
                        f'{self.filepaths.src_filepath}/testing/Wrapper.java']
        
        wrapper_result = subprocess.run(wrapper_cmd, shell=True)

        if wrapper_result.returncode != 0:
            return wrapper_result.returncode

        compile_cmd = [f'{self.filepaths.jvm}/java',
                    '- jar',
                    f'{self.filepaths.jasmin}/jasmin.jar',
                    f'{self.filepaths.src}/testing/{test_id}.j']

        compile_result = subprocess.run(compile_cmd, shell=True)

        return compile_result.returncode

    def decompile_test(self, test_name : str) -> int:
            
            # decompilation syntax varies depending on which decompiler toolchain is used

            if self.params.decompiler.value == Decompiler.CFR.value:
            
                decompile_cmd = [f'''./javabc/decompile_test_cfr.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm} {self.filepaths.decompiler_path}''']
            
            elif self.params.decompiler.value == Decompiler.FERNFLOWER.value:

                decompile_cmd = [f'''./javabc/decompile_test_fernflower.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm} {self.filepaths.decompiler_path}''']
            
            elif self.params.decompiler.value == Decompiler.PROCYON.value:
                decompile_cmd = [f'''./javabc/decompile_test_procyon.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm} {self.filepaths.decompiler_path}''']
            
            # if decompilation cmd failed or decompilation threw exception
            decompile_result = subprocess.run(decompile_cmd, shell=True)

            if decompile_result.returncode != 0:
                return 1
            
            return 0


    def recompile_test(self, test_name : str) -> int:
            
            compile_cmd = [f'''./javabc/recompile_java_no_ref.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm}''']
            compile_result = subprocess.run(compile_cmd, shell=True)

            return compile_result.returncode
            
    def execute_test(self, program : Path, path : Path) -> RunnerReturn:
        
        #TODO:Add reflection
        class_location = f'{str(program.parent)}/{str(program.stem)}'

        exe_cmd = [f'{self.jvm}',
                '-cp',
                f':{class_location}:/data/dev/java/json-simple-1.1.1.jar',
                'Wrapper',
                str(path),
                f'{class_location}/output.txt',
                f'{class_location}/bad_output.txt',
                f'{self.n_function_repeats}',
                '-XX:CompileThreshold=100']
                     
        result = subprocess.run(exe_cmd)

        return RunnerReturn.EXECUTION_FAIL if result.returncode != 0 else RunnerReturn.SUCCESS
