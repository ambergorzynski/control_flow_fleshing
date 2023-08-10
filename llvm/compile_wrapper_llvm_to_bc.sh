#!/bin/sh
output=$1
clang++ -emit-llvm -S llvm/Wrapper.cpp -o $output/Wrapper.ll
llvm-as $output/Wrapper.ll -o $output/Wrapper.bc