#!/bin/sh
. ~/.bashrc
python c/CTestHarness.py 1 100 throughput \
	clang++ /usr/bin \
	-dir 'known' \
	-base '/vol/bitbucket/agg22/cfg/c/fuzz'
