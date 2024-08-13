import numpy as np
import os
import sys
from pathlib import Path

from fuzzflesh.cfg.CFG import CFG, Route
from fuzzflesh.reducer.passes.abstract import AbstractPass

#TODO: Add support for merging nodes connected to the path
# this is more complicated because it requires adjusting the
# path as well as the graph

class MergeOffPathPass(AbstractPass):
    '''
        This pass merges nodes that are not on the path, and 
        not connected to any nodes on the path by an edge.
        It modifies the graph but not the path.
    '''

    def __init__(self):
        self.chunk : int = 2 
        self.nodes : list[int] = []

    def new(self, cfg : CFG, path : Path) -> None:
        
        self.nodes = self.get_off_path_nodes(cfg, path)

    def check_prerequisites(self, cfg : CFG, path : Path) -> bool:
        
        if len(self.nodes) < 2:
            return False

        return True

    def transform(self, cfg : CFG, path : Path) -> tuple[CFG, Path]:

        #n = len(self.nodes) // self.chunk if len(self.nodes) >= self.chunk else 1
        n = 1

        for i in range(n):
            
            # pop second node because it will be destroyed in the 
            # merge, so we cannot merge on it again
            node1 = self.nodes[0]
            node2 = self.nodes.pop(1)
           
            print(f'nodes for merging: {node1} {node2}')
     
            cfg = cfg.merge_nodes(node1, node2)

        print(f'cfg size after merge transform is {cfg.total_nodes()}')

        return (cfg, path)

    def get_off_path_nodes(self, cfg : CFG, path : Path) -> list[int]:

        merge_nodes = [x for x in cfg.nodes if x not in cfg.get_exit_nodes()
                and x not in cfg.get_path_neighbours(path)
                and x not in path.expected_output]

        return merge_nodes

class MergeOnPathPass(AbstractPass):
    '''
        This pass merges nodes that are on the path, or
        not connected to any nodes on the path by an edge.
        It modifies the graph and the path.
    '''

    def __init__(self):
        self.chunk : int = 2 
        self.nodes : list[int] = []

    def new(self, cfg : CFG, path : Path) -> None:
        
        self.nodes = self.get_on_path_nodes(cfg, path)

    def check_prerequisites(self, cfg : CFG, path : Path) -> bool:
        
        if len(self.nodes) < 2:
            return False

        return True

    def transform(self, cfg : CFG, path : Route) -> tuple[CFG, Route]:

        #n = len(self.nodes) // self.chunk if len(self.nodes) >= self.chunk else 1
        
        n = 1

        for i in range(n):

            # pop second node because it will be destroyed in the 
            # merge, so we cannot merge on it again
            node1 = self.nodes[0]
            node2 = self.nodes.pop(1)
           
            print(f'nodes for merging: {node1} {node2}')
            
            new_cfg = cfg.merge_nodes(node1, node2)

            new_path = update_path(new_cfg, cfg, path, node1, node2)
            
            '''
            print(f'cfg : {new_cfg.get_nodes()}')
            print(f'cfg : {new_cfg.get_edges()}')
            print(f'path : {new_path.expected_output}')
            print(f'dirs : {new_path.directions}')
            '''

            # update cfg and path to modified
            cfg = new_cfg
            path = new_path
        
        print(f'cfg size after merge transform is {cfg.total_nodes()}')
        
        return (new_cfg, new_path)

    def get_on_path_nodes(self, cfg : CFG, path : Path) -> list[int]:

        merge_nodes = [x for x in cfg.nodes if x not in cfg.get_exit_nodes()
                and x != 0
                and (x in path.expected_output
                or x in cfg.get_path_neighbours(path))]

        return merge_nodes

