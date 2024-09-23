#!/bin/sh

# This script creates a sample of FuzzFlesh test programs
# in Java bytecode (.class files) and runs CFR

# Setup information
SRC='/data/dev/fuzzflesh/src'
ACTION='fuzz'
OUTPUT='/data/work/fuzzflesh/coverage/fernflower/fuzzflesh'
LANG='javabc'
JVM='/usr/lib/jvm/java-19-openjdk-amd64/bin'
JASMIN='/homes/agg22/dev/jasmin-2.4'
JSON='/data/dev/java/json-simple-1.1.1.jar'
COMPILER='fernflower'
DECOMPILER_PATH='/data/dev/fernflower/java-decompiler-engine-242.21829.40.jar'

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
    --dirs \
    --no-tidy \
    --gen_xml_for_coverage \
    --time_limit=1 \
    $LANG \
    $COMPILER \
    $JVM \
    $JASMIN \
    $JSON \
    -decompiler_path=$DECOMPILER_PATH 



