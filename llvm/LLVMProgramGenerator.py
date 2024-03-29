from CFG import CFG
from ProgramGenerator import ProgramGenerator
from llvm.Utils import *
from typing import List

class LLVMProgramGenerator(ProgramGenerator):

    def __init__(self, params : FuzzingParams):
        self.params = params
        self.cfg = None
        self.fleshed_graph = None

    def fleshout(self, cfg : CFG, directions : List[int] = None) -> str:

        ''' 
            converts control flow graph to LLVM IR 
            returns str containing LLVM IR program
        '''

        self.cfg = cfg
        self.fleshed_graph = None

        # all programs have common start
        self.fleshed_graph = self.flesh_program_start(directions)

        for n in cfg.graph:

            # store node label in output array for every node visited
            self.fleshed_graph += self.flesh_start_of_node(n)

            # write remaining block code based on number of successor nodes
            n_successors = self.cfg.successors(n)

            if(n_successors == 0):
                self.fleshed_graph += self.flesh_exit_node(n)
            
            elif(n_successors == 1):
                self.fleshed_graph += self.flesh_unconditional_node(n)

            elif(n_successors == 2):
                self.fleshed_graph += self.flesh_conditional_node(n, directions)

            elif(n_successors > 2):
                self.fleshed_graph += self.flesh_switch_node(n, n_successors, directions)

        # add closing phrase to program
        self.fleshed_graph += self.flesh_end()

        return self.fleshed_graph
    
    def flesh_program_start(self, directions : List[int]):

        if self.params.directions.value == Directions.DYNAMIC.value:
            return self.flesh_program_start_dynamic()

        elif self.params.directions.value == Directions.STATIC_ARR.value:
            return self.flesh_program_start_static_arr(directions)
        
        elif self.params.directions.value == Directions.STATIC_PTR.value:
            return self.flesh_program_start_static(directions)
        
     

    def flesh_conditional_node(self, n : int, directions : List[int]):

        #TODO: make 'get directions' function that is static or dynamic; the branching condition is the same 
        # for conditional and switch, so can extract this
        
        if self.params.directions.value == Directions.DYNAMIC.value or self.params.directions.value == Directions.STATIC_PTR.value:
            return self.flesh_conditional_node_dynamic(n)
        
        elif self.params.directions.value == Directions.STATIC_ARR.value:
            return self.flesh_conditional_node_static(n, dir_size=len(directions))

    def flesh_switch_node(self, n : int, n_successors : int, directions : List[int]):
        
        if self.params.directions.value == Directions.DYNAMIC.value or self.params.directions.value == Directions.STATIC_PTR.value:
            return self.flesh_switch_node_dynamic(n, n_successors)
        
        elif self.params.directions.value == Directions.STATIC_ARR.value:
            return self.flesh_switch_node_static(n, n_successors, dir_size=len(directions))

    """
    def fleshout_static(self, cfg: CFG, directions: List[int]) -> str:

        '''
            converts control flow graph to LLVM IR 
            returns str containing LLVM IR program
            and saves as member variable
        '''

        # clear previously stored graph
        self.fleshed_graph = None
        self.cfg = cfg

        # all programs have common start
        self.fleshed_graph = self.flesh_program_start_static(directions)

        for n in self.cfg.graph:

            # store node label in output array for every node visited
            self.fleshed_graph += self.flesh_start_of_node(n)

            # write remaining block code based on number of successor nodes
            n_successors = self.cfg.successors(n)

            if(n_successors == 0):
                self.fleshed_graph += self.flesh_exit_node(n)
            
            elif(n_successors == 1):
                self.fleshed_graph += self.flesh_unconditional_node(n)

            elif(n_successors == 2):
                self.fleshed_graph += self.flesh_conditional_node(n)

            elif(n_successors > 2):
                self.fleshed_graph += self.flesh_switch_node(n, n_successors)

        # add closing phrase to program
        self.fleshed_graph += self.flesh_end()

        return self.fleshed_graph
    """

    def flesh_program_start_static_arr(self, directions : List[int]) -> str:

        """
            Sets up the program start in which the directions
            array is statically known. This version codes the array via a 
            simple int array that is initialised at the beginning of the program.
        """


        l = len(directions)

        prog_start = ''' ; 


        define void @_Z7run_cfgPi(i32* %in_output) #0 {{

        0:
            ; create array to store output
            %output = alloca i32*
            store i32* %in_output, i32** %output

            %counter = alloca i32
            store i32 0, i32* %counter

            %dir_counter = alloca i32
            store i32 0, i32* %dir_counter;

            ; set up direction array and pointer
            %dirs = alloca [{dir_size} x i32]
        '''.format(dir_size = l)

        #fill in directions array
        for i, d in enumerate(directions):
            prog_start += '''
            %v{index}_1 = getelementptr inbounds [{dir_size} x i32], [{dir_size} x i32]* %dirs, i64 0, i64 {index}
            store i32 {dir}, i32* %v{index}_1
        '''.format(index=i, dir_size = l, dir=d)
        
        return prog_start
    
    def flesh_program_start_static(self, directions : List[int]) -> str:

        """
            Sets up the program start in which the directions
            array is statically known. This version codes the array via a 
            pointer; it is the closes to the dynamically passed array version. 
            TODO Set up alternative statically known array that is a simple int 
            array rather than pointer (will require changing how the directions
            are referenced in the rest of the IR program)
            TODO Set up alternative statically known array that is a const array, 
            which will also require changes to the access in later parts 
        """

        l = len(directions)

        prog_start = ''' ; 


        define void @_Z7run_cfgPi(i32* %in_output) #0 {{

        0:
            ; create array to store output
            %output = alloca i32*
            store i32* %in_output, i32** %output

            %counter = alloca i32
            store i32 0, i32* %counter

            %dir_counter = alloca i32
            store i32 0, i32* %dir_counter;

            ; set up direction array and pointer
            %index_a = alloca i32
            %dirs = alloca [{dir_size} x i32]
            %directions = alloca [{dir_size} x i32]

            ; point directions ptr at directions
            store i32 0, i32* %index_a
            %var_0_0 = getelementptr inbounds [{dir_size} x i32], [{dir_size} x i32]* %dirs, i64 0, i64 0
            store i32* %var_0_0, i32** %directions

        '''.format(dir_size = l)

        #fill in directions array
        for i, d in enumerate(directions):
            prog_start += '''
            %v{index}_1 = load i32*, i32** %directions
            %v{index}_2 = getelementptr inbounds i32, i32* %v{index}_1, i64 {index}
            store i32 {dir}, i32* %v{index}_2
        '''.format(index=i, dir=d)
        
        
        return prog_start
    
    def flesh_program_start_dynamic(self) -> str:

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
            (exit node).
        '''
        
        code = '''
            ret void
        '''
        
        return code

    def flesh_unconditional_node(self, n : int) -> str:
        '''
            returns code for node n with single successor
        '''

        code = '''
            br label %{successor}
        '''.format(successor = list(self.cfg.graph.adj[n])[0])

        return code

    def flesh_conditional_node_dynamic(self, n : int) -> str:
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
            br i1 %condition_{i}, label %{successor_true}, label %{successor_false}
            '''.format(i = n,
                       successor_false = list(self.cfg.graph.adj[n])[1],
                       successor_true = list(self.cfg.graph.adj[n])[0])
        
        return code
    

    def flesh_conditional_node_static(self, n : int, dir_size : int) -> str:
        ''' 
            returns code for node n with two successors, one of
            which may be self (e.g. in case of loop)
            note this does not deal with switch statements where
            there are > 2 successor nodes
        '''
        code = '''
            ; get directions for node
            %index_dir_{i} = load i32, i32* %dir_counter
            %dir_{i} = sext i32 %index_dir_{i} to i64
            %dir_{i}_ptr = getelementptr inbounds [{dir_size} x i32], [{dir_size} x i32]* %dirs, i64 0, i64 %dir_{i}
            %dir_{i}_value = load i32, i32* %dir_{i}_ptr

            ; increment directions counter
            %temp_{i}_2 = add i32 %index_dir_{i}, 1
            store i32 %temp_{i}_2, i32* %dir_counter

            ; branch
            %condition_{i} = icmp eq i32 %dir_{i}_value, 0
            br i1 %condition_{i}, label %{successor_true}, label %{successor_false}
            '''.format(i = n,
                       dir_size = dir_size,
                       successor_false = list(self.cfg.graph.adj[n])[1],
                       successor_true = list(self.cfg.graph.adj[n])[0])
        
        return code
    
    def flesh_switch_node_dynamic(self, n : int, n_successors : int) -> str:
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
                       default = list(self.cfg.graph.adj[n])[0])
        
        for j in range(n_successors):
             code += ''' i32 {i}, label %{successor}
            '''.format(i = j,
                       successor = list(self.cfg.graph.adj[n])[j])
        
        
        code += ''']''' 
        
        return code
    
    def flesh_switch_node_static(self, n : int, n_successors : int, dir_size : int) -> str:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
        '''
        code = '''
            ; get directions for node
            %index_dir_{i} = load i32, i32* %dir_counter
            %dir_{i} = sext i32 %index_dir_{i} to i64
            %dir_{i}_ptr = getelementptr inbounds [{dir_size} x i32], [{dir_size} x i32]* %dirs, i64 0, i64 %dir_{i}
            %dir_{i}_value = load i32, i32* %dir_{i}_ptr

            ; increment directions counter
            %temp_{i}_2 = add i32 %index_dir_{i}, 1
            store i32 %temp_{i}_2, i32* %dir_counter

            ; switch
            switch i32 %dir_{i}_value, label %{default} [ 
            '''.format(i = n,
                       dir_size = dir_size,
                        default = list(self.cfg.graph.adj[n])[0])
        
        for j in range(n_successors):
            code += ''' i32 {i}, label %{successor}
            '''.format(i = j,
                    successor = list(self.cfg.graph.adj[n])[j])
        
        
        code += ''']''' 
        
        return code
                
    def flesh_end(self) -> str:
        return '''
        }'''

