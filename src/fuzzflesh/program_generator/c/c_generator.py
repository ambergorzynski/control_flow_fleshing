from typing import List 
from pathlib import Path

from fuzzflesh.common.utils import InstructionBlock, Lang
from fuzzflesh.program_generator.flesher import ProgramFlesher
from fuzzflesh.cfg import CFG

class CProgramGenerator(ProgramFlesher):

    def __init__(self, cfg : CFG, dirs_known_at_compile : bool = False):
        super(CProgramGenerator, self).__init__(cfg, dirs_known_at_compile)

    @property
    def language(self):
        return Lang.C

    def flesh_program_start(self) -> InstructionBlock:

        """
            Sets up the program start in which the directions
            array is dynamically passed to the function. 
        """

        code = ''' 
        void run_cfg(int* actual_output, int* directions) {

        block_0:
            // set up counters
            int dir_counter = 0;
            int out_counter = 0;
        '''

        return [InstructionBlock(code)]
    
    def flesh_program_start_with_dirs(self, directions : List[int]) -> List[InstructionBlock]:

        """
            Sets up the program start in which the directions
            array is statically known. This version codes the array via a 
            simple int array that is initialised at the beginning of the program.
        """


        l = len(directions)
        constant = 'const ' if self.dirs_known_at_compile else ''

        code = ''' 
        void run_cfg(int* actual_output) {{

        block_0:
            // set up counters
            int dir_counter = 0;
            int out_counter = 0;
            
            // set up directions array
            {const}int directions[{dir_size}]={{'''.format(const = constant, dir_size = l)

        #fill in directions array
        for i, d in enumerate(directions):
            code += '''{dir},'''.format(dir=d)

        # remove final comma and close bracket
        code = code[:-1]
        code += '};'
        
        return [InstructionBlock(code)]

    def flesh_start_of_node(self, n : int) -> InstructionBlock:
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

        return InstructionBlock(code)

    def flesh_exit_node(self, n : int) -> InstructionBlock:
        '''
            returns code for node n with no successors
            (exit node).
        '''
        
        code = '''
            return;
        '''
        
        return InstructionBlock(code)

    def flesh_unconditional_node(self, n : int) -> InstructionBlock:
        '''
            returns code for node n with single successor
        '''

        code = '''
            goto block_{successor};
        '''.format(successor = list(self.cfg.graph.adj[n])[0])

        return InstructionBlock(code)

    def flesh_conditional_node(self, n : int) -> InstructionBlock:
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
        
        return InstructionBlock(code)
    
    
    def flesh_switch_node(self, n : int, n_successors : int) -> InstructionBlock:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
        '''

        code = '''
            switch(directions[dir_counter++]){'''
        
        for child in range(n_successors):
             code += '''
                case {i}: goto block_{successor}; break;'''.format(i = child,
                       successor = list(self.cfg.graph.adj[n])[child])
        
        
        code += '''}''' 
        
        return InstructionBlock(code)
    
                
    def flesh_program_end(self) -> InstructionBlock:
        code = '''
        }'''

        return InstructionBlock(code)
