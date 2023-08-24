import networkx as nx

def main():
    
    path='/Users/ambergorzynski/Documents/cfg/repo/control_flow_fleshing/_old/llvm/progs/ifelse4.dot'

    G : nx.MultiDiGraph = nx.nx_pydot.read_dot(path)

    print('\nnodes:')
    for n in G.nodes:
        print(n)
    
    print('\nedges:')
    for e in G.edges:
        print(e)

if __name__=="__main__":
    main()