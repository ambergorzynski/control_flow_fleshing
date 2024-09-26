#!/bin/sh
export PYTHONPATH="${PYTHONPATH}:/${PWD}"
python dredd_test_runners/cfg_flesh_runner/main.py \
	/Users/ambergorzynski/dev/llvm-project-mutated/llvm/mutation_info/loop-simplifycfg_mutation_info.json \
	/Users/ambergorzynski/dev/llvm-project-tracking/llvm/mutation_info/loop-simplifycfg_tracked_info.json \
	/Users/ambergorzynski/dev/llvm-project-mutated/build/bin/opt \
	/Users/ambergorzynski/dev/llvm-project-tracking/build/bin/opt \
	/Users/ambergorzynski/dev \
	/Users/ambergorzynski/dev/llvm-project-mutated/build/bin/llc \
	--optimisations 'loop-simplifycfg'
#	--optimisations 'default<O3>'
#	--optimisations 'loop-unroll'

