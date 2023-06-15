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

    with open('test_input_arrays/input_test_a.txt', 'w') as f:
        f.write(str(len(path.directions))+'\n')
        f.write(str(len(path.expected_output))+'\n')
        f.write(spaces(path.directions)+'\n')
        f.write(spaces(path.expected_output))


def spaces(input_array):

    output = str(input_array[0])

    for i in range(1, len(input_array)):
        output += f' {input_array[i]}'

    return output


if __name__=="__main__":
    #main()
    single_example("graphs/graph_test.p")
