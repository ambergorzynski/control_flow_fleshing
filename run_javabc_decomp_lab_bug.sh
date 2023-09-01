#!/bin/sh
folder=$1

python javabc/JavaBCTestHarness.py 1 1 ${folder} \
	/usr/lib/jvm/java-17-openjdk-amd64/bin \
	/homes/agg22/dev/jasmin-2.4 \
	-dir 'known' \
	-lab True \
	-decompiler_path /vol/bitbucket/agg22/cfr-0.152.jar \
	-decompiler cfr \
        -successors 3 \
	-add_annotations False 
