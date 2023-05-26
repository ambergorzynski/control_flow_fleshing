import networkx as nx
import pickle

class CFG():

    def __init__(self, graph : nx.MultiDiGraph):
        self.graph : nx.MultiDiGraph = graph
        self.fleshed_graph : str = None

    def fleshout(self) -> str:
        ''' 
            converts control flow graph to LLVM IR 
            returns str containing LLVM IR program
            and saves as member variable
        '''

        for n in self.graph:
            print("Node: " + str(n) + " has child nodes: ")
            for v in self.graph.adj[n]:
                print(v)


    def save_llvm_to_file(self, filename : str) -> bool:
        ''' 
            writes CFG to given file in LLVM IR 
            returns true if file write is successful
            false otherwise
        '''
        pass

def main():

    # hard coded example graph - next step is to use cmd line args
    
    graph1 = pickle.load(open("graph_1.p", "rb"))

    cfg = CFG(graph1)

    cfg.fleshout()

    if (cfg.save_llvm_to_file("run_cfg_wip.ll")):
        print("Fleshed CFG created successfully!")
    
    else:
        print("Problem saving fleshed CFG")

if __name__=="__main__":
    main()
