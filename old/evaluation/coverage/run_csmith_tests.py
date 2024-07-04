import os
import subprocess
import argparse
import random

def main():
    
    parser = argparse.ArgumentParser()

    parser.add_argument("n_tests", type=int)
    parser.add_argument("folder", type=str)
    parser.add_argument("llvm_path",type=str)
    
    args = parser.parse_args()

    csmith_path='/home/user42/csmith-build/bin'
    csmith_include='/home/user42/csmith-build/include'

    optimisations = ['O1', 'O2', 'O3', 'Os', 'Oz']

    for i in range(int(args.n_tests)):
        
        #choose random optimisation level
        opt = random.choice(optimisations)
        print(f'opt is: {opt}')

        #run test
        subprocess.run(f'{csmith_path}/csmith > {args.folder}/random{i}.c', shell=True)
        try:
            result = subprocess.run(f'{args.llvm_path}/clang -I {csmith_include} {args.folder}/random{i}.c -o {args.folder}/random{i} -{opt}', shell=True, timeout = 5)
            result = subprocess.run(f'./{args.folder}/random{i}', shell=True, timeout=1)

        except subprocess.TimeoutExpired:
            print(f'Timeout expired for {i}')


if __name__=="__main__":
    main()
