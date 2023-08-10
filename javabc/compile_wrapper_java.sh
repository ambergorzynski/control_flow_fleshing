#!/bin/sh
src=$1
jvm=/Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home/bin/
cd $src
${jvm}/javac testing/TestCaseInterface.java
${jvm}/javac testing/Wrapper.java
