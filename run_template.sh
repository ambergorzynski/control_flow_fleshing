#!/bin/sh

TIMESTAMP=$(date +%s)
NAME=$(hostname)
MACHINE=${NAME%%.*}

SRC='/homes/rk1923/control_flow_fleshing/src'
ACTION='fuzz'
# OUTPUT=/vol/bitbucket/rk1923/UROP/output/${MACHINE}_${TIMESTAMP}
OUTPUT=./output
LANG='javabc'
COMPILER='hotspot'
JVM='/usr/lib/jvm/java-17-openjdk-amd64/bin'
JASMIN='/vol/bitbucket/rk1923/UROP/jasmin-2.4'
JSON='/vol/bitbucket/rk1923/UROP/json-simple-1.1.1.jar'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

mkdir -p $OUTPUT

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -graphs=1 \
    -paths=2 \
    -min_size=3 \
    -max_size=100 \
    --no_tidy \
    $LANG \
    $COMPILER \
    $JVM \
    $JASMIN \
    $JSON \
    # --reflection

