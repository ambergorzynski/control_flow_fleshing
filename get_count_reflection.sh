#!/bin/bash

SRC='/homes/rk1923/control_flow_fleshing/src'
ACTION='fuzz'
OUTPUT=./reflection
LANG='javabc'
COMPILER='hotspot'
JVM='/usr/lib/jvm/java-17-openjdk-amd64/bin'
JASMIN='/vol/bitbucket/rk1923/UROP/jasmin-2.4'
JSON='/vol/bitbucket/rk1923/UROP/json-simple-1.1.1.jar'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

mkdir -p $OUTPUT

output_file=count_reflection.csv
error_file=count_error_reflection.txt

hotspot_log=$OUTPUT/out/graph_0/prog_0_path_0/hotspot.log

echo "# of invocation until it gets C1/OSR/C2 compiled" > $output_file
echo "Graph size, C1, OSR, C2" >> $output_file
echo "Error messages" > $error_file

for i in {10..120}
do
    echo "Starting graph size $i"

    for j in {1..20}
    do
        echo "Iteration: $j"

        rm -rf $OUTPUT/out

        run="python3 -m fuzzflesh \
            $ACTION \
            -base=$OUTPUT \
            --dirs \
            -graphs=1 \
            -paths=1 \
            -min_size=$i \
            -max_size=$(expr $i + 1) \
            $LANG \
            $COMPILER \
            $JVM \
            $JASMIN \
            $JSON \
            --reflection"

        eval "$run"

        log=$(grep -E "<task compile.*TestCase testCase" "$hotspot_log")

        c1=$(echo "$log" | grep -E "<task compile.*TestCase testCase.*level='(2|3)'" | sed -n "s/.*count='\([0-9]*\)'.*/\1/p")
        osr=$(echo "$log" | grep -E "<task compile.*compile_kind='osr'.*TestCase testCase" | sed -n "s/.*count='\([0-9]*\)'.*/\1/p")
        c2=$(echo "$log" | grep -vE "<task compile.*TestCase testCase.*level='(2|3)'|<task compile.*compile_kind='osr'.*TestCase testCase" | sed -n "s/.*count='\([0-9]*\)'.*/\1/p")

        echo "$i, $c1, $osr, $c2" >> $output_file
    done
done
