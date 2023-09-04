import subprocess
import argparse

def main():
    
    parser = argparse.ArgumentParser()
    
    parser.add_argument("clang_path",type=str)
    
    args = parser.parse_args()

    test_folder = '/home/user42/amber-demo/flesh_tests_for_clang'

    for i in range(100):
        for j in range(10):
            print(f'running opt on test {i}, {j}')
            result = subprocess.run(f'''{args.clang_path}/clang -c {test_folder}/run_cfg_{i}_path_{j}.ll -o {test_folder}/run_cfg_{i}_path{j}.o -O3''', shell=True)

    
    """
    for i in range(100):
        for j in range(10):
            try:
                print(f'running opt on test {i}, {j}')
                result = subprocess.run(f'''{args.clang_path}/clang -c {test_folder}/run_cfg_{i}_path_{j}.ll -o {test_folder}/run_cfg_{i}_path{j}.o -O3''', shell=True, timeout = 5)

            except subprocess.TimeoutExpired:
                print(f'Timeout expired for {i}, {j}')
    """

if __name__=="__main__":
    main()
