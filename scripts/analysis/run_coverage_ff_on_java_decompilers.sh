#!/bin/sh

TIMELIMIT=$1
COVERAGE_BASE=$2
PARTIAL=$3

COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/java/fuzzflesh
SCRIPTS=/data/dev/fuzzflesh/src/analysis/coverage/java
FUZZER_OUTPUT=$COVERAGE_BASE/fuzzer_outputs/ff
COVERAGE_OUTPUT=$COVERAGE_BASE/coverage_outputs/ff

if [ -z "$3" ]; then
    DIRS="dirs_known dirs_unknown"
else
    DIRS="dirs_known"
fi

for DIR in $DIRS
do
    echo "Run the fuzzer to generate test classes for the given time budget"
    $COVERAGE/run_ff_all.sh $TIMELIMIT $DIR $COVERAGE $FUZZER_OUTPUT
    echo "Finished running the fuzzer"

    echo "Run the test classes using the decompiler instrumented with coverage"
    $COVERAGE/get_coverage.sh  $TIMELIMIT $DIR $SCRIPTS $FUZZER_OUTPUT $COVERAGE_OUTPUT
    echo "Finished running coverage"

done