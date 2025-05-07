#!/bin/sh

TIMELIMIT=$1
DIRS=$2
COVERAGE=$3
FUZZER_OUTPUT=$4
RESULTS_OUTPUT=$5

DECOMPILERS="fernflower" # "cfr fernflower jadx"

for DECOMPILER in $DECOMPILERS
do
    for DIR in $DIRS
    do
        for TIME in $TIMELIMIT
        do
            FUZZER_XML=${FUZZER_OUTPUT}/fuzzflesh_${DECOMPILER}_${DIR}_${TIME}/out
            OUTDIR=${RESULTS_OUTPUT}/fuzzflesh_${DECOMPILER}_${DIR}_${TIME}
            mkdir -p $OUTDIR
            /bin/bash ${COVERAGE}/get_${DECOMPILER}_coverage.sh $OUTDIR $FUZZER_XML fuzzflesh
        done
    done
done
