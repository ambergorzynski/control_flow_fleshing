#!/bin/sh

OUTPUT=$1
TIMELIMIT=$2

DECFUZZER=/data/dev/decfuzzer

# clean coverage files
cd /data/dev/radare2/r2ghidra-11
find . -name "*.gcda" | xargs rm -f

cd $DECFUZZER

# Must start the server as root
# sudo service sql start

source venv/bin/activate

export HOME=/data/dev
export PATH=/data/dev/radare2/install/radare2-ghidra11/bin:$PATH

python run.py
#python run_with_generation.py $TIMELIMIT

