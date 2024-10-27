#!/bin/sh

TOOL='decfuzzer'
BASE=/data/work/fuzzflesh/coverage/fuzzer_outputs/df

for DECOMPILER in ghidra11 ghidr9
do
    for TIMELIMIT in 120

        # get appropriate decompiler path
        if [[ "$DECOMPILER = ghidra11" ]]; then
            DECOMPILER_PATH='/data/dev/ghidra/ghidra_11.0.3_PUBLIC/support/analyzeHeadless'

        elif [[ "$DECOMPILER = ghidra9" ]]; then
            DECOMPILER_PATH='/data/dev/ghidra/ghidra_9.0.0_PUBLIC/support/analyzeHeadless'
        else; then
            echo "Invalid decompiler"
            exit 1
        fi 

        OUTPUT=${BASE}/${TOOL}_${DECOMPILER}_${TIMELIMIT}
        mkdir -p $OUTPUT

        /bin/bash run_decfuzzer.sh \
            $OUTPUT \
            $TIMELIMIT \
            $DECOMPILER_PATH 

    done
done
