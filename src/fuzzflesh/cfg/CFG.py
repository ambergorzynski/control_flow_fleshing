import networkx as nx
import sys
import random
from random import Random
from queue import Queue
from typing import List, Tuple
from itertools import chain

import pickle

def load_graph(filename : str) -> nx.MultiDiGraph:
         
    return  pickle.load(open(filename, 'rb'))

def spaces(input_array):

    if input_array == []:
        return

    output = str(input_array[0])

    for i in range(1, len(input_array)):
        output += f' {input_array[i]}'

    return output

class Path():

    def __init__(self, expected_output = [], directions = []) -> None:
        self.expected_output = expected_output
        self.directions = directions

class CFG():

    def __init__(self, graph : nx.MultiDiGraph = None, filename : str = None):
        
        if graph == None:
            graph = load_graph(filename)
        
        self.graph : nx.MultiDiGraph = graph
        self.fleshed_graph : str = None 
        self.doomed : List[int] = []
        self.not_doomed : List[int] = []
        self.exit_nodes : List[int] = self.get_exit_nodes()
        self.nodes : List[int] = self.get_nodes()

    def get_parents(self, node : int) -> list[int]:
        return list(self.graph.predecessors(node))

    def total_nodes(self) -> int:
        return self.graph.number_of_nodes()

    def get_cfg_size(self) -> tuple[int, int]:
        return (self.graph.number_of_nodes(), self.graph.number_of_edges())

    def save_graph(self, filename : str) -> None:
        pickle.dump(self.graph, open(filename, "wb"))
    
    def get_edges(self) -> List[tuple[int,int]]:
        return list(self.graph.edges)

    def get_nodes(self) -> List[int]:
        return list(self.graph.nodes)

    def get_graph(self) -> nx.MultiDiGraph:
        return self.graph

    def get_out_degree(self, node) -> int:
        return self.graph.out_degree(node)

    def get_out_edges(self, node) -> List[int]:
        return list(self.graph.out_edges(node))

    def get_exit_nodes(self) -> List[int]:
        ''' 
            returns a list of all exit nodes in the graph
            defined as nodes with no successors 
        '''

        exits = [node for node in self.graph.nodes()
                    if self.graph.in_degree(node) != 0
                    and self.graph.out_degree(node) == 0]

        return exits

    def remove_edge(self, edge : tuple[int,int]):
        
        modified_graph = self.graph

        modified_graph.remove_edge(*edge)

        return CFG(graph = modified_graph)

    def merge_nodes(self, node1 : int, node2 : int, self_loops=True):

        ''' own implementation of contracted_nodes to control merging
            behaviour
        '''
        #merged = nx.contracted_nodes(self.graph, node1, node2, copy=True) 
        
        H = self.graph.copy()

        # remove self-loop from in edge to avoid duplicates (self loops 
        # are listed as both in and out edges by the nx function
        in_edges = [x for x in self.graph.in_edges(node2) if x[0] != x[1]]

        in_edges = [(w, node1) for (w, x) in in_edges]
        
        out_edges = [(node1, w if w != node2 else node1) for x, w in self.graph.out_edges(node2)]

        new_edges = in_edges + out_edges

        H.remove_node(node2)

        H.add_edges_from(new_edges)
       
        return CFG(graph = H)

    def get_path_neighbours(self, path : Path) -> List[int]:
        '''
            returns a list of all nodes that are connected
            by at least one edge to the given path
        '''
       
        path_nodes = set(path.expected_output)

        path_pred_nodes = [[n for n in self.graph.predecessors(i)] for i in path_nodes]
        path_succ_nodes = [[n for n in self.graph.successors(i)] for i in path_nodes]

        path_neighbour_nodes = set([n for inner in (path_pred_nodes + path_succ_nodes)
            for n in inner])

        path_neighbour_nodes = list(set(path_neighbour_nodes))

        return path_neighbour_nodes

    def get_root(self) -> int:
        '''
            returns int identifying the root node of
            the graph. set as 0 for now, which is how
            we label the root node at the graph generation
            stage
        '''
        return 0

    
    def graph_is_valid(self) -> bool:
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
    
    def get_successors(self, node) -> list[int]:
        return list(self.graph.adj[node])

    def successors(self, current_node) -> int:
        '''
            returns the number of successors for current_node 
        '''
        return len(list(self.graph.adj[current_node]))
    
    def choose_next_node(self, current_node, rand) -> Tuple[int, int]:
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

            

    def find_shortest_path_to_exit(self, current_node) -> Tuple[List[int], List[int]]:
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
        
    def generate_path(self,
                    graph_number : int,
                    graph_filepath : str, 
                    path_filepath : str,
                    graph_name : str, 
                    n_paths : int, 
                    max_path_length : int, 
                    seed : float = None):
        
        '''
            Funtion generates a set of paths for each graph and writes the path and 
            directions to the output filepath provided
        '''
            
        #graph = pickle.load(open(f'{graph_filepath}/{graph_name}', 'rb'))

        if self.graph_is_valid():

            for j in range(n_paths):

                print(f'new path for graph {graph_number}, path {j}')

                path = self.find_path(max_path_length, seed)

                with open(f'{path_filepath}/input_graph_{graph_number}_path{j}.txt', 'w') as f:
                    f.write(str(len(path.directions))+'\n')
                    f.write(str(len(path.expected_output))+'\n')
                    f.write(str(spaces(path.directions))+'\n')
                    f.write(str(spaces(path.expected_output)))

        else:
            print("cfg is not valid")
   



