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
from reducer import Reducer

def get_path(filename : str) -> Path:
    
    with open(filename, "r") as f:
        content = f.readlines()

    directions = [int(i) for i in content[2].split()]

    expected_output = [int(i) for i in content[3].split()]

    return Path(expected_output = expected_output, directions = directions)

if __name__==("__main__"):
    parser = argparse.ArgumentParser()
    parser.add_argument("graph")
    parser.add_argument("input")
    parser.add_argument("interestingness_test")
    parser.add_argument("output_graph")
    parser.add_argument("--language", default="c")
   
    args = parser.parse_args()

    cfg = CFG(filename=args.graph)

    path = get_path(args.input)
    
    reducer = Reducer(cfg=cfg, path=path, interestingness_test=args.interestingness_test)
    
    reducer.reduce(['remove_edge', 'merge'])

