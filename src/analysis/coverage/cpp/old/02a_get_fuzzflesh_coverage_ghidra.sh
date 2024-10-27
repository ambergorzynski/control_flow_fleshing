#!/bin/bash

OUTPUT=$1

GHIDRA=/data/dev/ghidra_cov
DECOMPILER_ROOT=${GHIDRA}/Ghidra/Features/Decompiler

mkdir -p $OUTPUT

# copy fuzzer_classes.xml into ghidra_cov
cp ${OUTPUT}/out/fuzzer_classes.xml ${GHIDRA}/Ghidra/Test/IntegrationTest/src/test.slow/java/ghidra/fuzz/fuzzer_classes.xml

export JAVA_HOME='/usr/lib/jvm/java-19-openjdk-amd64/'

# get coverage
cd $GHIDRA
gradle buildGhidra
gradle jacocoReport

# produce csv summary of coverage
cd $DECOMPILER_ROOT
gcovr -r . \
    --csv ${OUTPUT}/coverage.csv



