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


