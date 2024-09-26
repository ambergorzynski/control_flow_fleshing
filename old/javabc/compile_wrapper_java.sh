#!/bin/sh
src=$1
jvm=$2
cd $src
${jvm}/javac testing/TestCaseInterface.java
${jvm}/javac testing/Wrapper.java
