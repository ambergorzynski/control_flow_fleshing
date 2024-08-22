from fuzzflesh.cfg.CFG import CFG, Route
from fuzzflesh.reducer.passes.abstract import AbstractPass
from fuzzflesh.reducer.passes.common import get_full_directions, get_new_direction_using_adj, check_route

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

    def transform(self, cfg : CFG, path : Route) -> tuple[CFG, Route]:

        #n = len(self.edges) // self.chunk if len(self.edges) >= self.chunk else 1
        n = 1
        
        for i in range(n):

            edge = self.edges.pop(0)
            print(f'Edge to remove: {edge}')

            cfg = cfg.remove_edge(edge)

        # path is not modified here - we are only removing off-path edges

        return (cfg, path)

    def get_edges_for_removal(self, cfg : CFG, path : Route) -> list[int]:
        '''
            Edges for removal here are not connected to the path or any
            nodes that appear on the path. Neither the start nor end node of 
            the edge is on the path.
        '''

        edges = [x for x in cfg.get_edges() if x[0] not in path.expected_output
                    and x[1] not in path.expected_output]

        return edges
        
class RemoveOnPathEdgePass(AbstractPass):
    '''
        This pass removes edges that are connected to at least one
        node on the path, but are not themselves on the path. 
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

    def transform(self, cfg : CFG, path : Route) -> tuple[CFG, Route]:

        #n = len(self.edges) // self.chunk if len(self.edges) >= self.chunk else 1
        n = 1
        
        for i in range(n):

            edge = self.edges.pop(0)

            print(f'Removing edge: {edge}')

            new_cfg = cfg.remove_edge(edge)

            # Update path to reflect possible new directions
            # Expected output will not change since we are only removing edges
            # that are not on the path
            new_path = update_path(new_cfg, cfg, path, edge)

            # update cfg and path to modified
            cfg = new_cfg
            path = new_path

        return (new_cfg, new_path)

    def get_edges_for_removal(self, cfg : CFG, path : Route) -> list[int]:
        
        '''
            Edges for removal here are not directly on the path but are 
            nearby: either the start or end node of the edge is on the path.
        '''

        all_edges = set([(u, v) for (u, v, n) in cfg.get_edges()])

        edges_on_path = set(get_edges_from_output(path.expected_output))
        
        return list(all_edges - edges_on_path)      
       
def update_path(cfg : CFG, old_cfg : CFG, old_path : Route, edge : tuple[int,int]) -> Route:

    print('Updating route...')
 
    new_path = Route(directions=old_path.directions, expected_output=old_path.expected_output)    
    
    full_direction_array = get_full_directions(old_cfg, old_path)
    
    former_direction_array = full_direction_array

    # find all nodes in the output that require directions adjustments
    # for edge (u,v), we need to update directions for node u if u is on
    # the path. 
    node_indices = [i for i, u in enumerate(new_path.expected_output) if u == edge[0]]

    for i in node_indices:

        # replace out-direction unless we are at the end of the path
        if i != len(new_path.expected_output) - 1:
            full_direction_array[i] = get_new_direction_using_adj(
                    cfg,
                    new_path.expected_output[i],
                    new_path.expected_output[i+1]
                    )

    new_path.directions = [x for x in full_direction_array if x != None]
    print(f'Updated directions: {new_path.directions}')
    print(f'Updated output: {new_path.expected_output}')

    # check that new path directions matches expected output
    if not check_route(cfg, new_path):
        print('NO MATCH!')
        exit()

    return new_path

def get_edges_from_output(output : list[int]) -> list[tuple[int,int]]:
    
    '''
        Returns a list of tuples containing the edges that appear on 
        the expected output path
    '''

    return [(output[index], output[index + 1]) for index, node in enumerate(output) if index != len(output) - 1]
