import os
import sys
import argparse
import subprocess
import random
import time
import json

from pathlib import Path

from fuzzflesh.cfg.CFG import CFG, Route
from fuzzflesh.program_generator.c.c_generator import CProgramGenerator

from fuzzflesh.reducer.passes.abstract import AbstractPass
from fuzzflesh.reducer.passes.merge import MergeOnPathPass, MergeOffPathPass, MergeExitPass
from fuzzflesh.reducer.passes.remove_edge import RemoveOffPathEdgePass, RemoveOnPathEdgePass

class Reducer():

    def __init__(self, cfg : CFG, route : Route, interestingness_test : Path, output_path : Path, dirs : bool = True):
        self.dirs_known : bool = dirs
        self.interestingness_test : Path = interestingness_test
        self.cfg : CFG = cfg
        print(f'route has type {type(route)}')
        self.route : Route = route
        self.pass_name_mapping = {
            'merge_on_path' : MergeOnPathPass,
            'merge_off_path' : MergeOffPathPass,
            'merge_exit' : MergeExitPass,
            'remove_edge_off_path' : RemoveOffPathEdgePass,
            'remove_edge_on_path' : RemoveOnPathEdgePass,
            }
        self.output_path : Path = output_path

        self.reduced_program_path : Path = Path(output_path, 'program.c')
        self.reduced_input_path : Path = Path(output_path, 'inputs.json')
        self.reduced_graph_path : Path = Path(output_path,'graph.p')
        
        self.interesting_program_path : Path = Path(output_path, 'interesting_program.c')
        self.interesting_input_path : Path = Path(output_path, 'interesting_input.json')
        self.interesting_graph_path : Path = Path(output_path,'interesting_graph.p')

    def reduce(self, passes : list[AbstractPass]) -> None:
        
        if not self.valid_pass(passes):
            print('Error! Invalid pass entered')
            return

        else:
            pass_instances = self.get_passes(passes)

        # Set up reducer directory
        self.output_path.mkdir(exist_ok=True)

        cmd = ['cp', str(self.interestingness_test), str(self.output_path)]
        result = subprocess.run(cmd)

        self.interestingness_test = Path(self.output_path, self.interestingness_test.name)

        if not self.is_interesting(cfg=self.cfg, route=self.route):
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

    def is_interesting(self, cfg : CFG, route : Route) -> bool:
        '''
            runs interestingness test to check whether given 
            cfg is interesting
        '''

        program = self.flesh_cfg(cfg, route.directions)
        
        #TODO: change to tmp folder
        with open(self.reduced_program_path, "w") as f:
            program.write_to_file(self.reduced_program_path)
            print(f'Program written to: {str(self.reduced_program_path)}')

        with open(self.reduced_input_path, "w") as f:
            json.dump(route.to_dict(), f, indent=4)

        cfg.save_graph(self.reduced_graph_path)

        # run interestingness test
        cmd = ['sh',
             str(self.interestingness_test)]

        result = subprocess.run(cmd, cwd=str(self.output_path))
        
        print(f'Result of interestingness test is: {result.returncode}')

        if result.returncode == 0:
            return True

        return False        

    def flesh_cfg(self, cfg : CFG, dirs : list[int]) -> str:
        
        generator = CProgramGenerator(cfg)

        if self.dirs_known:
            program = generator.fleshout_with_dirs(dirs)
        else:
            program = generator.fleshout_without_dirs()

        return program 

    def save_graph(self, cfg : CFG, filename : str) -> None:

        cfg.save_graph(filename)

    def run_pass(self, p : AbstractPass) -> None:
       
        p.new(self.cfg, self.route)

        while p.check_prerequisites(self.cfg, self.route):
           
            (modified_cfg, modified_path) = p.transform(self.cfg, self.route)

            if self.is_interesting(modified_cfg, modified_path):
                print('Updating cfg and path')
                '''
                print(f'New cfg nodes: {modified_cfg.get_nodes()}')
                print(f'New cfg edges: {modified_cfg.get_edges()}')
                print(f'New path: {modified_path.expected_output}')
                print(f'New dirs: {modified_path.directions}')
                '''
                self.cfg = modified_cfg
                self.route = modified_path

                # save out latest interesting cfg info
                program = self.flesh_cfg(self.cfg, self.route.directions)
                
                program.write_to_file(self.interesting_program_path)

                with open(self.interesting_input_path, "w") as f:
                    json.dump(self.route.to_dict(), f, indent=4)

                self.cfg.save_graph(self.interesting_graph_path)
                print('Saved latest interesting test case')

            print('Completed round of pass')


if __name__=="__main__":

    reducer = Reducer
