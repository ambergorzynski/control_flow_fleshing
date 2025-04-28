#!/bin/bash

# This script demonstrates examples of how FuzzFlesh can be used to test different decompilers

run_cfr.sh
run_fernflower.sh
run_ghidra.sh

# Reduce test cases
run_reducer_cfr.sh
