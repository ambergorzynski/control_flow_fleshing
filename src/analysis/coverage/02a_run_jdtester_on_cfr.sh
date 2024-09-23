#!/bin/sh

# This script runs JD-Tester on CFR using:
#   (1) the JavaFuzzer generator
#   (2) the Hephaestus generator
# Class file locations are gathered and recorded in fuzzer_classes.xml
# which will be passed to the coverage calculator

# JD-Tester does not appear to work smoothly.
# It is necessary to run it as root because it references a .mf file 
# in a hard-coded location: /root/DecompilerTester-Git/Test.mf
# and the source code is not available, so it is not possible to change
# this. In addition, there is some kind of error during decompilation.

# The output .class files appear to be generated OK if the following steps are used:
#   - Navigate to the /data/dev/jdtester folder
#   - The output folder must be within this folder
#   - Run the script as root

JDTESTER=/data/dev/jdtester
JDTESTER_JAR=${JDTESTER}/JD-Tester-JavaFuzzer.jar
ANDROID=/data/dev/Android/Sdk
OUTPUT=./cfr_output
DECOMPILER='cfr'
PROGRAMS=1

cd $JDTESTER

java -jar $JDTESTER_JAR \
    -ph $JDTESTER \
    -ah $ANDROID \
    -o $OUTPUT \
    -de $DECOMPILER \
    -npe $PROGRAMS
