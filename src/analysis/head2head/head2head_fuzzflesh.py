from pathlib import Path 
import subprocess
import os
import xml.etree.ElementTree as et
import glob
import re

import utils

FUZZFLESH = '/data/dev/fuzzflesh'


def main():
    base : Path = Path('/data/dev/head2head')
    jadx : Path = Path(base, 'jadx_ff')
    output : Path = Path('/data/work/fuzzflesh/head2head/jadx/ff')
    initial_commit_output = Path(output, 'initial_commit')

    # jadx initial commit is the latest stable release
    # before the first reported JD-Tester bug
    # version is 1.4.3 released Jul 20 2022
    # first JD-Tester bug report is 10 Aug 2022
    jadx_commits = utils.jadx_commits

    
    # build initial jadx version
    if not utils.build_jadx(jadx, jadx_commits['initial'], jdk=17):
        exit(1)

    # run fuzzflesh for X minutes on the initial jadx version
    # this should output tests into initial_commit_output folder
    timelimit = '1'
    initial_commit_output = Path(output, 'initial_commit')
    run_cmd = ['/bin/bash', 
        'run_fuzzflesh_on_initial_commit.sh', 
        str(initial_commit_output), 
        timelimit]

    result = subprocess.run(run_cmd)
    if result.returncode != 0:
        print('Problem!')
        exit()
    '''

    # get list of tests that fail (i.e. potentially trigger a bug)
    # on the initial commit
    (failing_tests, passing_tests) = get_initial_failing_tests(initial_commit_output)

    print(f'There were {len(failing_tests)} failing tests and {len(passing_tests)} passing tests on the initial commit')
    
    # get next commit
    if not utils.build_jadx(jadx, jadx_commits['fix1'], jdk=17, jdtester_location = JDTESTER):
        exit(1)

    # attempt to decompile and execute each previously failing test
    outpath = Path(output, 'jd')
    (new_failing_tests, new_passing_tests) = get_failing_tests(initial_commit_output, outpath, failing_tests, jadx)

    print(f'Out of {len(failing_tests)} there are now:')
    print(f'\t{len(new_failing_tests)} failing tests and') 
    print(f'\t{len(new_passing_tests)} passing tests')
    '''
if __name__=="__main__":
    main()