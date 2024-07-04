#!/bin/sh
src=$1
test_name=$2
jvm=$3
jasmin=$4

# compile test
cd $src
${jvm}/java -jar ${jasmin}/jasmin.jar testing/$test_name/$test_name.j -d testing/$test_name

# compile wrapper with test
${jvm}/javac -cp .:./testing/$test_name testing/WrapperNoReflection.java
