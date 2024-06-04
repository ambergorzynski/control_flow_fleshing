from abc import ABC, abstractmethod
from typing import List
from pathlib import Path

from fuzzflesh.program_generator.instruction_blocks import InstructionBlock
from fuzzflesh.cfg import CFG

class ProgramFlesher(ABC):

    def __init__(self):
        self.fleshed_graph : List[InstructionBlock] = None
        self.cfg : CFG = None

    def save_to_file(self, filename : Path) -> bool:

        try:
            with open(filename) as f:
                f.write('\n'.join(self.fleshed_graph))
            return True
        
        except:
            return False
        
    def fleshout(self, cfg : CFG, prog_number=None) -> List[InstructionBlock]:

        '''
        Converts control flow graph to target language.
        Returns a list of instructions that constitue the
        program.
        '''

        program : List[InstructionBlock] = []

        program.append(self.flesh_program_start())

        program.append(self.flesh_program_body(cfg))

        program.append(self.flesh_program_end())

        return program
    
    def flesh_program_body(self, cfg : CFG) -> List[InstructionBlock]:

        body : List[InstructionBlock] = []

        for n in cfg.graph:

            body.append(self.flesh_start_of_node(n))

            n_successors = cfg.successors(n)

            match n_successors:

                case 0:
                    body.append(self.flesh_exit_node(n))
                case 1:
                    body.append(self.flesh_unconditional_node(n))
                case 2:
                    body.append(self.flesh_conditional_node(n))
                case _:
                    body.append(self.flesh_switch_node(n))

        return body
    
    @abstractmethod
    def flesh_program_start(self) -> List[InstructionBlock]:
        pass
            
    @abstractmethod
    def flesh_program_end(self) -> List[InstructionBlock]:
        pass    
    
    @abstractmethod
    def flesh_exit_node(self, n : int) -> List[InstructionBlock]:
        pass    
    
    @abstractmethod
    def flesh_unconditional_node(self, n : int) -> List[InstructionBlock]:
        pass    
    
    @abstractmethod
    def flesh_conditional_node(self, n : int) -> List[InstructionBlock]:
        pass
    
    @abstractmethod
    def flesh_switch_node(self, n : int) -> List[InstructionBlock]:
        pass