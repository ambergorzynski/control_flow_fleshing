#!/bin/sh

# This script runs tests in the FernFlower test directory and gathers coverage.
# The relevant tests should be added to the FuzzFlesh test directory prior to 
# running this script.

# Path to checkout of FernFlower with coverage from https://github.com/ambergorzynski/intellij-community-cov
FERNFLOWER=/data/dev/fernflower/intellij-community-cov/plugins/java-decompiler/engine

# Path to coverage results output
OUTPUT=$1

# Path to the output directory containing the FuzzFlesh test .class files
TEST_FILES=$2

# Copy the test .xml into the FernFlower test-spec folder
# FernFlower will read from this file to determine the location of the .class files
cp ${TEST_FILES}/fuzzer_classes.xml ${FERNFLOWER}/testSpecs/

# Run tests
cd $FERNFLOWER
gradle clean test

# View interactive coverage results
#open build/jacocoHtml/index.html

# Compress coverage report and save
zip -r fernflower_coverage_fuzzflesh.zip build/jacocoHtml

mv fernflower_coverage_fuzzflesh.zip $OUTPUT/
