from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'../..'))

from CFG import CFG, Path

class Merge(AbstractPass):
    '''
        This pass merges nodes that are not on the path, and 
        not connected to any nodes on the path by an edge
    '''

    __init__(self):
        pass



