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