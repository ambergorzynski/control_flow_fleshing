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
        '''
            Function runs the compilation and execution process for the given
            parameters and filepaths
        '''

        # compile wrapper
        self.compile_wrapper()

        # compile graphs - includes execution
        # TODO: split out execution (but want to compile / execute alternating)
        self.compile_test()

        self.execute_test()

    def compile_wrapper(self):

        wrapper_path = Path(f'llvm/{self.filepaths.output_filepath}/Wrapper.o') 

        if not wrapper_path.exists(): 

            # have 3 possible wrappers set up: graalvm JIT (with directions known), 
            # directions unknown for static compilation, or directions known for static compilation
            if(self.filepaths.graalvm_path != None):
                subprocess.run(f'''./llvm/compile_wrapper_llvm_graalvm.sh {self.filepaths.output_filepath} {self.filepaths.graalvm_path}''', shell=True)

            elif(self.filepaths.graalvm_path == None and self.directions=='unknown'):
                subprocess.run(f'''./llvm/compile_wrapper_llvm.sh {self.filepaths.output_filepath}''', shell=True)

            elif(self.filepaths.graalvm_path == None and self.directions=='known'):
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
        else:

            
            for i in range(self.params.n_graphs):

                for j in range(self.params.n_paths):

                    optimisations_str = self.parse_opts()
                    print(f'optimisation: {optimisations_str}')

                    if(self.filepaths.graalvm_path is not None):
                        self.graalvm(f'run_cfg_{i}_path_{j}', f'input_graph_{i}_path{j}')

                    else:
                        self.compile_test(f'run_cfg_{i}_path_{j}', optimisations_str)

                        # execute
                        self.execute(f'run_cfg_{i}_path_{j}', f'input_graph_{i}_path{j}')


    def graalvm(self, test_name, path_name):
        subprocess.run(f'''./llvm/compile_test_llvm_graalvm_native.sh {self.filepaths.output_filepath} {self.filepaths.program_filepath} {self.filepaths.path_filepath} {test_name} {path_name} {self.filepaths.graalvm_path} {self.filepaths.results_name} {self.filepaths.bug_results_name}''', shell=True)
    
    def compile_wrapper(self):
        cmd = [f'''./llvm/compile_wrapper_llvm.sh {self.filepaths.output_filepath}''']
        result = subprocess.run(cmd, shell=True)

    def compile_wrapper_static(self):
        cmd = [f'''./llvm/compile_wrapper_llvm_static.sh {self.filepaths.output_filepath}''']
        result = subprocess.run(cmd, shell=True)

    def compile_wrapper_graalvm(self, test_name):
        cmd = [f'''./llvm/compile_wrapper_llvm_graalvm.sh {self.filepaths.output_filepath} {self.filepaths.program_filepath} {test_name}''']
        result = subprocess.run(cmd, shell=True)

    def compile_test(self, test_name, optimisation_list):

        cmd = [f'''./llvm/compile_test_llvm.sh {self.filepaths.output_filepath} {self.filepaths.program_filepath} {test_name} "{optimisation_list}"''']
        result = subprocess.run(cmd, shell=True)

    def compile_test_graalvm(self, test_name, optimisation_list):
        cmd = [f'''./llvm/compile_test_llvm_graalvm.sh {self.filepaths.output_filepath} {self.filepaths.program_filepath} {test_name} "{optimisation_list}"''']
        result = subprocess.run(cmd, shell=True)

    def execute(self, test_name, path_name):
        cmd = [f'{self.filepaths.exe_filepath}/{test_name}_out {self.filepaths.path_filepath}/{path_name}.txt {self.filepaths.output_filepath}/{self.filepaths.results_name}.txt {self.filepaths.output_filepath}/{self.filepaths.bug_results_name}.txt']
        result = subprocess.run(cmd, shell=True)    

    def parse_opts(self) -> str:

        if(self.optimisations=='random_level'):
            
            #TODO: pass n_optimisations instead of just setting to 1; issues with sequencing of optimisations
            optimisations_index = [random.randint(0, len(self.cfg_preset_optimisations) - 1) for i in range(1)]
                        
            opt_list = [self.cfg_preset_optimisations[i] for i in optimisations_index]

            return ','.join(opt_list)


        else:
            return self.optimisations
