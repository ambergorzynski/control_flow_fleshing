#!/bin/sh
clang -emit-llvm -S run_test.cpp -o run_test.ll
llvm-as test_input_llvm_programs/run_cfg_wip_graph_test.ll -o run_cfg.bc
llvm-as run_test.ll -o run_test.bc
llvm-link run_cfg.bc run_test.bc -o out_unopt.bc
#opimisation step
opt -passes=instcount out_unopt.bc -o out.bc
llc -filetype=obj out.bc -o out.o
clang++ out.o -o out
