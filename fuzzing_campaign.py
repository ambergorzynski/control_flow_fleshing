import networkx as nx
import pickle
from ProgramGenerator import LLVMGenerator, JavaBytecodeGenerator
from datetime import datetime
from random import Random
from generate_graph import *
from CFG import CFG
from run_test import Tester
from aux_tools.program_comparator import compare_optimised
from enum import Enum

class Language(Enum):
    LLVM  = 0
    JAVA_BYTECODE = 1

class Fuzzer():

    def __init__(self, language : Language,
                 graph_filepath : str, 
                 program_filepath : str,
                 path_filepath : str,
                 out_filepath : str,
                 results_name : str, 
                 bad_results_name : str):
        self.language = language
        self.graph_filepath = graph_filepath
        self.program_filepath = program_filepath
        self.path_filepath = path_filepath
        self.out_filepath = out_filepath
        self.results_name = results_name
        self.bad_results_name = bad_results_name
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

    def generate_graphs(self, n_graphs, min_graph_size, max_graph_size, min_successors, max_successors, graph_generation_approach, n_annotations=0, seed=None):

        rand = Random()

        rand.seed(seed)

        for i in range(n_graphs):

            graph_size = rand.choice(list(range(min_graph_size, max_graph_size)))

            if graph_generation_approach == 1:
                graph = generate_graph_approach_1(graph_size, add_annotations=True, n_annotations=n_annotations)

            elif graph_generation_approach == 2:
                graph = generate_graph_approach_2(graph_size, min_successors, max_successors)

            pickle.dump(graph, open(f'{self.graph_filepath}/graph_{i}.p', "wb"))

    def flesh_graphs(self, n_graphs):

        if(self.language == Language.LLVM):
            program_generator = LLVMGenerator()
        
        elif(self.language == Language.JAVA_BYTECODE):
            program_generator = JavaBytecodeGenerator()

        for i in range(n_graphs):
            
            graph = pickle.load(open(f'{self.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            program_generator.fleshout(cfg)

            program_generator.save_to_file(f'{self.program_filepath}/run_cfg_{i}.ll')


    def generate_paths(self, n_graphs, n_paths, max_path_length, seed=None):

        for i in range(n_graphs):
            
            graph = pickle.load(open(f'{self.graph_filepath}/graph_{i}.p', 'rb'))

            cfg = CFG(graph)

            if cfg.is_valid():

                for j in range(n_paths):

                    print(f'new path for graph {i}, path {j}')

                    path = cfg.find_path(max_path_length, seed)

                    with open(f'{self.path_filepath}/input_graph_{i}_path{j}.txt', 'w') as f:
                        f.write(str(len(path.directions))+'\n')
                        f.write(str(len(path.expected_output))+'\n')
                        f.write(str(self.spaces(path.directions))+'\n')
                        f.write(str(self.spaces(path.expected_output)))

            else:
                print("cfg is not valid")

    def spaces(self, input_array):

        if input_array == []:
            return

        output = str(input_array[0])

        for i in range(1, len(input_array)):
            output += f' {input_array[i]}'

        return output

    def run_tests(self, n_graphs, n_paths, n_optimisations):

        test = Tester(self.program_filepath, self.path_filepath, self.out_filepath, self.results_name, self.bad_results_name)

        # compile wrapper once
        test.compile_wrapper()

        for i in range(n_graphs):

            optimisations_index = [random.randint(0, len(self.cfg_preset_optimisations) - 1) for i in range(n_optimisations)]

            print(f'optimisation indices: {optimisations_index}')

            optimisations_str = self.parse_optimisations(optimisations_index)

            print(f'optimisaitons: {optimisations_str}')

            test.compile_through_shell(f'run_cfg_{i}', optimisations_str)

            for j in range(n_paths):

                test.execute(f'run_cfg_{i}', f'input_graph_{i}_path{j}')

    def parse_optimisations(self, indices):

        opt_list = [self.cfg_preset_optimisations[i] for i in indices]

        return ','.join(opt_list)

def main():
 # fixed input parameters
    time = datetime.now().timestamp()
    base = 'fuzzing/fuzzing_090723'
    graph_filepath = f'{base}/graphs'
    program_filepath = f'{base}/llvm'
    path_filepath = f'{base}/input'
    out_filepath = f'{base}/running'
    results_name = f'results_{time}'
    bad_results_name = f'bad_results_{time}'
    comparison_results_name = f'comparison_results_{time}'
    language = Language.LLVM

    # fuzzing input parameters
    n_graphs = 1
    n_paths = 1
    min_graph_size = 20
    max_graph_size = 500
    min_successors = 1
    max_successors = 4
    graph_approach = 2 # can be 1 or 2
    max_path_length = 900
    n_optimisations = 1
  
    fuzzer = Fuzzer(language, graph_filepath, program_filepath, path_filepath, out_filepath, results_name, bad_results_name)

    # Step 1 : generate graphs
    fuzzer.generate_graphs(n_graphs, min_graph_size, max_graph_size,
                            min_successors, max_successors,
                            graph_approach)

    # Step 2 : flesh graphs
    fuzzer.flesh_graphs(n_graphs)

    # Step 3 : generate paths for each graph
    fuzzer.generate_paths(n_graphs, n_paths, max_path_length)

    # Step 4 : run tests
    fuzzer.run_tests(n_graphs, n_paths, n_optimisations)

    # Step 5 : run comparison on optimised and unoptimised .ll files to check whether optimisations had an impact
    #compare_optimised(n_graphs, input_folder=llvm_filepath, results_folder=out_filepath, output_filename=comparison_results_name)


if __name__=="__main__":
    main()