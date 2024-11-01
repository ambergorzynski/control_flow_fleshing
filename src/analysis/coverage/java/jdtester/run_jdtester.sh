#!/bin/bash

# JD-Tester does not appear to work smoothly.
# It is necessary to run it as root because it references a .mf file 
# in a hard-coded location: /root/DecompilerTester-Git/Test.mf
# and the source code is not available, so it is not possible to change
# this. In addition, there is some kind of error during decompilation.

# The output .class files appear to be generated OK if the following steps are used:
#   - Navigate to the /data/dev/jdtester folder
#   - The output folder must be within this folder
#   - Run the script as root

DECOMPILER=$1
PROGRAM_GENERATOR=$2
OUTPUT=results/$3
TIMELIMIT=$4

if [[ "$PROGRAM_GENERATOR" = "javafuzzer" ]]
then
    PROGRAM_GENERATOR=JavaFuzzer
elif [[ "$PROGRAM_GENERATOR" = "hephaestus" ]]
then
    PROGRAM_GENERATOR=Hephaestus
fi

JDTESTER=/data/dev/jdtester
JDTESTER_JAR=${JDTESTER}/JD-Tester-${PROGRAM_GENERATOR}.jar
ANDROID=/data/dev/Android/Sdk
PROGRAMS=1

cd $JDTESTER

rm -rf $OUTPUT
mkdir -p $OUTPUT

export JAVA_HOME=/usr/lib/jvm/java-1.11.0-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH

num=0
end=$((SECONDS+TIMELIMIT))

while [ $SECONDS -lt $end ]; do

    java -jar $JDTESTER_JAR \
        -ph $JDTESTER \
        -ah $ANDROID \
        -o ./${OUTPUT}/out_${num} \
        -de ${DECOMPILER} \
        -npe $PROGRAMS

    num=$((num+1))
    
done
