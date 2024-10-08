from abc import ABC, abstractmethod
from typing import List
from pathlib import Path

from fuzzflesh.common.utils import InstructionBlock, Program
from fuzzflesh.cfg import CFG

class ProgramFlesher(ABC):

    def __init__(self, cfg : CFG, dirs_known_at_compile : bool):
        self.cfg : CFG = cfg
        self.dirs_known_at_compile : bool = dirs_known_at_compile
        
        @property
        @abstractmethod
        def language(self):
            pass

        
    def fleshout_without_dirs(self) -> List[InstructionBlock]:

        '''
        Converts control flow graph to target language.
        Returns a list of instructions that constitue the
        program.
        '''

        program : List[InstructionBlock] = []

        program.extend(self.flesh_program_start())

        program.extend(self.flesh_program_body())

        program.append(self.flesh_program_end())

        return Program(self.language, program)
    
    def fleshout_with_dirs(self, dirs : list[int]) -> List[InstructionBlock]:

        '''
        Converts control flow graph to target language.
        Returns a list of instructions that constitue the
        program.
        Program directions are known at compile time.
        '''

        program : List[InstructionBlock] = []

        program.extend(self.flesh_program_start_with_dirs(dirs))

        program.extend(self.flesh_program_body())

        program.append(self.flesh_program_end())

        return Program(self.language, program)
    
    def flesh_program_body(self) -> List[InstructionBlock]:

        body : List[InstructionBlock] = []

        for n in self.cfg.graph:

            body.append(self.flesh_start_of_node(n))

            n_successors = self.cfg.successors(n)

            match n_successors:

                case 0:
                    body.append(self.flesh_exit_node(n))
                case 1:
                    body.append(self.flesh_unconditional_node(n))
                case 2:
                    body.append(self.flesh_conditional_node(n))
                case _:
                    body.append(self.flesh_switch_node(n, n_successors))

        return body
    
    @abstractmethod
    def flesh_program_start(self) -> List[InstructionBlock]:
        pass

    @abstractmethod
    def flesh_program_start_with_dirs(self, dirs : list[int]) -> List[InstructionBlock]:
        pass
            
    @abstractmethod
    def flesh_program_end(self) -> InstructionBlock:
        pass    
    
    @abstractmethod
    def flesh_exit_node(self, n : int) -> InstructionBlock:
        pass    
    
    @abstractmethod
    def flesh_unconditional_node(self, n : int) -> InstructionBlock:
        pass    
    
    @abstractmethod
    def flesh_conditional_node(self, n : int) -> InstructionBlock:
        pass
    
    @abstractmethod
    def flesh_switch_node(self, n : int) -> InstructionBlock:
        pass