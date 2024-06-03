from abc import ABC, abstractmethod

class InstructionBlock(ABC):
    
    @abstractmethod
    def write(self) -> str:
        NotImplementedError

class ProgramStart(InstructionBlock):

class NodeStart(InstructionBlock):

class ExitNode(InstructionBlock):
