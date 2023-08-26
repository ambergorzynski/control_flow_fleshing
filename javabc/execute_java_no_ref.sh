#!/bin/sh
src=$1
test_name=$2
path_name=$3
output_filename=$4
bad_output_filename=$5
n_function_repeats=$6
jvm=$7
cd $src/testing
${jvm}/java -cp .:./$test_name Wrapper \
    "../paths/$path_name.txt" \
    "../output/$output_filename.txt" \
    "../output/$bad_output_filename.txt" \
    $n_function_repeats \
    -XX:CompileThreshold=100
