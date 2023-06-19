import networkx as nx
import pickle
from datetime import datetime
from random import Random
from generate_graph import GraphGenerator
from CFG import CFG

def generate_graphs(n_graphs, filepath, min_graph_size, max_graph_size, seed):

    rand = Random()

    rand.seed(seed)

    generator = GraphGenerator()

    for i in range(n_graphs):

        graph_size = rand.choice(list(range(min_graph_size, max_graph_size)))

        G = generator.generate_graph(graph_size)

        pickle.dump(G, open(f'{filepath}graph_{i}.p', "wb"))

def flesh_graphs(n_graphs, graph_filepath, llvm_filepath):

    for i in range(n_graphs):
        
        G = pickle.load(open(f'{graph_filepath}graph_{i}.p', "rb"))

        cfg = CFG(G)

        cfg.fleshout()

        cfg.save_llvm_to_file(f'{llvm_filepath}run_cfg_{i}.ll')



def main():

    # input parameters
    n_graphs = 10
    graph_filepath = "graphs/fuzzing_190623/"
    llvm_filepath = "test_input_llvm_programs/fuzzing_190623/"
    min_graph_size = 20
    max_graph_size = 500
    max_path_length = 900
    seed = datetime.now().timestamp()
  
    # Step 1 : generate graphs
    generate_graphs(n_graphs, graph_filepath, min_graph_size, max_graph_size, seed)

    # Step 2 : flesh graphs
    flesh_graphs(n_graphs, graph_filepath, llvm_filepath)

    # Step 3 : generate paths for each graph

    # Step 4 : compile




if __name__=="__main__":
    main()