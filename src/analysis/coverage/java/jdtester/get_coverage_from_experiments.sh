#!/bin/bash

TIMELIMIT=$1
PARTIAL=$2

FUZZER_OUTPUT=/data/dev/fuzzflesh/data/coverage/raw/fuzzer_outputs/jd
COVERAGE_OUTPUT=/data/dev/fuzzflesh/data/coverage/raw/coverage_outputs/jd

if [ -z "$3" ]; then
    GENERATORS="JavaFuzzer Hephaestus"
else
    GENERATORS="JavaFuzzer"
fi

for DECOMPILER in Jadx CFR FernFlower
do
    if [ $DECOMPILER = "CFR" ]; then
        DECOMP="cfr"
    elif [ $DECOMPILER = "FernFlower" ]; then
        DECOMP="fernflower"
    elif [ $DECOMPILER = "Jadx" ]; then
        DECOMP="jadx"
    fi
    for PROGRAM_GENERATOR in $GENERATORS
    do 

        if [ $PROGRAM_GENERATOR = "JavaFuzzer" ]; then
            PG="javafuzzer"
        elif [ $PROGRAM_GENERATOR = "Hephaestus" ]; then
            PG="hephaestus"
        fi
        
        FUZZ_OUTDIR=$FUZZER_OUTPUT/jdtester_${DECOMP}_${PG}_${TIMELIMIT}
        mkdir -p $FUZZ_OUTDIR

        ZIPDIR=/data/dev/fuzzflesh/external/jdtester/DecompilerStudy-1.1/experimentData/${PROGRAM_GENERATOR}/${DECOMPILER}-detailedExperimentData/allData.zip
        OUTDIR=/data/dev/fuzzflesh/external/jdtester/DecompilerStudy-1.1/experimentData/${PROGRAM_GENERATOR}/${DECOMPILER}-detailedExperimentData/

        # Folders have different structures :(
        if [ $PROGRAM_GENERATOR = "Hephaestus" ]; then
            DATADIR=$OUTDIR
            if [ $DECOMPILER = "Jadx" ]; then
                ZIPDIR=/data/dev/fuzzflesh/external/jdtester/DecompilerStudy-1.1/experimentData/${PROGRAM_GENERATOR}/${DECOMPILER}-detailedExperimentData/allDara.zip
            fi
        elif [ $PROGRAM_GENERATOR = "JavaFuzzer" ]; then
            DATADIR=$OUTDIR/allData
        fi

        # unzip experimental data
        unzip -o $ZIPDIR -d $OUTDIR
        
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
