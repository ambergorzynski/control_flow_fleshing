#!/bin/sh
TIMELIMIT=$1
COVERAGE_BASE=$2

GHIDRA=/data/dev/fuzzflesh/external/ghidra/ghidra_11.0.3_PUBLIC/support/analyzeHeadless
GHIDRA_COV=/data/dev/fuzzflesh/external/ghidra/ghidra_cov-ghidra1103release
COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/cpp/fuzzflesh
FUZZER_OUTPUT=$COVERAGE_BASE/fuzzer_outputs/ff
COVERAGE_OUTPUT=$COVERAGE_BASE/coverage_outputs/ff
DIRS='dirs_known'

echo "Run the fuzzer to generate test classes for the given time budget"
$COVERAGE/run_ff_config.sh $TIMELIMIT $DIRS $GHIDRA $FUZZER_OUTPUT
echo "Finished running the fuzzer"

echo "Run the test classes using the decompiler instrumented with coverage"
$COVERAGE/get_coverage.sh $TIMELIMIT \
    $DIRS \
    $FUZZER_OUTPUT \
    $COVERAGE_OUTPUT \
    $GHIDRA_COV

echo "Finished running coverage"
