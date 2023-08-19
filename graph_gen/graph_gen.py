''' 
    WIP - this file aims to take an .xml graph as input and output a
    networkx object, which can be used by the downstream fleshing 
    toolchain. Utilises the fleshout.py from 
    https://github.com/mc-imperial/spirv-control-flow/tree/main/fleshing
'''

from __future__ import annotations

import sys
import random
import xml.etree.ElementTree as elementTree
import argparse
from collections import defaultdict, deque

from random import Random
from typing import Deque, DefaultDict, Dict, List, Set

from fleshout import *

START_ID = 0

def xml_to_cfg(xml_file : str) -> CFG:

    tree = elementTree.parse(xml_file)

    alloy = tree.getroot()
    assert alloy.tag == "alloy"
    assert len(alloy) == 1
    instance = alloy[0]
    assert instance.tag == "instance"

    if not any(block in get_jump_relation(instance) for block in get_all_blocks(instance) ):
        raise NoTerminalNodesInCFGError()

    cfg = CFG(get_jump_relation(instance),
              get_merge_relation(instance),
              get_continue_relation(instance),
              get_entry_block(instance),
              get_regular_blocks(instance),
              get_loop_header_blocks(instance),
              get_selection_header_blocks(instance),
              get_switch_blocks(instance))
    
    return cfg
    
def view_cfg(cfg : CFG) -> None:

    print('\nCFG blocks:')
    print(cfg.all_blocks)

    print('\nCFG jump relations')
    print(cfg.jump_relation)
    print('\nCFG merger relations')
    print(cfg.merge_relation)
    print('\nCFG continue relations')
    print(cfg.continue_relation)

def view_topological_ordering(cfg : CFG) -> None:

    print("\nTopological ordering")

    for b in cfg.topological_ordering:
        print(int(cfg.get_block_id(b)) - START_ID)

def nodes_to_ids(cfg : CFG) -> list[int]:

    return [int(cfg.get_block_id(b)) - START_ID for b in cfg.topological_ordering]

def all_edges_to_ids(cfg : CFG) -> (Dict[int, list[int]], Dict[int, int], Dict[int, int]):

    # blocks to ids
    nodes = nodes_to_ids(cfg)

    # jump relation
    jump_edges = relation_to_id_dict(cfg.jump_relation, cfg.label_to_id)

    # merge relation
    merge_edges = relation_to_id_str(cfg.merge_relation, cfg.label_to_id)

    # continue relation
    continue_edges = relation_to_id_str(cfg.continue_relation, cfg.label_to_id)
    
    # combine into single dict of all relations
    all_edges = defaultdict(list)

    return (jump_edges, merge_edges, continue_edges)

def relation_to_id_dict(relation : Dict[str, list[str]], label_to_id : Dict[str, str]) -> Dict[int, int]:

    return {get_node(key, label_to_id): get_edges(value, label_to_id) for (key, value) in relation.items()}

def relation_to_id_str(relation : Dict[str, str], label_to_id : Dict[str, str]) -> Dict[int, int]:

    return {get_node(key, label_to_id): get_node(value, label_to_id) for (key, value) in relation.items()}

def get_node(key : str, label_to_id : Dict[str, str]) -> int:
    
    return int(label_to_id[key]) - START_ID

def get_edges(edges : list[str], label_to_id : Dict[str, str]) -> list[int]:

    return [(int(label_to_id[end]) - START_ID) for end in edges]

def main():

    cfg = xml_to_cfg('graph_gen/test_0.xml')
    
    '''
    view_cfg(cfg)
    view_topological_ordering(cfg)

    print('\nListing blocks from id list')
    int_blocks = nodes_to_ids(cfg)

    for i in int_blocks:
        print(i)
    '''

    (jump, merge, cont) = all_edges_to_ids(cfg)

    print('edges')

    for e, v in cont.items():
        print(f'{e} : {v}')

if __name__=="__main__":
    main()


