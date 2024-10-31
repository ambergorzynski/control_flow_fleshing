#!/bin/bash

GHIDRA=$1

if [ -z $GHIDRA ]; then
    echo "No filepath provided!"
    exit 1
fi

cd $GHIDRA
find . -name "*.gcda" | xargs rm -f
find . -name "*.gcov" | xargs rm -f 

find . -name "*.gcda"
RESULT=$?
if [ $RESULT != 0 ]; then
    exit 1
fi 

find . -name "*.gcov" 
RESULT=$?
if [ $RESULT != 0 ]; then 
    exit 1 
fi 

exit 0