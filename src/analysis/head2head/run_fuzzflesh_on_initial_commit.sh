#!/bin/sh
OUTPUT=$1
TIMELIMIT=$2

mkdir -p $OUTPUT

TOOL='fuzzflesh'
DECOMPILER="jadx"
DIRS="dirs_known"
DECOMPILER_PATH='/data/dev/head2head/jadx_ff/build/jadx/bin/jadx'

# if dirs
if [ $DIRS = "dirs_known" ]
then
    DIR_ARG="--dirs"
elif [ $DIRS = "dirs_unknown" ]
then
    DIR_ARG=""
else
    echo "Directions argument is invalid"
    exit 1
fi

# Setup information
SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
LANG='javabc'
JVM='/usr/lib/jvm/java-19-openjdk-amd64/bin'
JASMIN='/homes/agg22/dev/jasmin-2.4'
JSON='/data/dev/java/json-simple-1.1.1.jar'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

# Generate programs
python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -graphs=5 \
    -paths=3 \
    -max_size=7 \
    -max_successors=2 \
    --no-tidy \
    --gen_xml_for_coverage \
    --time_limit=$TIMELIMIT $DIR_ARG \
    $LANG \
    $DECOMPILER \
    $JVM \
    $JASMIN \
    $JSON \
    -decompiler_path=$DECOMPILER_PATH
