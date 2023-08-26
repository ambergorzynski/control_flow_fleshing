#!/bin/sh
output=$1
jvm=$2
export JAVA_HOME=$jvm
export LLVM_TOOLCHAIN=$($JAVA_HOME/bin/lli --print-toolchain-path)
$LLVM_TOOLCHAIN/clang++ -c llvm/WrapperGraalvm.cpp -o $output_path/Wrapper.o
