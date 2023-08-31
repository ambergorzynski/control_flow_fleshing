'''
    This script performs Dredd mutation and tracking for a set of specific optimisations.
'''
import subprocess
from pathlib import Path 
from typing import Dict

# Lists of LLVM optimisation passes
LLVM_PRESET_OPTS : list[str] = ['default<O1>',
                    'default<O2>',
                    'default<O3>',
                    'default<Os>',
                    'default<Oz>']
LLVM_CFG_OPTS : list[str] = ['adce',
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
LLVM_OTHER_OPTS : list[str] = ['always-inline',
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

LLVM_OPTS : Dict[str, str] = {'loop-unroll' : 'Transforms/Scalar/LoopUnrollPass.cpp',
                              'loop-unroll-and-jam' : 'Transforms/Scalar/LoopUnrollAndJamPass.cpp',
                              'loop-simplifycfg' : 'Transforms/Scalar/LoopSimplifyCFG.cpp',
                              'break-crit-edges' : 'Transforms/Utils/BreakCriticalEdges.cpp' ,
                              'adce' : 'Transforms/Scalar/ADCE.cpp',
                              'lcssa' : 'Transforms/Utils/LCSSA.cpp',
                              'loop-deletion' : 'Transforms/Scalar/LoopDeletion.cpp' ,
                              'loop-extract' : 'Transforms/IPO/LoopExtractor.cpp',
                              'loop-rotate' : 'Transforms/Scalar/LoopRotation.cpp',
                              'structurizecfg' : 'Transforms/Scalar/StructurizeCFG.cpp',
                              'mergereturn' : 'Transforms/Utils/UnifyFunctionExitNodes.cpp',
                              'basic_blocks' : 'Transforms/Utils/BasicBlockUtils.cpp',
                              'instcombine' : 'Transforms/InstCombine/InstructionCombining.cpp',
                              'instcount' : 'Analysis/InstCount.cpp'}
#                              'simplifycfg' : 'Utils/SimplifyCFG.cpp'} # couldn't build - took too long
#                              'loop-reduce' : 'Scalar/LoopStrengthReduce.cpp', # couldn't build - took too long
#                              'licm' : 'Scalar/LICM.cpp', # errors when building


def main():

    llvm_base : Path = Path('/Users/ambergorzynski/dev')
    dredd_exe : Path = Path('/Users/ambergorzynski/dredd-src/dredd/third_party/clang+llvm/bin/dredd')
    mutated_transforms_path : Path = Path(llvm_base, 'llvm-project-mutated/llvm/lib/')
    tracked_transforms_path : Path = Path(llvm_base, 'llvm-project-tracking/llvm/lib/')
    compilation_db_mutated : Path = Path(llvm_base, 'llvm-project-mutated/build/compile_commands.json')
    compilation_db_tracked : Path = Path(llvm_base, 'llvm-project-tracking/build/compile_commands.json')
    mutated_info_path : Path = Path(llvm_base, 'llvm-project-mutated/llvm/mutation_info')
    tracked_info_path : Path = Path(llvm_base, 'llvm-project-tracking/llvm/mutation_info')


    # apply mutations
    #for mutation in LLVM_OPTS.keys():
        
    mutation : str = 'basic_blocks' # for applying single mutation in testing

    print(f'Applying mutation {mutation} at {LLVM_OPTS[mutation]}...')

    pass_for_mutation : Path = Path(mutated_transforms_path, LLVM_OPTS[mutation])
    mutation_info_file : Path = Path(mutated_info_path,f'{mutation}_mutation_info.json')
    pass_for_tracking : Path = Path(tracked_transforms_path, LLVM_OPTS[mutation])
    tracked_info_file : Path = Path(tracked_info_path, f'{mutation}_tracked_info.json')

    #TODO: figure out why cmd list is not working; string works fine
    '''
    mutate_cmd = [dredd_exe, 
                '-p',
                compilation_db_mutated,
                pass_for_mutation,
                '-mutation-info-file',
                mutation_info_file]
    '''
    
    mutate_cmd = f'{dredd_exe}'
    mutate_cmd += f' -p {compilation_db_mutated} '
    mutate_cmd += f'{pass_for_mutation}'
    mutate_cmd += f' -mutation-info-file {mutation_info_file}'

    # check that mutation doesn't already exist - don't want to mutate twice
    if not mutation_info_file.exists():
        mutation_result = subprocess.run(mutate_cmd, shell=True)
        print(f'Mutation return code: {mutation_result.returncode}')
    else:
        print(f'Mutation {mutation} already exists!')

    
    # track
    track_cmd = f'{dredd_exe}'
    track_cmd += f' -p {compilation_db_tracked} '
    track_cmd += f'{pass_for_tracking}'
    track_cmd += f' -only-track-mutant-coverage'
    track_cmd += f' -mutation-info-file {tracked_info_file}'
    
    # check that mutation doesn't already exist - don't want to mutate twice
    if not tracked_info_file.exists():
        tracking_result = subprocess.run(track_cmd, shell=True)
        print(f'Mutation tracking return code: {tracking_result.returncode}')
    else:
        print(f'Mutation {mutation} tracking already exists!')
    
    # rebuild after each mutation because otherwise mac runs out of RAM...
    rebuild(f'{llvm_base}/llvm-project-mutated')
    rebuild(f'{llvm_base}/llvm-project-tracking')

def rebuild(home_path : str):

    print(f'Building {home_path}...')

    rebuild_cmd = f'cd {home_path}; '
    rebuild_cmd += 'cmake --build build'

    subprocess.run(rebuild_cmd, shell=True)
    

if __name__=="__main__":
    main()
