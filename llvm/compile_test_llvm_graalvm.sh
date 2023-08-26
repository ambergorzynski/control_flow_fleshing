#!/bin/sh
output_path=$1
llvm_path=$2
prog_name=$3
jvm=$4
export JAVA_HOME=$jvm
export LLVM_TOOLCHAIN=$($JAVA_HOME/bin/lli --print-toolchain-path)
$LLVM_TOOLCHAIN/clang++ -c $llvm_path/${prog_name}.ll -o $llvm_path/${prog_name}.o
$LLVM_TOOLCHAIN/clang++ $llvm_path/${prog_name}.o $output_path/Wrapper.o -o $output_path/${prog_name}_out