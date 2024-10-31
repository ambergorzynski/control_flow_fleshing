#!/bin/bash

DECOMPILER='jadx'
PROGRAM_GENERATOR='javafuzzer'
OUTPUT=results/pre_ff_fix_commit
TIMELIMIT=60*60

if [ $PROGRAM_GENERATOR = "javafuzzer" ]
then
    PROGRAM_GENERATOR=JavaFuzzer
elif [ $PROGRAM_GENERATOR = "hephaestus" ]
then
    PROGRAM_GENERATOR=Hephaestus
fi

JDTESTER=/data/dev/jdtester_backup
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
