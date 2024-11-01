#!/bin/sh

OUTPUT=$1 # Path where results should be stored
TEST_FILES=$2 # Path to the output directory containing fuzzer_classes.xml
TOOL=$3 # Tool from {fuzzflesh, jdtester}

# This script runs tests in the Jadx test directory and gathers coverage.
# The relevant tests should be added to the test directory prior to 
# running this script.

# Path to checkout of FernFlower with coverage from https://github.com/ambergorzynski/jadx_cov
JADX=/data/dev/jadx_cov/jadx-core

# Copy the test .xml into the Jadx test-spec folder
# Jadx will read from this file to determine the location of the .class files
cp ${TEST_FILES}/fuzzer_classes.xml ${JADX}/src/test/java/jadx/testSpecs/

RESULT=$?
if [[ $RESULT != 0 ]]
then
    echo "Problem getting fuzzer_classes.xml!"
    exit 1
fi

# Run tests
cd $JADX
gradle clean 
../gradlew :jadx-core:spotlessApply
gradle build --no-build-cache
gradle test --rerun-tasks
RESULT=$?
if [[ $RESULT != 0 ]]
then
    echo "Problem running tests!"
    exit 1
fi


# View interactive coverage results
#open build/reports/jacoco/test/html/index.html

# Compress coverage report and save
(cd build/reports/jacoco/test && zip -r html.zip html)

mv build/reports/jacoco/test/html.zip $OUTPUT/html.zip
rm -rf $OUTPUT/html
unzip $OUTPUT/html.zip -d $OUTPUT/html
rm -f $OUTPUT/html.zip

cp build/reports/jacoco/test/jacocoTestReport.csv $OUTPUT/coverage.csv
cp build/reports/jacoco/test/jacocoTestReport.xml $OUTPUT/coverage.xml
