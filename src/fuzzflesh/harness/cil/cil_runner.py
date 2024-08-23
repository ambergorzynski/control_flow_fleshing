import subprocess
import os
from pathlib import Path

from fuzzflesh.harness.runner import Runner
from fuzzflesh.common.utils import Compiler, Lang, RunnerReturn

class CILRunner(Runner):

    def __init__(self, 
                _toolchain : Compiler,
                _decompiler_path : Path,
                _output : Path,
                _dirs : bool):
        super(Runner, self).__init__()
        self.compiler_name : Compiler = _toolchain
        self.output : Path = _output
        self.dirs_known : bool = _dirs
        self.wrapper : Path = Path(_output, 'Wrapper.cs')
        self.decompiler_path : Path = _decompiler_path

        self.wrapper_exe : Path = Path(_output, 'Wrapper.exe')

    @property
    def language(self):
        return Lang.CIL
    
    @property
    def toolchain(self):
        return self.compiler_name

    def is_decompiler(self):
        return True if self.compiler_name in [Compiler.ILSPY] else False

    def compile(self, program : Path, path : Path) -> RunnerReturn:

        self.compile_wrapper()

        if self.is_decompiler():
            # We compile, decompile, and re-compile the program
            print('Assembling to exe...')
            if self.compile_test(program) != RunnerReturn.SUCCESS:
                print('Compilation failed!')
                return RunnerReturn.COMPILATION_FAIL

            print('Decompiling...')
            if self.decompile_test(program) != RunnerReturn.SUCCESS:
                print('Decompilation failed!')
                return RunnerReturn.DECOMPILATION_FAIL
                        
            print('Recompiling...')
            if self.recompile_test(program) != RunnerReturn.SUCCESS:
                print('Recompilation failed!')
                return RunnerReturn.RECOMPILATION_FAIL

            print('Linking...')
            if self.link_test(program) != RunnerReturn.SUCCESS:
                print('Linking failed!')
                return RunnerReturn.RECOMPILATION_FAIL

        else:
            pass

        return RunnerReturn.SUCCESS

    def execute(self, program : Path, path : Path) -> RunnerReturn:

        return self.execute_test(get_exe_name(program), path)

    def compile_wrapper(self) -> int:

        cmd = ['csc',
               str(self.wrapper),
               f'-out:{str(self.wrapper_exe)}']
   
        result = subprocess.run(cmd)

        return result.returncode 
   
    def compile_test(self, program : Path) -> RunnerReturn:

        cmd = ['ilasm',
                str(program),
                f'-output:{str(get_compiled_name(program))}',
                ]

        result = subprocess.run(cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.COMPILATION_FAIL
    
    def decompile_test(self, program : Path) -> RunnerReturn:
        
        cmd = [str(self.decompiler_path),
               str(get_compiled_name(program)),
               '--outputdir',
               str(program.parent)]

        result = subprocess.run(cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.DECOMPILATION_FAIL

    def recompile_test(self, program : Path):

        #TODO: move to appropriate fn
        #Ghidra sometimes inserts a function __stack_chk_fail() that is not defined in the c file
        line = 'void __stack_chk_fail(){return;}'
        with open(get_decomp_name(program), 'r+') as f:
            prog = f.read()
            f.seek(0, 0)
            f.write(line.rstrip('\r\n') + '\n' + prog)

        cmd = [str(self.compiler_path),
                str(get_decomp_name(program)),
                "-c",
                "-o",
                str(get_recomp_name(program))]
        
        result = subprocess.run(cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.RECOMPILATION_FAIL

    def link_test(self, program : Path):
                
        cmd = [str(self.compiler_path),
                str(get_recomp_name(program)),
                str(self.wrapper),
                "-o",
                str(get_recomp_exe_name(program))]
        
        env = os.environ.copy()

        env['CPLUS_INCLUDE_PATH']=str(self.include_path)

        result = subprocess.run(cmd, env=env)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.LINKING_FAIL

    def execute_test(self, executable : Path, path : Path) -> RunnerReturn:
        
        exe_cmd = [str(executable),
                str(path),
                str(self.output) + '/out.txt',
                str(self.output) + '/bug.txt'
                ]

        result = subprocess.run(exe_cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.EXECUTION_FAIL

def get_compiled_name(program : Path) -> Path:
    return Path(program.parent, f'{program.stem}.exe')

def get_decomp_name(program : Path) -> Path: 
    return Path(program.parent, f'decompiled_{program.stem}.cs')

def get_recomp_name(program : Path) -> Path:
    return Path(program.parent, f'recompiled_{program.stem}.exe')

