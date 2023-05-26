import networkx as nx
import pickle

class CFG():

    def __init__(self, graph : nx.MultiDiGraph):
        self.graph : nx.MultiDiGraph = graph
        self.fleshed_graph : str = None

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
            n_successors = len(list(self.graph.adj[n]))

            if(n_successors == 0):
                self.fleshed_graph += self.flesh_exit_node(n)
            
            elif(n_successors == 1):
                self.fleshed_graph += self.flesh_unconditional_node(n)

            elif(n_successors == 2):
                self.fleshed_graph += self.flesh_conditional_node(n)


        # end code with return statement
        self.fleshed_graph += '''
        ret void
        }'''

        return self.fleshed_graph
    
    def flesh_program_start(self) -> str:

        prog_start = '''

        ; example cfg 1: with single branching block

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
            %temp_{i}_1 = add i32 %inex_{i}, {i}
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
        placeholder exit'''
        
        return code

    def flesh_unconditional_node(self, n : int) -> str:
        '''
            returns code for node n with single successor
        '''

        code = '''
        placeholder unconditional'''

        return code

    def flesh_conditional_node(self, n : int) -> str:
        ''' 
            returns code for node n with two successors, one of
            which may be self (e.g. in case of loop)
            note this does not deal with switch statements where
            there are > 2 successor nodes
        '''
        code = '''
        placeholder conditional'''
        
        return code

    def save_llvm_to_file(self, filename : str) -> bool:
        ''' 
            writes CFG to given file in LLVM IR 
            returns true if file write is successful
            false otherwise
        '''
        print(self.fleshed_graph)

def main():

    # hard coded example graph - next step is to use cmd line args
    
    graph1 = pickle.load(open("graph_1.p", "rb"))

    cfg = CFG(graph1)

    cfg.fleshout()

    if (cfg.save_llvm_to_file("run_cfg_wip.ll")):
        print("Fleshed CFG created successfully!")
    
    else:
        print("Problem saving fleshed CFG")

if __name__=="__main__":
    main()
