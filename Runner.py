import subprocess
from abc import ABC, abstractmethod

class Runner(ABC):

    def __init__(self, test_filepath, input_filepath, output_filepath, results_name, bad_results_name, src_filepath=None):
        self.src = src_filepath
        self.test = test_filepath
        self.out = output_filepath
        self.input = input_filepath
        self.results_name = results_name
        self.bad_results_name = bad_results_name    

    @abstractmethod
    def compile_wrapper(self) -> None:
        pass

    @abstractmethod
    def compile_test(self, test_name : str, optimisation_list=None) -> None:
        pass

    @abstractmethod
    def execute(self, test_name : str, path_name : str) -> None:
        pass

class LLVMRunner(Runner):

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


class JavaBytecodeRunner(Runner):
    
    def compile_wrapper(self) -> None:
        cmd = [f'''./javabc/compile_wrapper_java.sh {self.src}''']
        result = subprocess.run(cmd, shell=True)

    def compile_test(self, test_name : str) -> None:
        cmd = [f'''./javabc/compile_test_java.sh {self.src} {test_name}''']
        result = subprocess.run(cmd, shell=True)

    def compile_no_ref(self, test_number : int) -> None:
        cmd = [f'''./javabc/compile_java_no_ref.sh {self.src} {test_number}''']
        result = subprocess.run(cmd, shell=True)

    def execute(self, test_number : int, path_name : str, n_function_repeats : int) -> None:
        cmd = [f'''./javabc/execute_test_java.sh {self.src} {test_number} {path_name} {self.results_name} {self.bad_results_name} {n_function_repeats}''']
        result = subprocess.run(cmd, shell=True)

    def execute_no_ref(self, test_number : int, path_name : str, n_function_repeats : int) -> None:
        cmd = [f'''./javabc/execute_java_no_ref.sh {self.src} {test_number} {path_name} {self.results_name} {self.bad_results_name} {n_function_repeats}''']
        result = subprocess.run(cmd, shell=True)

class CILRunner(Runner):
    
    def compile_wrapper(self) -> None:
        cmd = [f'''./cil/compile_wrapper_cil.sh {self.src}''']
        result = subprocess.run(cmd, shell=True)
        
    def compile_test(self, test_name : str) -> None:
        cmd = [f'''./cil/compile_test_cil.sh {self.src} {test_name}''']
        result = subprocess.run(cmd, shell=True)
        
    def execute(self, test_number : int, path_name : str, n_function_repeats : int, full_path : str) -> None:
        cmd = [f'''./cil/execute_test_cil.sh {self.src} {test_number} {path_name} {self.results_name} {self.bad_results_name} {n_function_repeats} {full_path}''']
        result = subprocess.run(cmd, shell=True)

