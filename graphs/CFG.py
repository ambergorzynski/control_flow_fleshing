import networkx as nx
import sys
import random
from random import Random
from queue import Queue

class Path():

    def __init__(self) -> None:
        self.expected_output = []
        self.directions = []

class CFG():

    def __init__(self, graph : nx.MultiDiGraph):
        self.graph : nx.MultiDiGraph = graph
        self.fleshed_graph : str = None 

    def get_root(self) -> int:
        '''
            returns int identifying the root node of
            the graph. set as 0 for now, which is how
            we label the root node at the graph generation
            stage
        '''
        return 0

    def fleshout(self) -> str:
        ''' 
            converts control flow graph to LLVM IR 
            returns str containing LLVM IR program
            and saves as member variable
        '''

        # all programs have common start
        self.fleshed_graph = self.flesh_program_start()

        for n in self.graph:

            # store node label in output array for every node visited
            self.fleshed_graph += self.flesh_start_of_node(n)

            # write remaining block code based on number of successor nodes
            n_successors = self.successors(n)

            if(n_successors == 0):
                self.fleshed_graph += self.flesh_exit_node(n)
            
            elif(n_successors == 1):
                self.fleshed_graph += self.flesh_unconditional_node(n)

            elif(n_successors == 2):
                self.fleshed_graph += self.flesh_conditional_node(n)


        # end code with return statement
        self.fleshed_graph += '''
        ret void
        }'''

        return self.fleshed_graph
    
    def flesh_program_start(self) -> str:

        prog_start = '''

        ; example cfg 1: with single branching block

        define void @_Z7run_cfgPiS_(i32* %in_directions, i32* %in_output) #0 {

        0:
            ; create arrays to store directions & output
            %directions = alloca i32*
            %output = alloca i32*

            store i32* %in_directions, i32** %directions
            store i32* %in_output, i32** %output

            %counter = alloca i32
            store i32 0, i32* %counter

            %dir_counter = alloca i32
            store i32 0, i32* %dir_counter

            '''
        
        return prog_start
    
    def flesh_start_of_node(self, n : int) -> str:
        '''
            returns code to store node n in output array
            and increment output counter
        '''

        # already have start of program for node 0
        if(n == 0):
            code = ''''''
        else:
            code = '''

            {i}: '''.format(i = n)

        code += '''
            ; store node label in output array
            %index_{i} = load i32, i32* %counter
            %output_{i} = load i32*, i32** %output
            %output_{i}_ptr = getelementptr inbounds i32, i32* %output_{i}, i32 %index_{i}
            store i32 {i}, i32* %output_{i}_ptr

            ; increment counter
            %temp_{i}_1 = add i32 %index_{i}, 1
            store i32 %temp_{i}_1, i32* %counter
        '''.format(i = n)

        return code

    def flesh_exit_node(self, n : int) -> str:
        '''
            returns code for node n with no successors
            (exit node). note there can be multiple exit nodes
            so no return statement is included here
        '''
        code = '''
            '''
        
        return code

    def flesh_unconditional_node(self, n : int) -> str:
        '''
            returns code for node n with single successor
        '''

        code = '''
            br label %{successor}
        '''.format(successor = list(self.graph.adj[n])[0])

        return code

    def flesh_conditional_node(self, n : int) -> str:
        ''' 
            returns code for node n with two successors, one of
            which may be self (e.g. in case of loop)
            note this does not deal with switch statements where
            there are > 2 successor nodes
        '''
        code = '''
            ; get directions for node
            %index_dir_{i} = load i32, i32* %dir_counter
            %dir_{i} = load i32*, i32** %directions
            %dir_{i}_ptr = getelementptr inbounds i32, i32* %dir_{i}, i32 %index_dir_{i}
            %dir_{i}_value = load i32, i32* %dir_{i}_ptr

            ; increment directions counter
            %temp_{i}_2 = add i32 %index_dir_{i}, 1
            store i32 %temp_{i}_2, i32* %dir_counter

            ; branch
            %condition_{i} = icmp eq i32 %dir_{i}_value, 0
            br i1 %condition_{i}, label %{successor_false}, label %{successor_true}
            '''.format(i = n,
                       successor_false = list(self.graph.adj[n])[0],
                       successor_true = list(self.graph.adj[n])[1])
        
        return code

    def save_llvm_to_file(self, filename : str) -> bool:
        ''' 
            writes CFG to given file in LLVM IR 
            returns true if file write is successful
            false otherwise
        '''
        print(self.fleshed_graph)

        file = open(filename, "w")
        file.write(self.fleshed_graph)
        file.close()

        return True

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

            (current_node, dir) = self.choose_next_node(current_node, path, rand)

            path.expected_output.append(current_node)
            
            if dir is not None:
                path.directions.append(dir)

        # if we are not at exit node, then find shortest distance to exit
        if(self.successors(current_node) != 0):
            (shortest_path_to_exit, dirs_to_exit) = self.find_shortest_path_to_exit(current_node, path)
            path.expected_output += shortest_path_to_exit
            path.directions += dirs_to_exit

        return path
    
    def successors(self, current_node) -> int:
        '''
            returns the number of successors for current_node 
        '''
        return len(list(self.graph.adj[current_node]))
    
    def choose_next_node(self, current_node, path, rand) -> tuple[int, int]:
        '''
            randomly chooses next node and returns a 
            tuple (node, direction)
        '''

        if(self.successors(current_node) == 1):

            return (list(self.graph.adj[current_node])[0], None)
        
        else:

            rand_num = rand.random()

            if(rand_num < 0.5):
                node = list(self.graph.adj[current_node])[0]
                dir = 0
            
            else:
                node = list(self.graph.adj[current_node])[1]
                dir = 1

        return (node, dir)
            

    def find_shortest_path_to_exit(self, current_node, path) -> tuple[list[int], list[int]]:
        '''
            finds shortest path to exit and adds it to path
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
            also edits directions array to add the directions to the exit
        '''
        if start == end:
            return [end]
        
        path = []
        dirs = [] 

        while parents[end] is not None:

            path.append(end)

            if directions[end] is not None:
                dirs.append(directions[end])

            end = parents[end]

        return (path[::-1], dirs[::-1])
            








        
       



