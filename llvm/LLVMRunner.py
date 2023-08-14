import subprocess
import random
from Utils import *

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

    def run(self) -> None:
        '''
            Function runs the compilation and execution process for the given
            parameters and filepaths
        '''

        #TODO: add different LLVM compiler options

        # compile wrapper
        self.compile_wrapper_overall()

        # compile graphs - includes execution
        # TODO: split out execution (but want to compile / execute alternating)
        self.compile_tests_overall()
 

    def compile_wrapper_overall(self):  

        # compile wrapper from C++ to object file
        if(self.directions=='unknown'):
            subprocess.run(f'''./llvm/compile_wrapper_llvm.sh {self.filepaths.output_filepath}''', shell=True)

        elif(self.directions=='known'):
            subprocess.run(f'''./llvm/compile_wrapper_llvm_static.sh {self.filepaths.output_filepath}''', shell=True)

    def compile_tests_overall(self):

        # compile each graph once (n total)
        if(self.directions == 'unknown'):
            
            for i in range(self.params.n_graphs):

                optimisations_str = self.parse_opts()
                print(f'optimisation: {optimisations_str}')
                
                self.compile_test(f'run_cfg_{i}', optimisations_str)
                
                for j in range(self.params.n_paths):

                    self.execute(f'run_cfg_{i}', f'input_graph_{i}_path{j}')


        # compile each graph-path pair once (n*m total)
        elif(self.directions == 'known'):
            
            for i in range(self.params.n_graphs):

                for j in range(self.params.n_paths):

                    optimisations_str = self.parse_opts()
                    print(f'optimisation: {optimisations_str}')

                    self.compile_test(f'run_cfg_{i}_path_{j}', optimisations_str)

                    # execute
                    self.execute(f'run_cfg_{i}_path_{j}', f'input_graph_{i}_path{j}')


    def compile_wrapper(self):
        cmd = [f'''./llvm/compile_wrapper_llvm.sh {self.filepaths.output_filepath}''']
        result = subprocess.run(cmd, shell=True)

    def compile_wrapper_static(self):
        cmd = [f'''./llvm/compile_wrapper_llvm_static.sh {self.filepaths.output_filepath}''']
        result = subprocess.run(cmd, shell=True)

    def compile_wrapper_graalvm(self):
        cmd = [f'''./llvm/compile_wrapper_llvm_graalvm.sh {self.filepaths.output_filepath}''']
        result = subprocess.run(cmd, shell=True)

    def compile_test(self, test_name, optimisation_list):

        cmd = [f'''./llvm/compile_test_llvm.sh {self.filepaths.output_filepath} {self.filepaths.program_filepath} {test_name} "{optimisation_list}"''']
        result = subprocess.run(cmd, shell=True)

    def compile_test_graalvm(self, test_name, optimisation_list):

        cmd = [f'''./llvm/compile_test_llvm_graalvm.sh {self.filepaths.output_filepath} {self.filepaths.program_filepath} {test_name} "{optimisation_list}"''']
        result = subprocess.run(cmd, shell=True)

    def execute(self, test_name, path_name):
        
        cmd = [f'./{self.filepaths.output_filepath}/{test_name}_out {self.filepaths.program_filepath}/{path_name}.txt {self.filepaths.output_filepath}/{self.filepaths.results_name}.txt {self.filepaths.output_filepath}/{self.filepaths.bug_results_name}.txt']
        result = subprocess.run(cmd, shell=True)    

    def parse_opts(self) -> str:

        if(self.optimisations=='random_level'):
            
            #TODO: pass n_optimisations instead of just setting to 1; issues with sequencing of optimisations
            optimisations_index = [random.randint(0, len(self.cfg_preset_optimisations) - 1) for i in range(1)]
            
            print(f'optimisation indices: {optimisations_index}')
            
            opt_list = [self.cfg_preset_optimisations[i] for i in optimisations_index]

            return ','.join(opt_list)


        else:
            return self.optimisations