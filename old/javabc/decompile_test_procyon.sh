#!/bin/sh
testing=$1
test_name=$2
jvm=$3
decompiler_jar=$4

cd $testing 
procyon-decompiler testing/$test_name/TestCase.class >> testing/$test_name/TestCase.java

# remove previous TestCase.class so it can be replaced (or not, if re-compilation fails)
rm -f testing/$test_name/TestCase.class