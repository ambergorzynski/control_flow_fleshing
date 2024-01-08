import os
import sys
import argparse
import subprocess
import random
import time
import networkx as nx

from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'..'))

from CFG import CFG
from c.CProgramGenerator import CProgramGenerator

def parse_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("graph")
    parser.add_argument("--language", default="c")
    parser.add_argument("--script") # optional for now
    return parser.parse_args()

def load_cfg(filename : str) -> CFG:
    return  CFG(filename=filename)

def flesh_cfg(cfg : CFG) -> str:

    generator = CProgramGenerator()

    program = generator.fleshout(cfg)

    return program 

class Reducer():

    def __init__(self, cfg : CFG):
        self.interesting_cfg : CFG = cfg
        self.timeout : int = None
    
    def reduce(self) -> None:

        modified_cfg : CFG = self.interesting_cfg

        counter = 0

        #TODO: include timeout stopping condition
        #TODO: include stoppping condition once all operations tried
        while self.is_interesting(modified_cfg):

            print(f'Nodes: {modified_cfg.get_nodes()}')
           
            print(f'Modification round {counter}')

            self.interesting_cfg = modified_cfg

            modified_cfg = self.merge(modified_cfg)

            counter += 1

            time.sleep(3)

        print('Finished!')


    def merge(self, cfg : CFG, nodes : tuple[int, int] = None) -> None:
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

        if nodes is None:

            nodes = self.get_random_nodes(cfg)

        print(f'nodes are: {nodes}')

        (node1, node2) = nodes

        merged_graph = (nx.contracted_nodes(cfg.get_graph(), node1, node2, copy=True) 
        
        return CFG(merged_graph)

    def get_random_nodes(self, cfg : CFG) -> tuple[int, int]:
        
        all_nodes = cfg.get_nodes()

        selected = random.sample(all_nodes,2)

        return tuple(selected)

    def is_interesting(self, cfg : CFG) -> bool:
        '''
            runs interestingness test to check whether current
            modified cfg is interesting
        '''

        #TODO: implement interestingness check
        return True

def main():

    args = parse_args()

    cfg : CFG = load_cfg(args.graph)
    
    reducer = Reducer(cfg)

    reducer.reduce()



    #TODO: change to tmp folder
    file = open("/data/work/fuzzflesh/graphs/graph.c", "w")
    file.write(program)
    file.close()

if __name__==("__main__"):
    main()


