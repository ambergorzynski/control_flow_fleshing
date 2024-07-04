#!/bin/sh

SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/data/work/fuzzflesh/dev_testing/output'
LANG='javabc'
COMPILER='cfr'
JVM='/usr/lib/jvm/java-19-openjdk-amd64/bin'
JASMIN='/homes/agg22/dev/jasmin-2.4'
JSON='/data/dev/java/json-simple-1.1.1.jar'
DECOMPILER_PATH='/vol/bitbucket/agg22/cfr-0.152.jar'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python3 -m fuzzflesh \
    $ACTION \
    -base=$BASE \
    --dirs \
    -graphs=3 \
    -paths=2 \
    $LANG \
    $COMPILER \
    $JVM \
    $JASMIN \
    $JSON \
    $DECOMPILER_PATH 