class MergeExitPass(AbstractPass):

    ''' 
        This pass merges exit nodes into a single default exit node.
        It is important to retain at least one exit node so that 
        the program does not become interminable.
    '''
    
    def __init__(self):
        self.chunk : int = 2 
        self.nodes : list[int] = []
        self.default_exit : int

    def new(self, cfg : CFG, path : Path) -> None:
        
        self.nodes = cfg.get_exit_nodes()
        self.default_exit = self.nodes.pop(0) # pop so we don't merge it

    def check_prerequisites(self, cfg : CFG, path : Path) -> bool:
        
        if len(self.nodes) < 2:
            return False

        return True

    def transform(self, cfg : CFG, path : Path) -> tuple[CFG, Path]:

        #n = len(self.nodes) // self.chunk if len(self.nodes) >= self.chunk else 1
        
        n = 1

        for i in range(n):

            # pop node because it will be destroyed in the 
            # merge, so we cannot merge on it again
            node = self.nodes.pop(1)
           
            print(f'nodes for merging: {self.default_exit} {node}')
            
            new_cfg = cfg.merge_nodes(self.default_exit, node)

            new_path = update_path(new_cfg, cfg, path, self.default_exit, node)

            # update cfg and path to modified
            cfg = new_cfg
            path = new_path
        
        print(f'cfg size after merge transform is {cfg.total_nodes()}')
        
        return (new_cfg, new_path)


def update_path(cfg : CFG, old_cfg : CFG, old_path : Path, node1 : int, node2 : int) -> Path:

    new_path = Route(directions=old_path.directions, expected_output=old_path.expected_output)
  
    new_path.expected_output = [node1 if x == node2 else x for x in old_path.expected_output]

    full_direction_array = get_full_directions(old_cfg, old_path)
    
    former_direction_array = full_direction_array
    
    # find all nodes in the output that require directions adjustments
    # this includes node1 and any node that was a parent of node2
    nodes = set(old_cfg.get_parents(node2) + [node1])

    node_indices = [i for i, x in enumerate(new_path.expected_output) if x in nodes]

    for i in node_indices:

        # replace out-direction unless we are at the end of the path
        if i != len(new_path.expected_output) - 1:
            full_direction_array[i] = get_new_direction_using_adj(
                    cfg,
                    new_path.expected_output[i],
                    new_path.expected_output[i+1]
                    )

        # also replace in-direction if it is node1
        if new_path.expected_output[i] == node1:
            full_direction_array[i-1] = get_new_direction_using_adj(
                    cfg, 
                    new_path.expected_output[i-1], 
                    node1
                    )

    #former = list(zip(old_path.expected_output, former_direction_array))
    #zipped = list(zip(new_path.expected_output, full_direction_array))

    #print(f'former:\n {former}')
    #print(f'current:\n {zipped}')

    new_path.directions = [x for x in full_direction_array if x != None]

    return new_path

def get_new_direction_using_adj(new_cfg : CFG, u : int, v : int) -> int:

    '''
        Returns the direction required to reach successor node v from u.
        This is consistent with the rest of the program generation process,
        which is based on successor nodes rather than edges.
    '''

    #TODO: change the rest of the program generation process to be based on edges

    successors = new_cfg.get_successors(u)

    if len(successors) == 1:
        return None

    #print(f'successors from {u} are: {successors}')
    #print(f'{u} to {v} is successor index {successors.index(v)}')

    return successors.index(v)

def get_new_direction_using_edges(new_cfg : CFG, u : int, v : int) -> int:

    ''' 
        Returns the direction required to follow edge (u,v). If multiple
        edges (u,v) exist, then it returns the first direction. If u has
        only one out edge, then the direction returned is None since
        no direction is required to traverse (u,v)
    '''

    edges = new_cfg.get_out_edges(u)


    if len(edges) == 1:
        return None
    print(f'out edges from {u} is {edges}')
    print(f'{u} to {v} is {edges.index((u,v))}')

    return edges.index((u,v))
        
def get_full_directions(cfg : CFG, path : Path) -> list[int]:
    '''
    create direction array that corresponds in size to output; all nodes on output 
    path that do not require a direction (i.e. have < 2 children) are given direction NULL
    '''

    # get degree of each node on path
    #degree = [cfg.get_out_degree(x) for x in path.expected_output]
    
    # get n successors of each node on path
    degree = [cfg.successors(x) for x in path.expected_output]

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


