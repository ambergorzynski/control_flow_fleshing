#!/bin/sh

OUTPUT=$1 # Path where results should be stored
TEST_FILES=$2 # Path to the output directory containing fuzzer_classes.xml
TOOL=$3 # Tool from {fuzzflesh, jdtester}

# This script runs tests in the CFR test directory and gathers coverage.
# The relevant tests should be added to the test directory prior to 
# running this script.

# Path to checkout of CFR with coverage from https://github.com/ambergorzynski/cfr_cov 
CFR=/data/dev/cfr_cov

# Path to Java 11, which is necessary to run CFR
JAVA11=/usr/lib/jvm/java-11-openjdk-amd64/

# Copy the test .xml into the CFR test-spec folder
# CFR will read from this file to determine the location of the .class files
cp ${TEST_FILES}/fuzzer_classes.xml ${CFR}/decompilation-test/test-specs/

RESULT=$?
if [[ $RESULT != 0 ]]
then
    echo "Problem getting fuzzer_classes.xml!"
    exit 1
fi

# Set env variables
export JAVA_HOME=$JAVA11
export PATH=$JAVA11:$PATH

# Run tests
cd $CFR
mvn clean test
mvn jacoco:report

# View interactive coverage results
#open target/site/index.html
# Compress coverage report and save
zip -r html_coverage_${TOOL}.zip target/site

mv html_coverage_${TOOL}.zip $OUTPUT/html_coverage_${TOOL}.zip
rm -rf $OUTPUT/html_coverage_${TOOL}
unzip $OUTPUT/html_coverage_${TOOL}.zip -d $OUTPUT/html_coverage_${TOOL}
rm -f $OUTPUT/html_coverage_${TOOL}.zip

cp target/site/jacoco/jacoco.csv  $OUTPUT/coverage.csv
cp target/site/jacoco/jacoco.xml  $OUTPUT/coverage.xml
