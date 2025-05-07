#!/bin/sh

TIMELIMIT=$1
DIRS=$2
DECOMPILER_PATH=$3
DATA_OUTPUT=$4

COVERAGE=$BASE/src/analysis/coverage/cpp/fuzzflesh
TOOL='fuzzflesh'
DECOMPILER='ghidra11'

OUTPUT=${DATA_OUTPUT}/${TOOL}_${DECOMPILER}_${DIRS}_${TIMELIMIT}
mkdir -p $OUTPUT

/bin/bash $COVERAGE/run_fuzzflesh_on_ghidra.sh \
    $OUTPUT \
    $TIMELIMIT \
    $DECOMPILER_PATH \
    $DIRS

