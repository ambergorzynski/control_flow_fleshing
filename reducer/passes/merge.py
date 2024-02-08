import os
import sys
from pathlib import Path
sys.path.append(os.path.join(os.path.dirname(__file__),'../..'))

from CFG import CFG, Path
from passes.abstract import AbstractPass

#TODO: Add support for merging nodes connected to the path
# this is more complicated because it requires adjusting the
# path as well as the graph

class MergePass(AbstractPass):
    '''
        This pass merges nodes that are not on the path, and 
        not connected to any nodes on the path by an edge.
    '''

    def __init__(self):
        self.chunk : int = 2 
        self.nodes : list[int] = []

    def new(self, cfg : CFG, path : Path) -> None:
        
        self.nodes = self.get_merge_nodes(cfg, path)

        print(f'Nodes for merging: {self.nodes}')

    def check_prerequisites(self, cfg : CFG, path : Path) -> bool:
        
        if len(self.nodes) < 2:
            return False

        return True

    def transform(self, cfg : CFG, path : Path) -> tuple[CFG, Path]:

        n = len(self.nodes) // self.chunk if len(self.nodes) >= self.chunk else 1

        for i in range(n):
            
            # pop second node because it will be destroyed in the 
            # merge, so we cannot merge on it again
            node1 = self.nodes[0]
            node2 = self.nodes.pop(1)
           
            print(f'nodes for merging: {node1} {node2}')
     
            cfg = cfg.merge_nodes(node1, node2)

        # path is not modified here - we are only merging off-path nodes

        return (cfg, path)

    def get_merge_nodes(self, cfg : CFG, path : Path) -> list[int]:

        merge_nodes = [x for x in cfg.nodes if x not in cfg.get_exit_nodes()
                and x not in cfg.get_path_neighbours(path)
                and x not in path.expected_output]

        return merge_nodes
        

