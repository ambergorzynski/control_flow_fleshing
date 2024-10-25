#!/bin/sh

OUTPUT=$1
TIMELIMIT=$2

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
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
    -max_size=15 \
    -graphs=1 \
    -paths=10 \
    --dirs \
    --gen_xml_for_coverage \
    --time_limit=$TIMELIMIT \
    $LANG \
    $COMPILER \
    $COMPILER_PATH \
    $INCLUDE_PATH \
    --headless_path $HEADLESS_PATH \
    --decompiler_path $DECOMPILER_PATH 
