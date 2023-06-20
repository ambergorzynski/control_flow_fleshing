import subprocess

class Tester():

    def __init__(self):
        pass 

    def compile(self, test_filepath, test_name):

        # compile c++ wrapper to llvm ir
        cmd = ["clang -emit-llvm -S run_test.cpp -o run_test.ll"]
        result = subprocess.run(cmd, shell=True)

        # assemble wrapper llvm ir to llvm bc
        # (could do previous two steps in one go)
        cmd = ["llvm-as run_test.ll -o run_test.bc"]
        result = subprocess.run(cmd, shell=True)

        # assemble llvm ir test program to llvm bc
        cmd = [f'llvm-as {test_filepath}/{test_name}.ll -o {test_name}.bc']
        result = subprocess.run(cmd, shell=True)

        # link wrapper with test program
        cmd = [f'llvm-link {test_name}.bc run_test.bc -o {test_name}_out_unopt.bc']
        result = subprocess.run(cmd, shell=True)

        # perform any optimisations
        # single 'instcount' opt hard-coded for now
        cmd = [f'opt -passes=instcount {test_name}_out_unopt.bc -o {test_name}_opt.bc']
        result = subprocess.run(cmd, shell=True)

        # generate object file
        cmd = [f'llc -filetype=obj {test_name}_opt.bc -o {test_name}_out_opt.o']
        result = subprocess.run(cmd, shell=True)

        # generate executable
        cmd = [f'clang++ {test_name}_out_opt.o -o {test_name}_out']
        result = subprocess.run(cmd, shell=True)

    def execute(self):
        pass

    def parse_results(self):
        pass


def main():

    test = Tester()

    test.compile('test_input_llvm_programs','run_cfg_wip_graph_test')

if __name__=="__main__":
    main()
