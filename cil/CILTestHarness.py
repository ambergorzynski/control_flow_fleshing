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
                        help="specifies graph generation approach from '1', '2' or 'xml'.")
    args = parser.parse_args()

    
    # Set up parameter inputs for fuzzing run
    time = datetime.now().timestamp()
    
    basePath = f'cil/fuzzing/{args.folder}'

    filepaths = FilePaths(base = basePath,
                            absolute_filepath=f'/Users/ambergorzynski/Documents/cfg/repo/control_flow_fleshing/src/testing',
                            graph_filepath = f'{basePath}/graphs',
                            src_filepath = f'{basePath}/src',
                            program_filepath= f'{basePath}/src/testing',
                            path_filepath = f'{basePath}/src/paths',
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
                            graph_approach = args.graph,
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
    program_generator = CILProgramGenerator()

    # directions are known at compile time - means we flesh n_graphs*m_paths programs
    if(args.dir == 'known'):
        
        # TODO: create java bc program generator with known directions array
        
        for i in range(params.n_graphs):
        
            # load graph                    
            graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            for p in range(params.n_paths):

                directions = read_in_dirs(i, p, filepaths)

                program_generator.fleshout_dirs_known(cfg, directions)

                # make directory for test case 
                subprocess.run(f'mkdir {filepaths.program_filepath}/run_cfg_{i}_path_{p}', shell=True)

                program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}_path_{p}/run_cfg_{i}_path_{p}.j')
        

    # directions are unknown at compile time - means we flesh n_graphs programs (1 for each graph)
    elif(args.dir == 'unknown'):

        for i in range(params.n_graphs):
                
            graph = pickle.load(open(f'{filepaths.graph_filepath}/graph_{i}.p', "rb"))

            cfg = CFG(graph)

            program_generator.fleshout_no_reflection(cfg, i)

            # make directory for test case 
            subprocess.run(f'mkdir {filepaths.program_filepath}/run_cfg_{i}', shell=True)

            # save in separate folder for classpath
            program_generator.save_to_file(f'{filepaths.program_filepath}/run_cfg_{i}/run_cfg_{i}.j')
    

    

    # Step 4 : run tests
    test = JavaBCRunner(filepaths, params, directions = args.dir)

    if args.dir == 'known':
    
        for i in range(params.n_graphs):
            
            graph_passed_tests = True

            for j in range(params.n_paths):

                test_name = f'run_cfg_{i}_path_{j}'
        
                test_result = test.run(test_name=test_name, test_id=i, path_name=f'input_graph_{i}_path{j}')

                # remove files if test passed
                if test_result == 0:
                    clean_up(f'{filepaths.path_filepath}/input_graph_{i}_path{j}.txt')
                    clean_up_folder(f'{filepaths.program_filepath}/{test_name}')
                else:
                    graph_passed_tests=False

            if graph_passed_tests:
                clean_up(f'{filepaths.graph_filepath}/graph_{i}.p')

    else:
        for i in range(params.n_graphs):

            graph_passed_tests = True
            test_name = f'run_cfg_{i}'

            for j in range(params.n_paths):
        
                test_result = test.run(test_name=test_name, test_id=i, path_name=f'input_graph_{i}_path{j}')

                if test_result == 0:
                    clean_up(f'{filepaths.path_filepath}/input_graph{i}_path{j}.txt')
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
    cmd += f' ;mkdir{basePath}/graphs'
    cmd += f' ;mkdir {basePath}/proj'
    cmd += f' ;mkdir {basePath}/proj/output'
    cmd += f' ;mkdir {basePath}/proj/paths'
    cmd += f' ;mkdir {basePath}/proj/testing'

    result = subprocess.run(cmd, shell=True)

    cmd = [f'''cp cil/Wrapper.cs {basePath}/proj/testing/Wrapper.cs''']
    result = subprocess.run(cmd, shell=True)


    
if __name__ == "__main__":
    main()