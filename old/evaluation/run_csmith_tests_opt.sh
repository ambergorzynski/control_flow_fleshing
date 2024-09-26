#!/bin/sh
opt=$1
export PYTHONPATH="${PYTHONPATH}:/${PWD}"
python dredd_test_runners/csmith_runner/main.py \
	/Users/ambergorzynski/dev/llvm-project-mutated/llvm/mutation_info/${opt}_mutation_info.json \
	/Users/ambergorzynski/dev/llvm-project-tracking/llvm/mutation_info/${opt}_tracked_info.json \
	/Users/ambergorzynski/dev/llvm-project-mutated/build/bin/opt \
	/Users/ambergorzynski/dev/llvm-project-tracking/build/bin/opt \
	/Users/ambergorzynski/dev/llvm-project-mutated/build/bin/llc \
	/opt/homebrew/bin \
    /$HOMEBREW_CELLAR/csmith/2.3.0/include/csmith-2.3.0 \
	--optimisations ${opt}
#	--optimisations 'default<O3>'
#	--optimisations 'loop-unroll'

