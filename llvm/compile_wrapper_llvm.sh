#!/bin/sh
output=$1
clang++ -c llvm/Wrapper.cpp -o $output/Wrapper.o
