import os
import sys
from pathlib import Path

from fuzzflesh.cfg.CFG import CFG, Route

class AbstractPass:
    
    def __init__(self):
        pass

    def __str__(self):
        return f'{type(self).__name__}'

    def new(self, cfg : CFG, path : Route) -> None:
        raise NotImplementedError(f"Class {type(self).__name__} has not implemented 'new'!")

    def check_prerequisites(self, cfg : CFG, path : Route) -> bool:
        raise NotImplementedError(f"Class {type(self).__name__} has not implemented 'check_prerequisites'!")

    def transform(self, cfg : CFG, path : Route) -> tuple[CFG, Route]:
        raise NotImplementedError(f"Class {type(self).__name__} has not implemented 'transform'!")
