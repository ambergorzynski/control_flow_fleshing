#!/bin/sh
output_path=$1
program_path=$2
test_name=$3
optimisations=$4

clang++ $program_path/$test_name.c $output_path/Wrapper.cpp -o $output_path/${test_name}_out $optimisations