#!/bin/sh

# filepaths
base=/home/user42/amber-demo
gfauto=/home/user42/amber-demo/graphicsfuzz/gfauto
compiler_build=$base/llvm-project/
llvm_path=$base/llvm-project/build/bin
working_folder=$base/cfg

# test-specific filepaths
cov_name=coverage_llvm_test_suite
info_name=${cov_name}_output.info
out_name=${cov_name}_out
gcda_folder=$base/cfg/$cov_name/
coverage_folder=$base/cfg/${cov_name}_gfauto

# test suite paths
path_to_test=/home/user42/amber-demo/corpus/llvm-tests/test-suite
path_to_test_build=/home/user42/amber-demo/corpus/llvm-tests/test-suite-build

<<com
# go to build directory for the test suite
cd $path_to_test_build

Ccompiler="${llvm_path}/clang"
CXXcompiler="${llvm_path}/clang++"

cmake -DCMAKE_C_COMPILER=${llvm_path}/clang \
	-DCMAKE_CXX_COMPILER=${llvm_path}/clang++ \
	-DLLVM_TARGETS_TO_BUILD="X86" \
	-C ${path_to_test}/cmake/caches/O3.cmake \
	../test-suite

# run compiler and save coverage data
mkdir $gcda_folder

export GCOV_PREFIX=$gcda_folder

make

unset GCOV_PREFIX
unset Ccompiler
unset CXXcompiler

# run tests
###

com

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
