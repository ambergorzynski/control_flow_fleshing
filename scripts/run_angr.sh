#!/bin/sh

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/data/work/fuzzflesh/output/angr'
LANG='c'
COMPILER='angr'
COMPILER_PATH='g++'
DECOMPILER_PATH='angr'
INCLUDE_PATH='/data/dev/include/'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

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
    --decompiler_path $DECOMPILER_PATH 
