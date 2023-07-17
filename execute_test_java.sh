#!/bin/sh
testing="fuzzing/java/fuzzing_170723/src"
cd $testing
java testing/Wrapper testing.TestCase0 "paths/input_graph_0_path0.txt"
