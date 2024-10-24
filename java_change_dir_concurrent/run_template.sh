#!/bin/sh

TIMESTAMP=$(date +%s)
NAME=$(hostname)
MACHINE=${NAME%%.*}

SRC='/homes/rk1923/control_flow_fleshing/src'
ACTION='fuzz_with_changing_paths'
# OUTPUT=/vol/bitbucket/rk1923/UROP/output/${MACHINE}_${TIMESTAMP}
OUTPUT=.
LANG='java'
COMPILER='hotspot'
JVM='/usr/lib/jvm/java-17-openjdk-amd64/bin'
# JVM='/vol/bitbucket/rk1923/UROP/graalvm-jdk-22.0.2+9.1/bin'
JASMIN='/vol/bitbucket/rk1923/UROP/jasmin-2.4'
JSON='/vol/bitbucket/rk1923/UROP/json-simple-1.1.1.jar'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

mkdir -p $OUTPUT

python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -graphs=1 \
    -paths=3 \
    -min_size=3 \
    -max_size=10000 \
    $LANG \
    $COMPILER \
    $JVM \
    $JSON \
    # --reflection

