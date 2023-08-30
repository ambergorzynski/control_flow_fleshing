#!/bin/sh
# directions are statically known during compile time
output=$1
llvm_path=$2
$llvm_path/clang++ -c llvm/WrapperStatic.cpp -o $output/Wrapper.o
