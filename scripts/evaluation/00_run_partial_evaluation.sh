#!/bin/sh

# This script runs all evaluation claims in our ECOOP25 paper without regenerating data
# The output is a set of Latex tables that correspond to the paper

BASE=/data/dev/fuzzflesh
cd $BASE

# Coverage comparison - overall
python3.10 src/analysis/coverage/coverage.py

# Coverage comparison - Ghidra
python3.10 src/analysis/coverage/diff_coverage.py --c

# Coverage comparison - Java decompilers
python3.10 src/analysis/coverage/diff_coverage.py --java

# Comparison of Java bugs found by FuzzFlesh and JD-Tester
python3.10 src/analysis/head2head/head2head_jdtester.py --analyse