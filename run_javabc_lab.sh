#!/bin/sh
folder=$1

python javabc/JavaBCTestHarness.py 10000 100 ${folder} \
	/usr/lib/jvm/java-17-openjdk-amd64/bin \
	/homes/agg22/dev/jasmin-2.4 \
	-dir 'known' \
	-lab True
