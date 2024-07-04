#!/bin/sh
. ~/.bashrc
python javabc/JavaBCTestHarness.py 1 100 throughput_fernflower  \
	/usr/lib/jvm/java-17-openjdk-amd64/bin \
	/homes/agg22/dev/jasmin-2.4 \
 	-graph '1' \
	-add_annotations False \
    -dir 'known' \
	-decompiler fernflower \
	-decompiler_path /vol/bitbucket/agg22/fernflower/fernflower.jar \
    -successors=2

