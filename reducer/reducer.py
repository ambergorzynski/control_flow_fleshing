import os
import sys
import argparse
import subprocess
import random
import time

from pathlib import Path

sys.path.append(os.path.join(os.path.dirname(__file__),'..'))

from CFG import CFG, Path
from c.CProgramGenerator import CProgramGenerator

from passes.abstract import AbstractPass
from passes.merge import MergePass

class Reducer():

    pass_name_mapping = {
            'merge' : MergePass,
            }

    def __init__(self, interestingness_test : str, cfg : CFG, path : Path):
        interestingness_test : str = interestingness_test
        cfg : CFG = cfg
        path : Path = path

    def reduce(self, passes : List[AbstractPass]):

        if !self.is_interesting(self.cfg, self.path):
            print('Error! Initial test case is not interesting!') 
            return

        return

    def is_interesting(self, cfg : CFG, path : Path) -> bool:
        '''
            runs interestingness test to check whether given 
            cfg is interesting
        '''

        program = flesh_cfg(cfg)
        
        #TODO: change to tmp folder
        with open("/data/work/ghidra/reducer/test_graph.c", "w") as f:
            file.write(program)

        with open("/data/work/ghidra/reducer/inputs.txt", "w") as f:
        f.write(str(len(path.directions)) + '\n')
        f.write(str(len(path.expected_output)) + '\n')
        f.writelines(' '.join([str(i) for i in path.directions]) + '\n')
        f.writelines(' '.join([str(i) for i in path.expected_output]))

        # run interestingness test
        cmd = ['sh', f'/{self.interestingness_test}']

        result = subprocess.run(cmd)
        
        print(f'Result of interestingness test is: {result.returncode}')

        return True if result.returncode == 0 else False        

