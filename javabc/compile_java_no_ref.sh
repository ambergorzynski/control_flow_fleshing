#!/bin/sh
src=$1
test_number=$2

jvm=/Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home/bin/

# compile test
cd $src
${jvm}/java -jar /Users/ambergorzynski/jasmin-2.4/jasmin.jar testing/test$test_number/run_cfg_$test_number.j -d testing/test$test_number

# compile wrapper with test
${jvm}/javac -cp .:./testing/test$test_number testing/WrapperNoReflection.java

echo 'compilation complete'