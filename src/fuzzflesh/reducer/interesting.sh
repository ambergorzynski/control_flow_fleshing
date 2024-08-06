#!/bin/sh

SRC='/data/dev/fuzzflesh/src'
PROGRAM='program.c'
OBJECT='program.o'
SCRIPT_PATH=${SRC}/fuzzflesh/harness/c
DECOMPILED='decompiled.c'
RECOMPILED_OBJECT='recompiled.o'
WRAPPER=${SRC}/fuzzflesh/wrappers/WrapperStatic.cpp
EXE='recompiled.exe'
INPUT_PATH='inputs.json'
OUTPUT='/data/work/fuzzflesh/dev_testing/output/out/graph_0/reduce'
GHIDRA='/data/dev/ghidra/ghidra_11.1.2_PUBLIC/support'

# set env
export CPLUS_INCLUDE_PATH='/data/dev/include'

# navigate to output file
cd $OUTPUT

# compile program to object file
g++ $PROGRAM -c -o $OBJECT

# decompile to c
$GHIDRA/analyzeHeadless \
    $OUTPUT Project \
    -import $OBJECT \
    -scriptPath $SCRIPT_PATH \
    -postscript DecompileHeadless.java \
    $DECOMPILED

# add __stack_chk_fail()
sed -i '1 i\void __stack_chk_fail(){return;}' $DECOMPILED 

# recompile to object file
echo "Recompiling..."
g++ $DECOMPILED -c -o $RECOMPILED_OBJECT

# link with wrapper
echo "Linking..."
g++ $RECOMPILED_OBJECT $WRAPPER -o $EXE

# execute
echo "Executing..."
./$EXE $INPUT_PATH all.txt bad.txt
RETURN=$?

# tidy
rm -rf Project*

# return 0 if the actual path is NOT equal to the expected path
if [ $RETURN -eq 1 ];
then
    exit 0
elif [ $RETURN -eq 0 ];
then
    exit 1
else
    exit $RETURN
fi
