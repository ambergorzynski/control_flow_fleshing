import tempfile
import shutil
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

        tempdir = tempfile.TemporaryDirectory()

        print('Compiling...')
        compile_test_result = self.compile_test(test_name)

        if compile_test_result != 0:
            print('Test compilation failed!')
            return 1
        
        print('Compilation succeeded!')

        #if we are using a decompiler, then include additional step to de- and re-compile test
        if self.params.decompiler != None:
            
            print('Compiling to object file...')
            compile_object_result = self.compile_test(test_name,object=True)

            print('Decompiling...')
            decompile_result = self.decompile_test(test_name, tempdir)

            if decompile_result!=0:
                print('Decompilation failed!')
                return 1
            
            print('Recompiling...')
            recompile_result = self.recompile_test(test_name, tempdir)
            
            if recompile_result!=0:
                print('Recompilation failed!')
                return 1

            print('Linking...')
            linking_result = self.link_test(test_name, tempdir)
            
            if linking_result!=0:
                print('Linking failed!')
                return 1

        # execute test
        exe_result = self.execute_test(test_name=test_name, path_name=path_name)
        if exe_result != 0:
            print('Execution failed!')
            return 1
        
        return 0

    def link_test(self, test_name, tempdir):
        
        cmd = ["g++",
                f'{tempdir}/recomp_test_graph.o',
                f'./c/Wrapper.cpp',
                "-o",
                f'{tempdir}/{test_name}']

    def recompile_test(self, test_name, tempdir):
        
        cmd = ["g++",
                f'{tempdir}/decomp_test_graph.c',
                "-c",
                "-o",
                f'{tempdir}/recomp_test_graph.o']
        
        result = subprocess.run(cmd, shell=True)

        return result.returncode
        
    def decompile_test(self, test_name, tempdir):
        
        cmd = [self.filepaths.decompiler_filepath,
                tempdir,
                "Project",
                "-import",
                f'{self.filepaths.output_path}/test_graph.o',
                "-overwrite",
                "-scriptPath",
                "./c/DecompileHeadless.java",
                f'{tempdir}/decomp_test_graph.c']

        result = subprocess.run(cmd, shell=True)

        return result.returncode
                
    def compile_test(self, test_name : str, object : bool = False) -> int:

        if object:
            cmd = [f'{self.filepaths.compiler_path}/{self.params.compiler}',
                    f'{self.filepaths.program_filepath}/{test_name}.c',
                    f'{self.filepaths.output_filepath}/Wrapper.cpp',
                    "-c",
                    "-o",
                    f'{self.filepaths.output_filepath}/{test_name}.o']
        else:
            cmd = [f'''./c/compile_test_c.sh \
                    {self.filepaths.output_filepath} \
                    {self.filepaths.program_filepath} \
                    {test_name} \
                    "-O3" \
                    {self.filepaths.compiler_path} \
                    {self.params.compiler}''']

        result = subprocess.run(cmd, shell=True)

        return result.returncode
        
    def execute_test(self, test_name : int, path_name : str) -> int:
        
        exe_cmd = [f'''{self.filepaths.exe_filepath}/{test_name}_out \
                    {self.filepaths.path_filepath}/{path_name}.txt \
                    {self.filepaths.output_filepath}/{self.filepaths.results_name}.txt \
                    {self.filepaths.output_filepath}/{self.filepaths.bug_results_name}.txt ''']
        
        exe_result = subprocess.run(exe_cmd, shell=True)

        return exe_result.returncode
