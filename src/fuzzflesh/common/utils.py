from enum import Enum
from pathlib import Path

class Lang(Enum):
    JAVABC = 1
    C = 2
    CIL = 3
    CS = 4

class Compiler(Enum):
    CFR = 1
    FERNFLOWER = 2
    PROCYON = 3
    GRAALVM = 4
    HOTSPOT = 5
    GCC = 6
    GPP = 7
    GHIDRA = 8
    ILSPY = 9
    JADX = 10
    ANGR = 11

class RunnerReturn(Enum):
    COMPILATION_FAIL = 1
    DECOMPILATION_FAIL = 2
    RECOMPILATION_FAIL = 3
    EXECUTION_FAIL = 4
    EXECUTION_MISMATCH = 5
    SUCCESS = 6

class InstructionBlock():

    def __init__(self, _code : str):
        self.code : str = _code
    
    def get_code(self) -> str:
        return self.code
    
class Program():

    def __init__(self, _lang : Lang, _prog : list[InstructionBlock]):

        self.program : list[InstructionBlock] = _prog
        self.language : Lang = _lang

    def write_to_file(self, program_path : Path) -> bool:

        with open(program_path, 'w') as f:
            for i in self.program:
                f.write(f'{i.get_code()}\n')
        
        return True
    
    def get_program_path(self, filepath : Path, filename : str) -> Path:
        return Path(filepath, f'{filename}{self.get_extension()}')
    
    def get_extension(self) -> str:
        match self.language:
            case Lang.JAVABC:
                return '.j'
            case Lang.C:
                return '.c'
            case Lang.CIL:
                return '.il'
            case _ : 
                return '.txt'


