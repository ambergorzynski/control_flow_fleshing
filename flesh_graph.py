from CFG import CFG
import pickle

def main():

    n_graphs = 1

    graph = [None] * n_graphs

    for i in range(n_graphs):

        graph_name = f'graphs/graph_{i + 1}.p'
        
        graph[i] = pickle.load(open(graph_name, "rb"))

        cfg = CFG(graph[i])

        cfg.fleshout()

        if (cfg.save_llvm_to_file(f'test_input_llvm_programs/run_cfg_wip_{(i + 1)}.ll')):
            print("Fleshed CFG created successfully!")
        
        else:
            print("Problem saving fleshed CFG")

def single_graph_test(graph_path, graph_name):
        
        graph = pickle.load(open(f'{graph_path}/{graph_name}.p', "rb"))

        cfg = CFG(graph)

        cfg.fleshout()

        if (cfg.save_llvm_to_file(f'test_input_llvm_programs/run_cfg_wip_{(graph_name)}.ll')):
            print("Fleshed CFG created successfully!")
        
        else:
            print("Problem saving fleshed CFG")


if __name__=="__main__":
    #main()
    single_graph_test("graphs", "graph_test")
