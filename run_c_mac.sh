#!/bin/sh
folder=$1

python c/CTestHarness.py 10 5 ${folder} \
	g++ /usr/bin \
	-dir 'known_const'

