#!/bin/sh
. ~/.bashrc
python llvm/LLVMTestHarness.py 1 10 throughput /usr/bin \
	-dir 'known' \
	-lab True
