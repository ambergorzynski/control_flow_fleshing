#!/bin/sh
TIMELIMIT=$1
COVERAGE_BASE=$2

GHIDRA=/data/dev/fuzzflesh/external/ghidra/ghidra_11.0.3_PUBLIC/support/analyzeHeadless
GHIDRA_COV=/data/dev/fuzzflesh/external/ghidra/ghidra_cov-ghidra1103release
COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/cpp/decfuzzer
FUZZER_OUTPUT=$COVERAGE_BASE/fuzzer_outputs/df
COVERAGE_OUTPUT=$COVERAGE_BASE/coverage_outputs/df

cd $GHIDRA_COV
gradle prepdev

python3.10 $COVERAGE/get_coverage.py $TIMELIMIT \
    $COVERAGE_OUTPUT \
    $GHIDRA_COV

echo "Finished running coverage"

rm -rf $GHIDRA_COV/dist
