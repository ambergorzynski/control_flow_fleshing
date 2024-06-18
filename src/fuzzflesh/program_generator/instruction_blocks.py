from abc import ABC, abstractmethod

class InstructionBlock(ABC):

    def __init__(self, _code : str):
        code = _code
    
    @abstractmethod
    def write(self) -> str:
        return code

