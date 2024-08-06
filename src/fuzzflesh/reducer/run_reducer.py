import os
import sys
import argparse
import subprocess
import random
import time
import networkx as nx
import json

from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'..'))

from CFG import CFG, Route
from reducer import Reducer

def get_path(filename : Path) -> Route:
    
    with open(filename, "r") as f:
        content = json.load(f)

    directions = content['dirs']

    expected_output = content['expected_output']

    return Route(expected_output = expected_output, directions = directions)

if __name__==("__main__"):
    parser = argparse.ArgumentParser()

    parser.add_argument("graph",
                        help='Filepath to graph of interest.')
    parser.add_argument("input",
                        help='Filepath to input.json of path')
    parser.add_argument("interestingness_test",
                        help='Filepath to interestingness shell script.')
    parser.add_argument("output_path",
                        help='Filepath to which the reduced program should be saved.')
    parser.add_argument("--language", default="c")
   
    args = parser.parse_args()

    cfg = CFG(filename=args.graph)

    path = get_path(args.input)
    
    reducer = Reducer(cfg=cfg, 
            path=path, 
            interestingness_test=args.interestingness_test,
            output_path=args.output_path)
    
    #reducer.reduce(['merge_off_path','remove_edge','merge_on_path'])
    
    reducer.reduce(['merge_off_path', 
                'remove_edge', 
                'merge_on_path',
                'merge_exit'])
