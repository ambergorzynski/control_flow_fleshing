#!/bin/sh
python dredd_test_runners/cfg_flesh_runner/main.py \
	/Users/ambergorzynski/dev/llvm-project-mutated/llvm_mutation_info.json \
	/Users/ambergorzynski/dev/llvm-project-tracking/llvm_mutant_tracking_info.json \
	/Users/ambergorzynski/dev/llvm-project-mutated/build/bin/opt \
	/Users/ambergorzynski/dev/llvm-project-tracking/build/bin/opt \
	/Users/ambergorzynski/dev
