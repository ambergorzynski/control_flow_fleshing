#!/bin/sh

# This script runs all evaluation claims in our ECOOP25 paper without regenerating data
# The output is a set of Latex tables that correspond to the paper

BASE=/data/dev/fuzzflesh
COVERAGE_DATA=$BASE/data/coverage/precalculated
COVERAGE_OUTPUT=$BASE/output/coverage

cd $BASE

# Coverage comparison - overall
python3.10 src/analysis/coverage/coverage.py $COVERAGE_DATA $COVERAGE_OUTPUT

# Coverage comparison - Ghidra
python3.10 src/analysis/coverage/diff_coverage.py $COVERAGE_DATA $COVERAGE_OUTPUT --c 

# Coverage comparison - Java decompilers
python3.10 src/analysis/coverage/diff_coverage.py $COVERAGE_DATA $COVERAGE_OUTPUT --java

# Comparison of Java bugs found by FuzzFlesh and JD-Tester
python3.10 src/analysis/head2head/head2head_jdtester.py --analyse