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

    def compile(self, test_name : str) -> int:
        '''
            Function runs the compilation and execution process for the given
            parameters and filepaths
        '''

        if not self.params.opt_only:
            wrapper_result = self.compile_wrapper()

            if wrapper_result != 0:
                print('Wrapper compilation failed!')
                return 1

            print('Wrapper compilation succeeded!')

        compilation_result = self.compile_test(test_name)

        if compilation_result != 0:
            print('Compilation failed!')
            return 1
        
        print('Test compilation succeeded!')

    def run(self, test_name : str, path_name : str) -> int:
        
        if not self.params.opt_only:
            exe_result = self.execute_test(test_name, path_name)

            if exe_result != 0:
                print('Execution failed!')
                return 1
            
            print('Execution succeeded!')
        
        return 0


    def compile_wrapper(self) -> int:

        wrapper_path = Path(f'llvm/{self.filepaths.output_filepath}/Wrapper.o') 

        if not wrapper_path.exists(): 

            # have 3 possible wrappers set up: 
            # 1. graalvm JIT (with directions known), 
            # 2. directions unknown for static compilation, 
            # 3. directions known for static compilation
            if(self.filepaths.graalvm_path != None):
                result = subprocess.run(f'''./llvm/compile_wrapper_llvm_graalvm.sh {self.filepaths.output_filepath} {self.filepaths.graalvm_path}''', shell=True)

            elif(self.filepaths.graalvm_path == None and self.directions=='unknown'):
                result = subprocess.run(f'''./llvm/compile_wrapper_llvm.sh {self.filepaths.output_filepath} {self.filepaths.llvm_filepath}''', shell=True)

            elif(self.filepaths.graalvm_path == None and self.directions=='known'):
                result = subprocess.run(f'''./llvm/compile_wrapper_llvm_static.sh {self.filepaths.output_filepath} {self.filepaths.llvm_filepath}''', shell=True)

            return result.returncode
        
        else:
            return 0


    def compile_test(self, test_name : str) -> int:

        # compilation process for graalvm is different to static compilation

        if(self.filepaths.graalvm_path != None):
            result = subprocess.run(f'''./llvm/compile_test_llvm_graalvm.sh {self.filepaths.output_filepath} {self.filepaths.program_filepath} {test_name} {self.filepaths.graalvm_path}''', shell=True)

        else:

           # we pass some optimisation level to LLVM static compiler tool opt 
            optimisations_str = self.parse_opts()
            print(f'optimisation: {optimisations_str}')

            opt_cmd = [f'''./llvm/opt_test_llvm.sh \
                    {self.filepaths.output_filepath} \
                    {self.filepaths.program_filepath} \
                    {self.filepaths.llvm_filepath} \
                    {test_name} \
                    "{optimisations_str}"''']
            
            result = subprocess.run(opt_cmd, shell=True)

            # compile to object file with static compiler unless opt-only flag is set
            if not self.params.opt_only:

                cmd = [f'''./llvm/compile_test_llvm.sh \
                        {self.filepaths.output_filepath} \
                        {self.filepaths.program_filepath} \
                        {self.filepaths.llvm_filepath} \
                        {test_name}''']
                
                result = subprocess.run(cmd, shell=True)

        return result.returncode
    
    def execute_test(self, test_name, path_name):

        # execution is different for graalvm (using lli) and static LLVM execution

        if(self.filepaths.graalvm_path != None):
            
            cmd = [f'''./llvm/execute_test_llvm_graalvm.sh \
                    {self.filepaths.output_filepath} \
                    {self.filepaths.path_filepath} \
                    {test_name} \
                    {path_name} \
                    {self.filepaths.graalvm_path} \
                    {self.filepaths.results_name} \
                    {self.filepaths.bug_results_name}''']
            
        else:
            
            cmd = [f'''{self.filepaths.exe_filepath}/{test_name}_out \
                    {self.filepaths.path_filepath}/{path_name}.txt \
                    {self.filepaths.output_filepath}/{self.filepaths.results_name}.txt \
                    {self.filepaths.output_filepath}/{self.filepaths.bug_results_name}.txt''']
                    
        result = subprocess.run(cmd, shell=True)
        return result.returncode

    def parse_opts(self) -> str:

        if(self.optimisations=='random_level'):
            
            #TODO: pass n_optimisations instead of just setting to 1; issues with sequencing of optimisations
            optimisations_index = [random.randint(0, len(self.cfg_preset_optimisations) - 1) for i in range(1)]
                        
            opt_list = [self.cfg_preset_optimisations[i] for i in optimisations_index]

            return ','.join(opt_list)

        else:
            return self.optimisations
