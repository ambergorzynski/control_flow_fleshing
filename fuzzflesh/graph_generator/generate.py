import networkx as nx
import pickle
import matplotlib.pyplot as plt
import sys
import random
from random import Random
from queue import Queue

import fuzzflesh.graph_generator.sample_graphs

def generate_graph_approach_0(n_nodes : int, seed=None) -> nx.MultiDiGraph:

    ''' 
        returns graph with number of nodes specified 
        graph generation approach is to first create a set of nodes.
        next, each node is given a set of edges going to randomly chosen other
        nodes in the graph. 
        this approach is problematic because it doesn't guranatee that there is a 
        path from the start to an exit node, and we end up with very short paths
    '''

    rand = Random()
    
    if seed is None:
        seed = random.randrange(0, sys.maxsize)

    rand.seed(seed)

    # generate graph with given number of nodes
    node_list = list(range(n_nodes))

    G = nx.MultiDiGraph()

    G.add_nodes_from(node_list)

    # loop over nodes and create edges
    for node in range(0, n_nodes - 1):

        # randomly choose number of successor nodes
        # up to 3 for now - to update later
        n_successors = rand.choice(list(range(1, 3)))

        for j in range(n_successors):

            successor = rand.choice(list(range(1, n_nodes)))

            G.add_edge(node, successor)

    # final node should have 0 successors (exit node)

    return G

def generate_graph_approach_1(n_nodes : int, 
                              min_successors : int,
                              max_successors : int, 
                              add_annotations : bool =False,
                              seed=None, 
                              n_annotations : int = 0) -> nx.MultiDiGraph:

    ''' 
        returns graph with number of nodes specified 
        graph generation approach is:
            1. grow a graph in a breadth-first approach, giving each
                node a random number of successors (including potentially 0).
                this step gives a graph that should have paths from entry to 
                exit nodes, but without any jumps beyond immediate neighbour nodes.
            2. annotate the graph by randomly adding edges to a randomly chosen
                number of nodes in the graph. the edges could jump forwards or
                backwards, or to the node itself
    '''

    rand = Random()
    
    if seed is None:
        seed = random.randrange(0, sys.maxsize)

    rand.seed(seed)

    G = nx.MultiDiGraph()

    node_counter = 0

    q = Queue()

    q.put(node_counter)

    G.add_node(node_counter)

    while (node_counter < n_nodes) and not q.empty():

        current_node = q.get()

        # randomly choose number of successor nodes
        # default 1 to 10 (to be flexed)
        n_successors = rand.choice(list(range(min_successors, max_successors + 1)))


        # add successor nodes as children
        # and add to back of queue
        nodes = list(range(node_counter + 1, node_counter + 1 + n_successors))
        
        G.add_nodes_from(nodes)

        for i in nodes:
            G.add_edge(current_node, i)
            q.put(i)

        # increment node counter
        node_counter += n_successors

    if add_annotations:

        n_annotations = G.number_of_nodes() // 5 # default for now: add 20% of graph size

        print(f'adding {n_annotations} annotations now!')
        # randomly decide whether to add random edges or loops
        if(rand.randrange(0, 10) > 4):
            G = add_random_edges(G, n_annotations, rand)
        else:
            G = add_loops(G, n_annotations, rand)


    return G

def add_random_edges(graph : nx.MultiDiGraph,
             n_edges : int, 
             rand : Random) -> nx.MultiDiGraph:
    '''
        adds random edge to the given graph and returns it 
        random edges are defined by randomly choosing a node and then adding 
        an edge to another randomly chosen node (could be parent, self, or unrelated)
        does not include node 0 as end node, since it has some set up code that 
        should not be repeated
    '''

    print('random!')

    for i in range(n_edges):
            
        start = rand.choice(list(range(1, graph.number_of_nodes())))

        end = rand.choice(list(range(1, graph.number_of_nodes())))

        graph.add_edge(start, end)

    return graph


