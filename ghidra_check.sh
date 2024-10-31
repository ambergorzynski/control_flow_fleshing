#!/bin/sh

HEADLESS_PATH=/data/dev/fuzzflesh/src/fuzzflesh/harness/c
HEADLESS=DecompileHeadless.java
GHIDRA=/data/dev/ghidra/ghidra_9.0.1/support/analyzeHeadless
FILE=/data/dev/decfuzzer/single_seed_for_r2/0

$GHIDRA /data/work/fuzzflesh \
    Project \
    -import \
    $FILE \
    -overwrite \
    -scriptPath \
    $HEADLESS_PATH \
    -postScript \
    $HEADLESS \
    /data/work/fuzzflesh/out.c

