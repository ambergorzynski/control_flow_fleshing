import os
import sys
from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'../..'))

from CFG import CFG, Path

class AbstractPass:
    
    def __init__(self):
        pass

    def __str__(self):
        return f'{type(self).__name__}'

    def new(self, cfg : CFG, path : Path) -> None:
        raise NotImplementedError(f"Class {type(self).__name__} has not implemented 'new'!")

    def check_prerequisites(self, cfg : CFG, path : Path) -> bool:
        raise NotImplementedError(f"Class {type(self).__name__} has not implemented 'check_prerequisites'!")

    def transform(self, cfg : CFG, path : Path) -> tuple[CFG, Path]:
        raise NotImplementedError(f"Class {type(self).__name__} has not implemented 'transform'!")
