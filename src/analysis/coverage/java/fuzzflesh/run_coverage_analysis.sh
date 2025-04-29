#!/bin/sh

# First, run the fuzzer to generate test classes for the given time budget
TIMELIMIT=1

/bin/bash run_ff_all.sh $TIMELIMIT

# Next, run the test classes using the decompiler instrumented with coverage
./get_coverage.sh