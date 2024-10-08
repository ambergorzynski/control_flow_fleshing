from typing import List 
from pathlib import Path

from fuzzflesh.common.utils import InstructionBlock, Lang
from fuzzflesh.program_generator.flesher import ProgramFlesher
from fuzzflesh.cfg import CFG

class CILProgramGenerator(ProgramFlesher):

    def __init__(self, cfg : CFG, 
                 dirs_known_at_compile : bool = False):
        super(CILProgramGenerator, self).__init__(cfg, dirs_known_at_compile)
    
    @property
    def language(self):
        return Lang.CIL
    
    def flesh_program_start(self, prog_number=None) -> List[InstructionBlock]:
        code = """.assembly extern mscorlib
{{
  .ver 4:0:0:0
  .publickeytoken = (B7 7A 5C 56 19 34 E0 89 ) // .z\V.4..
}}
.assembly 'run_cfg_{i}'
{{
  .custom instance void class [mscorlib]System.Runtime.CompilerServices.CompilationRelaxationsAttribute::'.ctor'(int32) =  (01 00 08 00 00 00 00 00 ) // ........

  .custom instance void class [mscorlib]System.Runtime.CompilerServices.RuntimeCompatibilityAttribute::'.ctor'() =  (
		01 00 01 00 54 02 16 57 72 61 70 4E 6F 6E 45 78   // ....T..WrapNonEx
		63 65 70 74 69 6F 6E 54 68 72 6F 77 73 01       ) // ceptionThrows.

  .custom instance void class [mscorlib]System.Diagnostics.DebuggableAttribute::'.ctor'(valuetype [mscorlib]System.Diagnostics.DebuggableAttribute/DebuggingModes) =  (01 00 07 01 00 00 00 00 ) // ........

  .hash algorithm 0x00008004
  .ver  0:0:0:0
}}
.module run_cfg_{i}.exe 

  .class private auto ansi beforefieldinit run_cfg_{i}
  	extends [mscorlib]System.Object
  {{

    // main
    .method public static hidebysig 
           default void Main (string[] args)  cil managed 
    {{
	.entrypoint
	.maxstack 8
	IL_0000:  nop 
	IL_0001:  ret 
    }}
       
	// default constructor
    .method public hidebysig specialname rtspecialname 
           instance default void '.ctor' ()  cil managed 
    {{
	.maxstack 8
	IL_0000:  ldarg.0 
	IL_0001:  call instance void object::'.ctor'()
	IL_0006:  nop 
	IL_0007:  ret 
    }}

    // test case method
	.method public hidebysig 
           instance default void callTest (int32[] dir, int32[]& output)  cil managed 
    {{
	
	.maxstack 5
	.locals init(
		int32	V_0, // directions counter
		int32	V_1	// output counter
	)

    block_0:

        // initialise counters
        ldc.i4.0
        stloc.0		// set local var 0 to 0
        ldc.i4.0
        stloc.1		// set local var 1 to 0
        
""".format(i = prog_number)
        
        return [InstructionBlock(code)]

    def flesh_program_start_with_dirs(self, dirs: List[int]) -> List[InstructionBlock]:
        #TODO: implement
        return super().flesh_program_start_with_dirs(dirs)
    
    def flesh_start_of_node(self, n : int) -> InstructionBlock:
        
        if(n == 0):
            code = ''''''
        else:
            code = '''

    block_{i}: '''.format(i = n)

        code += '''
        // store node label in output array
        ldarg.2
        ldind.ref
        ldloc.1
        ldc.i4 {i}
        stelem.i4

        // increment output counter
        ldloc.1
        ldc.i4.1
        add
        stloc.1

    '''.format(i = n)

        return InstructionBlock(code)


    def flesh_exit_node(self, n : int) -> InstructionBlock:
        '''
            returns code for node n with no successors
            (exit node).
        '''
        
        code = '''
    ret
        '''
        
        return InstructionBlock(code)


    def flesh_unconditional_node(self, n : int) -> InstructionBlock:
        '''
            returns code for node n with single successor
        '''

        code = '''
        br block_{successor}
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
        // push node direction
        ldarg.1
        ldloc.0
        ldelem.i4

        // increment directions counter
        ldloc.0
        ldc.i4.1
        add
        stloc.0

        // branch
        ldc.i4.0
        ceq
        brfalse block_{successor_false}
        br block_{successor_true}
                    '''.format(i = n,
                       successor_false = list(self.cfg.graph.adj[n])[1],
                       successor_true = list(self.cfg.graph.adj[n])[0])
        
        return InstructionBlock(code)

    def flesh_switch_node(self, n: int, n_successors : int) -> InstructionBlock:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
        '''
        code = '''
        // get directions for node
        ldarg.1
        ldloc.0
        ldelem.i4

        // increment directions counter
        ldloc.0
        ldc.i4.1
        add
        stloc.0

        // switch
        switch ('''
        
        for j in range(n_successors):
             code += '''
        block_{successor}'''.format(successor = list(self.cfg.graph.adj[n])[j])
             
             if j == (n_successors - 1):
                 code += ''')'''
             else:
                 code += ''','''
        
        # default block
        code += '''
        br block_{default}'''.format(
                       default = list(self.cfg.graph.adj[n])[0])
        
        return InstructionBlock(code)

    def flesh_program_end(self) -> InstructionBlock:
        code = '''
    }
}'''
        return InstructionBlock(code)

