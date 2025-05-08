#!/bin/sh

TIMELIMIT=$1
COVERAGE_BASE=$2
PARTIAL=$3

COVERAGE=/data/dev/fuzzflesh/src/analysis/coverage/java/jdtester

echo "Get test classes for the given time budget"
$COVERAGE/get_coverage_from_experiments.sh $TIMELIMIT $PARTIAL
