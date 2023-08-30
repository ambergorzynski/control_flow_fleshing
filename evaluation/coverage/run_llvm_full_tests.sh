#!/bin/sh
cd /home/user42/amber-demo/cfg/repo
source /home/user42/cfg/repo/venv/bin/activate

# set gcov prefix
export GCOV_PREFIX=/home/user42/cfg/coverage_test

# run tests
python llvm/LLVMTestHarness.py 1 1 fuzzing_test -dir 'known' -llvm_path '/home/user42/'

# unset
unset GCOV_PREFIX
