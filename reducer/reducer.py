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

    def __init__(self, cfg : CFG, path : Path, interestingness_test : str):
        self.interestingness_test : str = interestingness_test
        self.cfg : CFG = cfg
        self.path : Path = path
        self.pass_name_mapping = {
            'merge' : MergePass,
            }


    def reduce(self, passes : list[AbstractPass]) -> None:
        
        if not self.valid_pass(passes):
            print('Error! Invalid pass entered')
            return

        else:
            pass_instances = self.get_passes(passes)

        if not self.is_interesting(cfg=self.cfg, path=self.path):
            print('Error! Initial test case is not interesting!') 
            return

        for p in pass_instances:
            print(f'Running pass {p}')
            self.run_pass(p)
            print(f'Finished pass {p}')

        print('Finished all passes')

        return

    def get_passes(self, passes : list[str]) -> list[AbstractPass]:

        pass_instances = []

        for p in passes:
            pass_class = self.pass_name_mapping[p]
            pass_instance = pass_class()
            pass_instances.append(pass_instance)

        return pass_instances

    def valid_pass(self, passes : list[str]) -> bool:

        for p in passes:
            if self.pass_name_mapping.get(p) == None:
                return False

        return True

    def is_interesting(self, cfg : CFG, path : Path) -> bool:
        '''
            runs interestingness test to check whether given 
            cfg is interesting
        '''

        program = self.flesh_cfg(cfg)
        
        #TODO: change to tmp folder
        with open("/data/work/ghidra/reducer/test_graph.c", "w") as f:
            f.write(program)

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

    def flesh_cfg(self, cfg : CFG) -> str:
    
        generator = CProgramGenerator()

        program = generator.fleshout(cfg)

        return program 

    def run_pass(self, p : AbstractPass) -> None:
       
        p.new(self.cfg, self.path)

        while p.check_prerequisites(self.cfg, self.path):

            (modified_cfg, modified_path) = p.transform(self.cfg, self.path)

            if self.is_interesting(modified_cfg, modified_path):
                print('Updating cfg and path')
                self.cfg = modified_cfg
                self.path = modified_path

            print('Completed round of pass')
            print('Sleeping...')
            time.sleep(3)


if __name__=="__main__":

    reducer = Reducer
