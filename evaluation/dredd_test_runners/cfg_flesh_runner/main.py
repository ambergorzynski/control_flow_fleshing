import argparse
import shutil
import subprocess

import json
import os
import random
import tempfile
import time

#TODO: replace with cfg fleshed test program
#from dredd_test_runners.csmith_runner.prepare_csmith_program import prepare_csmith_program 
from dredd_test_runners.common.run_process_with_timeout import ProcessResult, run_process_with_timeout
from dredd_test_runners.common.run_test_with_mutants import run_test_with_mutants, KillStatus
from dredd_test_runners.common.mutation_tree import MutationTree
from dredd_test_runners.common.hash_file import hash_file

from pathlib import Path
from typing import List, Set


def still_testing(start_time_for_overall_testing: float,
                  time_of_last_kill: float,
                  total_test_time: int,
                  maximum_time_since_last_kill: int) -> bool:
    if 0 < total_test_time < int(time.time() - start_time_for_overall_testing):
        return False
    if 0 < maximum_time_since_last_kill < int(time.time() - time_of_last_kill):
        return False
    return True


def main():
    start_time_for_overall_testing: float = time.time()
    time_of_last_kill: float = start_time_for_overall_testing

    parser = argparse.ArgumentParser()
    parser.add_argument("mutation_info_file",
                        help="File containing information about mutations, generated when Dredd was used to actually "
                             "mutate the source code.",
                        type=Path)
    parser.add_argument("mutation_info_file_for_mutant_coverage_tracking",
                        help="File containing information about mutations, generated when Dredd was used to "
                             "instrument the source code to track mutant coverage; this will be compared against the "
                             "regular mutation info file to ensure that tracked mutants match applied mutants.",
                        type=Path)
    parser.add_argument("mutated_compiler_executable",
                        help="Path to the executable for the Dredd-mutated compiler opt.",
                        type=Path)
    parser.add_argument("mutant_tracking_compiler_executable",
                        help="Path to the executable for the compiler instrumented to track mutants.",
                        type=Path)
    parser.add_argument("csmith_root", help="Path to a checkout of Csmith, assuming that it has been built under "
                                            "'build' beneath this directory.",
                        type=Path)
    parser.add_argument("mutated_llc_executable",
                        help="Path to the executable for the Dredd-mutated compiler llc.",
                        type=Path)
    parser.add_argument("--generator_timeout",
                        default=20,
                        help="Time in seconds to allow for generation of a program.",
                        type=int)
    parser.add_argument("--compile_timeout",
                        default=5,
                        help="Time in seconds to allow for compilation of a generated program (without mutation).",
                        type=int)
    parser.add_argument("--run_timeout",
                        default=10,
                        help="Time in seconds to allow for running a generated program (without mutation).",
                        type=int)
    parser.add_argument("--seed",
                        help="Seed for random number generator.",
                        type=int)
    parser.add_argument("--total_test_time",
                        default=86400,
                        help="Total time to allow for testing, in seconds. Default is 24 hours. To test indefinitely, "
                             "pass 0.",
                        type=int)
    parser.add_argument("--maximum_time_since_last_kill",
                        default=86400,
                        help="Cease testing if a kill has not occurred for this length of time. Default is 24 hours. "
                             "To test indefinitely, pass 0.",
                        type=int)
    parser.add_argument("--optimisations",
                        default='default<O3>',
                        help="Invoke specific LLVM optimisation passes. Default is level O3.",
                        type=str)
    args = parser.parse_args()

    assert args.mutation_info_file != args.mutation_info_file_for_mutant_coverage_tracking

    print("Building the real mutation tree...")
    with open(args.mutation_info_file, 'r') as json_input:
        mutation_tree = MutationTree(json.load(json_input))
    print("Built!")
    print("Building the mutation tree associated with mutant coverage tracking...")
    with open(args.mutation_info_file_for_mutant_coverage_tracking, 'r') as json_input:
        mutation_tree_for_coverage_tracking = MutationTree(json.load(json_input))
    print("Built!")
    print("Checking that the two mutation trees match...")
    assert mutation_tree.mutation_id_to_node_id == mutation_tree_for_coverage_tracking.mutation_id_to_node_id
    assert mutation_tree.parent_map == mutation_tree_for_coverage_tracking.parent_map
    assert mutation_tree.num_nodes == mutation_tree_for_coverage_tracking.num_nodes
    assert mutation_tree.num_mutations == mutation_tree_for_coverage_tracking.num_mutations
    print("Check complete!")
    total_mutations = mutation_tree.num_mutations
    print(f'Total number of mutations is: {mutation_tree.num_mutations}')


    if args.seed is not None:
        random.seed(args.seed)

    with tempfile.TemporaryDirectory() as temp_dir_for_generated_code:
        fleshing_generated_program: Path = Path(temp_dir_for_generated_code, '__prog.ll')
        #dredd_covered_mutants_path: Path = Path(temp_dir_for_generated_code, '__dredd_covered_mutants')
        dredd_covered_mutants_path: Path = Path('/Users/ambergorzynski/Documents/cfg/repo/control_flow_fleshing/evaluation/__dredd_covered_mutants')
        unmutated_program : Path = Path(temp_dir_for_generated_code, '__regular.ll')
        unmutated_obj : Path = Path(temp_dir_for_generated_code, '__regular.o')
        generated_program_exe_compiled_with_no_mutants = Path(temp_dir_for_generated_code, '__regular.exe')
        generated_program_exe_compiled_with_mutant_tracking = Path(temp_dir_for_generated_code, '__tracking.exe')
        mutant_program : Path = Path(temp_dir_for_generated_code, '__mutant.ll')
        mutant_obj : Path = Path(temp_dir_for_generated_code, '__mutant.o')
        mutant_exe = Path(temp_dir_for_generated_code, '__mutant.exe')

        killed_mutants: Set[int] = set()
        unkilled_mutants: Set[int] = set(range(0, mutation_tree.num_mutations))

        print('\nunkilled mutants')
        print(unkilled_mutants)

        # Make a work directory in which information about the mutant killing process will be stored. If this already
        # exists that's OK - there may be other processes working on mutant killing, or we may be continuing a job that
        # crashed previously.
        workdir = f'work_flesh_{args.optimisations}'
        Path(workdir).mkdir(exist_ok=True)
        Path(f'{workdir}/tests').mkdir(exist_ok=True)
        Path(f'{workdir}/killed_mutants').mkdir(exist_ok=True)

        '''
        while still_testing(total_test_time=args.total_test_time,
                            maximum_time_since_last_kill=args.maximum_time_since_last_kill,
                            start_time_for_overall_testing=start_time_for_overall_testing,
                            time_of_last_kill=time_of_last_kill):
        '''    

        # loop over set number of test cases rather than testing for a certain time period
        for graph in range(100):
            for path in range(10):

                if dredd_covered_mutants_path.exists():
                    os.remove(dredd_covered_mutants_path)
                if fleshing_generated_program.exists():
                    os.remove(fleshing_generated_program)
                if generated_program_exe_compiled_with_no_mutants.exists():
                    os.remove(generated_program_exe_compiled_with_no_mutants)
                if generated_program_exe_compiled_with_mutant_tracking.exists():
                    os.remove(generated_program_exe_compiled_with_mutant_tracking)

                # TODO:Generate a CFG fleshing program here. For now, just cp a test .ll program directly
                # into the folder fleshing_generated_program
                cmd = [f'''cp dredd_test_runners/cfg_flesh_runner/fleshing_progs/llvm/run_cfg_{graph}_path_{path}.ll {fleshing_generated_program}''']
                subprocess.run(cmd, shell=True)

                
                fleshing_seed = random.randint(0, 2 ** 32 - 1)
            
                # Compile the program without mutation.
                # Args for opt tool; this is what we are mutating and testing
                compiler_args = [f'-passes={args.optimisations}',
                        "-S",
                        fleshing_generated_program]
                
                compile_time_start: float = time.time()

                # Run un-mutated opt on .ll program 
                regular_compile_cmd = [args.mutated_compiler_executable]\
                    + compiler_args\
                    + ["-o", unmutated_program]

                compile_time_start: float = time.time()
                regular_opt_result: ProcessResult = run_process_with_timeout(cmd=regular_compile_cmd,
                                                                                timeout_seconds=args.compile_timeout)
                
                print(f'opt result is: {regular_opt_result.returncode}')

                

                subprocess.run(f'cp {unmutated_program} test/unmutated.ll',shell=True)

                
                regular_llc_cmd = [args.mutated_llc_executable,
                                "-filetype=obj",
                                unmutated_program,
                                "-o", unmutated_obj]
                
                regular_compile_result: ProcessResult = run_process_with_timeout(cmd=regular_llc_cmd,
                                                                                timeout_seconds=args.compile_timeout)
                
                print(f'llc result is: {regular_compile_result.returncode}')
                subprocess.run(f'cp {unmutated_obj} test/unmutated.o',shell=True)


                compile_time_end: float = time.time()
                compile_time = compile_time_end - compile_time_start

                print(f'compile time with unmutated compiler is {compile_time}')

                if regular_compile_result is None:
                    print("Compiler timeout.")
                    continue
                if regular_compile_result.returncode != 0:
                    print("Compilation failed without mutants.")
                    print(f"stdout: {regular_compile_result.stdout.decode('utf-8')}")
                    print(f"stderr: {regular_compile_result.stderr.decode('utf-8')}")
                    continue

                regular_hash = hash_file(str(unmutated_program))
                
                # link unmutated test and wrapper
                linking_cmd = ["/usr/bin/clang++", 
                                "Wrapper.o",
                                unmutated_obj, 
                                "-o",
                                generated_program_exe_compiled_with_no_mutants]
                
                regular_linking_result: ProcessResult = run_process_with_timeout(
                    cmd=linking_cmd, timeout_seconds=args.run_timeout)
                
                print(f'linking result is: {regular_linking_result.returncode}')

                # execute unmutated program
                execution_cmd = [generated_program_exe_compiled_with_no_mutants, 
                    f'dredd_test_runners/cfg_flesh_runner/fleshing_progs/input/input_graph_{graph}_path{path}.txt',
                    "test/results_n.txt",
                    "test/bugs_n.txt"]
                
                run_time_start: float = time.time()
                regular_execution_result: ProcessResult = run_process_with_timeout(
                    cmd=execution_cmd, timeout_seconds=args.run_timeout)
                run_time_end: float = time.time()
                run_time = run_time_end - run_time_start

                print(f'unmutated execution result is: {regular_execution_result.returncode}')

                

                if regular_execution_result is None:
                    print("Runtime timeout.")
                    continue
                if regular_execution_result.returncode != 0:
                    print("Execution of generated program failed without mutants.")
                    continue

                

                # Args for opt tool; this is what we are mutating and testing
                compiler_args = [f'-passes={args.optimisations}',
                        "-S",
                        fleshing_generated_program]


                # Compile the program with the mutant tracking compiler.
                tracking_environment = os.environ.copy()
                tracking_environment["DREDD_MUTANT_TRACKING_FILE"] = str(dredd_covered_mutants_path)
                tracking_compile_cmd = [args.mutant_tracking_compiler_executable]\
                    + compiler_args\
                    + ["-o", generated_program_exe_compiled_with_mutant_tracking]
                
                
                if run_process_with_timeout(cmd=tracking_compile_cmd, timeout_seconds=args.compile_timeout,
                                            env=tracking_environment) is None:
                    print("Mutant tracking compilation timed out.")
                    continue
                
                
                # Try to create a directory for this test. It is very unlikely that it already exists, but this could
                # happen if two test workers pick the same seed. If that happens, this worker will skip the test.
                fleshing_test_name: str = f'graph_{graph}_path_{path}'
                test_output_directory: Path = Path(f'{workdir}/tests/{fleshing_test_name}')
                try:
                    test_output_directory.mkdir()
                    print(f'Directory created at: {test_output_directory}')
                except FileExistsError:
                    print(f"Skipping seed {fleshing_seed} as a directory for it already exists")
                    continue
                shutil.copy(src=fleshing_generated_program, dst=test_output_directory / "prog.ll")

                
                
                # Load file contents into a list. We go from list to set to list to eliminate duplicates.            
                covered_by_this_test: List[int] = list(set([int(line.strip()) for line in
                                                            open(dredd_covered_mutants_path, 'r').readlines()]))
                covered_by_this_test.sort()
                number_mutants_covered_by_this_test = len(covered_by_this_test)
                candidate_mutants_for_this_test: List[int] = ([m for m in covered_by_this_test if m not in killed_mutants])
                print("Number of mutants to try: " + str(len(candidate_mutants_for_this_test)))

                print('\ncovered mutants')
                print(covered_by_this_test)

                # write mutant summary info to output file
                with open(f'{workdir}/mutant_summary_{fleshing_test_name}.json', 'w') as outfile:
                    json.dump({"test_name" : fleshing_test_name,
                            "total_mutants" : total_mutations,
                            "n_covered_mutants" : number_mutants_covered_by_this_test},
                            outfile)
                
                
                already_killed_by_other_tests: List[int] = ([m for m in covered_by_this_test if m in killed_mutants])
                killed_by_this_test: List[int] = []
                covered_but_not_killed_by_this_test: List[int] = []

                for mutant in candidate_mutants_for_this_test:

                    if not still_testing(total_test_time=args.total_test_time,
                                        maximum_time_since_last_kill=args.maximum_time_since_last_kill,
                                        start_time_for_overall_testing=start_time_for_overall_testing,
                                        time_of_last_kill=time_of_last_kill):
                        break

                    mutant_path = Path(f'{workdir}/killed_mutants/' + str(mutant))
                    
                    if mutant_path.exists():
                        print("Skipping mutant " + str(mutant) + " as it is noted as already killed.")
                        unkilled_mutants.remove(mutant)
                        killed_mutants.add(mutant)
                        already_killed_by_other_tests.append(mutant)
                        continue
            

                    print("Trying mutant " + str(mutant))
                    mutant_result = run_test_with_mutants(mutants=[mutant],
                                                        compiler_path=str(args.mutated_compiler_executable),
                                                        compiler_args=compiler_args,
                                                        compile_time=compile_time,
                                                        run_time=run_time,
                                                        binary_hash_non_mutated=regular_hash,
                                                        execution_result_non_mutated=regular_execution_result,
                                                        mutant_program_path = mutant_program,
                                                        mutant_obj_path = mutant_obj,
                                                        mutant_exe_path=mutant_exe)
                    
                    print("Mutant result: " + str(mutant_result))
                
            
                    if mutant_result == KillStatus.SURVIVED_IDENTICAL \
                            or mutant_result == KillStatus.SURVIVED_BINARY_DIFFERENCE:
                        covered_but_not_killed_by_this_test.append(mutant)
                        continue

                    unkilled_mutants.remove(mutant)
                    killed_mutants.add(mutant)
                    killed_by_this_test.append(mutant)
                    time_of_last_kill = time.time()
                    print(f"Kill! Mutants killed so far: {len(killed_mutants)}")
                    try:
                        mutant_path.mkdir()
                        print("Writing kill info to file.")
                        with open(mutant_path / "kill_info.json", "w") as outfile:
                            json.dump({"killing_test": fleshing_test_name,
                                    "kill_type": str(mutant_result)}, outfile)
                    except FileExistsError:
                        print(f"Mutant {mutant} was independently discovered to be killed.")
                        continue

                terminating_test_process: bool = not still_testing(
                    total_test_time=args.total_test_time,
                    maximum_time_since_last_kill=args.maximum_time_since_last_kill,
                    start_time_for_overall_testing=start_time_for_overall_testing,
                    time_of_last_kill=time_of_last_kill)

                all_considered_mutants = killed_by_this_test \
                    + covered_but_not_killed_by_this_test \
                    + already_killed_by_other_tests
                all_considered_mutants.sort()

                if covered_by_this_test != all_considered_mutants:
                    assert terminating_test_process
                    terminated_early: bool = True
                else:
                    terminated_early: bool = False

                killed_by_this_test.sort()
                covered_but_not_killed_by_this_test.sort()
                already_killed_by_other_tests.sort()
                with open(test_output_directory / "kill_summary.json", "w") as outfile:
                    json.dump({"terminated_early": terminated_early,
                            "total_mutants" : total_mutations,
                            "n_covered_mutants" : number_mutants_covered_by_this_test,
                            "covered_mutants": covered_by_this_test,
                            "killed_mutants": killed_by_this_test,
                            "skipped_mutants": already_killed_by_other_tests,
                            "survived_mutants": covered_but_not_killed_by_this_test}, outfile)


if __name__ == '__main__':
    main()
