#!/bin/sh
folder=$1

python c/CTestHarness.py 1 1 ${folder} \
	g++ /usr/bin \
	-dir 'unknown' \
	-graph 'preset'
