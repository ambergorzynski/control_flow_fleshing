#!/bin/sh
base=/Users/ambergorzynski/dev
dredd_exe=/Users/ambergorzynski/dredd-src/dredd/third_party/clang+llvm/bin/dredd
transforms=${base}/llvm-project-tracking/llvm/lib/Transforms
compilation_db=${base}/llvm-project-tracking/build/compile_commands.json
info_path=${base}/llvm-project-tracking/llvm/mutation_info

${dredd_exe} -p ${compilation_db} \
	${transforms}/Scalar/LoopUnrollPass.cpp \
	${transforms}/Scalar/LoopSimplifyCFG.cpp \
	${transforms}/Scalar/ADCE.cpp \
	${transforms}/Scalar/LoopDeletion.cpp \
	-mutation-info-file ${info_path}/mutation_info.json
