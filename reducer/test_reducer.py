import os
import sys
import argparse
import subprocess
import random
import time
import networkx as nx

from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'..'))

from CFG import CFG, Path
from passes.merge import MergeOnPathPass, MergeOffPathPass

def get_path(filename : str) -> Path:
    
    with open(filename, "r") as f:
        content = f.readlines()

    directions = [int(i) for i in content[2].split()]

    expected_output = [int(i) for i in content[3].split()]

    return Path(expected_output = expected_output, directions = directions)

def show(cfg, path):

    #print(f'Nodes:\n{cfg.get_nodes()}')
    
    #print(f'Edges:\n{cfg.get_edges()}')

    print(f'Path:\n{path.expected_output}')

    print(f'Dirs:\n{path.directions}')


if __name__==("__main__"):

    folder = 'large_test_270224_v4'

    cfg = CFG(filename = f'/data/work/ghidra/reducer/{folder}/test_graph.p')

    path = get_path(f'/data/work/ghidra/reducer/{folder}/inputs.txt')

    show(cfg, path)

    # Test merge pass
    merger = MergeOnPathPass()

    merger.new(cfg=cfg, path=path)

    node = 417

    print(f'merging nodes 1, {node}')

    new_cfg = cfg.merge_nodes(1,node)

    new_path = merger.update_path(new_cfg, cfg, path,1,node)

    show(new_cfg, new_path)

    
