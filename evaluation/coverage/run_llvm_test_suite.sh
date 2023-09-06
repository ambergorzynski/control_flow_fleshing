#!/bin/sh
path_to_llvm=/home/user42/amber-demo/llvm-project/build
path_to_test=/home/user42/amber-demo/corpus/llvm-tests/test-suite
path_to_test_build=/home/user42/amber-demo/corpus/llvm-tests/test-suite-build

gcda=/home/user42/amber-demo/cfg/coverage_llvm_test_suite

# go to build directory for the test suite
cd $path_to_test_build

Ccompiler="${path_to_llvm}/bin/clang"
CXXcompiler="${path_to_llvm}/bin/clang++"

cmake -DCMAKE_C_COMPILER=${path_to_llvm}/bin/clang \
	-DCMAKE_CXX_COMPILER=${path_to_llvm}/bin/clang++ \
	-DLLVM_TARGETS_TO_BUILD="X86" \
	-C ${path_to_test}/cmake/caches/O3.cmake \
	../test-suite

# run compiler and save coverage data
mkdir $gcda

export GCOV_PREFIX=$gcda

make

unset GCOV_PREFIX
unset Ccompiler
unset CXXcompiler

# run tests
