#!/bin/bash

DIRS=dirs_unknown
TIME=120

FUZZER_XML=/data/work/fuzzflesh/coverage/fuzzer_outputs/ff/fuzzflesh_ghidra11_${DIRS}_${TIME}/out/fuzzer_classes.xml
OUTDIR=/data/work/fuzzflesh/coverage/coverage_results/ff/fuzzflesh_ghidra11_${DIRS}_${TIME}

GHIDRA=/data/dev/ghidra_cov
DECOMPILER_ROOT=${GHIDRA}/Ghidra/Features/Decompiler

mkdir -p $OUTDIR

# copy fuzzer_classes.xml into ghidra_cov
cp ${FUZZER_XML} ${GHIDRA}/Ghidra/Test/IntegrationTest/src/test.slow/java/ghidra/fuzz/fuzzer_classes.xml
RESULT=$?
if [ $RESULT != 0 ]; then
    echo "Problem with fuzzer xml!"
    exit 1
fi

export JAVA_HOME='/usr/lib/jvm/java-19-openjdk-amd64/'

# get coverage
cd $GHIDRA
gradle clean
gradle buildGhidra --continue
gradle jacocoReport

# produce csv summary of coverage
cd $DECOMPILER_ROOT
gcovr -r . \
    --csv ${OUTDIR}/coverage.csv \
    --xml ${OUTDIR}/coverage.xml \
    --html --html-details ${OUTDIR}/coverage.html



