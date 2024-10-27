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

    def get_low_level_location(self, program : Path):
        return self.get_object_name(program)

    def get_test_id(self, program : Path):
        return program.stem

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

        return self.execute_test(self.get_exe_name(program), path)

    def compile_test(self, program : Path) -> RunnerReturn:
        
        output_path = self.get_exe_name(program)

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
                    str(self.get_object_name(program)),
                    "-overwrite",
                    "-scriptPath",
                    str(self.headless_path),
                    "-postScript",
                    str(self.headless_script_name),
                    str(self.get_decomp_name(program))]
            
            
            result = subprocess.run(cmd)

        elif self.compiler_name == Compiler.ANGR:
            cmd = [str(self.decompiler_path),
                    'decompile',
                    str(self.object_name(program))]

            result = subprocess.run(cmd, capture_output=True)

            # angr output is written to stdout
            with open(str(self.get_decomp_name(program)),'w') as f:
                f.write(result.stdout.decode('utf-8'))

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.DECOMPILATION_FAIL

    def recompile_test(self, program : Path):

        if self.compiler_name == Compiler.GHIDRA:
            self.add_stack_chk_def(program)


        if self.compiler_name == Compiler.ANGR:
            self.edit_angr_prog(program)

        cmd = [str(self.compiler_path),
                str(self.get_decomp_name(program)),
                "-c",
                "-fpermissive",
                "-o",
                str(self.get_recomp_name(program))]
        
        result = subprocess.run(cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.RECOMPILATION_FAIL

    def link_test(self, program : Path):
                
        cmd = [str(self.compiler_path),
                str(self.get_recomp_name(program)),
                str(self.wrapper),
                "-o",
                str(self.get_recomp_exe_name(program))]
        
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
        
    def add_stack_chk_def(self, program : Path):
        #Ghidra sometimes inserts a function __stack_chk_fail() that is not defined in the c file
        line = 'void __stack_chk_fail(){return;}'
        with open(self.get_decomp_name(program), 'r+') as f:
            prog = f.read()
            f.seek(0, 0)
            f.write(line.rstrip('\r\n') + '\n' + prog)

    def edit_angr_prog(self, program : Path):

        if self.dirs_known:
            # Need to perform some edits on the angr output to make it 
            # recompilable:
            #   1. change function signature, which is usually mis-decompiled
            #   2. remove all 'unsigned' from the program (i.e. change to signed)
            #   3. dereference a pointer - this might be more tricky to see where
            #       it is, check a few more examples in case it's always in the same
            #       part of the program. Seems to always be in the line after v1
            #       is defined which has the format *((int *)(vn * 4 + a0)) = 0; and
            #       we need to reference vn

            with open(self.get_decomp_name(program), 'r') as f:
                prog = f.readlines()

            # replace function signature
            prog[0] = 'void run_cfg(int* a0)\n'

            # remove return statement since function is void
            prog = [line for line in prog if 'return' not in line]

            # remove all unsigned types
            prog = [line.replace('unsigned','') for line in prog]

            # program seems to use rax without dereferencing by mistake
            prog = [line if 'rax' not in line else line.replace('*','') for line in prog]

            with open(self.get_decomp_name(program), 'w') as f:
                f.write(''.join(prog))

        else:
            
            with open(self.get_decomp_name(program), 'r') as f:
                prog = f.readlines()

            # replace function signature
            prog[0] = 'void run_cfg(int* a0, int* a1)\n'

            # remove return statement since function is void
            prog = [line for line in prog if 'return' not in line]

            # remove all unsigned types
            prog = [line.replace('unsigned','') for line in prog]

            # program seems to use rax without dereferencing by mistake
            prog = [line if 'rax' not in line else line.replace('*','') for line in prog]

            with open(self.get_decomp_name(program), 'w') as f:
                f.write(''.join(prog))
            
    def get_object_name(self, program : Path) -> Path:
        return Path(program.parent, f'{program.stem}.o')

    def get_decomp_name(self, program : Path) -> Path: 
        return Path(program.parent, f'decompiled_{program.stem}.c')

    def get_recomp_name(self, program : Path) -> Path:
        return Path(program.parent, f'recompiled_{program.stem}.o')

    def get_exe_name(self, program : Path) -> Path:
        return Path(program.parent, f'{program.stem}.exe')

    def get_recomp_exe_name(self, program : Path) -> Path:
        return Path(program.parent, f'{program.stem}.exe')
