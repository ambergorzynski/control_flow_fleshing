from pathlib import Path 
import subprocess
import os
import xml.etree.ElementTree as et
import glob
import re
import argparse
import json

import utils

JDTESTER = '/data/dev/jdtester_backup'

def parse_xml(xml : Path):
    # tried to parse xml but the formatting is junk
    # the error messages have not been handled properly
    # so just parse as text instead
    with open(xml, 'r') as f:
        data = f.read()

    # find SuccessOnes tag and check if it is 1 or 0
    success = data[data.find("<SuccessOnes num="):data.find("</SuccessOnes>")]

    if success[success.find("num") + 5] == '0':
        return 'Fail'
    else:
        return 'Success'


def get_initial_failing_tests(dir : Path) -> dict[Path, str]:

    failing_tests = {}
    passing_tests = {}

    for d in dir.glob('*'):    
        xml = glob.glob(f'{d}/*.xml')

        if len(xml) > 1:
            print('Problem with xml!')
            print(xml)
            exit(1)

        if len(xml) == 1:
            test_result = parse_xml(xml[0])
            if test_result != 'Success':
                failing_tests[Path(Path(xml[0]).parent)] = test_result
            else:
                passing_tests[Path(Path(xml[0]).parent)] = test_result
        
    return (failing_tests, passing_tests)

def get_failing_tests_cfr(original : Path, output : Path, original_tests : dict[Path, str], cfr : Path):
    failing_tests = {}
    passing_tests = {}

    # check if each test decompiles successfully
    for test in original_tests:
        outpath = Path(output, test.stem)

        original_testdir = Path(test,'eposide-1','1','original-1')

        decompile_cmd = ['java',
                    '-cp',
                    f'{cfr}/target/classes',
                    'org.benf.cfr.reader.Main',
                    f'{original_testdir}/Test.class',
                    '--outputpath',
                    outpath,
                    '--clobber',
                    'True']

        result = subprocess.run(decompile_cmd)

        if result.returncode != 0:
            failing_tests[test] = 'Fail'
            continue

        # if test decompiles, check if it recompiles
        
        copy_cmd = ['cp', f'{JDTESTER}/FuzzerUtils.java', f'{outpath}/FuzzerUtils.java']
        result = subprocess.run(copy_cmd)

        recompile_cmd = [f'javac',
                'FuzzerUtils.java',
                'Test.java']

        result = subprocess.run(recompile_cmd, cwd = outpath)

        if result.returncode != 0:
            failing_tests[test] = 'Fail'
            continue

        # if test recompiles, check if it runs
        exe_cmd = ['java', 'Test']
        try:
            exe_result = subprocess.run(exe_cmd, cwd = outpath, capture_output=True, timeout=10)
        except:
            print('Timeout')
            failing_tests[test] = 'Fail'
            continue

        if exe_result.returncode != 0 or ('Exception' in exe_result.stdout.decode()):
            failing_tests[test] = 'Fail'
            continue

        # if test runs, run original test and compare output to original output
        try:
            original_exe_result = subprocess.run(exe_cmd, cwd = original_testdir, capture_output=True, timeout=10)
        except:
            print('Timeout')
            failing_tests[test] = 'Fail'
            continue

        if ((exe_result.stdout.decode() != original_exe_result.stdout.decode()) or 
                (exe_result.stderr.decode() != original_exe_result.stderr.decode())):
            failing_tests[test] = 'Fail'
            continue

        passing_tests[test] = 'Success'


    return (failing_tests, passing_tests)


def get_failing_tests_jadx(original : Path, output : Path, original_tests : dict[Path, str], jadx : Path):

    failing_tests = {}
    passing_tests = {}

    # check if each test decompiles successfully
    for test in original_tests:
        outpath = Path(output, test.stem)

        original_testdir = Path(test,'eposide-1','1','original-1')

        decompile_cmd = [f'{jadx}/build/jadx/bin/jadx',
                '-d',
                str(outpath),
                str(original_testdir)]

        result = subprocess.run(decompile_cmd)

        if result.returncode != 0:
            failing_tests[test] = 'Fail'
            continue

        # if test decompiles, check if it recompiles
        outpath = Path(outpath,'sources','defpackage')
        
        copy_cmd = ['cp', f'{JDTESTER}/FuzzerUtils.java', f'{outpath}/FuzzerUtils.java']
        result = subprocess.run(copy_cmd)

        with open(Path(outpath, 'Test.java'),'r') as f:
            lines = f.readlines()
        with open(Path(outpath, 'Test.java'), 'w') as f:
            for line in lines:
                f.write(re.sub('package defpackage;','', line))

        recompile_cmd = [f'javac',
                'FuzzerUtils.java',
                'Test.java']

        result = subprocess.run(recompile_cmd, cwd = outpath)


        if result.returncode != 0:
            failing_tests[test] = 'Fail'
            continue

        # if test recompiles, check if it runs
        exe_cmd = ['java', 'Test']
        try:
            exe_result = subprocess.run(exe_cmd, cwd = outpath, capture_output=True, timeout=10)
        except:
            print('Timeout')
            failing_tests[test] = 'Fail'
            continue

        if exe_result.returncode != 0 or ('Exception' in exe_result.stdout.decode()):
            failing_tests[test] = 'Fail'
            continue

        # if test runs, run original test and compare output to original output
        try:
            original_exe_result = subprocess.run(exe_cmd, cwd = original_testdir, capture_output=True, timeout=10)
        except:
            print('Timeout')
            failing_tests[test] = 'Fail'
            continue

        if ((exe_result.stdout.decode() != original_exe_result.stdout.decode()) or 
                (exe_result.stderr.decode() != original_exe_result.stderr.decode())):
            failing_tests[test] = 'Fail'
            continue

        passing_tests[test] = 'Success'

    return (failing_tests, passing_tests)

