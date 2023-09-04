#!/bin/sh
folder=$1

python c/CTestHarness.py 10 5 ${folder} \
	clang++ /usr/bin \
	-dir 'known'

