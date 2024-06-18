from typing import List 
from pathlib import Path

from fuzzflesh.program_generator.instruction_blocks import InstructionBlock
from fuzzflesh.program_generator.flesher import ProgramFlesher
from fuzzflesh.cfg import CFG

class JavaBCProgramGenerator(ProgramFlesher):

    def __init__(self, dirs_known_at_compile : bool = False):
        self.dirs_known_at_compile : bool = dirs_known_at_compile

    def flesh_program_start(self) -> InstructionBlock:
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
        return InstructionBlock(code)  
    
    def flesh_program_start_with_dirs(self, directions : list[int]) -> InstructionBlock:

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
    sipush {dir_length}
    newarray int

'''.format(dir_length=len(directions))
        # fill out directions array
        for i, d in enumerate(directions):
            code += '''
    dup
    sipush {index}
    sipush {direction}
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

        return InstructionBlock(code)       

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

        return InstructionBlock(code)

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

        return InstructionBlock(code)

    def flesh_exit_node(self, n : int) -> str:
        '''
            returns code for node n with no successors
            (exit node).
        '''
        
        code = '''
    return
        '''
        
        return InstructionBlock(code)

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
        
        return InstructionBlock(code)

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
        
        return InstructionBlock(code)
    
    def flesh_end(self) -> str:
        return InstructionBlock('''
.end method''')
