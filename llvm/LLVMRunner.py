import subprocess

class LLVMRunner():

    def __init__(filepaths = FilePaths):

    def compile_wrapper(self):
        cmd = [f'''./llvm/compile_wrapper_llvm.sh {self.out}''']
        result = subprocess.run(cmd, shell=True)

    def compile_wrapper_static(self):
        cmd = [f'''./llvm/compile_wrapper_llvm_static.sh {self.out}''']
        result = subprocess.run(cmd, shell=True)

    def compile_wrapper_graalvm(self):
        cmd = [f'''./llvm/compile_wrapper_llvm_graalvm.sh {self.out}''']
        result = subprocess.run(cmd, shell=True)

    def compile_test(self, test_name, optimisation_list):

        cmd = [f'''./llvm/compile_test_llvm.sh {self.out} {self.test} {test_name} "{optimisation_list}"''']
        result = subprocess.run(cmd, shell=True)

    def compile_test_graalvm(self, test_name, optimisation_list):

        cmd = [f'''./llvm/compile_test_llvm_graalvm.sh {self.out} {self.test} {test_name} "{optimisation_list}"''']
        result = subprocess.run(cmd, shell=True)

    def execute(self, test_name, path_name):
        
        cmd = [f'./{self.out}/{test_name}_out {self.input}/{path_name}.txt {self.out}/{self.results_name}.txt {self.out}/{self.bad_results_name}.txt']
        result = subprocess.run(cmd, shell=True)    
