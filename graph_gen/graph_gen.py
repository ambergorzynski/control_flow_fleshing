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

import networkx as nx
import pickle
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

def cfg_to_graph(cfg : CFG) -> nx.MultiDiGraph:
    
    # get list of nodes as ints
    int_blocks = nodes_to_ids(cfg)

    # get list of edges as int tuples
    (jump, merge, cont) = all_edges_to_ids(cfg)

    # create graph object
    G = nx.MultiDiGraph()

    G.add_nodes_from(int_blocks)

    # jump is list of tuples
    for i in jump:
        if len(i) == 1:
            G.add_edge(i[0][0], i[0][1])
        else:
            G.add_edges_from(i)
        
    G.add_edges_from(merge)
    G.add_edges_from(cont)

    return G

 
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

def all_edges_to_ids(cfg : CFG) -> (list[tuple(int, int)], list[tuple(int, int)], list[tuple(int, int)]):

    # blocks to ids
    nodes = nodes_to_ids(cfg)

    # jump relation
    jump_edges_dict = relation_to_id_dict(cfg.jump_relation, cfg.label_to_id)
    jump_edges = []
    for k in jump_edges_dict.keys():
        tups = [(k, end) for end in jump_edges_dict[k]]
        jump_edges.append(tups)

    # merge relation
    merge_edges_dict = relation_to_id_str(cfg.merge_relation, cfg.label_to_id)
    merge_edges = [(k, v) for k, v in merge_edges_dict.items()]

    # continue relation
    continue_edges_dict = relation_to_id_str(cfg.continue_relation, cfg.label_to_id)
    continue_edges = [(k, v) for k, v in continue_edges_dict.items()]

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
    
    graph = cfg_to_graph(cfg)

    print([e for e in graph.edges()])


if __name__=="__main__":
    main()


