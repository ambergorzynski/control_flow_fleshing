import subprocess
import json
from pathlib import Path

from fuzzflesh.harness.runner import Runner
from fuzzflesh.common.utils import Compiler, Lang, RunnerReturn

class CILRunner(Runner):

    def __init__(self, 
                _toolchain : Compiler,
                _decompiler_path : Path,
                _output : Path,
                _dirs : bool,
                _n_fn_repeats : int = 1000):
        super(Runner, self).__init__()
        self.compiler_name : Compiler = _toolchain
        self.output : Path = _output
        self.dirs_known : bool = _dirs
        self.wrapper : Path = Path(_output, 'Wrapper.cs')
        self.decompiler_path : Path = _decompiler_path
        self.n_fn_repeats : int = _n_fn_repeats

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

        self.convert_path(path)

        if self.compile_wrapper() != 0:
            print('Problem with wrapper compilation!')
            return RunnerReturn.COMPILATION_FAIL
        
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
            
        else:
            pass

        return RunnerReturn.SUCCESS

    def execute(self, program : Path, path : Path) -> RunnerReturn:

        return self.execute_recompiled_test(get_recomp_name(program), path)

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

        cmd = ['csc',
               '-o',
                str(get_decomp_name(program)),
                f'-out:{str(get_recomp_name(program))}']
        
        result = subprocess.run(cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.RECOMPILATION_FAIL

    def execute_recompiled_test(self, executable : Path, route : Path) -> RunnerReturn:

        txt_route = str(route).replace('.json','.txt')

        #TODO: tidy up this command with the Wrapper args
        exe_cmd = ['mono',
                str(self.wrapper_exe),
                str(executable.stem),
                txt_route,
                str(self.output) + '/out.txt',
                str(self.output) + '/bug.txt',
                str(self.n_fn_repeats),
                f'{str(executable.parent)}/' 
                ]
        
        result = subprocess.run(exe_cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.EXECUTION_FAIL
    
    def convert_path(self, path : Path):
        #TODO: convert c# wrapper to read directly from json instead of txt

        with open(path,'r') as f:
            route = json.load(f)

        dirs = ' '.join([str(d) for d in route["dirs"]])
        out = ' '.join([str(d) for d in route["expected_output"]])

        with open(str(path).replace('.json','.txt'),'w') as f:
            f.write(f'{route["dir_len"]}\n')
            f.write(f'{route["output_len"]}\n')
            f.write(dirs + '\n')
            f.write(out + '\n')


def get_compiled_name(program : Path) -> Path:
    return Path(program.parent, f'{program.stem}.exe')

def get_decomp_name(program : Path) -> Path: 
    # This naming format is fixed by ILSpy
    return Path(program.parent, f'{program.stem}.decompiled.cs')

def get_recomp_name(program : Path) -> Path:
    return Path(program.parent, f'{program.stem}.recompiled.exe')

