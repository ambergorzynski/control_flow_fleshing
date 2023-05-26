import networkx as nx
import pickle

class CFG():

    def __init__(self, graph : nx.MultiDiGraph):
        self.raw_graph : nx.MultiDiGraph = graph
        self.fleshed_graph : str = None

    def fleshout(self) -> str:
        ''' 
            converts control flow graph to LLVM IR 
            returns str containing LLVM IR program
        '''

    def save_llvm_to_file(self, filename : str) -> bool:
        ''' 
            writes CFG to given file in LLVM IR 
            returns true if file write is successful
            false otherwise
        '''

def main():
    
