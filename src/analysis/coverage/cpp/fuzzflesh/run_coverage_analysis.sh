#!/bin/sh
TIMELIMIT=$1

# First, run the fuzzer to generate test classes for the given time budget
./run_ff_config.sh $TIMELIMIT

# Next, run the test classes using the decompiler instrumented with coverage
./get_coverage.sh

