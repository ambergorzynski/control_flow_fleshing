#!/bin/sh
TIMELIMIT=$1

GHIDRA=/data/dev/fuzzflesh/external/ghidra/ghidra_11.1.2_PUBLIC/support/analyzeHeadless
COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/cpp/fuzzflesh

echo "Run the fuzzer to generate test classes for the given time budget"
$COVERAGE/run_ff_config.sh $TIMELIMIT $GHIDRA
echo "Finished running the fuzzer"
exit 

echo "Run the test classes using the decompiler instrumented with coverage"
$COVERAGE/get_coverage.sh
echo "Finished running coverage"
