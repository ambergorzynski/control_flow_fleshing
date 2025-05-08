#!/bin/sh
TIMELIMIT=$1
COVERAGE_BASE=$2
PARTIAL=$3

GHIDRA=/data/dev/fuzzflesh/external/ghidra/ghidra_11.0.3_PUBLIC/support/analyzeHeadless
GHIDRA_COV=/data/dev/fuzzflesh/external/ghidra/ghidra_cov-ghidra1103release
COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/cpp/fuzzflesh
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
    $COVERAGE/run_ff_config.sh $TIMELIMIT $DIR $GHIDRA $FUZZER_OUTPUT
    echo "Finished running the fuzzer"

    echo "Run the test classes using the decompiler instrumented with coverage"
    $COVERAGE/get_coverage.sh $TIMELIMIT \
        $DIR \
        $FUZZER_OUTPUT \
        $COVERAGE_OUTPUT \
        $GHIDRA_COV

    echo "Finished running coverage"
done
