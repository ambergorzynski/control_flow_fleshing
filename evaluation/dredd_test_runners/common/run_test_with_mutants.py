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


def run_test_with_mutants(mutants: List[int],
                          compiler_path: str,
                          compiler_args: List[str],
                          compile_time: float,
                          run_time: float,
                          binary_hash_non_mutated: str,
                          execution_result_non_mutated: ProcessResult,
                          mutant_exe_path: Path) -> KillStatus:
    mutated_environment = os.environ.copy()
    mutated_environment["DREDD_ENABLED_MUTATION"] = ','.join([str(m) for m in mutants])
    if mutant_exe_path.exists():
        os.remove(mutant_exe_path)
    mutated_cmd = [compiler_path] + compiler_args + ['-o', str(mutant_exe_path)]
    mutated_result: ProcessResult = run_process_with_timeout(cmd=mutated_cmd,
                                                             timeout_seconds=int(max(1.0, 5.0 * compile_time)),
                                                             env=mutated_environment)
    if mutated_result is None:
        return KillStatus.KILL_COMPILER_TIMEOUT

    if mutated_result.returncode != 0:
        return KillStatus.KILL_COMPILER_CRASH

    if binary_hash_non_mutated == hash_file(str(mutant_exe_path)):
        return KillStatus.SURVIVED_IDENTICAL

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
