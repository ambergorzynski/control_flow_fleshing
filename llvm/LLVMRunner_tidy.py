import subprocess
import random
from Utils import *
from pathlib import Path
import os

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
        wrapper_path : Path = Path(f'{self.filepaths.output_filepath}/Wrapper.ll')
        
        # compile wrapper if not already compiled (only need to do this once per run)
        #if not wrapper_path.exists():
        #    self.compile_wrapper()
        self.compile_wrapper()

        # compile test
        compile_result = self.compile_test(test_name)

        print(f'the result of compilation is: {compile_result}')

        # run test
        exe_result = self.execute_test(test_name, path_name)

        print(f'the result of running is: {exe_result}')

        # if return value is crash or timeout, record testcase

        # if execution arrays are different, record testcase

        # otherwise, delete graph, path, and test case files

    def execute_test(self, test_name : str, path_name : str) -> int:

        if self.filepaths.graalvm_path == None:

            exe_cmd = [f'{self.filepaths.exe_filepath}/{test_name}_out',
                       f'{self.filepaths.path_filepath}/{path_name}.txt',
                       f'{self.filepaths.output_filepath}/{self.filepaths.results_name}.txt',
                       f'{self.filepaths.output_filepath}/{self.filepaths.bug_results_name}.txt']
            
            exe_result = subprocess.run(exe_cmd,shell=True)

        else:

            java_home=self.filepaths.graalvm_path
            llvm_toolchain=f'{self.filepaths.graalvm_path}/languages/llvm/native/bin'

            new_env = os.environ.copy()
            new_env["JAVA_HOME"] = java_home
            new_env["LLVM_TOOLCHAIN"] = llvm_toolchain

            exe_cmd = [f'{llvm_toolchain}/lli {self.filepaths.output_filepath}/{test_name}_out',
                       f'{self.filepaths.path_filepath}/{path_name}.txt',
                       f'{self.filepaths.output_filepath}/{self.filepaths.results_name}.txt',
                       f'{self.filepaths.output_filepath}/{self.filepaths.bug_results_name}.txt']
            
            exe_result = subprocess.run(exe_cmd,env=new_env)

        return exe_result

            
    def compile_test(self, test_name : str) -> int:

        if self.filepaths.graalvm_path == None:

            # optimise .ll -> .ll

            optimisations_str = self.parse_opts()

            opt_cmd = ['opt',
                       f"-passes='{optimisations_str}'",
                       '-S',
                       f'llvm/{test_name}.ll',
                       '-o',
                       f'{self.filepaths.output_filepaths}/{test_name}_opt.ll']
            
            opt_result = subprocess.run(opt_cmd, shell=True)

            if opt_result != 0:
                return 1
            
            # statically compile .ll -> .o
            
            llc_cmd = ['llc',
                       '-filetype=obj',
                       f'{self.filepaths.output_filepaths}/{test_name}_opt.ll']
            
            llc_result = subprocess.run(llc_cmd, shell=True)

            if llc_result != 0:
                return 1
            
            # link test with wrapper - no-pie option required for lab machines; ignored on others

            link_cmd = ['clang++',
                        '-no-pie',
                        f'{self.filepaths.output_filepath}/Wrapper.o',
                        f'{self.filepaths.output_filepath}/{test_name}_opt.ll',
                        '-o',
                        f'{self.filepaths.output_filepath}/{test_name}_out']
            
            link_result = subprocess.run(link_cmd, shell=True)

            if link_result != 0:
                return 1            
            
        # compilation for graalvm    
        else:

            java_home=self.filepaths.graalvm_path
            llvm_toolchain=f'{self.filepaths.graalvm_path}/languages/llvm/native/bin'

            new_env = os.environ.copy()
            new_env["JAVA_HOME"] = java_home
            new_env["LLVM_TOOLCHAIN"] = llvm_toolchain

            compile_cmd = [f'{llvm_toolchain}/clang++',
                           '-c',
                           f'{self.filepaths.program_filepath}/{test_name}.ll',
                           '-o',
                           f'{self.filepaths.program_filepath}/{test_name}.o']
            
            compile_result = subprocess.run(compile_cmd,env=new_env)

            if compile_result != 0:
                return 1     

            link_cmd = [f'{llvm_toolchain}/clang++',
                           f'{self.filepaths.program_filepath}/{test_name}.o',
                           f'{self.filepaths.output_filepath}/Wrapper.o',
                           '-o',
                           f'{self.filepaths.output_filepath}/{test_name}_out']
            
            compile_result = subprocess.run(compile_cmd,env=new_env)

            if compile_result != 0:
                return 1     



    def compile_wrapper(self) -> None:

        if self.filepaths.graalvm_path == None:

            # set wrapper name based on direction options
            if self.params.directions=='known':
                wrapper = 'WrapperStatic.cpp'
            else:
                wrapper = 'Wrapper.cpp'

            cmd = ['clang++',
                    '-c',
                    f'{wrapper}',
                    '-o',
                    f'{self.filepaths.output_filepath}/Wrapper.o']
            
            print(cmd)
                        
            subprocess.run(cmd, shell=True)

        # if using graalvm, also have to translate to .bc
        if self.filepaths.graalvm_path != None:

            wrapper = 'WrapperGraalvm.cpp'
            ll_output = 'Wrapper.ll'
            bc_output = 'Wrapper.bc'    

            emit_cmd = [f'clang++ -emit-llvm -S llvm/{wrapper} -o {self.filepaths.output_filepath}/{ll_output}']
            
            result = subprocess.run(emit_cmd, shell=True)

            print(f'Emit result: {result}')

            cmd = [f'llvm-as {self.filepaths.output_filepath}/{ll_output} -o {self.filepaths.output_filepath}/{bc_output}']
                        
            llvm_as_result = subprocess.run(cmd, shell=True)

            print(f'llvm-as result: {llvm_as_result}')

    def parse_opts(self) -> str:

        if(self.optimisations=='random_level'):
            
            #TODO: pass n_optimisations instead of just setting to 1; issues with sequencing of optimisations
            optimisations_index = [random.randint(0, len(self.cfg_preset_optimisations) - 1) for i in range(1)]
                        
            opt_list = [self.cfg_preset_optimisations[i] for i in optimisations_index]

            return ','.join(opt_list)

        else:
            return self.optimisations
        