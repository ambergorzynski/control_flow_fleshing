#!/bin/sh
folder=$1

python javabc/JavaBCTestHarness.py 1 1 ${folder} \
	/vol/bitbucket/agg22/graalvm-jdk-17.0.8+9.1/bin \
	/homes/agg22/dev/jasmin-2.4 \
	-dir 'known' \
	-lab True
