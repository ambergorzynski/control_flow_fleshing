#!/bin/sh

# This script runs all evaluation claims in our ECOOP25 paper including regenerating data
# The amount of time in minutes for each analyses can be controlled through the TIME parameters in this script

BASE=/data/dev/fuzzflesh
cd $BASE

TIME_COVERAGE=1 # Minute