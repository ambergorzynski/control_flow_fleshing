import os
import sys
import argparse
import subprocess

from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'..'))

from c import CProgramGenerator, Utils

def parse_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("graph")
    parser.add_argument("--language", default="c")
    parser.add_argument("--script") # optional for now
    return parser.parse_args()

def main():

    args = parse_args()
    
if __name__==("__main__"):
    main()


