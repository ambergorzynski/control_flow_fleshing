import argparse
import shutil

import json
import os
import random
import tempfile
import time
import subprocess

from dredd_test_runners.csmith_runner.run_test_with_mutants_csmith import run_test_with_mutants_csmith, KillStatus
from dredd_test_runners.csmith_runner.prepare_csmith_program import prepare_csmith_program
from dredd_test_runners.common.run_process_with_timeout import ProcessResult, run_process_with_timeout
from dredd_test_runners.common.hash_file import hash_file

from pathlib import Path

def main():
    
    # filepaths
    csmith_temp_dir_for_generated_code = 'csmith_temp'
    timeout = 2
    
    csmith_include = '/$HOMEBREW_CELLAR/csmith/2.3.0/include/csmith-2.3.0'
    mutant_tracking_compiler_executable = '/Users/ambergorzynski/dev/llvm-project-tracking/build/bin/opt'

    csmith_generated_program: Path = Path(csmith_temp_dir_for_generated_code, '__prog.c')
    dredd_covered_mutants_path: Path = Path(csmith_temp_dir_for_generated_code, '__csmith_dredd_covered_mutants')
    ll_unoptimised = Path(csmith_temp_dir_for_generated_code, '__regular_unopt.ll')
    ll_opt_with_tracking = Path(csmith_temp_dir_for_generated_code, '__tracking.exe')

    # generate csmith progs
    for i in range(1):
        csmith_generated_program: Path = Path(csmith_temp_dir_for_generated_code, f'prog{i}.c')
        ll_unoptimised = Path(csmith_temp_dir_for_generated_code, f'csmith_unopt_{i}.ll')
        csmith_seed = random.randint(0, 2 ** 32 - 1)

        csmith_cmd = ["csmith", "--seed", str(csmith_seed), "-o",
                        str(csmith_generated_program)]

        if run_process_with_timeout(cmd=csmith_cmd, timeout_seconds=timeout) is None:
            print(f"Csmith timed out (seed {csmith_seed})")

        # use clang to get LLVM IR representation of csmith program: .c -> .ll
        c_to_ll_cmd = 'clang '
        c_to_ll_cmd += f'-S -emit-llvm {csmith_generated_program} '
        c_to_ll_cmd += f'-I {csmith_include} -o {ll_unoptimised}'''
        c_to_ll_cmd += f' -Xclang -disable-O0-optnone'

        c_to_ll_result = subprocess.run(c_to_ll_cmd, shell=True)
        print(f'c to ll result is {c_to_ll_result.returncode}')
    
    # optimise .ll with tracking on to generate mutant tracking file
    tracking_environment = os.environ.copy()
    tracking_environment["DREDD_MUTANT_TRACKING_FILE"] = str(dredd_covered_mutants_path)

    tracking_compile_cmd = [mutant_tracking_compiler_executable,
                            f'-passes=default<O3>',
                            '-S',
                            ll_unoptimised,
                            "-o", 
                            ll_opt_with_tracking]
    
    tracking_result = run_process_with_timeout(cmd=tracking_compile_cmd, timeout_seconds=timeout,
                                        env=tracking_environment) 
    if tracking_result is None:
        print("Mutant tracking compilation timed out.")

    print(f'tracking result is {tracking_result.returncode}')







if __name__=="__main__":
    main()