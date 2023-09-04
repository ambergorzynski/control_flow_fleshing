#!/bin/sh
output_path=$1
program_path=$2
test_name=$3
optimisations=$4
path_to_compiler=$5
compiler=$6

${path_to_compiler}/${compiler} $program_path/$test_name.c $output_path/Wrapper.cpp -o $output_path/${test_name}_out $optimisations