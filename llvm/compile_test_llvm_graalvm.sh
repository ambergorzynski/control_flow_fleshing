#!/bin/sh
output=$1
llvm=$2
name=$3
optimisations=$4
graalvm=/Library/Java/JavaVirtualMachines/graalvm-jdk-17.0.8+9.1/Contents/Home

# assemble optimised llvm ir file to llvm bc
llvm-as $output/${name}.ll -o $output/${name}.bc

# link wrapper with test program
llvm-link $output/${name}.bc $output/Wrapper.bc -o $output/${name}_out.bc

# execute using graal llvm runtime 
${graalvm}/bin/lli $output/${name}_out.bc
