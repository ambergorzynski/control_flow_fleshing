#!/bin/sh
testing=$1
test_number=$2
path_name=$3
output_filename=$4
bad_output_filename=$5
n_function_repeats=$6
jvm=$7
cd $testing
${jvm}/java testing/Wrapper testing.TestCase$test_number "paths/$path_name.txt" "output/$output_filename.txt" "output/$bad_output_filename.txt" $n_function_repeats
