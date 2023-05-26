import networkx as nx
import pickle

# example graph 1

G1 = nx.MultiDiGraph()

G1.add_nodes_from([0, 1, 2, 3, 4])

G1.add_edges_from([(0, 1), 
    (1, 2), (1, 3), 
    (2, 4), 
    (3, 4)])

print("G1: Nodes: " + str(G1.number_of_nodes()) + " Edges: " + str(G1.number_of_edges()))

# example graph 2

G2 = nx.MultiDiGraph()

G2.add_nodes_from([0, 1, 2, 3, 4])

G2.add_edges_from([(0, 1), 
    (1, 2), (1, 3), 
    (2, 4), (2, 2), 
    (3, 4)])

print("G2: Nodes: " + str(G2.number_of_nodes()) + " Edges: " + str(G2.number_of_edges()))

#pickle graphs (for now) - change this to JSON rather than pickle later
pickle.dump(G1, open("graph_1.p", "wb"))
pickle.dump(G2, open("graph_2.p", "wb"))
