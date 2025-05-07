#!/bin/bash

TIMELIMIT=$1

FUZZER_OUTPUT=/data/dev/fuzzflesh/data/coverage/raw/fuzzer_outputs/jd
COVERAGE_OUTPUT=/data/dev/fuzzflesh/data/coverage/raw/coverage_outputs/jd

for DECOMPILER in Jadx FernFlower CFR
do
    if [ $DECOMPILER = "CFR" ]; then
        DECOMP="cfr"
    elif [ $DECOMPILER = "FernFlower" ]; then
        DECOMP="fernflower"
    elif [ $DECOMPILER = "Jadx" ]; then
        DECOMP="jadx"
    fi
    for PROGRAM_GENERATOR in JavaFuzzer Hephaestus
    do 

        if [ $PROGRAM_GENERATOR = "JavaFuzzer" ]; then
            PG="javafuzzer"
        elif [ $PROGRAM_GENERATOR = "Hephaestus" ]; then
            PG="hephaestus"
        fi
        
        DATADIR=/data/dev/fuzzflesh/external/jdtester/DecompilerStudy-1.1/experimentData/${PROGRAM_GENERATOR}/${DECOMPILER}-detailedExperimentData/allData
        # Some paths have a typo 
        if [ $PROGRAM_GENERATOR = "JavaFuzzer" ]; then
            if [ $DECOMPILER = "Jadx" ]; then
                DATADIR=/data/dev/fuzzflesh/external/jdtester/DecompilerStudy-1.1/experimentData/${PROGRAM_GENERATOR}/${DECOMPILER}-detailedExperimentData/allData/allData
            fi
        fi
        if [ $PROGRAM_GENERATOR = "Hephaestus" ]; then
            if [ $DECOMPILER = "Jadx" ]; then
                DATADIR=/data/dev/fuzzflesh/external/jdtester/DecompilerStudy-1.1/experimentData/${PROGRAM_GENERATOR}/${DECOMPILER}-detailedExperimentData/allDara
            fi
        fi
        FUZZ_OUTDIR=$FUZZER_OUTPUT/jdtester_${DECOMP}_${PG}_${TIMELIMIT}
        mkdir -p $FUZZ_OUTDIR

        # unzip experimental data
        unzip -o $DATADIR.zip -d $DATADIR

        # run python script to collect class file locations
        python3.10 /data/dev/fuzzflesh/src/analysis/coverage/java/jdtester/gather_jdtester_classes.py \
            --datadir=$DATADIR \
            --xmldir=$FUZZ_OUTDIR \
            --time=$TIMELIMIT \
            --fuzzer=$PG
        echo $FUZZ_OUTDIR

        OUTDIR=${COVERAGE_OUTPUT}/jdtester_${DECOMP}_${PG}_${TIMELIMIT}
        mkdir -p $OUTDIR
        
        echo "Run coverage"

        /data/dev/fuzzflesh/src/analysis/coverage/java/get_${DECOMP}_coverage.sh $OUTDIR $FUZZ_OUTDIR jdtester
    done
done
