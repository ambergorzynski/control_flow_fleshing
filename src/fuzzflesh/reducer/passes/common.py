from fuzzflesh.cfg.CFG import CFG, Route

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
        
def get_full_directions(cfg : CFG, path : Route) -> list[int]:
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


