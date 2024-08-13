from fuzzflesh.cfg.CFG import CFG, Route
from fuzzflesh.reducer.passes.abstract import AbstractPass

class RemoveOffPathEdgePass(AbstractPass):
    '''
        This pass removes edges that are not connected to any
        node that is on the path.
    '''

    def __init__(self):
        self.chunk : int = 2 
        self.edges : list[tuple[int,int]] = []

    def new(self, cfg : CFG, path : Route) -> None:
        
        self.edges = self.get_edges_for_removal(cfg, path)

    def check_prerequisites(self, cfg : CFG, path : Route) -> bool:
        
        if len(self.edges) == 0:
            return False

        return True

    def transform(self, cfg : CFG, path : Path) -> tuple[CFG, Route]:

        n = len(self.edges) // self.chunk if len(self.edges) >= self.chunk else 1

        for i in range(n):

            edge = self.edges.pop(0)

            cfg = cfg.remove_edge(edge)

        # path is not modified here - we are only removing off-path edges

        return (cfg, path)

    def get_edges_for_removal(self, cfg : CFG, path : Route) -> list[int]:

        edges = [x for x in cfg.get_edges() if x[0] not in path.expected_output
                    and x[1] not in path.expected_output]

        return edges
        

class RemovePathEdges(AbstractPass):
    '''
        This pass removes edges that are are connected to nodes
        that are on the path. This requires the path to be updated
        (possibly just directions or directions and expected output).
    '''

        def __init__(self):
        self.chunk : int = 2 
        self.edges : list[tuple[int,int]] = []

    def new(self, cfg : CFG, path : Path) -> None:
        
        self.edges = self.get_edges_for_removal(cfg, path)

    def check_prerequisites(self, cfg : CFG, path : Path) -> bool:
        
        if len(self.edges) == 0:
            return False

        return True

    def transform(self, cfg : CFG, path : Route) -> tuple[CFG, Route]:

        n = len(self.edges) // self.chunk if len(self.edges) >= self.chunk else 1

        for i in range(n):

            edge = self.edges.pop(0)

            cfg = cfg.remove_edge(edge)

        # path is not modified here - we are only removing off-path edges

        return (cfg, path)

    def get_edges_for_removal(self, cfg : CFG, path : Path) -> list[int]:

        edges = [x for x in cfg.get_edges() if x[0] in path.expected_output
                    or x[1] in path.expected_output]

        return edges
        
