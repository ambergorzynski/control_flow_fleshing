#!/bin/sh

TIMELIMIT=$1
COVERAGE=$2
FUZZER_OUTPUT=$3

for DECOMPILER in CFR FernFlower Jadx
do
    for PROGRAM_GENERATOR in JavaFuzzer Hephaestus
    do 
        # outdir must be a relative path from jdtester folder
        OUTDIR=jdtester_${DECOMPILER}_${PROGRAM_GENERATOR}
        
        '/bin/bash $COVERAGE/run_jdtester.sh \
            $DECOMPILER \
            $PROGRAM_GENERATOR \
            $OUTDIR \
            $SECONDS
        '
        # run python script to collect class file locations
        python3.10 $COVERAGE/gather_jdtester_classes.py \
            --datadir=/data/dev/fuzzflesh/external/jdtester/DecompilerStudy-1.1/${PROGRAM_GENERATOR}/${DECOMPILER}-detailedExperimentData/allData \
            --xmldir=${FUZZER_OUTPUT}/${OUTDIR}
    done
done

