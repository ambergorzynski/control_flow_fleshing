#!/bin/sh

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/data/work/fuzzflesh/output/ilspy'
LANG='cil'
DECOMPILER_PATH='/Users/ambergorzynski/.dotnet/'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -graphs=1 \
    -paths=1 \
    -max_size=10  \
    --tidy \
    $LANG \
    $DECOMPILER_PATH 
