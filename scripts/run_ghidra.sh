#!/bin/sh

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/data/dev/fuzzflesh/output'
LANG='c'
COMPILER='ghidra'
COMPILER_PATH='g++'
DECOMPILER_PATH='/data/dev/fuzzflesh/external/ghidra/ghidra_11.0.3_PUBLIC/support/analyzeHeadless'
HEADLESS_PATH='/data/dev/fuzzflesh/src/fuzzflesh/harness/c/'
INCLUDE_PATH='/data/dev/fuzzflesh/external/ghidra/ghidra_include/'

PYTHONPATH=$SRC/fuzzflesh

mkdir -p $OUTPUT

export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -max_size=5 \
    -graphs=1 \
    -paths=1 \
    --dirs \
    $LANG \
    $COMPILER \
    $COMPILER_PATH \
    $INCLUDE_PATH \
    --headless_path $HEADLESS_PATH \
    --decompiler_path $DECOMPILER_PATH 
