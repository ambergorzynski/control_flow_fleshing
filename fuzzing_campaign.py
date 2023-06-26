import networkx as nx
import pickle
from datetime import datetime
from random import Random
from generate_graph import *
from CFG import CFG
from run_test import Tester

class Fuzzer():

    def __init__(self, graph_filepath, llvm_filepath, path_filepath, out_filepath, results_name, bad_results_name):
        self.graph_filepath = graph_filepath
        self.llvm_filepath = llvm_filepath
        self.path_filepath = path_filepath
        self.out_filepath = out_filepath
        self.results_name = results_name
        self.bad_results_name = bad_results_name
        self.cfg_optimisations = ['adce',
                                    'block-placement',
                                    'break-crit-edges',
                                    'dce',
                                    'jump-threading',
                                    'lcssa',
                                    'licm',
                                    'loop-deletion',
                                    'loop-extract',
                                    'loop-extract-single',
                                    'loop-reduce',
                                    'loop-rotate',
                                    'loop-simplify',
                                    'loop-unroll',
                                    'loop-unroll-and-jam',
                                    'loop-unswitch',
                                    'lowerswitch',
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

    def generate_graphs(self, n_graphs, min_graph_size, max_graph_size, seed=None):

        rand = Random()

        rand.seed(seed)

        for i in range(n_graphs):

            graph_size = rand.choice(list(range(min_graph_size, max_graph_size)))

            graph = generate_graph_approach_3(graph_size)
            #graph = generate_graph_approach_2(graph_size, add_annotations=True, n_annotations=graph_size//10)
            #graph = generate_graph_approach_presets(i)

            pickle.dump(graph, open(f'{self.graph_filepath}/graph_{i}.p', "wb"))

    def flesh_graphs(self, n_graphs):

        for i in range(n_graphs):
            
            graph = pickle.load(open(f'{self.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            cfg.fleshout()

            cfg.save_llvm_to_file(f'{self.llvm_filepath}/run_cfg_{i}.ll')


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

    def run_tests(self, n_graphs, n_paths, optimisations):

        test = Tester(self.llvm_filepath, self.path_filepath, self.out_filepath, self.results_name, self.bad_results_name, optimisations)

        for i in range(n_graphs):
            
            test.compile(f'run_cfg_{i}')

            for j in range(n_paths):

                test.execute(f'run_cfg_{i}', f'input_graph_{i}_path{j}')


def main():

    # input parameters
    time = datetime.now().timestamp()
    n_graphs = 4
    n_paths = 5
    base = 'fuzzing/fuzzing_210623'
    graph_filepath = f'{base}/graphs'
    llvm_filepath = f'{base}/llvm'
    path_filepath = f'{base}/input'
    out_filepath = f'{base}/running'
    results_name = f'results_{time}'
    bad_results_name = f'bad_results_{time}'
    min_graph_size = 20
    max_graph_size = 21
    max_path_length = 900
    optimisations = 'break-crit-edges,dse'
    #seed = datetime.now().timestamp()
  
    fuzzer = Fuzzer(graph_filepath, llvm_filepath, path_filepath, out_filepath, results_name, bad_results_name)

    # Step 1 : generate graphs
    fuzzer.generate_graphs(n_graphs, min_graph_size, max_graph_size)

    # Step 2 : flesh graphs
    fuzzer.flesh_graphs(n_graphs)

    # Step 3 : generate paths for each graph
    fuzzer.generate_paths(n_graphs, n_paths, max_path_length)

    # Step 4 : run tests
    fuzzer.run_tests(n_graphs, n_paths, optimisations)





if __name__=="__main__":
    main()