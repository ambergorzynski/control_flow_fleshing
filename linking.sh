#!/bin/sh
clang -emit-llvm -S run_test.cpp -o run_test.ll
llvm-link -S test_input_llvm_programs/run_cfg_wip_graph_test.ll run_test.ll -o out_unopt.ll
opt -passes="adce" -S out_unopt.ll -o out.ll
llc -filetype=obj out.ll -o out.o
clang++ out.o -o out
#llvm-as test_input_llvm_programs/run_cfg_wip_graph_test.ll -o run_cfg.bc
#llvm-as run_test.ll -o run_test.bc
#llvm-link run_cfg.bc run_test.bc -o out_unopt.ll
#opt -passes="adce" out_unopt.ll -o out.ll
#clang++ out.bc -o out
#llc -filetype=obj out.bc -o out.o
#clang++ out.o -o out
