from CFG import CFG
from ProgramGenerator import ProgramGenerator
from Utils import *

class CProgramGenerator(ProgramGenerator):

    def __init__(self, params : FuzzingParams):
        self.params = params
        self.cfg = None
        self.fleshed_graph = None

    def fleshout(self, cfg : CFG, directions : list[int] = None) -> str:

        ''' 
            converts control flow graph to C 
            returns str containing C program
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
                self.fleshed_graph += self.flesh_conditional_node(n)

            elif(n_successors > 2):
                self.fleshed_graph += self.flesh_switch_node(n, n_successors, directions)

        # add closing phrase to program
        self.fleshed_graph += self.flesh_end()

        return self.fleshed_graph
    
    def flesh_program_start(self, directions : list[int]):

        if self.params.directions.value == Directions.STATIC_ARR.value:
            return self.flesh_program_start_static_arr(directions)
    

    def flesh_conditional_node(self, n : int):
        if self.params.directions.value == Directions.STATIC_ARR.value:
            return self.flesh_conditional_node_static(n)

    def flesh_switch_node(self, n : int, n_successors : int, directions : list[int]):
        
        if self.params.directions.value == Directions.STATIC_ARR.value:
            return self.flesh_switch_node_static(n, n_successors)

    def flesh_program_start_static_arr(self, directions : list[int]) -> str:

        """
            Sets up the program start in which the directions
            array is statically known. This version codes the array via a 
            simple int array that is initialised at the beginning of the program.
        """


        l = len(directions)

        prog_start = ''' 
        void run_cfg(int* actual_output) {{

        block_0:
            // set up counters
            int dir_counter = 0;
            int out_counter = 0;
            
            // set up directions array
            int directions[{dir_size}]={{'''.format(dir_size = l)

        #fill in directions array
        for i, d in enumerate(directions):
            prog_start += '''{dir},'''.format(dir=d)

        # remove final comma and close bracket
        prog_start = prog_start[:-1]
        prog_start += '};'
        
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

            block_{i}: '''.format(i = n)

        code += '''
            // store visited node to output array
            actual_output[out_counter++] = {i};
        '''.format(i = n)

        return code

    def flesh_exit_node(self, n : int) -> str:
        '''
            returns code for node n with no successors
            (exit node).
        '''
        
        code = '''
            return;
        '''
        
        return code

    def flesh_unconditional_node(self, n : int) -> str:
        '''
            returns code for node n with single successor
        '''

        code = '''
            goto block_{successor};
        '''.format(successor = list(self.cfg.graph.adj[n])[0])

        return code

    def flesh_conditional_node_static(self, n : int) -> str:
        ''' 
            returns code for node n with two successors, one of
            which may be self (e.g. in case of loop)
            note this does not deal with switch statements where
            there are > 2 successor nodes
        '''
        code = '''
            if(directions[dir_counter++] == 0){{
                goto block_{successor_false};
            }}
            else{{
                goto block_{successor_true};
            }}
            '''.format(successor_false = list(self.cfg.graph.adj[n])[0],
                       successor_true = list(self.cfg.graph.adj[n])[1])
        
        return code
    
    
    def flesh_switch_node_static(self, n : int, n_successors : int) -> str:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
        '''
        pass
        code = '''
            switch(directions[dir_counter++]){'''
        
        for child in range(n_successors):
             code += '''
                case {i}: goto block_{successor}; break;'''.format(i = child,
                       successor = list(self.cfg.graph.adj[n])[child])
        
        
        code += '''}''' 
        
        return code
    
                
    def flesh_end(self) -> str:
        return '''
        }'''


    def save_to_file(self, filename : str) -> bool:
        ''' 
            writes CFG to given file 
            returns true if file write is successful
            false otherwise
        '''

        file = open(filename, "w")
        file.write(self.fleshed_graph)
        file.close()

        return True
