#!/bin/sh
testing=$1
test_name=$2
cd $testing
ilasm $testing/testing/$test_name.il