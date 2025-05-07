#!/bin/sh

COVERAGE=$
BASE=$3

OUTPUT=${BASE}/decfuzzer_ghidra_11_${TIMELIMIT}
COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/cpp/decfuzzer
mkdir -p $OUTPUT

/bin/bash $COVERAGE/run_decfuzzer.sh \
    $OUTPUT 
