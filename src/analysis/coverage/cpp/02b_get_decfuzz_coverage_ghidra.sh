#!/bin/bash

OUTPUT=$1
ROOTDIR=/data/dev/r2ghidra/ghidra-native

# Produce text summary of coverage
cd $ROOTDIR

gcovr -r . \
    --csv ${OUTPUT}/coverage.csv \
    --gcov-ignore-parse-errors=suspicious_hits.warn



