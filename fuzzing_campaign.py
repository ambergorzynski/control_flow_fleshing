import networkx as nx
import pickle
from datetime import datetime
from random import Random
from generate_graph import *
from CFG import CFG
from run_test import Tester

def generate_graphs(n_graphs, filepath, min_graph_size, max_graph_size, seed=None):

    rand = Random()

    rand.seed(seed)

    for i in range(n_graphs):

        graph_size = rand.choice(list(range(min_graph_size, max_graph_size)))

        graph = generate_graph_approach_3(graph_size)
        #graph = generate_graph_approach_2(graph_size, add_annotations=True, n_annotations=graph_size//10)
        #graph = generate_graph_approach_presets(i)

        pickle.dump(graph, open(f'{filepath}/graph_{i}.p', "wb"))

def flesh_graphs(n_graphs, graph_filepath, llvm_filepath):

    for i in range(n_graphs):
        
        graph = pickle.load(open(f'{graph_filepath}/graph_{i}.p', "rb"))

        cfg = CFG(graph)

        cfg.fleshout()

        cfg.save_llvm_to_file(f'{llvm_filepath}/run_cfg_{i}.ll')


def generate_paths(n_graphs, n_paths, graph_filepath, path_filepath, max_path_length, seed=None):

    for i in range(n_graphs):
        
        graph = pickle.load(open(f'{graph_filepath}/graph_{i}.p', 'rb'))

        cfg = CFG(graph)

        if cfg.is_valid():

            for j in range(n_paths):

                print(f'new path for graph {i}, path {j}')

                path = cfg.find_path(max_path_length, seed)

                with open(f'{path_filepath}/input_graph_{i}_path{j}.txt', 'w') as f:
                    f.write(str(len(path.directions))+'\n')
                    f.write(str(len(path.expected_output))+'\n')
                    f.write(str(spaces(path.directions))+'\n')
                    f.write(str(spaces(path.expected_output)))

        else:
            print("cfg is not valid")

def spaces(input_array):

    if input_array == []:
        return

    output = str(input_array[0])

    for i in range(1, len(input_array)):
        output += f' {input_array[i]}'

    return output

def run_tests(n_graphs, n_paths, llvm_filepath, path_filepath, output_filepath, results_name):

    test = Tester(llvm_filepath, path_filepath, output_filepath, results_name)

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
    min_graph_size = 20
    max_graph_size = 21
    max_path_length = 900
    #seed = datetime.now().timestamp()
  
    # Step 1 : generate graphs
    generate_graphs(n_graphs, graph_filepath, min_graph_size, max_graph_size)

    # Step 2 : flesh graphs
    flesh_graphs(n_graphs, graph_filepath, llvm_filepath)

    # Step 3 : generate paths for each graph
    generate_paths(n_graphs, n_paths, graph_filepath, path_filepath, max_path_length)

    # Step 4 : run tests
    run_tests(n_graphs, n_paths, llvm_filepath, path_filepath, out_filepath, results_name)





if __name__=="__main__":
    main()