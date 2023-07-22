import subprocess
from abc import ABC, abstractmethod

class Tester(ABC):

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
    def compile_through_shell(self, test_name : str, optimisation_list=None) -> None:
        pass

    @abstractmethod
    def execute(self, test_name : str, path_name : str) -> None:
        pass

class LLVMTester(Tester):

    def compile_wrapper(self):
        cmd = [f'''./compile_wrapper_llvm.sh {self.out}''']
        result = subprocess.run(cmd, shell=True)

    def compile_through_shell(self, test_name, optimisation_list):

        cmd = [f'''./compile_test_llvm.sh {self.out} {self.test} {test_name} "{optimisation_list}"''']
        result = subprocess.run(cmd, shell=True)

    def execute(self, test_name, path_name):
        
        cmd = [f'./{self.out}/{test_name}_out {self.input}/{path_name}.txt {self.out}/{self.results_name}.txt {self.out}/{self.bad_results_name}.txt']
        result = subprocess.run(cmd, shell=True)        


class JavaBytecodeTester(Tester):
    
    def compile_wrapper(self) -> None:
        cmd = [f'''./compile_wrapper_java.sh {self.src}''']
        result = subprocess.run(cmd, shell=True)

    def compile_through_shell(self, test_name : str) -> None:
        cmd = [f'''./compile_test_java.sh {self.src} {test_name}''']
        result = subprocess.run(cmd, shell=True)

    def execute(self, test_number : int, path_name : str, n_function_repeats : int) -> None:
        cmd = [f'''./execute_test_java.sh {self.src} {test_number} {path_name} {self.results_name} {self.bad_results_name} {n_function_repeats}''']
        result = subprocess.run(cmd, shell=True)

class CILTester(Tester):
    
    def compile_wrapper(self) -> None:
        cmd = [f'''./compile_wrapper_cil.sh {self.src}''']
        result = subprocess.run(cmd, shell=True)

    def compile_through_shell(self, test_name : str) -> None:
        cmd = [f'''./compile_test_cil.sh {self.src} {test_name}''']
        result = subprocess.run(cmd, shell=True)

    def execute(self, test_number : int, path_name : str, n_function_repeats : int, full_path : str) -> None:
        cmd = [f'''./execute_test_cil.sh {self.src} {test_number} {path_name} {self.results_name} {self.bad_results_name} {n_function_repeats} {full_path}''']
        result = subprocess.run(cmd, shell=True)


def main():

    base = 'fuzzing/fuzzing_280623'
    test_filepath = f'{base}/llvm'
    input_filepath = f'{base}/input'
    output_filepath = f'{base}/running'
    results_name = 'results'
    bad_results_name = 'bad_results'
    test_name = 'run_cfg_0'
    path_name = 'input_graph_0_path0'
    optimisations = 'simplifycfg'

    test = Tester(test_filepath, input_filepath, output_filepath, results_name, bad_results_name)
    
    #test.compile(test_name, optimisations)
    test.compile_through_shell(test_name, optimisations)

    #test.execute(test_name, path_name)

if __name__=="__main__":
    main()