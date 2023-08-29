#!/bin/sh
folder=$1

python javabc/JavaBCTestHarness.py 1000 50 ${folder} \
	/usr/lib/jvm/java-17-openjdk-amd64/bin \
	/homes/agg22/dev/jasmin-2.4 \
	-graph '1' \
	-add_annotations False \
	-dir 'known' \
	-lab True \
	-decompiler_path /vol/bitbucket/agg22/cfr-0.152.jar \
	-successors 2
