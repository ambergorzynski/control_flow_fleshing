#!/bin/sh

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/data/work/fuzzflesh/dev_testing/output'
LANG='javabc'
JVM='/usr/lib/jvm/java-19-openjdk-amd64/bin'
JASMIN='/homes/agg22/dev/jasmin-2.4'
JSON='/data/dev/java/json-simple-1.1.1.jar'
COMPILER='cfr'
DECOMPILER_PATH='/vol/bitbucket/agg22/cfr-0.152.jar'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -graphs=3 \
    -paths=2 \
    $LANG \
    $COMPILER \
    $JVM \
    $JASMIN \
    $JSON \
    -compiler_path=$DECOMPILER_PATH 
