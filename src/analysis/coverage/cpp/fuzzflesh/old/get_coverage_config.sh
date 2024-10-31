#!/bin/sh

BASE=/data/work/fuzzflesh/coverage

FUZZER_OUTPUT=${BASE}/fuzzer_outputs/ff
RESULTS_OUTPUT=${BASE}/coverage_results/ff

DECOMPILERS="ghidra11"
DIRS="dirs_known"
TIMELIMIT="120"

for DECOMPILER in $DECOMPILERS
do
    for DIR in $DIRS
    do
        for TIME in $TIMELIMIT
        do
            FUZZER_XML=${FUZZER_OUTPUT}/fuzzflesh_${DECOMPILER}_${DIR}_${TIME}/out
            OUTDIR=${RESULTS_OUTPUT}/fuzzflesh_${DECOMPILER}_${DIR}_${TIME}
            mkdir -p $OUTDIR
            /bin/bash get_fuzzflesh_coverage_ghidra.sh $OUTDIR $FUZZER_XML
        done
    done
done
