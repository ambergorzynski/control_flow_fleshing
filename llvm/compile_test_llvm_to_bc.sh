#!/bin/sh
output=$1
llvm=$2
name=$3
optimisations=$4
graalvm=/Library/Java/JavaVirtualMachines/graalvm-jdk-17.0.8+9.1/Contents/Home

# run optimisations on test case llvmr ir
opt -passes=$optimisations -S $llvm/${name}.ll -o $output/${name}_opt.ll

# assemble optimised llvm ir file to llvm bc
llvm-as $output/${name}_opt.ll -o $output/${name}_opt.bc

# link wrapper with test program
llvm-link $output/${name}_opt.bc $output/Wrapper.bc -o $output/${name}_out.bc

# execute using graal llvm runtime 
${graalvm}/bin/lli $output/${name}_out.bc
