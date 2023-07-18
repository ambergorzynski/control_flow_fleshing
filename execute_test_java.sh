#!/bin/sh
testing=$1
test_number=$2
path_name=$3
cd $testing
java testing/Wrapper testing.TestCase$test_number "paths/$path_name.txt"
