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
from passes.merge import MergeOnPathPass, MergeOffPathPass
from passes.remove_edge import RemoveEdgePass

class Reducer():

    def __init__(self, cfg : CFG, path : Path, interestingness_test : str, output_path : str):
        self.interestingness_test : str = interestingness_test
        self.cfg : CFG = cfg
        self.path : Path = path
        self.pass_name_mapping = {
            'merge_on_path' : MergeOnPathPass,
            'merge_off_path' : MergeOffPathPass,
            'remove_edge' : RemoveEdgePass,
            }
        self.output_path = output_path


    def reduce(self, passes : list[AbstractPass]) -> None:
        
        if not self.valid_pass(passes):
            print('Error! Invalid pass entered')
            return

        else:
            pass_instances = self.get_passes(passes)
        
        '''
        print(f'cfg nodes: {self.cfg.get_nodes()}')
        print(f'cfg edges: {self.cfg.get_edges()}')
        print(f'path: {self.path.expected_output}')
        print(f'dirs: {self.path.directions}')
        '''

        if not self.is_interesting(cfg=self.cfg, path=self.path):
            print('Error! Initial test case is not interesting!') 
            return

        (nodes, edges) = self.cfg.get_cfg_size()

        print(f'CFG size is: {nodes} nodes and {edges} edges')
        
        shrinking = True

        while shrinking:
            old_nodes = nodes
            old_edges = edges

            for p in pass_instances:
                print(f'Running pass {p}')
                self.run_pass(p)
                print(f'Finished pass {p}')

            (nodes, edges) = self.cfg.get_cfg_size()
            
            print(f'CFG size is: {nodes} nodes and {edges} edges')

            shrinking = True if ((nodes < old_nodes) or (edges < old_edges)) else False 
            time.sleep(1)

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
        with open(f'{self.output_path}/test_case.c', "w") as f:
            f.write(program)

        with open(f'{self.output_path}/inputs.txt', "w") as f:
            f.write(str(len(path.directions)) + '\n')
            f.write(str(len(path.expected_output)) + '\n')
            f.writelines(' '.join([str(i) for i in path.directions]) + '\n')
            f.writelines(' '.join([str(i) for i in path.expected_output]))

        cfg.save_graph(f'{self.output_path}/test_graph.p')

        # run interestingness test
        cmd = ['sh', f'/{self.interestingness_test}']

        result = subprocess.run(cmd)
        
        print(f'Result of interestingness test is: {result.returncode}')

        if result.returncode == 0:
            return True

        return False        

    def flesh_cfg(self, cfg : CFG) -> str:
    
        generator = CProgramGenerator()

        program = generator.fleshout(cfg)

        return program 

    def save_graph(self, cfg : CFG, filename : str) -> None:

        cfg.save_graph(filename)

    def run_pass(self, p : AbstractPass) -> None:
       
        p.new(self.cfg, self.path)

        while p.check_prerequisites(self.cfg, self.path):
           
            (modified_cfg, modified_path) = p.transform(self.cfg, self.path)

            if self.is_interesting(modified_cfg, modified_path):
                print('Updating cfg and path')
                '''
                print(f'New cfg nodes: {modified_cfg.get_nodes()}')
                print(f'New cfg edges: {modified_cfg.get_edges()}')
                print(f'New path: {modified_path.expected_output}')
                print(f'New dirs: {modified_path.directions}')
                '''
                self.cfg = modified_cfg
                self.path = modified_path

                # save out latest interesting cfg info
                program = self.flesh_cfg(self.cfg)
                
                with open(f'{self.output_path}/latest_test_case.c', "w") as f:
                    f.write(program)

                with open(f'{self.output_path}/latest_inputs.txt', "w") as f:
                    f.write(str(len(self.path.directions)) + '\n')
                    f.write(str(len(self.path.expected_output)) + '\n')
                    f.writelines(' '.join([str(i) for i in self.path.directions]) + '\n')
                    f.writelines(' '.join([str(i) for i in self.path.expected_output]))

                self.cfg.save_graph(f'{self.output_path}/latest_graph.p')
                print('Saved latest interesting test case')

            print('Completed round of pass')


if __name__=="__main__":

    reducer = Reducer
