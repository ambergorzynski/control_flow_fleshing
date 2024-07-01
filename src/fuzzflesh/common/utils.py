from enum import Enum
from pathlib import Path

class Lang(Enum):
    JAVABC = 1
    C = 2

class Compiler(Enum):
    CFR = 1
    FERNFLOWER = 2
    PROCYON = 3
    GRAALVM = 4
    HOTSPOT = 5

class InstructionBlock():

    def __init__(self, _code : str):
        self.code : str = _code
    
    def get_code(self) -> str:
        return self.code
    
class Program():

    def __init__(self, _lang : Lang, _prog : list[InstructionBlock]):
        self.program : list[InstructionBlock] = _prog
        self.language : Lang = _lang

    def write_to_file(self, filepath : Path, filename : str) -> bool:

        with open(Path(filepath, f'{filename}{self.get_extension()}'), 'w') as f:
            for i in self.program:
                f.write(f'{i.get_code()}\n')
        
        return True
    
    def get_extension(self) -> str:
        match self.language:
            case Lang.JAVABC:
                return '.j'
            case Lang.C:
                return '.c'
            case _ : 
                return '.txt'


