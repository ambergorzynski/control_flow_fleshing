#!/bin/sh

SRC='/Users/ambergorzynski/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/Users/ambergorzynski/work/fuzzflesh/output/ilspy/cs'
LANG='cs'
COMPILER='ilspy'
DECOMPILER_PATH='/Users/ambergorzynski/dev/ilspy/ICSharpCode.ILSpyCmd/bin/Debug/net8.0/ilspycmd'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -graphs=1 \
    -paths=1 \
    -max_size=6  \
    $LANG \
    $COMPILER \
    $DECOMPILER_PATH 
