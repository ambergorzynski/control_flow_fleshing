from abc import ABC, abstractmethod
from CFG import CFG
import pickle

class ProgramGenerator(ABC):
    
    def __init__(self):
        self.fleshed_graph = None
        self.cfg = None

    def fleshout(self, cfg : CFG, prog_number=None):

        ''' 
            converts control flow graph to LLVM IR 
            returns str containing LLVM IR program
            and saves as member variable
        '''

        # clear previously stored graph
        self.fleshed_graph = None
        self.cfg = cfg

        # all programs have common start
        self.fleshed_graph = self.flesh_program_start(prog_number)

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
    
    @abstractmethod
    def flesh_program_start(self, prog_number=None) -> str:
        pass

    @abstractmethod
    def flesh_start_of_node(self, n : int) -> str:
        pass

    @abstractmethod
    def flesh_exit_node(self, n : int) -> str:
        pass

    @abstractmethod
    def flesh_unconditional_node(self, n : int) -> str:
        pass

    @abstractmethod
    def flesh_conditional_node(self, n : int) -> str:
        pass

    @abstractmethod
    def flesh_switch_node(self, n: int, n_successors : int) -> str:
        pass

    @abstractmethod
    def flesh_end(self) -> str:
        pass
    
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


class LLVMGenerator(ProgramGenerator):
    
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
                       successor_false = list(self.cfg.graph.adj[n])[0],
                       successor_true = list(self.cfg.graph.adj[n])[1])
        
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



class JavaBytecodeGenerator(ProgramGenerator):

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
        code = '''
    ; get directions for node
    aload_1
    iload 4
    iaload

    ; increment directions counter
    iinc 4 1

    ; branch
    ifeq block_{successor_true}
    goto block_{successor_false}
            '''.format(i = n,
                       successor_false = list(self.cfg.graph.adj[n])[0],
                       successor_true = list(self.cfg.graph.adj[n])[1])
        
        return code

    def flesh_switch_node(self, n: int, n_successors : int) -> str:
        '''
            returns code for node with > 2 successors
            e.g. a switch statement
        '''
        code = '''
    ; get directions for node
    aload_1
    iload 4
    iaload

    ; increment directions counter
    iinc 4 1

    ; switch
    lookupswitch'''
        
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

def main():
        
        base = 'fuzzing/java_test_140723'
        graph_path = f'{base}/graphs'
        program_filepath = f'{base}/programs'

        graph_name = 'graph_test'
            
        graph = pickle.load(open(f'{graph_path}/{graph_name}.p', "rb"))

        program_generator = JavaBytecodeGenerator()

        cfg = CFG(graph)

        program_generator.fleshout(cfg)

        if (program_generator.save_to_file(f'{program_filepath}/{(graph_name)}.j')):
            print("Fleshed CFG created successfully!")
        
        else:
            print("Problem saving fleshed CFG")

if __name__=="__main__":
    main()


