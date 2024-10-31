#!/bin/bash

OUTPUT=$1
R2GHIDRA=$2

# Produce text summary of coverage
cd $R2GHIDRA/ghidra-native

gcovr -r . \
    --csv ${OUTPUT}/coverage.csv \
    --xml ${OUTPUT}/coverage.xml \
    --html --html-details ${OUTPUT}/coverage.html



