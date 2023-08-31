#!/bin/sh
testing=$1
test_name=$2
jvm=$3
decompiler_jar=$4

cd $testing
${jvm}/java -jar ${decompiler_jar} testing/$test_name/TestCase.class testing/$test_name/
