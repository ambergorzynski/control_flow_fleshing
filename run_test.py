import subprocess

class Tester():

    def __init__(self, test_filepath, input_filepath, output_filepath, results_name, optimisaitons):
        self.test = test_filepath
        self.out = output_filepath
        self.input = input_filepath
        self.results_name = results_name
        self.optimisation_list = optimisaitons

    def compile(self, test_name):

        # compile c++ wrapper to llvm ir
        cmd = [f'clang -emit-llvm -S run_test.cpp -o {self.out}/run_test.ll']
        result = subprocess.run(cmd, shell=True)

        # assemble wrapper llvm ir to llvm bc
        # (could do previous two steps in one go)
        cmd = [f'llvm-as {self.out}/run_test.ll -o {self.out}/run_test.bc']
        result = subprocess.run(cmd, shell=True)

        # assemble llvm ir test program to llvm bc
        cmd = [f'llvm-as {self.test}/{test_name}.ll -o {self.out}/{test_name}.bc']
        result = subprocess.run(cmd, shell=True)

        # link wrapper with test program
        cmd = [f'llvm-link {self.out}/{test_name}.bc {self.out}/run_test.bc -o {self.out}/{test_name}_out_unopt.bc']
        result = subprocess.run(cmd, shell=True)

        # perform any optimisations
        # single 'instcount' opt hard-coded for now
        cmd = [f'''opt -passes={self.optimisation_list} {self.out}/{test_name}_out_unopt.bc -o {self.out}/{test_name}_opt.bc''']
        result = subprocess.run(cmd, shell=True)
        
        # generate object file
        cmd = [f'llc -filetype=obj {self.out}/{test_name}_opt.bc -o {self.out}/{test_name}_out_opt.o']
        result = subprocess.run(cmd, shell=True)

        # generate executable
        cmd = [f'clang++ {self.out}/{test_name}_out_opt.o -o {self.out}/{test_name}_out']
        result = subprocess.run(cmd, shell=True)
        

    def execute(self, test_name, path_name):
        
        cmd = [f'./{self.out}/{test_name}_out {self.input}/{path_name}.txt {self.out}/{self.results_name}.txt']
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
    test_name = 'run_cfg_0'
    path_name = 'input_graph_0_path0'
    optimisations = 'break-crit-edges,dse'

    test = Tester(test_filepath, input_filepath, output_filepath, results_name, optimisations)
    
    test.compile(test_name)

    test.execute(test_name, path_name)

if __name__=="__main__":
    main()