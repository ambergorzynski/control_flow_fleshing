#!/bin/sh

OUTPUT=$1 # Path where results should be stored
TEST_FILES=$2 # Path to the output directory containing fuzzer_classes.xml
TOOL=$3 # Tool from {fuzzflesh, jdtester}

# This script runs tests in the FernFlower test directory and gathers coverage.
# The relevant tests should be added to the test directory prior to 
# running this script.

FERNFLOWER=/data/dev/fuzzflesh/external/fernflower/fernflower_cov

# Copy the test .xml into the FernFlower test-spec folder
# FernFlower will read from this file to determine the location of the .class files
echo ${TEST_FILES}/fuzzer_classes.xml
cp ${TEST_FILES}/fuzzer_classes.xml ${FERNFLOWER}/testSpecs/
RESULT=$?
if [[ $RESULT != 0 ]]
then
    echo "Problem getting fuzzer_classes.xml!"
    exit 1
fi

# Run tests
cd $FERNFLOWER
gradle clean build --no-build-cache

# Get csv and xml report
cp build/customJacocoReportDir/test/jacocoTestReport.csv $OUTPUT/coverage.csv
cp build/customJacocoReportDir/test/jacocoTestReport.xml $OUTPUT/coverage.xml

