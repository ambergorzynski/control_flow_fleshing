#!/bin/sh
TIMELIMIT=$1 # in minutes

BASE=/data/dev/fuzzflesh/data/coverage_results/fuzzer_outputs/ff

TOOL='fuzzflesh'
DECOMPILERS="jadx cfr fernflower"
DIRECTIONS="dirs_known"

for DECOMPILER in $DECOMPILERS
do
    for DIRS in $DIRECTIONS
    do 
        if [ $DECOMPILER = "cfr" ]; then
            DECOMPILER_PATH='/data/dev/fuzzflesh/external/cfr/cfr/target/classes'
        elif [ $DECOMPILER = "fernflower" ]; then
            DECOMPILER_PATH='/data/dev/fuzzflesh/external/fernflower/java-decompiler-engine-242.21829.40.jar'
        elif [ $DECOMPILER = "jadx" ]; then
            DECOMPILER_PATH='/data/dev/fuzzflesh/external/jadx/jadx/build/jadx/bin/jadx'
        else 
            echo "Invalid decompiler"
            exit 1
        fi
        
        OUTPUT=${BASE}/${TOOL}_${DECOMPILER}_${DIRS}_${TIMELIMIT}
        
        echo $OUTPUT
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

