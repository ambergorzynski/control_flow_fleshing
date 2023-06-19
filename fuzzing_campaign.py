import networkx as nx
import pickle
import sys
import random
from datetime import datetime
from random import Random
from generate_graph import GraphGenerator

def generate_graphs(n_graphs, filepath, min_graph_size, max_graph_size, seed):

    rand = Random()

    rand.seed(seed)

    generator = GraphGenerator()

    for i in range(n_graphs):

        graph_size = rand.choice(list(range(min_graph_size, max_graph_size)))

        G = generator.generate_graph(graph_size)

        pickle.dump(G, open(f'{filepath}graph_{i}.p', "wb"))

def main():

    # input parameters
    n_graphs = 10
    graph_filepath = "graphs/fuzzing_190623/"
    min_graph_size = 20
    max_graph_size = 500
    max_path_length = 900
    seed = datetime.now().timestamp()
  
    # Step 1 : generate graphs
    generate_graphs(n_graphs, graph_filepath, min_graph_size, max_graph_size, seed)

    # Step 2 : flesh graphs

    # Step 3 : generate paths for each graph

    # Step 4 : compile




if __name__=="__main__":
    main()