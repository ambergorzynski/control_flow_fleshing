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

            elif(n_successors > 2):
                self.fleshed_graph += self.flesh_switch_node(n, n_successors)


        # end code with return statement
        self.fleshed_graph += '''
        ret void
        }'''

        return self.fleshed_graph
    
    def flesh_program_start(self) -> str:

        prog_start = '''

        ; 

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
    
    def flesh_switch_node(self, n : int, n_successors : int) -> str:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
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

            ; switch
            switch i32 %dir_{i}_value, label %{default} [ 
            '''.format(i = n,
                       default = list(self.graph.adj[n])[0])
        
        for j in range(n_successors):
             code += ''' i32 {i}, label %{successor}
            '''.format(i = j,
                       successor = list(self.graph.adj[n])[j])
        
        
        code += ''']''' 
        
        return code
                

    def save_llvm_to_file(self, filename : str) -> bool:
        ''' 
            writes CFG to given file in LLVM IR 
            returns true if file write is successful
            false otherwise
        '''

        file = open(filename, "w")
        file.write(self.fleshed_graph)
        file.close()

        return True
    
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
                print("node:")
                print(current_node)
                doomed.append(node)
                print("doomed:")
                print(doomed)
                print("successors:")
                print(list(self.graph.successors(current_node)))
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
                if child != n and visited[n] == False:
                    q.put(n)
                    visited[n] = True

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
            








        
       



