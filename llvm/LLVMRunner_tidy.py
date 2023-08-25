import subprocess
import random
from Utils import *
from pathlib import Path

class LLVMRunner():

    def __init__(self,
                 filepaths : FilePaths,
                 params : FuzzingParams,
                 compiler : str = 'default',
                 directions : str = 'unknown',
                 optimisations : str = 'O1'):
        
        self.filepaths : FilePaths = filepaths
        self.params : FuzzingParams = params
        self.compiler : str = compiler
        self.directions : str = directions
        self.optimisations : str = optimisations

        # optimisations that were unrecognised:
        #   block-placement, loop-mssa, loop-unswitch
        #   loop-extract-single
        self.cfg_preset_optimisations = ['default<O1>',
                                         'default<O2>',
                                         'default<O3>',
                                         'default<Os>',
                                         'default<Oz>']
        self.cfg_optimisations = ['adce',
                                    'break-crit-edges',
                                    'dce',
                                    'jump-threading',
                                    'lcssa',
                                    'loop-deletion',
                                    'loop-extract',
                                    'loop-reduce',
                                    'loop-rotate',
                                    'loop-simplify',
                                    'loop-unroll',
                                    'loop-unroll-and-jam',
                                    'lowerswitch',
                                    'licm',
                                    'mergereturn',
                                    'simplifycfg'
                                    ]
        self.non_cfg_optimisations = ['always-inline',
                                    'argpromotion',
                                    'bb-vectorize',
                                    'constmerge',
                                    'deadargelim',
                                    'deadtypeelim',
                                    'die',
                                    'dse',
                                    'function-attrs',
                                    'globaldce',
                                    'globalopt',
                                    'gvn',
                                    'indvars',
                                    'inline',
                                    'instcombine',
                                    'aggressive-instcombine',
                                    'internalize',
                                    'ipsccp',
                                    'lower-global-dtors',
                                    'loweratomic',
                                    'lowerinvoke',
                                    'mem2reg',
                                    'memcpyopt',
                                    'mergefunc',
                                    'partial-inliner',
                                    'prune-eh',
                                    'reassociate',
                                    'rel-lookup-table-converter',
                                    'reg2mem',
                                    'sroa',
                                    'sccp',
                                    'sink',
                                    'strip',
                                    'strip-dead-debug-info',
                                    'strip-dead-prototypes',
                                    'strip-debug-declare',
                                    'strip-nondebug',
                                    'tailcallelim',
                                    ]

    def run(self, test_name : str, path_name : str) -> None:

        # set up path names

        llvm_path : Path = ''
        wrapper_path : Path = ''

        
        # compile wrapper if not already compiled (only need to do this once per run)
        if not wrapper_path.exists():
            self.compile_wrapper()

        # compile test
        result = compile_test()

        # if return value is crash or timeout, record testcase

        # if execution arrays are different, record testcase

        # otherwise, delete graph, path, and test case files

    def compile_wrapper(self) -> None:

        # set wrapper name based on direction options
        if self.params.directions=='known':
            wrapper = 'WrapperStatic.cpp'
        else:
            wrapper = 'Wrapper.cpp'

        # set compilation output based on whether we are using graalvm (lli) or not
        if self.filepaths.graalvm_path == None:
            output = 'Wrapper.o'
        else:
            output = 'Wrapper.ll'
            bc_output = 'Wrapper.bc'

        cmd = ['clang++',
                '-c',
                f'llvm/{wrapper}',
                '-o',
                f'{self.filepaths.output_filepath}/{output}']
            
        subprocess.run(cmd, shell=True)

        # if using graalvm, also have to translate to .bc
        if self.filepaths.graalvm_path != None:

            cmd = ['llvm-as',
                   f'{self.filepaths.output_filepath}/{output}',
                   '-o',
                   f'{self.filepaths.output_filepath}/{bc_output}']
            
            subprocess.run(cmd, shell=True)

