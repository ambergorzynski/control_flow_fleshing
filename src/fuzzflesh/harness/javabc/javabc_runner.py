import subprocess
from pathlib import Path

from fuzzflesh.harness.runner import Runner
from fuzzflesh.common.utils import Compiler, Lang, RunnerReturn

class JavaBCRunner(Runner):

    def __init__(self, 
                _toolchain : Compiler,
                _jvm : Path,
                _jasmin : Path,
                _json : Path,
                _output : Path,
                _decompiler_path : Path,
                _reflection : bool):
        super(Runner, self).__init__()
        self.compiler_name : Compiler = _toolchain
        self.decompiler_path : Path = _decompiler_path
        self.output : Path = _output
        self.jvm : Path = Path(_jvm, 'java')
        self.javac : Path = Path(_jvm, 'javac')
        self.jasmin : Path = Path(_jasmin, 'jasmin.jar')
        self.json_jar : Path = Path(_json)
        self.wrapper : Path = Path(_output, 'testing/Wrapper.java') if _reflection else Path(_output,'Wrapper.java')
        self.interface : Path = Path(_output, 'testing/TestCaseInterface.java')
        self.n_function_repeats : int = 1000
        self.reflection : bool = _reflection
        
        #TODO put in CFR class
        self.cfr_main = 'org.benf.cfr.reader.Main'
        
    @property
    def language(self):
        return Lang.JAVABC
    
    @property
    def toolchain(self):
        return self.compiler_name

    def get_class_location(self, program : Path) -> str:
        return f'{str(program.parent)}/{str(program.stem)}'
    
    def get_recompiled_class_location(self, program : Path) -> str:
        return f'{str(program.parent)}/{str(program.stem)}/recompiled'

    def compile(self, program : Path, path : Path) -> RunnerReturn:

        class_location = self.get_class_location(program)

        if self.is_decompiler():

            recompiled_class_location = self.get_recompiled_class_location(program)

            # We compile, decompile, and re-compile the program
            print('Compiling...')
            if self.compile_test(program, class_location) != RunnerReturn.SUCCESS:
                return RunnerReturn.COMPILATION_FAIL

            # TODO: move the compile/decompile/recompile into main and extract execution test from here
            print('Executing to check original version...')
            if self.execute_test(program, path, self.get_class_location(program)) != RunnerReturn.SUCCESS:
                return RunnerReturn.EXECUTION_FAIL

            print('Decompiling...')
            if self.decompile_test(Path(class_location,'TestCase.class'), class_location) != RunnerReturn.SUCCESS:
                return RunnerReturn.DECOMPILATION_FAIL   

            recompiled_class_location = self.get_recompiled_class_location(program)

            print('Recompiling...')
            if self.recompile_test(Path(class_location,'TestCase.java'), recompiled_class_location) != RunnerReturn.SUCCESS:
                return RunnerReturn.RECOMPILATION_FAIL
        
        else:
            print('Compiling...')
            return self.compile_test(program, class_location)
        
        return RunnerReturn.SUCCESS
        
    def execute(self, program : Path, path : Path) -> RunnerReturn:
        print('Executing...')

        if self.is_decompiler():
            print('Executing recompiled...')
            class_location = self.get_recompiled_class_location(program)
        else:
            class_location = self.get_class_location(program)

        return self.execute_test(program, path, class_location)

    def is_decompiler(self):
        if self.toolchain in [Compiler.CFR,Compiler.PROCYON,Compiler.FERNFLOWER,Compiler.JADX]:
            return True
        
        return False

    def compile_test(self, program : Path, class_location : Path) -> int:

        if self.reflection:
            return self.compile_test_with_reflection(program, class_location)

        return self.compile_test_without_reflection(program, class_location)

    def compile_test_without_reflection(self, program : Path, class_location : Path) -> RunnerReturn:    

        compile_test_result = self.compile_testcase(program, class_location)

        if compile_test_result != 0:
            return RunnerReturn.COMPILATION_FAIL
    
        compile_wrapper_cmd = [str(self.javac),
                    '-cp',
                    f':{class_location}:{self.json_jar}',
                    str(self.wrapper),
                    '-d',
                    class_location]
        
        compile_wrapper_result = subprocess.run(compile_wrapper_cmd)

        if compile_wrapper_result.returncode != 0:
            return RunnerReturn.COMPILATION_FAIL
        
        return RunnerReturn.SUCCESS
    
    def compile_test_with_reflection(self, program: Path, class_location : Path) -> RunnerReturn:   

        compile_test_result = self.compile_testcase(program, class_location)

        if compile_test_result != 0:
            return RunnerReturn.COMPILATION_FAIL

        interface_cmd = [f'{self.javac}',
                        f'{self.interface}']
                
        interface_result = subprocess.run(interface_cmd)

        if interface_result.returncode != 0:
            print('Interface compilation failed!')
            return interface_result.returncode

        wrapper_cmd = [f'{self.javac}',
                        '-cp',
                        f':{self.output}:{self.json_jar}',
                        f'{self.wrapper}']
        
        wrapper_result = subprocess.run(wrapper_cmd)

        if wrapper_result.returncode != 0:
            print('Wrapper compilation failed!')
            return wrapper_result.returncode

        return wrapper_result.returncode

    def compile_testcase(self, program : Path, testcase_location : Path) -> int:    

        class_location = f'{str(program.parent)}/{str(program.stem)}'

        compile_test_cmd = [f'{self.jvm}',
                    '-jar',
                    str(self.jasmin),
                    str(program),
                    '-d',
                    str(testcase_location)]

        compile_test_result = subprocess.run(compile_test_cmd)

        return compile_test_result.returncode
    
    def execute_test(self, program : Path, path : Path, class_location : Path) -> RunnerReturn:

        if self.reflection:
            exe_cmd = [f'{self.jvm}',
                '-cp',
                f':{self.output}:{class_location}:{self.json_jar}',
                f'testing/Wrapper',
                f'testing.TestCase',
                str(path),
                f'{class_location}/output.txt',
                f'{class_location}/bad_output.txt',
                f'{self.n_function_repeats}',
                '-XX:CompileThreshold=100']
        else:
            exe_cmd = [f'{self.jvm}',
                '-cp',
                f':{class_location}:{self.json_jar}',
                'Wrapper',
                str(path),
                f'{class_location}/output.txt',
                f'{class_location}/bad_output.txt',
                f'{self.n_function_repeats}',
                '-XX:CompileThreshold=100']
                     
        result = subprocess.run(exe_cmd, capture_output=True)

        # Diagnose whether result is mismatch or execution failure (e.g. index out of bounds)
        if result.returncode != 0:
            if 'Expected and actual output are not the same' in result.stdout.decode('utf-8'):
                return RunnerReturn.EXECUTION_MISMATCH
            else:
                with open(Path(class_location.parent,"output_check.txt"),'a') as f:
                    f.write(result.stdout.decode('utf-8'))
                    f.write(result.stderr.decode('utf-8'))
                return RunnerReturn.EXECUTION_FAIL

        return RunnerReturn.SUCCESS
    
    def decompile_test(self, class_file : Path, outputdir : Path) -> RunnerReturn:
        
        # decompilation syntax varies depending on which decompiler toolchain is used

        if self.compiler_name == Compiler.CFR:
            
            # CFR syntax for source
            decompile_cmd = [str(self.jvm),
                        '-cp',
                        str(self.decompiler_path),
                        self.cfr_main,
                        str(class_file),
                        '--outputpath',
                        outputdir,
                        '--clobber',
                        'True']

        elif self.compiler_name == Compiler.FERNFLOWER:

            decompile_cmd = [str(self.jvm),
                        '-jar',
                        str(self.decompiler_path),
                        str(class_file),
                        outputdir]
        
        elif self.compiler_name == Compiler.JADX:

            decompile_cmd = [str(self.decompiler_path),
                        '--single-class-output',
                        str(outputdir),
                        str(class_file)]

        #TODO: allow CFR in either jar or source form (syntax varies)
        '''
            # CFR synatx for jar file
            decompile_cmd = [f'{self.jvm}',
                        '-jar',
                        str(self.compiler_path),
                        '--outputdir',
                        outputdir,
                        str(class_file)]            
        '''

        #TODO: syntax for other decompilers
        """
        elif self.params.decompiler.value == Decompiler.PROCYON.value:
            decompile_cmd = [f'''./javabc/decompile_test_procyon.sh {self.filepaths.src_filepath} {test_name} {self.filepaths.jvm} {self.filepaths.decompiler_path}''']
        """
        decompile_result = subprocess.run(decompile_cmd)

        if decompile_result.returncode != 0:
            return RunnerReturn.DECOMPILATION_FAIL
        
        # CFR can decompile successfully but throw a 'Decompilation failed' error
        if self.compiler_name == Compiler.CFR:
            with open(Path(outputdir, 'TestCase.java'),'r') as f:
                program = f.read()
                if 'Decompilation failed' in program:
                    return RunnerReturn.DECOMPILATION_FAIL

        # Fernflower throws a 'Decompilation failed' error
        if self.compiler_name == Compiler.FERNFLOWER:
            with open(Path(outputdir, 'TestCase.java'),'r') as f:
                program = f.read()
                if "$FF: Couldn't be decompiled" in program:
                    return RunnerReturn.DECOMPILATION_FAIL

        return RunnerReturn.SUCCESS
    

    def recompile_test(self, program : Path, outputdir : Path) -> RunnerReturn:
                        
        # Recompile test case
        compile_cmd = [str(self.javac),
                str(program),
                '-d',
                outputdir]

        compile_result = subprocess.run(compile_cmd)

        if compile_result.returncode != 0:
            return RunnerReturn.RECOMPILATION_FAIL

        # Compile wrapper
        compile_wrapper_cmd = [str(self.javac),
                '-cp',
                f':{str(program.parent)}:{self.json_jar}',
                str(self.wrapper),
                '-d',
                outputdir]
        
        wrapper_result = subprocess.run(compile_wrapper_cmd)

        return RunnerReturn.SUCCESS if wrapper_result.returncode == 0 else RunnerReturn.RECOMPILATION_FAIL


            
