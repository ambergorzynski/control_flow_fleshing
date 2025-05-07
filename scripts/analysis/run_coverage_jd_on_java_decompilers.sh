#!/bin/sh

TIMELIMIT=$1
COVERAGE_BASE=$2

COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/java/jdtester

echo "Get test classes for the given time budget"
$COVERAGE/get_coverage_from_experiments.sh $TIMELIMIT

echo "Run the test classes using the decompiler instrumented with coverage"
#$COVERAGE/get_coverage.sh  $TIMELIMIT $SCRIPTS $FUZZER_OUTPUT $COVERAGE_OUTPUT
echo "Finished running coverage"
