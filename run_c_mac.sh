#!/bin/sh
folder=$1

python c/CTestHarness.py 1 1 ${folder} \
	g++ /usr/bin \
	-dir 'known_const' \
	-graph 'preset'
