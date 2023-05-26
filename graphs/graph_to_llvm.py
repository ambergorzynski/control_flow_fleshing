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

        self.fleshed_graph = self.add_program_start()

        for n in self.graph:
            print("Node: " + str(n) + " has child nodes: ")
            for v in self.graph.adj[n]:
                print(v)


        return self.fleshed_graph
    
    def add_program_start(self) -> str:

        prog_start = '''

; example cfg 1: with single branching block

define void @_Z7run_cfgPiS_(i32* %in_directions, i32* %in_output) #0 {

0:
    ; create arrays to store directions & output
    %directions = alloca i32*
    %output = alloca i32*

    store i32* %in_directions, i32** %directions
    store i32* %in_output, i32** %output

    %counter = alloca i32
    store i32 0, i32* %counter

    %dir_counter = alloca i32
    store i32 0, i32* %dir_counter

    br label %1'''
        
        return prog_start



    def save_llvm_to_file(self, filename : str) -> bool:
        ''' 
            writes CFG to given file in LLVM IR 
            returns true if file write is successful
            false otherwise
        '''
        print(self.fleshed_graph)

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
