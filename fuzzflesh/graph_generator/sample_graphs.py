import networkx as nx

def preset_graph_1() -> nx.MultiDiGraph:
    
    ''' returns example graph 1 '''

    G = nx.MultiDiGraph()

    G.add_nodes_from([0, 1, 2, 3, 4])

    G.add_edges_from([(0, 1), 
        (1, 2), (1, 3), 
        (2, 4), 
        (3, 4)])
    
    return G

def preset_graph_2() -> nx.MultiDiGraph:

    ''' returns example graph 2 '''

    G = nx.MultiDiGraph()

    G.add_nodes_from([0, 1, 2, 3, 4])

    G.add_edges_from([(0, 1), 
        (1, 2), (1, 3), 
        (2, 2), (2, 4),
        (3, 4)])
    
    return G

def preset_graph_3() -> nx.MultiDiGraph:

    ''' returns example graph 3 '''

    G = nx.MultiDiGraph()

    G.add_nodes_from([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

    G.add_edges_from([(0, 1),
        (1, 2), (1, 3),
        (2, 2), (2, 10),
