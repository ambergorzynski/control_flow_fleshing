#!/bin/sh
testing=$1
test_name=$2
jvm=$3
jasmin=$4

cd $testing
${jvm}/java -jar ${jasmin}/jasmin.jar testing/$test_name.j