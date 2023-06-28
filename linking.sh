#!/bin/sh
clang++ -c run_test.cpp -o run_test.o
opt -passes="simplifycfg" -S test_input_llvm_programs/run_cfg_wip_graph_test.ll -o out_opt.ll
llc -filetype=obj out_opt.ll -o out_opt.o
clang++ -o out run_test.o out_opt.o
#clang -emit-llvm -S run_test.cpp -o run_test.ll
#llvm-link -S test_input_llvm_programs/run_cfg_wip_graph_test.ll run_test.ll -o out_unopt.ll
#opt -passes="loop-extract-single" -S out_unopt.ll -o out.ll
#llc -filetype=obj out.ll -o out.o
#clang++ out.o -o out
