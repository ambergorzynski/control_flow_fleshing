#!/bin/bash

SRC='/homes/rk1923/control_flow_fleshing/src'
ACTION='fuzz'
OUTPUT=./no_reflection
LANG='javabc'
COMPILER='hotspot'
JVM='/usr/lib/jvm/java-17-openjdk-amd64/bin'
JASMIN='/vol/bitbucket/rk1923/UROP/jasmin-2.4'
JSON='/vol/bitbucket/rk1923/UROP/json-simple-1.1.1.jar'

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

mkdir -p $OUTPUT

output_file=stats_no_reflection.csv
error_file=error_no_reflection.txt

echo "Graph size, # of C1, # of C2" > $output_file
echo "Error messages" > $error_file

for i in {10..300}
do
    echo "Starting graph size $i"
    echo "Starting graph size $i" >> $error_file

    c1=0
    c2=0

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
            $JSON"

        log=$(eval "$run" 2>>$error_file | grep "====")

        if echo $log | grep -q "C1"; then
            c1=$((c1+1))
        fi
        if echo $log | grep -q "C2"; then
            c2=$((c2+1))
        fi
    done

    echo "$i, $c1, $c2" >> $output_file
done
