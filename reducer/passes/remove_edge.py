import os
import sys
from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'../..'))

from CFG import CFG, Path
from passes.abstract import AbstractPass


class RemoveEdgePass(AbstractPass):
    '''
        This pass removes edges that are not connected to any
        node that is on the path.
    '''

    def __init__(self):
        self.chunk : int = 2 
        self.edges : list[tuple[int,int]] = []

    def new(self, cfg : CFG, path : Path) -> None:
        
        self.edges = self.get_edges_for_removal(cfg, path)

        print(f'Edges for removal: {self.edges}')

    def check_prerequisites(self, cfg : CFG, path : Path) -> bool:
        
        if len(self.edges) == 0:
            return False

        return True

    def transform(self, cfg : CFG, path : Path) -> tuple[CFG, Path]:

        n = len(self.edges) // self.chunk if len(self.edges) >= self.chunk else 1

        for i in range(n):

            edge = self.edges.pop[0]

            print(f'Remove edge {edge}')
            
            cfg = cfg.remove_edge(edge)

        # path is not modified here - we are only removing off-path edges

        return (cfg, path)

    def get_edges_for_removal(self, cfg : CFG, path : Path) -> list[int]:

        edges = [x for x in cfg.get_edges() if x[0] not in path.expected_output
                    and x[1] not in path.expected_output]

        return edges
        

