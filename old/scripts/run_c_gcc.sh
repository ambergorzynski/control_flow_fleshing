#!/bin/sh
. ~/.bashrc

python c/CTestHarness.py 1 100 fuzzing_gcc \
    g++ /usr/bin \
	-dir 'known_const' \
	-base '/vol/bitbucket/agg22/cfg/c/fuzz'
