from abc import ABC, abstractmethod

from fuzzflesh.common.utils import RunnerReturn

class Runner(ABC):
    def __init__(self):
        pass
        
    @property
    @abstractmethod
    def language(self):
        pass

    @property
    @abstractmethod
    def toolchain(self):
        pass
        
    @abstractmethod
    def run(self) -> RunnerReturn:
        pass