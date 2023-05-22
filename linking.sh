#!/bin/sh
clang -emit-llvm -S wrapper.cpp -o wrapper.ll
llvm-as run_cfg.ll -o run_cfg.bc
llvm-as wrapper.ll -o wrapper.bc
llvm-link run_cfg.bc wrapper.bc -o out.bc
llc -filetype=obj out.bc -o out.o
clang out.o -o out
