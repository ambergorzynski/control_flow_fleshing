#!/bin/sh
output_path=$1
path_path=$2
prog_name=$3
path_name=$4
jvm=$5
results=$6
bad_results=$7
export JAVA_HOME=$jvm
export LLVM_TOOLCHAIN=$($JAVA_HOME/bin/lli --print-toolchain-path)
echo "${path_path}/${path_name}.txt"
$JAVA_HOME/bin/lli $output_path/${prog_name}_out "${path_path}/${path_name}.txt" "${output_path}/${results}.txt" "${output_path}/${bad_results}.txt"
