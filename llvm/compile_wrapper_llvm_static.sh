#!/bin/sh
# directions are statically known during compile time
output=$1
clang++ -c llvm/WrapperStatic.cpp -o $output/Wrapper.o
