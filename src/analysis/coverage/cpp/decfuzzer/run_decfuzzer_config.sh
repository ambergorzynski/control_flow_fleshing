#!/bin/sh

TOOL='decfuzzer'
BASE=/data/work/fuzzflesh/coverage/fuzzer_outputs/df

for DECOMPILER in ghidra11
do
    for TIMELIMIT in 120 
    do
        OUTPUT=${BASE}/${TOOL}_${DECOMPILER}_${TIMELIMIT}
        mkdir -p $OUTPUT

        /bin/bash run_decfuzzer.sh \
            $OUTPUT \
            $TIMELIMIT 

    done
done
