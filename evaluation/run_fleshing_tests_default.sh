#!/bin/sh
opt=$1
export PYTHONPATH="${PYTHONPATH}:/${PWD}"
python dredd_test_runners/cfg_flesh_runner/main.py \
    /Users/ambergorzynski/dev/llvm-project-mutated/llvm/mutation_info/default_mutation_info.json \
    /Users/ambergorzynski/dev/llvm-project-tracking/llvm/mutation_info/default_tracked_info.json \
    /Users/ambergorzynski/dev/llvm-project-mutated/build/bin/opt \
    /Users/ambergorzynski/dev/llvm-project-tracking/build/bin/opt \
    /Users/ambergorzynski/dev \
    /Users/ambergorzynski/dev/llvm-project-mutated/build/bin/llc \
    --optimisations 'default<O3>'
#	--optimisations 'default<O3>'
#	--optimisations 'loop-unroll'
