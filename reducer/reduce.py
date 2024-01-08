import os
import sys
import argparse
import subprocess

from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'..'))

from CFG import CFG
from c.CProgramGenerator import CProgramGenerator

def parse_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("graph")
    parser.add_argument("--language", default="c")
    parser.add_argument("--script") # optional for now
    return parser.parse_args()

def gen_program(filename : str) -> str:

    # load cfg as nx object
    cfg = CFG(filename=filename)

    # flesh cfg to program
    generator = CProgramGenerator()

    program = generator.fleshout(cfg)

    print(program)

    return 'hello'

def main():

    args = parse_args()

    program : str = gen_program(args.graph)

if __name__==("__main__"):
    main()


