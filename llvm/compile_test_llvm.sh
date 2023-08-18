#!/bin/sh
output=$1
llvm=$2
name=$3
optimisations=$4
opt -passes=$optimisations -S $llvm/${name}.ll -o $output/${name}_opt.ll
llc -filetype=obj $output/${name}_opt.ll
clang++ -no-pie $output/Wrapper.o $output/${name}_opt.o -o $output/${name}_out

