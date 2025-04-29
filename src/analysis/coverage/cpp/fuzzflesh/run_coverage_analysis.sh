#!/bin/sh

# Unzip the coverage instrumented decompiler 
unzip /data/dev/external/coverage/ghidra_cov_11.zip -d /data/dev/external/coverage/

# First, run the fuzzer to generate test classes for the given time budget
TIMELIMIT=1

/bin/bash run_ff_config.sh $TIMELIMIT

# Next, run the test classes using the decompiler instrumented with coverage
./get_coverage.sh

# Remove the coverage instrumented decompiler for space reasons
rm -rf /data/dev/external/coverage/ghidra_cov_11
