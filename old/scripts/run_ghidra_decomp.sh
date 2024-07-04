#!/bin/sh
. ~/.bashrc
python c/CTestHarness.py 1 1 \
    ghidra \
	g++ \
    /usr/bin \
	-dir 'unknown' \
	-base '/vol/bitbucket/agg22/cfg/c/fuzz' \
    -decompiler True \
    -decompiler_path '/data/dev/ghidra/ghidra_10.4_PUBLIC/support/analyzeHeadless'
