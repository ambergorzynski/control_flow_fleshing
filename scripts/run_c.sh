#!/bin/sh

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/data/work/fuzzflesh/dev_testing/output/08_13_no_dirs'
LANG='c'
COMPILER='ghidra'
COMPILER_PATH='g++'
DECOMPILER_PATH='/data/dev/ghidra/ghidra_11.1.2_PUBLIC/support/analyzeHeadless'
HEADLESS_PATH='/data/dev/fuzzflesh/src/fuzzflesh/harness/c/'
INCLUDE_PATH='/data/dev/include/'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -max_size=25 \
    -graphs=20 \
    -paths=10 \
    --tidy \
    $LANG \
    $COMPILER \
    $COMPILER_PATH \
    $INCLUDE_PATH \
    --headless_path $HEADLESS_PATH \
    --decompiler_path $DECOMPILER_PATH 
