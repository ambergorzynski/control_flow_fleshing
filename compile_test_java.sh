#!/bin/sh
testing=$1
test_name=$2
cd $testing
java -jar /Users/ambergorzynski/jasmin-2.4/jasmin.jar testing/$test_name.j