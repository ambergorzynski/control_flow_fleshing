#!/bin/sh

BASE=/data/work/fuzzflesh/coverage/fuzzer_outputs/jd
XMLDIR=/data/work/fuzzflesh/coverage/coverage_results/jd

TOOL='jdtester'
TIMELIMIT=$((60*60*8)) # seconds

for DECOMPILER in jadx
do
    for PROGRAM_GENERATOR in hephaestus
    do 
        # outdir is a relative path from jdtester folder
        OUTDIR=jdtester_${DECOMPILER}_${PROGRAM_GENERATOR}_$((${TIMELIMIT}/60))
        :' 
        /bin/bash run_jdtester.sh \
            $DECOMPILER \
            $PROGRAM_GENERATOR \
            $OUTDIR \
            $TIMELIMIT
        '
        # run python script to collect class file locations
        python gather_jdtester_classes.py \
            --datadir=/data/dev/jdtester/results/${OUTDIR} \
            --xmldir=${BASE}/${OUTDIR}
    done
done

