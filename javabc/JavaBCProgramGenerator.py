from CFG import CFG
from ProgramGenerator import ProgramGenerator

class JavaBCProgramGenerator(ProgramGenerator):

    def __init__(self, dirs_known_at_compile : bool = False):
        self.dirs_known_at_compile : bool = dirs_known_at_compile


    def fleshout_no_reflection(self, cfg : CFG, prog_number=None):

        ''' 
            converts control flow graph to LLVM IR 
            returns str containing LLVM IR program
            and saves as member variable
        '''

        # clear previously stored graph
        self.fleshed_graph = None
        self.cfg = cfg

        # all programs have common start
        self.fleshed_graph = self.flesh_program_start_no_reflection()

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

    def fleshout_dirs_known(self, cfg : CFG, directions : list[int]):

        ''' 
            converts control flow graph to LLVM IR 
            returns str containing LLVM IR program
            and saves as member variable
        '''

        # clear previously stored graph
        self.fleshed_graph = None
        self.cfg = cfg

        # all programs have common start
        self.fleshed_graph = self.flesh_program_start_known_dirs(directions)

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

    def flesh_program_start_no_reflection(self) -> str:
        code = '''
.class public TestCase
.super java/lang/Object

; default constructor
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

.method public testCase([I[I)V
    .limit stack 5
    .limit locals 5

block_0:
    ; set up counter in local variable 3
    iconst_0
    istore_3

    ; set up directions counter in local variable 4
    iconst_0
    istore 4    
'''

        return code       
    
    def flesh_program_start_known_dirs(self, directions : list[int]) -> str:

        code = '''
.class public TestCase
.super java/lang/Object

; default constructor
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

.method public testCase([I[I)V
    .limit stack 5
    .limit locals 6

block_0:
    ; set up directions array in local variable 5
    bipush {dir_length}
    newarray int

'''.format(dir_length=len(directions))
        # fill out directions array
        for i, d in enumerate(directions):
            code += '''
    dup
    bipush {index}
    bipush {direction}
    iastore
'''.format(index = i, direction = d)

        code += '''
    ; store array ref in local variable 5
    astore 5

    ; set up counter in local variable 3
    iconst_0
    istore_3

    ; set up directions counter in local variable 4
    iconst_0
    istore 4    
'''

        return code       

    def flesh_program_start(self, prog_number : int) -> str:
        code = '''
.class public testing.TestCase{i}
.super java/lang/Object
.implements testing.TestCaseInterface

; default constructor
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

.method public testCase([I[I)V
    .limit stack 5
    .limit locals 5

block_0:
    ; set up counter in local variable 3
    iconst_0
    istore_3

    ; set up directions counter in local variable 4
    iconst_0
    istore 4    
'''.format(i = prog_number)

        return code

    def flesh_start_of_node(self, n : int) -> str:
        
        if(n == 0):
            code = ''''''
        else:
            code = '''

block_{i}: '''.format(i = n)

        code += '''
    ; store node label in output array
    aload_2
    iload_3
    sipush {i}
    iastore

    ; increment counter
    iinc 3 1
'''.format(i = n)

        return code

    def flesh_exit_node(self, n : int) -> str:
        '''
            returns code for node n with no successors
            (exit node).
        '''
        
        code = '''
    return
        '''
        
        return code

    def flesh_unconditional_node(self, n : int) -> str:
        '''
            returns code for node n with single successor
        '''

        code = '''
    goto block_{successor}
        '''.format(successor = list(self.cfg.graph.adj[n])[0])

        return code

    def flesh_conditional_node(self, n : int) -> str:
        ''' 
            returns code for node n with two successors, one of
            which may be self (e.g. in case of loop)
            note this does not deal with switch statements where
            there are > 2 successor nodes
        '''

        # directions array stored in different local variable 
        # depending on whether they are known at compile time or not
        #TODO: switch dir and output in passing function so dirs is always var 2
        dir_local_var = 5 if self.dirs_known_at_compile else 1

        code = '''
    ; get directions for node
    aload_{dir_local_var}
    iload 4
    iaload

    ; increment directions counter
    iinc 4 1

    ; branch
    ifeq block_{successor_true}
    goto block_{successor_false}
            '''.format(dir_local_var = dir_local_var,
                       successor_false = list(self.cfg.graph.adj[n])[1],
                       successor_true = list(self.cfg.graph.adj[n])[0])
        
        return code

    def flesh_switch_node(self, n: int, n_successors : int) -> str:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
        '''

        dir_local_var = 5 if self.dirs_known_at_compile else 1

        code = '''
    ; get directions for node
    aload_{dir_local_var}
    iload 4
    iaload

    ; increment directions counter
    iinc 4 1

    ; switch
    lookupswitch'''.format(dir_local_var=dir_local_var)
        
        for j in range(n_successors):
             code += '''
        {i}: block_{successor}'''.format(i = j,
                       successor = list(self.cfg.graph.adj[n])[j])
        
        
        code += '''
        default : block_{default}'''.format(
                       default = list(self.cfg.graph.adj[n])[0])
        
        return code
    
    def flesh_end(self) -> str:
        return '''
.end method'''
