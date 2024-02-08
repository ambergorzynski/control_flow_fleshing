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
        pass

    def check_prerequisites(self, cfg : CFG, path : Path) -> bool:
        return True

    #TODO: once we have found the set of available nodes, store
    # these in the state. then pop them as we merge (i.e. pop the
    # node that is vanishing). this means we don't re-merge next 
    # time we perform the transormation. figure out when to add
    # this to the state
    def transform(self, cfg : CFG, path : Path) -> tuple[CFG, Path]:
        
        all_nodes = [x for x in cfg.nodes if x not in cfg.get_exit_nodes()
                and x not in cfg.get_path_neighbours(path)
                and x not in path.expected_output]

        print(f'nodes for selection: {all_nodes}')
        
        node1 = all_nodes.pop(0)
        node2 = all_nodes.pop(0)

        print(f'nodes for merging: {node1} {node2}')
 
        modified_cfg = cfg.merge_nodes(node1, node2)

        modified_path = path

        # return modified graph and path
        return (modified_cfg, modified_path)
