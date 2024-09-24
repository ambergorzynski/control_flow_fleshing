#!/bin/sh

# This script runs tests in the Jadx test directory and gathers coverage.
# The relevant tests should be added to the FuzzFlesh test directory prior to 
# running this script.

# Path to checkout of FernFlower with coverage from https://github.com/ambergorzynski/jadx_cov
JADX=/data/dev/jadx_cov/jadx-core

# Path to the output directory containing the FuzzFlesh test .class files
TEST_FILES=/data/work/fuzzflesh/coverage/fernflower/fuzzflesh/out

# Path to coverage results output
OUTPUT=/data/work/fuzzflesh/coverage/results/

# Copy the test .xml into the FernFlower test-spec folder
# FernFlower will read from this file to determine the location of the .class files
cp ${TEST_FILES}/fuzzer_classes.xml ${JADX}/src/test/java/jadx/testSpecs/

# Run tests
cd $JADX
gradle clean test

# View interactive coverage results
#open build/reports/jacoco/test/html/index.html

# Compress coverage report and save
zip -r jadx_coverage_fuzzflesh.zip build/reports/jacoco/test/htmls

mv jadx_coverage_fuzzflesh.zip $OUTPUT
