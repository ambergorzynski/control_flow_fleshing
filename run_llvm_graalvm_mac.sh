#!/bin/sh
folder=$1

python llvm/LLVMTestHarness.py 1 100 ${folder}   \
	/Users/ambergorzynski/llvm-project/build/bin \
	-graalvm /Library/Java/JavaVirtualMachines/graalvm-jdk-17.0.8+9.1/Contents/Home \
	-dir 'known'

