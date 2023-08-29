#!/bin/sh
folder=$1

python llvm/LLVMTestHarness.py 1000 50 ${folder}   \
	-graalvm /Library/Java/JavaVirtualMachines/graalvm-jdk-17.0.8+9.1/Contents/Home \
	-dir 'known'

