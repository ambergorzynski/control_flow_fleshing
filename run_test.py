import subprocess

class Tester():

    def __init__(self, test_filepath, input_filepath, output_filepath, results_name, bad_results_name):
        self.test = test_filepath
        self.out = output_filepath
        self.input = input_filepath
        self.results_name = results_name
        self.bad_results_name = bad_results_name    

    def compile(self, test_name, optimisation_list):

        # compile c++ wrapper to llvm ir
        cmd = [f'clang -emit-llvm -S run_test.cpp -o {self.out}/run_test.ll']
        result = subprocess.run(cmd, shell=True)

        # link wrapper with test program
        cmd = [f'''llvm-link {self.test}/{test_name}.ll {self.out}/run_test.ll -o {self.out}/{test_name}_out_unopt.ll''']
        result = subprocess.run(cmd, shell=True)

        # perform any optimisations
        # single 'instcount' opt hard-coded for now
        cmd = [f'''opt -passes={optimisation_list} {self.out}/{test_name}_out_unopt.ll -o {self.out}/{test_name}_opt.ll''']
        result = subprocess.run(cmd, shell=True)
        
        # generate object file
        cmd = [f'llc -filetype=obj {self.out}/{test_name}_opt.ll -o {self.out}/{test_name}_out_opt.o']
        result = subprocess.run(cmd, shell=True)

        # generate executable
        cmd = [f'clang++ {self.out}/{test_name}_out_opt.o -o {self.out}/{test_name}_out']
        result = subprocess.run(cmd, shell=True)
        

    def execute(self, test_name, path_name):
        
        cmd = [f'./{self.out}/{test_name}_out {self.input}/{path_name}.txt {self.out}/{self.results_name}.txt {self.out}/{self.bad_results_name}.txt']
        result = subprocess.run(cmd, shell=True)
        print(result.returncode)
        

    def parse_results(self):
        pass


def main():

    base = 'fuzzing/fuzzing_200623'
    test_filepath = f'{base}/llvm'
    input_filepath = f'{base}/input'
    output_filepath = f'{base}/running'
    results_name = 'results'
    bad_results_name = 'bad_results'
    test_name = 'run_cfg_0'
    path_name = 'input_graph_0_path0'
    optimisations = 'break-crit-edges,dse'

    test = Tester(test_filepath, input_filepath, output_filepath, results_name, bad_results_name)
    
    test.compile(test_name, optimisations)

    test.execute(test_name, path_name)

if __name__=="__main__":
    main()