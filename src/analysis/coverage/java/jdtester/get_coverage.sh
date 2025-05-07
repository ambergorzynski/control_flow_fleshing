#!/bin/sh

BASE=/data/dev/fuzzflesh/external/jdtester

RESULTS_OUTPUT=${BASE}/coverage_results/jd

DECOMPILERS="jadx" # jadx fernflower"
FUZZERS="javafuzzer hephaestus" #hephaestus"

for DECOMPILER in $DECOMPILERS
do
    for FUZZER in $FUZZERS
    do
        for TIME in $TIMELIMIT
        do
            FUZZER_XML=${FUZZER_OUTPUT}/jdtester_${DECOMPILER}_${FUZZER}_${TIME}
            OUTDIR=${RESULTS_OUTPUT}/jdtester_${DECOMPILER}_${FUZZER}_${TIME}
            mkdir -p $OUTDIR
            /bin/bash ../get_${DECOMPILER}_coverage.sh $OUTDIR $FUZZER_XML jdtester
        done
    done
done
