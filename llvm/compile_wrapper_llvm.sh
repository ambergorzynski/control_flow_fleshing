#!/bin/sh
output=$1
llvm_path=$2
$llvm_path/clang++ -c llvm/Wrapper.cpp -o $output/Wrapper.o
