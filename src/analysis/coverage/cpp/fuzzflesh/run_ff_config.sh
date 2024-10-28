#!/bin/sh

TOOL='fuzzflesh'
BASE=/data/work/fuzzflesh/coverage/fuzzer_outputs/ff

for DECOMPILER in ghidra11
do
    for DIRS in dirs_unknown
    do 
        for TIMELIMIT in 480
        do
            # get appropriate decompiler path
            if [ $DECOMPILER = "ghidra11" ]; then
                DECOMPILER_PATH='/data/dev/ghidra/ghidra_11.0.3_PUBLIC/support/analyzeHeadless'

            elif [ $DECOMPILER = "ghidra9" ]; then
                DECOMPILER_PATH='/data/dev/ghidra/ghidra_9.0.0_PUBLIC/support/analyzeHeadless'
            else
                echo "Invalid decompiler"
                exit 1
            fi 

            OUTPUT=${BASE}/${TOOL}_${DECOMPILER}_${DIRS}_${TIMELIMIT}
            mkdir -p $OUTPUT

            /bin/bash run_fuzzflesh_on_ghidra.sh \
                $OUTPUT \
                $TIMELIMIT \
                $DECOMPILER_PATH \
                $DIRS

        done
    done
done
