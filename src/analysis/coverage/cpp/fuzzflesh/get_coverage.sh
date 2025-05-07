#!/bin/bash

TIME=$1
DIRS=$2
FUZZER_OUTPUT=$3
COVERAGE_OUTPUT=$4
GHIDRA_COV=$5

FUZZER_XML=$FUZZER_OUTPUT/fuzzflesh_ghidra11_${DIRS}_${TIME}/out/fuzzer_classes.xml
OUTDIR=$COVERAGE_OUTPUT/fuzzflesh_ghidra11_${DIRS}_${TIME}

DECOMPILER_ROOT=${GHIDRA_COV}/Ghidra/Features/Decompiler

mkdir -p $OUTDIR

# copy fuzzer_classes.xml into ghidra_cov
cp ${FUZZER_XML} ${GHIDRA_COV}/Ghidra/Test/IntegrationTest/src/test.slow/java/ghidra/fuzz/fuzzer_classes.xml
RESULT=$?
if [ $RESULT != 0 ]; then
    echo "Problem with fuzzer xml!"
    exit 1
fi

export JAVA_HOME='/usr/lib/jvm/java-17-openjdk-amd64/'

# get coverage
cd $GHIDRA_COV
gradle clean
gradle buildGhidra --continue
gradle jacocoReport

# produce csv summary of coverage
cd $DECOMPILER_ROOT
gcovr -r . \
    --csv ${OUTDIR}/coverage.csv \
    --xml ${OUTDIR}/coverage.xml



