#!/bin/sh
output=$1
program=$2
llvm_path=$3
name=$4
$llvm_path/llc -filetype=obj $output/${name}_opt.ll
clang++ -no-pie $output/Wrapper.o $output/${name}_opt.o -o $output/${name}_out

