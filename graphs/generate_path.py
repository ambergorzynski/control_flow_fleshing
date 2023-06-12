from CFG import CFG, Path
from datetime import datetime
import pickle


def main():

    seed = datetime.now().timestamp()

    max_length = 10

    n_graphs = 3

    for i in range(n_graphs):
           
        graph = pickle.load(open(f'graph_{i+1}.p', 'rb'))

        cfg = CFG(graph)

        path = cfg.find_path(max_length)

        print("Expected output and directions:")
        print(path.expected_output)
        print(path.directions)

if __name__=="__main__":
    main()
