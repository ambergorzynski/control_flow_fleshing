import os
import sys
import argparse
import subprocess
import random
import time
import networkx as nx

from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'..'))

from CFG import CFG, Path
from c.CProgramGenerator import CProgramGenerator

def parse_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("graph")
    parser.add_argument("input")
    parser.add_argument("script")
    parser.add_argument("--language", default="c")
    return parser.parse_args()

def load_cfg(filename : str) -> CFG:
    return  CFG(filename=filename)

def flesh_cfg(cfg : CFG) -> str:

    generator = CProgramGenerator()

    program = generator.fleshout(cfg)

    return program 

def get_path(filename : str) -> Path:
    
    f = open(filename, "r")

    content = f.readlines()

    f.close()

    directions = [int(i) for i in content[2].split()]

    expected_output = [int(i) for i in content[3].split()]

    return Path(expected_output = expected_output, directions = directions)

def update_path_after_merge(original : nx.MultiDiGraph, updated : nx.MultiDiGraph, node1 : int, node2 : int, original_path : Path) -> Path:
    
    '''
        Walk the graph following the directions and update the new path & directions
        as we go.

        Everything relating to node1 in the original graph is unchanged, because we 
        merged node2 into node1.
        
        Whenever we encounter node2 in the path, we need to update the new expected
        output to be node1 (since node2 is renamed to node1).
        
        Whenever we take an edge FROM node2, we need to renumber this direction as
        n + j, where n is the number of edges originally leading from node1, and 
        j is the specific direction that we previously took from node2. This is because
        the edges from node2 are appended to the edges from node1. (#TODO: double check this)
    '''

    # Initialise updated directions and expected output arrays
    dirs = original_path.directions
    path = original_path.expected_output

    dir_index = 0
    path_index = 0

    while path_index < len(path):

        # update path and direction if we encounter node2 on our path
        if path[path_index] == node2:

            n_node1_edges = len(original.out_edges(node1))
            n_node2_edges = len(original.out_edges(node2))

            # node2 is renamed to node1 during merge operation
            path[path_index] = node1

            # if node1 had more than one child, then a dir already existed
            # we need to update this dir for node2 by adding the number of
            # edges that node1 has (e.g. if we want to take branch 2 from
            # node2, and node1 had 3 edges, then we need direction 2 + 3 = 5)
            if n_node1_edges > 1:
                dirs[dir_index] = dirs[dir_index] + n_node1_edges

            # otherwise, we must insert new direction into list at the dir index
            elif n_node1_edges == 1:
                dirs.insert(dir_index, dirs[dir_index] + 1)

            else:
                print("Error! Trying to merge an exit node, which is not yet supported")
                exit(1)

            # must also replace preceding direction if the node has changed name
            # since the node contract operation changes the ordering of the edges
            if original.out_degree(path[path_index] - 1) > 0:
                dirs[dir_index - 1] = original.out_degree(path[path_index - 1])

        # increment dir counter if we are branching
        if is_decision_node(original, path[path_index], node1, node2):
            dir_index += 1

        path_index += 1
    
    return Path(expected_output = path, directions = dirs)

def is_decision_node(graph : nx.MultiDiGraph, current_node : int, node1 : int, node2 : int) -> bool:

    '''
        Checks whether current node involves a branch after
        a merge operation
    '''

    if current_node != node1 and current_node != node2 and len(graph.out_edges(current_node)) > 1:
        return True

    if (current_node == node1 or current_node == node2) and len(graph.out_edges(node1)) + len(graph.out_edges(node2)) > 1:
        return True

    return False

class Reducer():

    def __init__(self, cfg : CFG, input_filepath : str, script_filepath : str):
        self.interesting_cfg : CFG = cfg
        self.script_filepath : str = script_filepath
        self.timeout : int = None
        self.path : Path = get_path(input_filepath)
    
    def reduce(self) -> None:

        counter = 0

        #TODO: include timeout stopping condition
        #TODO: include stoppping condition once all operations tried
        while True:

            print(f'\nModification round {counter}')

            print(f'Nodes: {self.interesting_cfg.get_nodes()}')
            print(f'Dirs: {self.path.directions}')
            print(f'Path: {self.path.expected_output}')

            (modified_cfg, modified_path) = self.merge()
            
            if self.is_interesting(modified_cfg, modified_path):
                self.interesting_cfg = modified_cfg
                self.path = modified_path

            counter += 1

            print('Sleeping...')
            time.sleep(3)

        print('Finished!')


    def merge(self, nodes : tuple[int, int] = None) -> tuple[CFG, Path]:
        '''
            merge operation combines two nodes in the given
            CFG. By default the nodes are randomly selected,
            or they can optionally be specified. 
            The two nodes are replaced  with a single merged
            node. All directed edges pointing to either node 
            are directed to the merged node. All edges 
            originating from either node will originate
            from the merged node. Any edges between the two
            nodes are removed.
        '''

        #TODO: include condition checking for merge validity
        # e.g. do not merge exit nodes (for now)

        if nodes is None:

            nodes = self.get_random_nodes(self.interesting_cfg)

        (node1, node2) = nodes
        print(f'Merging nodes {node1} and {node2}')

        merged_graph = (nx.contracted_nodes(self.interesting_cfg.get_graph(), 
                        node1, node2, copy=True)) 

        path = update_path_after_merge(self.interesting_cfg.get_graph(),
                            merged_graph, 
                            node1, 
                            node2, 
                            self.path)

        print(f'Finished merging graph to give nodes: {merged_graph.nodes()}')
        print(f'And edges: {merged_graph.edges()}')
        print(f'And dirs: {path.directions}')
        print(f'And path: {path.expected_output}')
        return (CFG(merged_graph), path)

    def get_random_nodes(self, cfg : CFG) -> tuple[int, int]:
        
        # get list of all nodes except the starting node from which to choose
        # also do not include end nodes
        all_nodes = [x for x in cfg.nodes if x not in cfg.exit_nodes]

        all_nodes.remove(0)

        selected = random.sample(all_nodes,2)

        return tuple(selected)

    def is_interesting(self, cfg : CFG, path : Path) -> bool:
        '''
            runs interestingness test to check whether current
            modified cfg is interesting
        '''

        program = flesh_cfg(cfg)
        
        #TODO: change to tmp folder
        file = open("/data/work/ghidra/reducer/test_graph.c", "w")
        file.write(program)
        file.close()

        path_file = open("/data/work/ghidra/reducer/inputs.txt", "w")
        path_file.write(str(len(path.directions)) + '\n')
        path_file.write(str(len(path.expected_output)) + '\n')
        path_file.writelines(' '.join([str(i) for i in path.directions]) + '\n')
        path_file.writelines(' '.join([str(i) for i in path.expected_output]))
        path_file.close()

        # run interestingness test
        cmd = ['sh', f'/{self.script_filepath}']

        result = subprocess.run(cmd)
        
        print(f'Result of interestingness test is: {result.returncode}')

        return True if result.returncode == 0 else False

def main():

    args = parse_args()

    cfg : CFG = load_cfg(args.graph)
    
    reducer : Reducer = Reducer(cfg, args.input, args.script)

    reduced_cfg : CFG = reducer.reduce()

    '''
    program : str = flesh_cfg(reduced_cfg)

    #TODO: change to tmp folder
    file = open("/data/work/fuzzflesh/graphs/graph.c", "w")
    file.write(program)
    file.close()
    '''

if __name__==("__main__"):
    main()


