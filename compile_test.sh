#!/bin/sh
output=$1
llvm=$2
name=$3
optimisations=$4
clang++ -c run_test.cpp -o $output/run_test.o
opt -passes=$optimisations -S $llvm/${name}.ll -o $output/${name}_opt.ll
llc -filetype=obj $output/${name}_opt.ll
clang++ $output/run_test.o $output/${name}_opt.o -o $output/${name}_out

