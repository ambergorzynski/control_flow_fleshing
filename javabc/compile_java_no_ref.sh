#!/bin/sh
src=$1
test_number=$2
jvm=$3
jasmin=$4

# compile test
cd $src
${jvm}/java -jar ${jasmin}/jasmin.jar testing/test$test_number/run_cfg_$test_number.j -d testing/test$test_number

# compile wrapper with test
${jvm}/javac -cp .:./testing/test$test_number testing/WrapperNoReflection.java

echo 'compilation complete'