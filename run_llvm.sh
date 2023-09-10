#!/bin/sh
. ~/.bashrc
python llvm/LLVMTestHarness.py 1 100 throughput /usr/bin \
	-dir 'known' \
	-lab True
