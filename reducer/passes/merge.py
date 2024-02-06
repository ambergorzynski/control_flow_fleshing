import os
import sys
from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'../..'))

from CFG import CFG, Path
from passes.abstract import AbstractPass

class MergePass(AbstractPass):
    '''
        This pass merges nodes that are not on the path, and 
        not connected to any nodes on the path by an edge
    '''

    def __init__(self):
        pass



