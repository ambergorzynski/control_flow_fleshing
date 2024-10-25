#!/bin/sh
/data/dev/ghidra/ghidra_11.1.2_PUBLIC/support/analyzeHeadless \
"/data/work/fuzzflesh/" \
Project \
-import \
"/data/work/fuzzflesh/coverage/ghidra/ff/oct_20/out/graph_0/prog_0_path_0.o" \
 -overwrite \
 -scriptPath /data/dev/fuzzflesh/src/fuzzflesh/harness/c \
 -postScript DecompileHeadless.java \
 "/data/work/fuzzflesh/decomptemp.c"
