from CFG import CFG
import pickle

def main():

    n_graphs = 3

    graph = [None] * n_graphs

    for i in range(n_graphs):

        graph_name = f'graph_{i + 1}.p'
        
        graph[i] = pickle.load(open(graph_name, "rb"))

        cfg = CFG(graph[i])

        cfg.fleshout()

        if (cfg.save_llvm_to_file(f'run_cfg_wip_{(i + 1)}.ll')):
            print("Fleshed CFG created successfully!")
        
        else:
            print("Problem saving fleshed CFG")

if __name__=="__main__":
    main()
