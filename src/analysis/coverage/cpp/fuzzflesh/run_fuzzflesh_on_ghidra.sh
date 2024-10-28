#!/bin/sh

OUTPUT=$1
TIMELIMIT=$2
DECOMPILER_PATH=$3
DIRS=$4

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
LANG='c'
COMPILER='ghidra'
COMPILER_PATH='g++'
HEADLESS_PATH='/data/dev/fuzzflesh/src/fuzzflesh/harness/c/'
INCLUDE_PATH='/data/dev/include/'

# if dirs
if [ $DIRS = "dirs_known" ]
then
    DIR_ARG="--dirs"
elif [ "$DIRS" = "dirs_unknown" ]
then
    DIR_ARG=""
else
    echo "Directions argument is invalid"
    exit 1
fi

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -max_size=15 \
    -graphs=1 \
    -paths=10 \
    --gen_xml_for_coverage \
    --time_limit=$TIMELIMIT $DIR_ARG \
    $LANG \
    $COMPILER \
    $COMPILER_PATH \
    $INCLUDE_PATH \
    --headless_path $HEADLESS_PATH \
    --decompiler_path $DECOMPILER_PATH 
