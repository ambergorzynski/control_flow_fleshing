from typing import List 
from pathlib import Path

from fuzzflesh.common.utils import InstructionBlock, Lang
from fuzzflesh.program_generator.flesher import ProgramFlesher
from fuzzflesh.cfg import CFG

class JavaBCProgramGenerator(ProgramFlesher):

    def __init__(self, cfg : CFG, dirs_known_at_compile : bool = False, _reflection : bool = False):
        super(JavaBCProgramGenerator, self).__init__(cfg, dirs_known_at_compile)
        self.program_number : int = 0

        if dirs_known_at_compile:
            self.directions_array : int = 4
            self.output_array : int = 1
            self.output_index : int = 2
            self.dir_index : int = 3
        else:
            self.directions_array : int = 1
            self.output_array : int = 2
            self.output_index : int = 3
            self.dir_index : int = 4

        self.reflection = _reflection
        self.dirs_known = dirs_known_at_compile

    @property
    def language(self):
        return Lang.JAVABC

    def increment_program_number(self) -> None:
        self.program_number += 1

    def flesh_program_start(self) -> List[InstructionBlock]:

        code_name = self.get_program_name()

        code_setup = self.get_program_setup()

        return [code_name, code_setup]

    def flesh_program_start_with_dirs(self, directions : list[int]) -> List[InstructionBlock]:

        code_start = self.flesh_program_start()

        code = '''
    ; set up directions array 

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
    ; store array ref in local variable {dirs}
    astore {dirs}
   
'''.format(dirs=self.directions_array)

        code_start.append(InstructionBlock(code))
        
        return code_start

    def get_program_name(self) -> str:

        if self.reflection:
            
            code = '''
.class public testing.TestCase
.super java/lang/Object
.implements testing.TestCaseInterface
'''.format(i = self.get_program_number())

        else:
            code = '''
.class public TestCase
.super java/lang/Object
'''
        return InstructionBlock(code)

    def get_program_number(self) -> int:
        num = self.program_number
        self.increment_program_number
        return num

    def get_program_setup(self) -> InstructionBlock:

        fn_signature = '[I' if self.dirs_known_at_compile else '[I[I'

        code = '''
; default constructor
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

.method public testCase({fn_signature})V
    .limit stack 5
    .limit locals 6

block_0:
    ; set up counter in local variable {counter}
    iconst_0
    istore_{counter}

    ; set up directions counter in local variable {dirs_counter}
    iconst_0
    istore {dirs_counter}  
'''.format(counter=self.output_index, 
        dirs_counter=self.dir_index,
        fn_signature=fn_signature)

        return InstructionBlock(code)  


    def flesh_start_of_node(self, n : int) -> InstructionBlock:
        
        if(n == 0):
            code = ''''''
        else:
            code = '''

block_{i}: '''.format(i = n)

        code += '''
    ; store node label in output array
    aload_{output_array}
    iload_{output_index}
    sipush {i}
    iastore

    ; increment counter
    iinc {output_index} 1
'''.format(i = n,
        output_array=self.output_array,
        output_index=self.output_index)

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

    def flesh_unconditional_node(self, n : int) -> InstructionBlock:
        '''
            returns code for node n with single successor
        '''

        code = '''
    goto block_{successor}
        '''.format(successor = list(self.cfg.graph.adj[n])[0])

        return InstructionBlock(code)

    def flesh_conditional_node(self, n : int) -> InstructionBlock:
        ''' 
            returns code for node n with two successors, one of
            which may be self (e.g. in case of loop)
            note this does not deal with switch statements where
            there are > 2 successor nodes
        '''

        # directions array stored in different local variable 
        # depending on whether they are known at compile time or not

        code = '''
    ; get directions for node
    aload {dir_array}
    iload {dir_index}
    iaload

    ; increment directions counter
    iinc {dir_index} 1

    ; branch
    ifeq block_{successor_true}
    goto block_{successor_false}
            '''.format(dir_array = self.directions_array,
                        dir_index = self.dir_index,
                        successor_false = list(self.cfg.graph.adj[n])[1],
                        successor_true = list(self.cfg.graph.adj[n])[0])
        
        return InstructionBlock(code)

    def flesh_switch_node(self, n : int, n_successors : int) -> InstructionBlock:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
        '''

        code = '''
    ; get directions for node
    aload {dir_array}
    iload {dir_index}
    iaload

    ; increment directions counter
    iinc {dir_index} 1

    ; switch
    lookupswitch'''.format(dir_array = self.directions_array,
                        dir_index = self.dir_index)
        
        for j in range(n_successors):
             code += '''
        {i}: block_{successor}'''.format(i = j,
                       successor = list(self.cfg.graph.adj[n])[j])
        
        
        code += '''
        default : block_{default}'''.format(
                       default = list(self.cfg.graph.adj[n])[0])
        
        return InstructionBlock(code)
    
    def flesh_program_end(self) -> InstructionBlock:
        return InstructionBlock('''
.end method''')
