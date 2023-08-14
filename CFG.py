import networkx as nx
import sys
import random
from random import Random
from queue import Queue
import pickle

class Path():

    def __init__(self) -> None:
        self.expected_output = []
        self.directions = []

class CFG():

    def __init__(self, graph : nx.MultiDiGraph):
        self.graph : nx.MultiDiGraph = graph
        self.fleshed_graph : str = None 
        self.doomed : list[int] = []
        self.not_doomed : list[int] = []
        self.exit_nodes : list[int] = self.find_exit_nodes()

    def find_exit_nodes(self) -> list[int]:
        ''' 
            returns a list of all exit nodes in the graph
            defined as nodes with no successors 
        '''

        exits = []

        for node in self.graph:
            if self.successors(node) == 0:
                exits.append(node)

        return exits


    def get_root(self) -> int:
        '''
            returns int identifying the root node of
            the graph. set as 0 for now, which is how
            we label the root node at the graph generation
            stage
        '''
        return 0

    
    def is_valid(self) -> bool:
        '''
            function checks whether CFG is valid, which is 
            defined by a path existing from the start node
            to an exit node
        '''

        for end in self.exit_nodes:

            if(self.is_reachable(0, end)):

                return True

        # if we reach the end of the check, then we have not 
        # found any paths to exit nodes
        return False

    def find_path(self, max_length, seed=None) -> Path:
        '''
            function finds a random path through the 
            CFG and stores it in the expected output array.
            also stores the directions needed to navigate
            this path
        '''

        rand = Random()
        
        if seed is None:
            seed = random.randrange(0, sys.maxsize)

        rand.seed(seed)
        
        # root should be id 0
        current_node = self.get_root()

        path = Path()

        path.expected_output.append(current_node)

        while(self.successors(current_node) != 0 and len(path.expected_output) < max_length):

            (current_node, dir) = self.choose_next_node(current_node, rand)

            path.expected_output.append(current_node)
            
            if dir is not None:
                path.directions.append(dir)

        # if we are not at exit node, then find shortest distance to exit
        if(self.successors(current_node) != 0):
            (shortest_path_to_exit, dirs_to_exit) = self.find_shortest_path_to_exit(current_node)
            path.expected_output += shortest_path_to_exit
            path.directions += dirs_to_exit

        return path
    
    def successors(self, current_node) -> int:
        '''
            returns the number of successors for current_node 
        '''
        return len(list(self.graph.adj[current_node]))
    
    def choose_next_node(self, current_node, rand) -> tuple[int, int]:
        '''
            randomly chooses next node and returns a 
            tuple (node, direction)
        '''

        doomed = []

        if(self.successors(current_node) == 1):

            return (list(self.graph.adj[current_node])[0], None)
        
        else:
            
            # randomly choose a node from the set of possible successors
            node = rand.choice(list(self.graph.successors(current_node)))
            
            # ensure node choice is not a doomed node that cannot reach an exit
            while(self.is_doomed(node)):
                node = rand.choice([i for i in list(self.graph.successors(current_node)) if i not in doomed])

            # the node index provides the direction    
            index = list(self.graph.successors(current_node)).index(node)

        return (node, index)
    
    def is_doomed(self, node) -> bool:
        ''' returns true if node is doomed s.t. no exit node is 
            reachable from this node '''

        # first check whether we have already encountered this node
        if node in self.doomed:
            return True
        
        elif node in self.not_doomed:
            return False
        
        # if we haven't already checked the node, then check whether
        # it can reach any possible exit node
        for end in self.exit_nodes:

            if(self.is_reachable(node, end)):

                # add node to non-doomed set
                self.not_doomed.append(node)

                return False
        
       # if no exit nodes were reachable, then add node to doomed set 
        self.doomed.append(node)

        return True
    
    def is_reachable(self, start, end) -> bool:
        ''' returns true if the given end node can be reached from
            the start node. checked using BFS '''
        
        visited = [False] * self.graph.number_of_nodes()

        q = Queue()

        q.put(start)

        while not q.empty():

            n = q.get()

            # return true if we have found an exit node
            if n == end:
                return True
            
            # add all neighbours of n to queue
            for child in self.graph.neighbors(n):
                if child != n and visited[child] == False:
                    q.put(child)
                    visited[child] = True

        # if we have completed the search without finding the
        # end node, then return false
        return False

            

    def find_shortest_path_to_exit(self, current_node) -> tuple[list[int], list[int]]:
        '''
            finds shortest path to exit and 
            returns tuple (shortest_path, shortest_dirs)
        '''

        parents = [None] * self.graph.number_of_nodes()

        directions = [None] * self.graph.number_of_nodes()

        q = Queue()

        q.put(current_node)

        while not q.empty():

            n = q.get()

            # if we have found an exit node, then return
            # need to add finding path from src to exit
            if(self.successors(n) == 0):
                (shortest_path, shortest_dirs) = self.recover_bfs_path(current_node, n, parents, directions)
                return (shortest_path, shortest_dirs)
            
            # otherwise, add successors to queue
            dir = 0

            for child in self.graph.neighbors(n):

                if child != n and parents[child] == None:
                    q.put(child)
                    parents[child] = n

                    # include direction if parent has multiple children
                    if self.successors(n) > 1:
                        directions[child] = dir

                dir += 1
                                

    def recover_bfs_path(self, start, end, parents, directions):
        '''
            recovers path from start to exit given parent array
            returns tuple containing path and directions array
        '''
        
        path = []
        dirs = [] 

        # trace path in reverse order from end node to start node
        while start != end:

            path.append(end)

            if directions[end] is not None:
                dirs.append(directions[end])

            end = parents[end]

        # reverse the ordering to give path from start to end node
        # and remove start node since already in expected_output path
        return (path[::-1], dirs[::-1])
            


def generate_paths(self, 
                   graph_filepath : str, 
                   output_filepath : str, 
                   n_graphs : int, 
                   n_paths : int, 
                   max_path_length : int, 
                   seed : float = None):
    
    '''
        Funtion generates a set of paths for each graph and writes the path and 
        directions to the output filepath provided
    '''

    for i in range(n_graphs):
        
        graph = pickle.load(open(f'{graph_filepath}/graph_{i}.p', 'rb'))

        cfg = CFG(graph)

        if cfg.is_valid():

            for j in range(n_paths):

                print(f'new path for graph {i}, path {j}')

                path = cfg.find_path(max_path_length, seed)

                with open(f'{output_filepath}/input_graph_{i}_path{j}.txt', 'w') as f:
                    f.write(str(len(path.directions))+'\n')
                    f.write(str(len(path.expected_output))+'\n')
                    f.write(str(self.spaces(path.directions))+'\n')
                    f.write(str(self.spaces(path.expected_output)))

        else:
            print("cfg is not valid")





    
    



