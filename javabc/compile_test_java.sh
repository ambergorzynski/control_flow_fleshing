#!/bin/sh
testing=$1
test_name=$2
cd $testing
jvm=/Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home/bin
${jvm}/java -jar /Users/ambergorzynski/jasmin-2.4/jasmin.jar testing/$test_name.j