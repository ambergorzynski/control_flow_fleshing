#!/bin/bash

GHIDRA=/data/dev/ghidra_cov
DECOMPILER_ROOT=${GHIDRA}/Ghidra/Features/Decompile
OUTPUT=/data/work/fuzzflesh/coverage/ghidra/cpp

# Produce text summary of coverage
gcovr -r $DECOMPILER_ROOT \
    --txt ${OUTPUT}/coverage.txt


