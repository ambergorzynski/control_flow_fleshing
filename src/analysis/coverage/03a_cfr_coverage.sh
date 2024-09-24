#!/bin/sh

# This script runs tests in the CFR test directory and gathers coverage.
# The relevant tests should be added to the FuzzFlesh test directory prior to 
# running this script.

# Path to checkout of CFR with coverage from https://github.com/ambergorzynski/cfr_cov 
CFR=/data/dev/cfr_cov

# Path to Java 11, which is necessary to run CFR
JAVA11=/usr/lib/jvm/java-11-openjdk-amd64/

# Path to coverage results output
OUTPUT=$1

# Path to the output directory containing the FuzzFlesh test .class files
TEST_FILES=$2

# Tool from {fuzzflesh, jdtester}
TOOL=$3

# Copy the test .xml into the CFR test-spec folder
# CFR will read from this file to determine the location of the .class files
cp ${TEST_FILES}/fuzzer_classes.xml ${CFR}/decompilation-test/test-specs/

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
zip -r cfr_coverage_fuzzflesh.zip target/site

mv cfr_coverage_${TOOL}.zip $OUTPUT/cfr_coverage_${TOOL}.zip
rm -rf $OUTPUT/cfr_coverage_${TOOL}
unzip $OUTPUT/cfr_coverage_${TOOL}.zip -d $OUTPUT/cfr_coverage_${TOOL}
rm -f $OUTPUT/cfr_coverage_${TOOL}.zip
