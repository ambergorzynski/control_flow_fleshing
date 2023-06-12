import networkx as nx
import pickle

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

def main():

    generator = GraphGenerator()
    G1 = generator.preset_graph_1()
    G2 = generator.preset_graph_2()
    G3 = generator.preset_graph_3()

    #pickle graphs (for now) - change this to JSON rather than pickle later
    pickle.dump(G1, open("graph_1.p", "wb"))
    pickle.dump(G2, open("graph_2.p", "wb"))
    pickle.dump(G3, open("graph_3.p", "wb") )

if __name__=="__main__":
    main()
