#!/bin/sh
src=$1
jvm=/Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home/bin/
cd $src

# compile test


# compile wrapper with test
${jvm}/javac testing/WrapperNoReflection.java
