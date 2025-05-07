#!/bin/sh

# This script runs all evaluation claims in our ECOOP25 paper including regenerating data
# The amount of time in minutes for each analyses can be controlled through the TIME parameters in this script

BASE=/data/dev/fuzzflesh
COVERAGE_BASE=$BASE/data/coverage/raw
COVERAGE_DATA=$BASE/data/coverage/raw/coverage_outputs
COVERAGE_OUTPUT=$BASE/output/coverage
cd $BASE

TIME_COVERAGE=1 # Minute

# Get coverage data
echo "Running coverage analysis for FuzzFlesh on the decompiler Ghidra"
./scripts/analysis/run_coverage_ff_on_ghidra.sh $TIME_COVERAGE $COVERAGE_BASE

echo "Running coverage analysis for FuzzFlesh on Java decompilers"
./scripts/analysis/run_coverage_ff_on_java_decompilers.sh $TIME_COVERAGE $COVERAGE_BASE

# Coverage comparison - overall
echo "Processing results"
python3.10 src/analysis/coverage/coverage.py $COVERAGE_DATA $COVERAGE_OUTPUT --time $TIME_COVERAGE

# Coverage comparison - Ghidra
#python3.10 src/analysis/coverage/diff_coverage.py $COVERAGE_DATA $COVERAGE_OUTPUT --c --time $TIME_COVERAGE

# Coverage comparison - Java decompilers
#python3.10 src/analysis/coverage/diff_coverage.py $COVERAGE_DATA --java
