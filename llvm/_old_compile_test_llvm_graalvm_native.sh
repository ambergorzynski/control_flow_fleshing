#!/bin/sh
output_path=$1
llvm_path=$2
path_path=$3
prog_name=$4
path_name=$5
jvm=$6
results=$7
bad_results=$8
#export JAVA_HOME=/Library/Java/JavaVirtualMachines/graalvm-jdk-17.0.8+9.1/Contents/Home
export JAVA_HOME=$jvm
export LLVM_TOOLCHAIN=$($JAVA_HOME/bin/lli --print-toolchain-path)
$LLVM_TOOLCHAIN/clang++ -c $llvm_path/${prog_name}.ll -o $llvm_path/${prog_name}.o
#$LLVM_TOOLCHAIN/clang++ -c llvm/WrapperGraalvm.cpp -o $output_path/Wrapper.o
$LLVM_TOOLCHAIN/clang++ $llvm_path/${prog_name}.o $output_path/Wrapper.o -o $output_path/${prog_name}_out
$JAVA_HOME/bin/lli $output_path/${prog_name}_out "${path_path}/${path_name}.txt" "${output_path}/${results}.txt" "${output_path}/${bad_results}.txt"
