#!/bin/sh
folder=$1

python javabc/JavaBCTestHarness.py 1 1 ${folder} \
	/Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home/bin \
	/Users/ambergorzynski/jasmin-2.4 \
    -dir 'known' \
	-decompiler procyon \
	-successors 2 \
	-size 6 \
	--no_tidy \
	-add_annotations False 
