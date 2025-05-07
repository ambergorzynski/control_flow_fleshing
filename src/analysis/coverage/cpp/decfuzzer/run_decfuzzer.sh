#!/bin/sh

TIMELIMIT=$1
OUTPUT=$2
DECFUZZER=/data/dev/fuzzflesh/external/decfuzzer/DecFuzzer-master

cd $DECFUZZER

# Start the server
service sql start

#export HOME=/data/dev
#export PATH=/data/dev/radare2/install/radare2-ghidra11/bin:$PATH

python run_with_generation.py

