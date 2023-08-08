#!/bin/sh
output=$1
clang++ -c llvm/WrapperStatic.cpp -o $output/Wrapper.o
