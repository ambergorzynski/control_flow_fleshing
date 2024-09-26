#!/bin/sh

SRC='/data/dev/fuzzflesh/src'

JAVA='/usr/lib/jvm/java-19-openjdk-amd64/bin/java'
JAVAC='/usr/lib/jvm/java-19-openjdk-amd64/bin/javac'
JASMIN='/homes/agg22/dev/jasmin-2.4/jasmin.jar'
JSON='/data/dev/java/json-simple-1.1.1.jar'
DECOMPILER_PATH='/data/dev/fernflower/java-decompiler-engine-242.21829.40.jar'

WRAPPER=${SRC}/fuzzflesh/wrappers/WrapperNoReflection.java
INPUT_PATH='inputs.json'
PROGRAM='program.j'

COMPILED_DIR='.'
DECOMPILED_DIR='.'
COMPILED='TestCase.class'
DECOMPILED='TestCase.java'
RECOMPILED_DIR='recompiled/'

# compile program to class file
echo "Compiling..."
$JAVA -jar $JASMIN $PROGRAM -d $COMPILED_DIR

RETURN=$?
if [ $RETURN != 0 ];
then
    exit 1
fi
# check that original program executes ok
echo "Compile wrapper..."
$JAVAC -cp ".:$JSON" $WRAPPER -d $COMPILED_DIR

RETURN=$?
if [ $RETURN != 0 ];
then
    exit 2
fi
# execute
echo "Execute..."
$JAVA -cp "$COMPILED_DIR:$JSON" Wrapper $INPUT_PATH output.txt bad.txt 1000

RETURN=$?
if [ $RETURN != 0 ];
then
    exit 3
fi
# decompile to java
echo "Decompiling..."
$JAVA -jar $DECOMPILER_PATH $COMPILED $DECOMPILED_DIR

grep "Couldn't be decompiled" $DECOMPILED_DIR/$DECOMPILED

RESULT=$?

if [ $RESULT -eq 0 ];
then
    exit 4
fi

# recompile 
echo "Recompiling..."
$JAVAC $DECOMPILED -d $RECOMPILED_DIR

RETURN=$?
if [ $RETURN != 0 ];
then
    exit 5
fi
echo "Compile wrapper..."
$JAVAC -cp ".:$JSON" $WRAPPER -d $RECOMPILED_DIR

RETURN=$?
if [ $RETURN != 0 ];
then
    exit 6
fi
# execute
echo "Execute..."
$JAVA -cp "$RECOMPILED_DIR:$JSON" Wrapper $INPUT_PATH output.txt bad.txt 1000

RETURN=$?

# tidy
rm -rf Project*

# return 0 if the actual path is NOT equal to the expected path
if [ $RETURN -eq 1 ];
then
    exit 0
elif [ $RETURN -eq 0 ];
then
    exit 7
else
    exit $RETURN
fi
