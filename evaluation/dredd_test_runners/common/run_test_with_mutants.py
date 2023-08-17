from enum import Enum
import os
from pathlib import Path
from typing import List

from dredd_test_runners.common.run_process_with_timeout import ProcessResult, run_process_with_timeout
from dredd_test_runners.common.hash_file import hash_file


class KillStatus(Enum):
    SURVIVED_IDENTICAL = 1
    SURVIVED_BINARY_DIFFERENCE = 2
    KILL_COMPILER_CRASH = 3
    KILL_COMPILER_TIMEOUT = 4
    KILL_RUNTIME_TIMEOUT = 5
    KILL_DIFFERENT_EXIT_CODES = 6
    KILL_DIFFERENT_STDOUT = 7
    KILL_DIFFERENT_STDERR = 8

#TODO: added None defaults for args coming from compiling the unmutated test case for now
def run_test_with_mutants(mutants: List[int],
                          compiler_path: str,
                          compiler_args: List[str],
                          mutant_program_path : Path,
                          mutant_obj_path : Path,
                          mutant_exe_path: Path,
                          compile_time: float = None,
                          run_time: float = None,
                          binary_hash_non_mutated: str = None,
                          execution_result_non_mutated: ProcessResult = None,) -> KillStatus:


    # Use opt with specific mutant enabled to go from prog.ll -> optimised prog.ll
    mutated_environment = os.environ.copy()
    mutated_environment["DREDD_ENABLED_MUTATION"] = ','.join([str(m) for m in mutants])
    if mutant_exe_path.exists():
        os.remove(mutant_exe_path)
    mutated_cmd = [compiler_path] + compiler_args + ['-o', str(mutant_program_path)]

    mutated_result: ProcessResult = run_process_with_timeout(cmd=mutated_cmd,
                                                             timeout_seconds=int(max(1.0, 5.0 * compile_time)),
                                                             env=mutated_environment)
    if mutated_result is None:
        return KillStatus.KILL_COMPILER_TIMEOUT

    if mutated_result.returncode != 0:
        return KillStatus.KILL_COMPILER_CRASH
    
    print(mutated_result.returncode)
    '''
    if binary_hash_non_mutated == hash_file(str(mutant_exe_path)):
        return KillStatus.SURVIVED_IDENTICAL
    '''
    # Go from optimised prog.ll -> prog.exe by compiling prog.ll and linking with wrapper
    #TODO: create function to perform the rest of the compilation process
    
    # prog.ll -> prog.o
    cmd = ['/Users/ambergorzynski/dev/llvm-project-mutated/build/bin/llc', 
                 '-filetype=obj',
                 "-o", 
                 mutant_obj_path]

    mutated_obj_result : ProcessResult = run_process_with_timeout(cmd=cmd, timeout_seconds=5)

    # link prog.o and wrapper.o -> prog.exe
    cmd = ["clang++", 
                 "Wrapper.o",
                 mutant_obj_path, 
                 "-o",
                 mutant_exe_path]
    
    if mutated_obj_result is None:
        return KillStatus.KILL_COMPILER_TIMEOUT

    if mutated_obj_result.returncode != 0:
        return KillStatus.KILL_COMPILER_CRASH
    
    mutated_link_result : ProcessResult = run_process_with_timeout(cmd = cmd, timeout_seconds=5)

    if mutated_link_result is None:
        return KillStatus.KILL_COMPILER_TIMEOUT

    if mutated_link_result.returncode != 0:
        return KillStatus.KILL_COMPILER_CRASH

    '''

    # Run the executable and check results
    # TODO: check whether actual/expected output are the same within run_process_with_timeout
    mutated_execution_result: ProcessResult = run_process_with_timeout(cmd=[str(mutant_exe_path)],
                                                                       timeout_seconds=int(max(1.0, 5.0 * run_time)))
    if mutated_execution_result is None:
        return KillStatus.KILL_RUNTIME_TIMEOUT

    if execution_result_non_mutated.returncode != mutated_execution_result.returncode:
        return KillStatus.KILL_DIFFERENT_EXIT_CODES

    if execution_result_non_mutated.stdout != mutated_execution_result.stdout:
        return KillStatus.KILL_DIFFERENT_STDOUT

    if execution_result_non_mutated.stderr != mutated_execution_result.stderr:
        return KillStatus.KILL_DIFFERENT_STDERR

    return KillStatus.SURVIVED_BINARY_DIFFERENCE

    '''