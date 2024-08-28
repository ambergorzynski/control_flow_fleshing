from typing import List 
from pathlib import Path

from fuzzflesh.common.utils import InstructionBlock, Lang
from fuzzflesh.program_generator.flesher import ProgramFlesher
from fuzzflesh.cfg import CFG

class JavaProgramGenerator(ProgramFlesher):

    def __init__(self, cfg : CFG, dirs_known_at_compile : bool = False, _reflection : bool = False):
        super(JavaProgramGenerator, self).__init__(cfg, dirs_known_at_compile)
        self.program_number : int = 0
        self.reflection = _reflection

    @property
    def language(self):
        return Lang.JAVA

    def increment_program_number(self) -> None:
        self.program_number += 1

    def flesh_program_start(self) -> List[InstructionBlock]:
        if self.reflection:         
            code = '''package testing;

class TestCase implements TestCaseInterface {
    int dirs[];
    int dirsIndex;
    int actualOutput[];
    int outputIndex;

    // default constructor
    public TestCase() {}

    @Override
    public void testCase(int dirs[], int actualOutput[]) {
        this.dirs = dirs; // direction not known at compile time
        this.dirsIndex = 0;
        this.actualOutput = actualOutput;
        this.outputIndex = 0;

        block_0(); // call starting block
    }

'''

        else:
            code = '''class TestCase {
    int dirs[];
    int dirsIndex;
    int actualOutput[];
    int outputIndex;

    // default constructor
    public TestCase() {}

    public void testCase(int dirs[], int actualOutput[]) {
        this.dirs = dirs; // direction not known at compile time
        this.dirsIndex = 0;
        this.actualOutput = actualOutput;
        this.outputIndex = 0;

        block_0(); // call starting block
    }

'''

        return [InstructionBlock(code)]

    def flesh_program_start_with_dirs(self, directions : list[int]) -> List[InstructionBlock]:
        dirs = '''// direction known at compile time
        this.dirs = new int []{'''

        # fill out directions array
        for i, d in enumerate(directions):
            dirs += '''
            {direction},'''.format(direction = d)
        
        dirs += '''
        };'''

        if self.reflection:         
            code = '''package testing;

class TestCase implements TestCaseInterface {{
    int dirs[];
    int dirsIndex;
    int actualOutput[];
    int outputIndex;

    // default constructor
    public TestCase() {{}}

    @Override
    public void testCase(int dirs[], int actualOutput[]) {{
        {dirs}

        this.dirsIndex = 0;
        this.actualOutput = actualOutput;
        this.outputIndex = 0;

        block_0(); // call starting block
    }}

'''.format(dirs = dirs)

        else:
            code = '''class TestCase {{
    int dirs[];
    int dirsIndex;
    int actualOutput[];
    int outputIndex;

    // default constructor
    public TestCase() {{}}

    public void testCase(int dirs[], int actualOutput[]) {{
        {dirs}

        this.dirsIndex = 0;
        this.actualOutput = actualOutput;
        this.outputIndex = 0;

        block_0(); // call starting block
    }}

'''.format(dirs = dirs)
        return [InstructionBlock(code)]

    def get_program_number(self) -> int:
        num = self.program_number
        self.increment_program_number
        return num

    def flesh_start_of_node(self, n : int) -> InstructionBlock:
        # Double {{ for escaping
        code = '''    void block_{i}() {{
        actualOutput[outputIndex++] = {i};
'''.format(i = n)

        return InstructionBlock(code)

    def flesh_exit_node(self, n : int) -> str:
        '''
            returns code for node n with no successors
            (exit node).
        '''
        
        code = '''        return; // exit node
    }
'''

        return InstructionBlock(code)

    def flesh_unconditional_node(self, n : int) -> InstructionBlock:
        '''
            returns code for node n with single successor
        '''

        code = '''        block_{successor}(); // unconditional node
    }}
'''.format(successor = list(self.cfg.graph.adj[n])[0])

        return InstructionBlock(code)

    def flesh_conditional_node(self, n : int) -> InstructionBlock:
        ''' 
            returns code for node n with two successors, one of
            which may be self (e.g. in case of loop)
            note this does not deal with switch statements where
            there are > 2 successor nodes
        '''

        code = '''        int dir = dirs[dirsIndex++];

        // conditional node
        if (dir == 0) {{
            block_{successor_true}();
        }} else {{
            block_{successor_false}();
        }}
    }}
'''.format(successor_false = list(self.cfg.graph.adj[n])[1], successor_true = list(self.cfg.graph.adj[n])[0])
        
        return InstructionBlock(code)

    def flesh_switch_node(self, n : int, n_successors : int) -> InstructionBlock:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
        '''

        code = '''        int dir = dirs[dirsIndex++];

        // switch node
        switch (dir) {
'''
        
        for j in range(n_successors):
             code += '''            case {i}: block_{successor}(); break;
'''.format(i = j, successor = list(self.cfg.graph.adj[n])[j])
        
        
        code += '''            default: block_{default}();
        }}
    }}
'''.format(default = list(self.cfg.graph.adj[n])[0])
        
        return InstructionBlock(code)
    
    def flesh_program_end(self) -> InstructionBlock:
        return InstructionBlock('''}
''')
