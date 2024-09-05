import subprocess
import os
from pathlib import Path

from fuzzflesh.harness.runner import Runner
from fuzzflesh.common.utils import Compiler, Lang, RunnerReturn

class CRunner(Runner):

    def __init__(self, 
                _toolchain : Compiler,
                _compiler_path : Path,
                _output : Path,
                _include : Path,
                _dirs : bool,
                _headless_path : Path = None,
                _decompiler_path : Path = None):
        super(Runner, self).__init__()
        self.compiler_name : Compiler = _toolchain
        self.compiler_path : Path = _compiler_path
        self.output : Path = _output
        self.dirs_known : bool = _dirs
        self.wrapper : Path = Path(_output, 'Wrapper.cpp')
        self.include_path : Path = _include
        self.decompiler_path : str = _decompiler_path
        self.headless_path : str = _headless_path
        self.headless_script_name : Path = Path('DecompileHeadless.java')

    @property
    def language(self):
        return Lang.C
    
    @property
    def toolchain(self):
        return self.compiler_name

    def is_decompiler(self):
        return True if self.compiler_name in [Compiler.GHIDRA, Compiler.ANGR] else False

    def compile(self, program : Path, path : Path) -> RunnerReturn:

        program_location : Path = program.parent

        if self.is_decompiler():
            # We compile, decompile, and re-compile the program
            print('Compiling to object...')
            if self.compile_test_to_object(program) != RunnerReturn.SUCCESS:
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
            print('Compiling...')
            return self.compile_test(program)

        return RunnerReturn.SUCCESS

    def execute(self, program : Path, path : Path or None) -> RunnerReturn:

        return self.execute_test(get_exe_name(program), path)

    def compile_test(self, program : Path) -> RunnerReturn:
        
        output_path = get_exe_name(program)

        cmd = [str(self.compiler_path),
                str(program),
                str(self.wrapper),
                '-o',
                str(output_path),
                '-O3']

        env = os.environ.copy()

        env['CPLUS_INCLUDE_PATH']=str(self.include_path)

        result = subprocess.run(cmd, env=env)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.COMPILATION_FAIL
    
    def compile_test_to_object(self, program : Path) -> RunnerReturn:

        output_path = Path(program.parent, f'{program.stem}.o')

        cmd = [str(self.compiler_path),
                str(program),
                "-c",
                "-o",
                str(output_path)]
       
        result = subprocess.run(cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.COMPILATION_FAIL

    def decompile_test(self, program : Path) -> RunnerReturn:
        
        if self.compiler_name == Compiler.GHIDRA:
            cmd = [str(self.decompiler_path),
                    str(self.output),
                    "Project",
                    "-import",
                    str(get_object_name(program)),
                    "-overwrite",
                    "-scriptPath",
                    self.headless_path,
                    "-postScript",
                    str(self.headless_script_name),
                    str(get_decomp_name(program))]
            
            result = subprocess.run(cmd)

        elif self.compiler_name == Compiler.ANGR:
            cmd = [str(self.decompiler_path),
                    'decompile',
                    str(get_object_name(program))]

            result = subprocess.run(cmd, capture_output=True)

            # angr output is written to stdout
            with open(str(get_decomp_name(program)),'w') as f:
                f.write(result.stdout.decode('utf-8'))

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

def get_object_name(program : Path) -> Path:
    return Path(program.parent, f'{program.stem}.o')

def get_decomp_name(program : Path) -> Path: 
    return Path(program.parent, f'decompiled_{program.stem}.c')

def get_recomp_name(program : Path) -> Path:
    return Path(program.parent, f'recompiled_{program.stem}.o')

def get_exe_name(program : Path) -> Path:
    return Path(program.parent, f'{program.stem}.exe')

def get_recomp_exe_name(program : Path) -> Path:
    return Path(program.parent, f'{program.stem}.exe')