def add_loops(graph : nx.MultiDiGraph,
             n_loops : int, 
             rand : Random) -> nx.MultiDiGraph:
    '''
        adds loops to the given graph and returns it with loops
        loops are defined by randomly choosing a node and then adding 
        an edge to one of its parent nodes (not necessarily the immediate parent)
    '''

    print('loops!')

    for i in range(n_loops):

        end = rand.choice(list(range(1, graph.number_of_nodes())))
        
        ancestors = list(nx.ancestors(graph, end))

        start = rand.choice(ancestors)

        graph.add_edge(start, end)

    return graph

    
def generate_graph_approach_2(n_nodes : int, 
                              seed : float = None, 
                              min_successors : int = 1, 
                              max_successors : int = 10,
                              add_annotations : bool = True) -> nx.MultiDiGraph:

        ''' 
            variant on approach 1: use same initial approach and then append
            exit nodes to a randomly selected sample of the nodes in the graph.
        '''

        rand = Random()
        
        if seed is None:
            seed = random.randrange(0, sys.maxsize)

        rand.seed(seed)

        # generate graph with given number of nodes
        node_list = list(range(n_nodes))

        G = nx.MultiDiGraph()

        G.add_nodes_from(node_list)

        # loop over nodes and create edges
        for node in range(0, n_nodes - 1):

            # randomly choose number of successor nodes
            n_successors = rand.choice(list(range(min_successors, max_successors)))

            for j in range(n_successors):

                successor = rand.choice(list(range(1, n_nodes)))

                G.add_edge(node, successor)

        if add_annotations:

            n_annotations = G.number_of_nodes() // 5 # default for now: add 20% of graph size

            print(f'adding {n_annotations} annotations now!')
            # randomly decide whether to add random edges or loops
            if(rand.randrange(0, 10) > 4):
                G = add_random_edges(G, n_annotations, rand)
            else:
                G = add_loops(G, n_annotations, rand)

        # randomly append exit nodes to a sample of nodes
        nodes = rand.choices(list(range(0, n_nodes)), k=n_nodes//5)

        # give new index to exit nodes
        exit_node = n_nodes

        G.add_node(n_nodes)

        for n in nodes:
            G.add_edge(n, exit_node)

        return G

def generate_graph_approach_presets(i : int) -> nx.MultiDiGraph:
    if i == 0:
        return sample_graphs.preset_graph_1()
    if i == 1:
        return sample_graphs.preset_graph_2()
    if i == 2:
        return sample_graphs.preset_graph_3()
    if i == 3:
        return sample_graphs.preset_graph_4()
    if i == -1:
        return sample_graphs.preset_graph_for_report()


    
def view_graph(filepath : str) -> None:
    
    graph = pickle.load(open(filepath, "rb"))
    nx.draw(graph, with_labels=True)
    plt.show()

def list_graph(filepath : str) -> None:

    graph = pickle.load(open(filepath, "rb"))

    print("all edges")
    print(graph.edges())
    print("edges from node 3")
    print(graph.edges(3))

def generate_graphs(graph_filepath : str,
                    n_graphs : int,
                    min_graph_size : int,
                    max_graph_size : int,
                    min_successors : int, 
                    max_successors : int, 
                    graph_generation_approach : int, 
                    add_annotations : bool = True,
                    n_annotations : int = -1,
                    seed : float = None):
    '''
        Function generates a set of graphs based on the given
        parameters and saves them in the given filepath
    '''

    print(f'annotation param is: {add_annotations}')

    rand = Random()

    rand.seed(seed)

    for i in range(n_graphs):

        graph_size = rand.choice(list(range(min_graph_size, max_graph_size)))
        print(f'max successors is {max_successors}')

        # parse arg for default annotations based on graph size
        if add_annotations and n_annotations == -1:
            n_annotations = graph_size // 5

        if graph_generation_approach == 1:
            graph = generate_graph_approach_1(graph_size, min_successors, max_successors, add_annotations, n_annotations)

        elif graph_generation_approach == 2:
            graph = generate_graph_approach_2(graph_size, min_successors, max_successors)

        elif graph_generation_approach == 3:
            graph = sample_xml_graph()

        elif graph_generation_approach == -1:
            graph = generate_graph_approach_presets(-1)

        pickle.dump(graph, open(f'{graph_filepath}/graph_{i}.p', "wb"))
