#!/bin/sh
src=$1
test_name=$2
jvm=$3

# compile test
cd $src
${jvm}/javac testing/$test_name/TestCase.java

# compile wrapper with test
${jvm}/javac -cp .:./testing/$test_name testing/WrapperNoReflection.java
