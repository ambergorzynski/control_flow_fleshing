#!/bin/sh
. ~/.bashrc
python llvm/LLVMTestHarness.py 1 100 throughput_unknown /usr/bin \
	-dir 'unknown' \
	-lab True
