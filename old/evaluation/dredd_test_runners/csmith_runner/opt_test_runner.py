#TODO: revise main.py so that we aren't passing all the info to/from os
import subprocess
import main
from common.mutator import LLVM_OPTS

def main():
    
    # for each optimisation, call the test runner and pass the relevant arguments
    for mutation in LLVM_OPTS.keys():
        
        #mutation = 'loop-unroll'

        result = subprocess.run(f'./run_test {mutation}')
        print(f'Result is {result.returncode}')

if __name__=="__main__":
    main()