#!/bin/bash
location=/home/user42/amber-demo/corpus

mkdir $location

mkdir $location/llvm-tests
cd $location/llvm-tests
git clone https://github.com/llvm/llvm-test-suite.git
