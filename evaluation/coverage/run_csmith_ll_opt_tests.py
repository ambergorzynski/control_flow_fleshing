import os
import subprocess
import argparse
import random

def main():
    
    parser = argparse.ArgumentParser()
    
    parser.add_argument("llvm_path",type=str)
    
    args = parser.parse_args()

    test_folder = '/home/user42/amber-demo/csmith_temp'

    for i in range(100):
        
        #choose random optimisation level

        try:
            print(f'running opt on test {i}')
            result = subprocess.run(f'''{args.llvm_path}/opt -passes='default<O3>' -S {test_folder}/csmith_unopt_{i}.ll -o {test_folder}/csmith_opt_{i}.ll''', shell=True, timeout = 5)

        except subprocess.TimeoutExpired:
            print(f'Timeout expired for {i}')


if __name__=="__main__":
    main()
