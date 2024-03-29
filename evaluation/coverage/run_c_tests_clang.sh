#!/bin/sh
base=/home/user42/amber-demo
gfauto=/home/user42/amber-demo/graphicsfuzz/gfauto
compiler_build=$base/llvm-project/
llvm_path=$base/llvm-project/build/bin
working_folder=$base/cfg

cov_name=coverage_c_dirs_known_clang
info_name=${cov_name}_output.info
out_name=${cov_name}_out
gcda_folder=$base/cfg/$cov_name/
coverage_folder=$base/cfg/${cov_name}_gfauto

# activate venv for CFG fleshing
<<com
cd $working_folder/repo
source /home/user42/amber-demo/cfg/repo/venv/bin/activate

# set gcov prefix
export GCOV_PREFIX=$gcda_folder

echo 'Running tests...'

# run tests
python c/CTestHarness.py 100 10 fuzzing_run clang++ /home/user42/amber-demo/llvm-project/build/bin -dir 'known_const' -base '/home/user42/amber-demo/cfg/repo/c/fuzz'

# unset
unset GCOV_PREFIX

deactivate
com
echo 'Finished running tests. Starting coverage...'

# run gfauto to create symlinks
# TODO: extract script to do this from gfauto source code
mkdir -p $coverage_folder
mkdir -p $coverage_folder/function
mkdir -p $coverage_folder/line

source $gfauto/.venv/bin/activate

cd $working_folder/coverage_processed/line
gfauto_cov_from_gcov --out run_gcov2cov.cov $compiler_build --gcov_prefix_dir $gcda_folder --num_threads 32 --gcov_uses_json

deactivate

# create the coverage report with lcov
cd $working_folder
/home/user42/my_lcov/bin/lcov --capture --directory $cov_name --output-file $info_name 
genhtml $info_name --output-directory $out_name

echo 'Coverage complete!'

cd /home/user42/amber-demo/cfg/repo/evaluation/coverage
