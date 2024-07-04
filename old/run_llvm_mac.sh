#!/bin/sh
folder=$1

python llvm/LLVMTestHarness.py 1 1 ${folder}   \
	/Users/ambergorzynski/llvm-project/build/bin \
	-graph 'preset' \
	-dir 'known' \
	-clean_as_you_go 0

