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
                _dirs : bool):
        super(Runner, self).__init__()
        self.compiler_name : Compiler = _toolchain
        self.compiler_path : Path = _compiler_path
        self.output : Path = _output
        self.dirs_known : bool = _dirs
        self.wrapper : Path = Path(_output, 'Wrapper.cpp')
        self.include_path : Path = _include
        
    @property
    def language(self):
        return Lang.C
    
    @property
    def toolchain(self):
        return self.compiler_name

    def is_decompiler(self):
        return True if self.compiler_name in ['ghidra'] else False

    def compile(self, program : Path) -> RunnerReturn:
        if self.is_decompiler():
            pass
        else:
            return self.compile_test(program)

    def execute(self, program : Path, path : Path or None) -> RunnerReturn:

        return self.execute_test(self.get_executable(program), path)

    def get_executable(self, program : Path) -> Path:
        
        return Path(program.parent, f'{program.stem}.exe')

            
    def compile_test(self, program : Path) -> RunnerReturn:
        
        output_path = self.get_executable(program)

        cmd = [str(self.compiler_path),
                str(program),
                str(self.wrapper),
                '-o',
                str(output_path),
                '-O3']

        print(cmd)

        env = os.environ.copy()

        env['CPLUS_INCLUDE_PATH']=str(self.include_path)

        result = subprocess.run(cmd, env=env)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.COMPILATION_FAIL
    
    def compile_test_to_object(self, program : Path) -> RunnerReturn:

        output_path = Path(program.parent, f'{program.stem}.o')

        cmd = [str(self.compiler_path),
                str(program),
                str(self.wrapper),
                "-c",
                "-o",
                str(output_path)]
       
        result = subprocess.run(cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.COMPILATION_FAIL
        
    def execute_test(self, test_name : int, path_name : str) -> int:
        
        exe_cmd = [f'''{self.filepaths.exe_filepath}/{test_name}_out \
                    {self.filepaths.path_filepath}/{path_name}.txt \
                    {self.filepaths.output_filepath}/{self.filepaths.results_name}.txt \
                    {self.filepaths.output_filepath}/{self.filepaths.bug_results_name}.txt ''']
        
        exe_result = subprocess.run(exe_cmd, shell=True)

        return exe_result.returncode

    def execute_test(self, executable : Path, path : Path) -> RunnerReturn:
        
        exe_cmd = [str(executable),
                str(path),
                str(self.output) + '/out.txt',
                str(self.output) + '/bug.txt'
                ]

        result = subprocess.run(exe_cmd)

        return RunnerReturn.SUCCESS if result.returncode == 0 else RunnerReturn.EXECUTION_FAIL

