#!/bin/sh

BASE=/data/work/fuzzflesh/coverage/fuzzer_outputs/ff

TOOL='fuzzflesh'
TIMELIMIT=480
DECOMPILERS="jadx"
DIRECTIONS="dirs_unknown"

for DECOMPILER in $DECOMPILERS
do
    for DIRS in $DIRECTIONS
    do 
        if [ $DECOMPILER = "cfr" ]; then
            DECOMPILER_PATH='/data/dev/cfr/target/classes'
        elif [ $DECOMPILER = "fernflower" ]; then
            DECOMPILER_PATH='/data/dev/fernflower/java-decompiler-engine-242.21829.40.jar'
        elif [ $DECOMPILER = "jadx" ]; then
            DECOMPILER_PATH='/data/dev/jadx/bin/jadx'
        else 
            echo "Invalid decompiler"
            exit 1
        fi
        
        OUTPUT=${BASE}/${TOOL}_${DECOMPILER}_${DIRS}_${TIMELIMIT}
        
        echo $OUTPUT
        exit 1
        mkdir -p $OUTPUT

        /bin/bash run_fuzzflesh.sh \
        $TOOL \
        $OUTPUT \
        $DECOMPILER \
        $DECOMPILER_PATH \
        $TIMELIMIT \
        $DIRS
    
    done
done

