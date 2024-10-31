#!/bin/bash

OUTPUT=/data/work/rubbish 
FUZZER_XML=$2

GHIDRA=/data/dev/ghidra_cov
DECOMPILER_ROOT=${GHIDRA}/Ghidra/Features/Decompiler

# copy fuzzer_classes.xml into ghidra_cov
#cp ${FUZZER_XML}/fuzzer_classes.xml ${GHIDRA}/Ghidra/Test/IntegrationTest/src/test.slow/java/ghidra/fuzz/fuzzer_classes.xml
:'
RESULT=$?
if [[ $RESULT != 0 ]]
then
    echo "Problem getting fuzzer_classes.xml!"
    exit 1
fi
'
export JAVA_HOME='/usr/lib/jvm/java-19-openjdk-amd64/'

# get coverage
cd $GHIDRA
gradle clean # this removes .gcda files
gradle jacocoReport

# produce csv summary of coverage
cd $DECOMPILER_ROOT
gcovr -r . \
    --csv ${OUTPUT}/coverage.csv \
    --xml ${OUTPUT}/coverage.xml \
    --json ${OUTPUT}/coverage.json \
    --html --html-details ${OUTPUT}/coverage.html


