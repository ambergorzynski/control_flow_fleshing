#!/bin/sh
export JAVA_HOME=/vol/bitbucket/agg22/graalvm-jdk-17.0.8+9.1
export LLVM_TOOLCHAIN=$($JAVA_HOME/bin/lli --print-toolchain-path)
$LLVM_TOOLCHAIN/clang -c WORKING_external_fn.ll -o external.o
$LLVM_TOOLCHAIN/clang -c WORKING_main.c -o main.o
$LLVM_TOOLCHAIN/clang external.o main.o -o main.out
$JAVA_HOME/bin/lli main.out
