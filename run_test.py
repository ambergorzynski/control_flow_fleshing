import subprocess

class Tester():

    def __init__(self):
        pass 

    def compile(self, test_filepath, output_filepath, test_name):

        # compile c++ wrapper to llvm ir
        cmd = [f'clang -emit-llvm -S run_test.cpp -o {output_filepath}/run_test.ll']
        result = subprocess.run(cmd, shell=True)

        # assemble wrapper llvm ir to llvm bc
        # (could do previous two steps in one go)
        cmd = [f'llvm-as {output_filepath}/run_test.ll -o {output_filepath}/run_test.bc']
        result = subprocess.run(cmd, shell=True)

        # assemble llvm ir test program to llvm bc
        cmd = [f'llvm-as {test_filepath}/{test_name}.ll -o {output_filepath}/{test_name}.bc']
        result = subprocess.run(cmd, shell=True)

        # link wrapper with test program
        cmd = [f'llvm-link {output_filepath}/{test_name}.bc {output_filepath}/run_test.bc -o {output_filepath}/{test_name}_out_unopt.bc']
        result = subprocess.run(cmd, shell=True)

        # perform any optimisations
        # single 'instcount' opt hard-coded for now
        cmd = [f'opt -passes=instcount {output_filepath}/{test_name}_out_unopt.bc -o {output_filepath}/{test_name}_opt.bc']
        result = subprocess.run(cmd, shell=True)

        # generate object file
        cmd = [f'llc -filetype=obj {output_filepath}/{test_name}_opt.bc -o {output_filepath}/{test_name}_out_opt.o']
        result = subprocess.run(cmd, shell=True)

        # generate executable
        cmd = [f'clang++ {output_filepath}/{test_name}_out_opt.o -o {output_filepath}/{test_name}_out']
        result = subprocess.run(cmd, shell=True)

    def execute(self):
        pass

    def parse_results(self):
        pass


def main():

    test = Tester()

    base = 'fuzzing/fuzzing_200623'
    test_filepath = f'{base}/llvm'
    input_filepath = f'{base}/input'
    output_filepath = f'{base}/running'
    test_name = 'run_cfg_0'
    

    test.compile(test_filepath, output_filepath, test_name)

    test.execute(input_filepath, output_filepath, test_name)

if __name__=="__main__":
    main()