def test_cfr():
    base : Path = Path('/data/dev/head2head')
    cfr : Path = Path(base, 'cfr')
    start_commit_output = Path(JDTESTER, 'results', 'cfr_pre_ff_fix_commit')
    output : Path = Path('/data/work/fuzzflesh/head2head/cfr')

    # build starting cfr version
    #if not utils.build_cfr(cfr, utils.cfr_commits['pre_fix1'], jdtester_location = JDTESTER):
    #    exit(1)

    # run jdtester for X minutes on the initial jadx version
    # this must be done manually using root for jdtester :(
    # this should output tests into the start_commit_output folder
    
    (failing_tests, passing_tests) = get_initial_failing_tests(start_commit_output)

    print(f'Number of originally failing tests: {len(failing_tests)} and passing: {len(passing_tests)}')

    with open(Path(output,'failing_tests_on_initial_commit.txt'),'w') as f:
        json.dump({str(k) : str(v) for k,v in failing_tests.items()}, f)

    with open(Path(output,'passing_tests_on_initial_commit.txt'),'w') as f:
        json.dump({str(k) : str(v) for k,v in passing_tests.items()}, f)

    # get next commit
    #if not utils.build_cfr(cfr, utils.cfr_commits['fix1'], jdtester_location = JDTESTER):
    #    print('Problem building cfr!')
    #   exit(1)

    # attempt to decompile and execute each previously failing test
    outpath = Path(output, 'jd')
    (new_failing_tests, new_passing_tests) = get_failing_tests_cfr(start_commit_output, outpath, failing_tests, cfr)

    print(f'Out of {len(failing_tests)} there are now:')
    print(f'\t{len(new_failing_tests)} failing tests and') 
    print(f'\t{len(new_passing_tests)} passing tests')

    with open(Path(output,'failing_tests_on_postfix_commit.txt'),'w') as f:
        json.dump({str(k) : str(v) for k,v in new_failing_tests.items()},f)

    with open(Path(output,'passing_tests_on_postfix_commit.txt'),'w') as f:
        json.dump({str(k) : str(v) for k,v in new_passing_tests.items()},f)



    
def test_jadx(): 
    base : Path = Path('/data/dev/head2head')
    jadx : Path = Path(base, 'jadx')
    start_commit_output = Path(JDTESTER, 'results', 'jadx_pre_ff_fix_commit')
    output : Path = Path('/data/work/fuzzflesh/head2head/jadx')

    # jadx initial commit is the latest stable release
    # before the first reported JD-Tester bug
    # version is 1.4.3 released Jul 20 2022
    # first JD-Tester bug report is 10 Aug 2022
    #jadx_commits = utils.jadx_commits

    
    # build starting jadx version
    #if not utils.build_jadx(jadx, utils.jadx_commits['pre_fix5'], jdk=17, jdtester_location = JDTESTER):
    #    exit(1)
    
    # run jdtester for X minutes on the initial jadx version
    # this must be done manually using root for jdtester :(
    # this should output tests into the start_commit_output folder

    # get list of tests that fail (i.e. potentially trigger a bug)
    # on the initial commit
    (failing_tests, passing_tests) = get_initial_failing_tests(start_commit_output)

    with open(Path(output,'failing_tests_on_initial_commit_jadx.txt'),'w') as f:
        json.dump({str(k) : str(v) for k,v in failing_tests.items()}, f)

    with open(Path(output,'passing_tests_on_initial_commit_jadx.txt'),'w') as f:
        json.dump({str(k) : str(v) for k,v in passing_tests.items()}, f)

    print(f'There were {len(failing_tests)} failing tests and {len(passing_tests)} passing tests on the initial commit')
    
    # get next commit
    if not utils.build_jadx(jadx, utils.jadx_commits['fix5'], jdk=17, jdtester_location = JDTESTER):
        exit(1)


    # attempt to decompile and execute each previously failing test
    outpath = Path(output, 'jd')
    (new_failing_tests, new_passing_tests) = get_failing_tests_jadx(start_commit_output, outpath, failing_tests, jadx)

    print(f'Out of {len(failing_tests)} there are now:')
    print(f'\t{len(new_failing_tests)} failing tests and') 
    print(f'\t{len(new_passing_tests)} passing tests')

    with open(Path(output,'failing_tests_on_postfix_commit_jadx.txt'),'w') as f:
        json.dump({str(k) : str(v) for k,v in new_failing_tests.items()},f)

    with open(Path(output,'passing_tests_on_postfix_commit_jadx.txt'),'w') as f:
        json.dump({str(k) : str(v) for k,v in new_passing_tests.items()},f)


def main():
    parser = argparse.ArgumentParser()

    parser.add_argument('--jadx', action=argparse.BooleanOptionalAction)
    parser.add_argument('--cfr', action=argparse.BooleanOptionalAction)

    args = parser.parse_args()

    if args.jadx:
        test_jadx()
    elif args.cfr:
        test_cfr()

if __name__=="__main__":
    main()