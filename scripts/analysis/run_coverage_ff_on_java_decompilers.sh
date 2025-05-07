#!/bin/sh

TIMELIMIT=$1
COVERAGE_BASE=$2

COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/java/fuzzflesh
FUZZER_OUTPUT=$COVERAGE_BASE/fuzzer_outputs/ff
COVERAGE_OUTPUT=$COVERAGE_BASE/coverage_outputs/ff
DIRS='dirs_known'

echo "Run the fuzzer to generate test classes for the given time budget"
$COVERAGE/run_ff_all.sh $TIMELIMIT
echo "Finished running the fuzzer"

echo "Run the test classes using the decompiler instrumented with coverage"
$COVERAGE/get_coverage.sh  $TIMELIMIT
echo "Finished running coverage"
