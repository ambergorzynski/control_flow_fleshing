import argparse 
import sys
import networkx as nx
import subprocess

from datetime import datetime

#TODO: convert graph generator etc to package

sys.path.append('../control_flow_fleshing')

from GraphGenerator import *
from CFG import *
from CILProgramGenerator import *
from CILRunner import *
from Utils import *

def main():

    # parse args
    parser = argparse.ArgumentParser()

    parser.add_argument("n_graphs", type=int)
    parser.add_argument("n_paths", type=int)
    parser.add_argument("folder", type=str)
    parser.add_argument("-graph", type=str, default="2",
                        help="specifies graph generation approach from '-1' (for report graph), '1', '2' or 'xml'.")
    parser.add_argument("-decompiler_path", type = str, default = None,
                        help = "specifies decompiler path to ilspy exe")
    args = parser.parse_args()

    
    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    
    basePath = f'cil/fuzzing/{args.folder}'

    filepaths = FilePaths(base = basePath,
                            decopmiler_path= args.decompiler_path,
                            absolute_filepath=f'/Users/ambergorzynski/Documents/cfg/repo/control_flow_fleshing/{basePath}/proj/testing/',
                            graph_filepath = f'{basePath}/graphs',
                            src_filepath = f'{basePath}/proj',
                            program_filepath = f'{basePath}/proj/testing',
                            path_filepath = f'{basePath}/proj/paths',
                            output_filepath = f'{basePath}/output',
                            results_name = f'results_{time}',
                            bug_results_name = f'bugs_{time}')

    params = FuzzingParams(
                            n_graphs = args.n_graphs,
                            n_paths = args.n_paths,
                            min_graph_size = 10,
                            max_graph_size = 500,
                            min_successors = 1,
                            max_successors = 2,
                            graph_approach = int(args.graph),
                            max_path_length = 900,
                            n_function_repeats=5000)
    
    # Setup
    create_folders(basePath)
  
    # Step 1 : generate graphs
    generate_graphs(graph_filepath = filepaths.graph_filepath,
                    n_graphs = params.n_graphs,
                    min_graph_size = params.min_graph_size,
                    max_graph_size = params.max_graph_size,
                    min_successors = params.min_successors, 
                    max_successors = params.max_successors, 
                    graph_generation_approach = params.graph_approach, 
                    seed = None)
    
    # Step 2 : generate paths for each graph
    for i in range(params.n_graphs):
        generate_path(graph_number = i,
                        graph_filepath = filepaths.graph_filepath, 
                        path_filepath = filepaths.path_filepath,
                        graph_name = f'graph_{i}.p', 
                        n_paths = params.n_paths, 
                        max_path_length = params.max_path_length, 
                        seed = None)

    
    # Step 3 : flesh graphs
    program_generator = CILProgramGenerator(params)
   
    for i in range(params.n_graphs):
        graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

        cfg = CFG(graph)

        program_generator.fleshout(cfg, i)

        program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}.il')

    
    # Step 4 : run tests
    test = CILRunner(filepaths, params)

    for i in range(params.n_graphs):
        graph_passed_tests = True
        test_name = f'run_cfg_{i}'

        for j in range(params.n_paths):
    
            test_result = test.run(test_name=test_name, test_id=i, path_name=f'input_graph_{i}_path{j}')
            if test_result == 0:
                clean_up(f'{filepaths.path_filepath}/input_graph_{i}_path{j}.txt')
            else:
                graph_passed_tests = False

        if graph_passed_tests:
            clean_up(f'{filepaths.program_filepath}/{test_name}*')
            clean_up(f'{filepaths.graph_filepath}/graph_{i}.p')

def clean_up(filepath : str):
    subprocess.run(f'rm {filepath}', shell=True)

def clean_up_folder(folderpath : str):
    subprocess.run(f'rm -rf {folderpath}', shell=True)

def read_in_dirs(graph : nx.MultiDiGraph, path : int, filepaths : FilePaths) -> list[int]:
        
        with open(f'{filepaths.path_filepath}/input_graph_{graph}_path{path}.txt', 'r') as f:
            lines = f.readlines()

        # third line is directions list
        dirs = lines[2].split(' ')

        # convert str to int
        return [eval(i) for i in dirs]

def create_folders(basePath : str, ) -> None:

    print('Setting up folders...')

    cmd = f'mkdir {basePath}'
    cmd += f' ;mkdir {basePath}/graphs'
    cmd += f' ;mkdir {basePath}/proj'
    cmd += f' ;mkdir {basePath}/proj/output'
    cmd += f' ;mkdir {basePath}/proj/paths'
    cmd += f' ;mkdir {basePath}/proj/testing'

    result = subprocess.run(cmd, shell=True)

    cmd = [f'''cp cil/Wrapper.cs {basePath}/proj/testing/Wrapper.cs''']
    result = subprocess.run(cmd, shell=True)


    
if __name__ == "__main__":
    main()