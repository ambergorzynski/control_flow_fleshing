#!/bin/sh
cd /home/user42/amber-demo/cfg/repo
source /home/user42/amber-demo/cfg/repo/venv/bin/activate

# set gcov prefix
export GCOV_PREFIX=/home/user42/cfg/coverage_test

# run tests
python llvm/LLVMTestHarness.py 1 1 fuzzing_test /home/user42/amber-demo/llvm-project/build/bin -dir 'known'
# unset
unset GCOV_PREFIX

deactivate
cd /home/user42/amber-demo/cfg/repo/evaluation/coverage
