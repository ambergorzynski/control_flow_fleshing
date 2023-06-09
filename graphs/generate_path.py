from CFG import CFG, Path
from datetime import datetime
import pickle


def main():

    seed = datetime.now().timestamp()

    max_length = 5

    # hard coded example graph 1 - next step is to use cmd line args
    
    graph1 = pickle.load(open("graph_1.p", "rb"))

    cfg = CFG(graph1)

    path = cfg.find_path(max_length)

    print("Expected output and directions:")
    print(path.expected_output)
    print(path.directions)

    # hard coded example graph 2 - next step is to use cmd line args
    
    graph2 = pickle.load(open("graph_2.p", "rb"))

    cfg = CFG(graph2)

    path = cfg.find_path(max_length)

    print("Expected output and directions:")
    print(path.expected_output)
    print(path.directions)


if __name__=="__main__":
    main()
