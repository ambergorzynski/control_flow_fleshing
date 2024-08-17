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
    '''
    print(f'successors from {u} are: {successors}')
    print(f'{u} to {v} is successor index {successors.index(v)}')
    '''
    # allow for a default fall-through to subsequent node using default value
    # TODO: update to show the default next node as a successor based on ordering
    if v in successors:
        return successors.index(v)
    elif len(successors) > 2 and (v == new_cfg.get_next_greatest_node(u)):
        return len(successors) # this is the default fallthrough on a switch
    else:
        print(f'Problem! No edge connects u {u} to v {v} (likely due to merging)')
        print(f'Children of u are: {successors}')
        print(f'Next greatest node is: {new_cfg.get_next_greatest_node(u)}')
        new_cfg.add_edge_directly((u,v))
        print(f'Children of u are: {new_cfg.get_successors(u)}')
        return new_cfg.get_successors(u).index(v)

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

def check_route(cfg : CFG, path : Route) -> bool:
    '''
        Checks that direction correspond with expected output.
    '''
    actual_output = []
    output_index = 0
    dir_index = 0
    direction = None

    # Get entry node
    current_node = cfg.get_root()
    actual_output.append(current_node)

    # Check number of children
    children : list[int] = cfg.get_successors(current_node)

    while len(children) > 0:

        if actual_output[output_index] != path.expected_output[output_index]:
            print(f'CHECK: actual: \n {actual_output}')
            print(f'CHECK: expect: \n {path.expected_output}')
            return False

        output_index += 1

        if len(children) == 1:
            current_node = children[0]
            
        else:
            direction = path.directions[dir_index]
            dir_index += 1

            if len(children) == 2:
                print(f'CHECK: actual: \n {actual_output}')
                print(f'CHECK: expect: \n {path.expected_output}')
                print(f'current node: {current_node}')
                print(f'current node children: {children}')
                print(f'directions: {direction}')
                current_node = children[direction]

            elif len(children) > 2:
                # check for default direction, which occurs
                # if the direction is greater than the number
                # of children
                if direction >= len(children):
                    # the next node will be the next greatest
                    # numbered node in the graph
                    current_node = cfg.get_next_greatest_node(current_node)
                
                else:
                    current_node = children[direction]
        
        actual_output.append(current_node)
        children = cfg.get_successors(current_node)

    return True
