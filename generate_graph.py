import networkx as nx
import pickle
import matplotlib.pyplot as plt
import sys
import random
from random import Random
from queue import Queue

class GraphGenerator():

    def __init__(self) -> None:
        pass

    def preset_graph_1(self) -> nx.MultiDiGraph:
        
        ''' returns example graph 1 '''
    
        G = nx.MultiDiGraph()

        G.add_nodes_from([0, 1, 2, 3, 4])

        G.add_edges_from([(0, 1), 
            (1, 2), (1, 3), 
            (2, 4), 
            (3, 4)])
        
        return G

    def preset_graph_2(self) -> nx.MultiDiGraph:

        ''' returns example graph 2 '''

        G = nx.MultiDiGraph()

        G.add_nodes_from([0, 1, 2, 3, 4])

        G.add_edges_from([(0, 1), 
            (1, 2), (1, 3), 
            (2, 2), (2, 4),
            (3, 4)])
        
        return G
    
    def preset_graph_3(self) -> nx.MultiDiGraph:

        ''' returns example graph 3 '''

        G = nx.MultiDiGraph()

        G.add_nodes_from([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

        G.add_edges_from([(0, 1),
            (1, 2), (1, 3),
            (2, 2), (2, 10),
            (3, 4),
            (4, 5), (4, 6),
            (5, 5), (5, 7),
            (6, 8),
            (7, 8),
            (8, 9), (8, 4),
            (9, 10)])
        
        return G
    
    def preset_graph_4(self) -> nx.MultiDiGraph:

        ''' returns example graph 4 with switch statement'''

        G = nx.MultiDiGraph()

        G.add_nodes_from([0, 1, 2, 3, 4, 5])

        G.add_edges_from([(0, 1),
            (1, 2), (1, 3), (1, 4),
            (2, 5),
            (3, 5),
            (4, 5)])
        
        return G

    def generate_graph_approach_1(self, n_nodes, seed=None) -> nx.MultiDiGraph:

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
            n_successors = rand.choice(list(range(0, 50)))

            for j in range(n_successors):

                successor = rand.choice(list(range(1, n_nodes)))

                G.add_edge(node, successor)

        # final node should have 0 successors (exit node)

        return G
    
    def generate_graph_approach_2(self, n_nodes, seed=None, add_annotations=False, n_annotations=0) -> nx.MultiDiGraph:

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
            # from 0 to 10 (to be flexed)
            n_successors = rand.choice(list(range(0, 10)))

            # add successor nodes as children
            # and add to back of queue
            nodes = list(range(node_counter + 1, node_counter + n_successors))
            
            G.add_nodes_from(nodes)

            for i in nodes:
                G.add_edge(current_node, i)
                q.put(i)

            # increment node counter
            node_counter += n_successors

        if add_annotations:

            # choose pairs of nodes randomly to add edges between
            # do not include node 0 as the destination node, since it has some 
            # set-up code that should not be repeated
            for i in range(n_annotations):





        return G

def main():
  
    generator = GraphGenerator()
    '''
    G1 = generator.preset_graph_1()
    G2 = generator.preset_graph_2()
    G3 = generator.preset_graph_3()
    G4 = generator.preset_graph_4()
    
    #pickle graphs (for now) - change this to JSON rather than pickle later
    pickle.dump(G1, open("graphs/graph_1.p", "wb"))
    pickle.dump(G2, open("graphs/graph_2.p", "wb"))
    pickle.dump(G3, open("graphs/graph_3.p", "wb") )
    pickle.dump(G4, open("graphs/graph_4.p", "wb") )
    '''

    G = generator.generate_graph_approach_1(20)

    #nx.draw_networkx(G)
    nx.draw(G, with_labels=True)
    plt.show()
    pickle.dump(G, open("graphs/graph_test.p", "wb"))
    '''
    graph = nx.drawing.nx_pydot.to_pydot(G1)
    graph.write_png("output.png")

    print(G1)
    '''

def view_graph():
    
    graph = pickle.load(open(f'graphs/fuzzing_190623/graph_0.p', "rb"))
    nx.draw(graph, with_labels=True)
    plt.show()



if __name__=="__main__":
    #view_graph()
    main()