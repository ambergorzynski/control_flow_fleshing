#!/bin/sh
src=$1
test_number=$2
path_name=$3
output_filename=$4
bad_output_filename=$5
n_function_repeats=$6
full_path=$7
cd $src
mono testing/Wrapper.exe run_cfg_$test_number "paths/$path_name.txt" "output/$output_filename.txt" "output/$bad_output_filename.txt" $n_function_repeats $full_path
