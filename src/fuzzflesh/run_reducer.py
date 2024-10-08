import os
import sys
import argparse
import subprocess
import random
import time
import networkx as nx
import json

from pathlib import Path

from fuzzflesh.common.utils import Lang
from fuzzflesh.cfg.CFG import CFG, Route
from fuzzflesh.reducer.reducer import Reducer

def get_route(filename : Path) -> Route:
    
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
    parser.add_argument("--dirs_known",
                        action=argparse.BooleanOptionalAction)
    parser.add_argument("--language", 
                        choices=['c','javabc'],
                        default="c")
   
    args = parser.parse_args()

    language = Lang[args.language.upper()]

    cfg = CFG(filename=args.graph)

    route = get_route(args.input)
    
    reducer = Reducer(language=language,
            cfg=cfg, 
            route=route, 
            interestingness_test=Path(args.interestingness_test),
            output_path=Path(args.output_path),
            dirs=args.dirs_known)
    
    reducer.reduce(['merge_off_path', 
                'remove_edge_off_path', 
                'merge_on_path',
                'merge_exit',
                'remove_edge_on_path'])

    
