#!/bin/sh
output=$1
program=$2
llvm_path=$3
name=$4
optimisations=$5
#export GCOV_PREFIX=/home/user42/amber-demo/cfg/coverage_test
$llvm_path/opt -passes=$optimisations -S $program/${name}.ll -o $output/${name}_opt.ll
$llvm_path/llc -filetype=obj $output/${name}_opt.ll
$llvm_path/clang++ -no-pie $output/Wrapper.o $output/${name}_opt.o -o $output/${name}_out
#unset GCOV_PREFIX

