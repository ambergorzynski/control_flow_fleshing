#!/bin/sh

TIMESTAMP=$(date +%s)
NAME=$(hostname)
MACHINE=${NAME%%.*}

SRC='/homes/rk1923/control_flow_fleshing/src'
ACTION='fuzz'
OUTPUT=/vol/bitbucket/rk1923/UROP/output/${MACHINE}_${TIMESTAMP}
LANG='javabc'
COMPILER='cfr'
JVM='/usr/lib/jvm/java-17-openjdk-amd64/bin'
JASMIN='/vol/bitbucket/rk1923/UROP/jasmin-2.4'
JSON='/vol/bitbucket/rk1923/UROP/json-simple-1.1.1.jar'
DECOMPILER_PATH='/vol/bitbucket/agg22/cfr-0.152.jar'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

mkdir $OUTPUT

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    --dirs \
    -graphs=1 \
    -paths=1 \
    -min_size=3 \
    -max_size=100 \
    $LANG \
    $COMPILER \
    $JVM \
    $JASMIN \
    $JSON \
    $DECOMPILER_PATH  
