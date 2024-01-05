import os
import argparse
import subprocess

from pathlib import Path

def parse_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("graph")
    parser.add_argument("--script") # optional for now
    return parser.parse_args()

def main():

    args = parse_args()
    
if __name__==("__main__"):
    main()


