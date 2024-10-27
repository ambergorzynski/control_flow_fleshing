#!/bin/sh

FUZZFLESH=/data/dev/fuzzflesh/src
RESULTS=/data/work/fuzzflesh/coverage/fuzzer_outputs

FF_OUT=${RESULTS}/ff/fuzzflesh_ghidra11_dirs_unknown_120
DF_OUT=${RESULTS}/decfuzzer/oct_20

FUZZFLESH_TIMER=120 # minutes

mkdir -p $FF_OUT
#mkdir -p $DF_OUT

./01a_run_fuzzflesh_on_ghidra.sh $FF_OUT $FUZZFLESH_TIMER

:'
/01b_run_decfuzz_on_ghidra.sh

./02a_get_fuzzflesh_coverage_ghidra.sh $FF_OUT
./02b_get_decfuzz_coverage_ghidra.sh $DF_OUT

source ${FUZZFLESH}/venv/bin/activate

python 03_coverage_analysis.py
'