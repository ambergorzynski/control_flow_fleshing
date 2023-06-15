from CFG import CFG, Path
from datetime import datetime
import pickle


def main():

    seed = datetime.now().timestamp()

    max_length = 10

    n_graphs = 4

    for i in range(n_graphs):
           
        graph = pickle.load(open(f'graphs/graph_{i+1}.p', 'rb'))

        cfg = CFG(graph)

        path = cfg.find_path(max_length)

        print("Expected output and directions:")
        print(path.expected_output)
        print(path.directions)

def single_example(graph_name):
    
    seed = datetime.now().timestamp()

    max_length = 10

    graph = pickle.load(open(graph_name, 'rb'))

    cfg = CFG(graph)

    path = cfg.find_path(max_length)

    print("Expected output and directions:")
    print(path.expected_output)
    print(path.directions)

if __name__=="__main__":
    #main()
    single_example("graphs/graph_test.p")
