import numpy as np
import os
import sys
from pathlib import Path

from fuzzflesh.cfg.CFG import CFG, Route
from fuzzflesh.reducer.passes.abstract import AbstractPass
from fuzzflesh.reducer.passes.common import *

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

