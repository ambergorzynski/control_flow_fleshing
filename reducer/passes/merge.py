import numpy as np
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

    def update_path(self, old_cfg : CFG, old_path : Path, node1 : int, node2 : int) -> Path:
 
        new_path = Path(directions=old_path.directions, expected_output=old_path.expected_output)
      
        new_path.expected_output = [node1 if x == node2 else x for x in old_path.expected_output]
 
        full_direction_array = self.get_full_directions(old_cfg, old_path)

        print(f'full direction array: {full_direction_array}')

        # update node 1 directions
        if node1 in old_path.expected_output:

            if old_cfg.get_out_degree(node1) == 1:
                
                full_direction_array = [0 if old_path.expected_output[i] == node1 else x 
                        for i, x in enumerate(full_direction_array)]

            elif old_cfg.get_out_degree(node1) > 1:
                pass # included for clarity - no need to modify if direction already existed
        
            else:
                pass #TODO: add

        # update node 2 directions
        if node2 in old_path.expected_output:

            if old_cfg.get_out_degree(node2) == 1:
                
                new_direction = old_cfg.get_out_degree(node1)
                
                full_direction_array = [new_direction 
                        if old_path.expected_output[i] == node2 else x 
                        for i, x in enumerate(full_direction_array)]

            elif old_cfg.get_out_degree(node2) > 1:
                
                full_direction_array = [(old_cfg.get_out_degree(node1) + x) 
                        if old_path.expected_output[i] == node2 else x 
                        for i, x in enumerate(full_direction_array)]
            
            else:
                pass #TODO: add

        print(f'full direction array after updates: {full_direction_array}')
        

        return new_path

    def get_full_directions(self, cfg : CFG, path : Path) -> list[int]:
        '''
        create direction array that corresponds in size to output; all nodes on output 
        path that do not require a direction (i.e. have < 2 children) are given direction NULL
        '''

        # get degree of each node on path
        degree = [cfg.get_out_degree(x) for x in path.expected_output]
        
        # get appropriate direction 
        direction = []
        dir_index = 0

        for i, val in enumerate(degree):
            
            if val > 1:
                direction.append(path.directions[dir_index])
                dir_index += 1
            else:
                direction.append(None)

        return direction


