#!/bin/sh

# This script runs FuzzFlesh on some example decompiler configurations

BASE=/data/dev/fuzzflesh
cd $BASE

echo "Running FuzzFlesh on Ghidra..."
./scripts/run_ghidra.sh