#!/bin/sh

# This script creates a sample of FuzzFlesh test programs
# in Java bytecode (.class files) and adds them to the 
# CFR test directory. The tests can be run to gather coverage
# information in script 02.

# Setup information
SRC='/data/dev/fuzzflesh/src'
ACTION='gen'
OUTPUT='/data/work/fuzzflesh/coverage/fuzzflesh_graph_gen'
LANG='javabc'
JVM='/usr/lib/jvm/java-19-openjdk-amd64/bin'
JASMIN='/homes/agg22/dev/jasmin-2.4'
JSON='/data/dev/java/json-simple-1.1.1.jar'
COMPILER='cfr'
DECOMPILER_PATH='/data/dev/cfr/target/classes'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

# Generate programs
python3 -m fuzzflesh \
    $ACTION \
    -base=$OUTPUT \
    -graphs=5 \
    -paths=3 \
    -max_size=50 \
    -max_successors=2 \
    --dirs \
    --tidy \
    --gen_decompiler_input \
    $LANG \
    $COMPILER \
    $JVM \
    $JASMIN \
    $JSON \
    -decompiler_path=$DECOMPILER_PATH 



