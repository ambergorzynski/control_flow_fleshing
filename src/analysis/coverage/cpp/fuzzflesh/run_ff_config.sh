#!/bin/sh

TIMELIMIT=$1
DECOMPILER_PATH=$2

BASE=/data/dev/fuzzflesh
DATA_OUTPUT=$BASE/data/coverage_results/ff
COVERAGE=$BASE/src/analysis/coverage/cpp/fuzzflesh
TOOL='fuzzflesh'

for DIRS in dirs_unknown
do
    OUTPUT=${DATA_OUTPUT}/${TOOL}_${DECOMPILER}_${DIRS}_${TIMELIMIT}
    mkdir -p $OUTPUT

    /bin/bash $COVERAGE/run_fuzzflesh_on_ghidra.sh \
        $OUTPUT \
        $TIMELIMIT \
        $DECOMPILER_PATH \
        $DIRS
done
