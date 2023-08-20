#!/bin/sh
output=$1
llvm=$2
name=$3
path=$4
jvm=$5
results=$6
bad_results=$7
#export JAVA_HOME=/Library/Java/JavaVirtualMachines/graalvm-jdk-17.0.8+9.1/Contents/Home
export JAVA_HOME=$jvm
export LLVM_TOOLCHAIN=$($JAVA_HOME/bin/lli --print-toolchain-path)
$LLVM_TOOLCHAIN/clang++ -c $llvm/${name}.ll -o $llvm/${name}.o
$LLVM_TOOLCHAIN/clang++ -c llvm/WrapperStatic.cpp -o $output/wrapper.o
$LLVM_TOOLCHAIN/clang++ $llvm/${name}.o $output/wrapper.o -o $output/${name}_out
$JAVA_HOME/bin/lli $output/${name}_out "${input}/${path_name}.txt" "${output}/${results}.txt" "${output}/${bad_results}.txt"
