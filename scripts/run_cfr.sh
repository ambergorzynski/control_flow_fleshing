#!/bin/sh

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/data/dev/fuzzflesh/output'
LANG='javabc'
JVM='/usr/lib/jvm/java-11-openjdk-amd64/bin'
JASMIN='/data/dev/fuzzflesh/external/jasmin/jasmin-2.4'
JSON='/data/dev/fuzzflesh/external/json/json-simple-1.1.1.jar'
COMPILER='cfr'
DECOMPILER_PATH='/data/dev/fuzzflesh/external/cfr/cfr/target/classes'

PYTHONPATH=$SRC/fuzzflesh

mkdir -p $OUTPUT

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -paths=5 \
    -max_size=10 \
    -max_successors=4 \
    --dirs \
    --tidy \
    $LANG \
    $COMPILER \
    $JVM \
    $JASMIN \
    $JSON \
    -decompiler_path=$DECOMPILER_PATH