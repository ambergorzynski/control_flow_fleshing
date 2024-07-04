import json
import os

def main():
    
    path = '/Users/ambergorzynski/Documents/cfg/repo/control_flow_fleshing/evaluation/work_flesh_loop-unroll/tests/graph_0_path_0/kill_summary.json'
    with open(path, 'r') as f:
        loop_unroll_info = json.load(f)

    covered_mutants = loop_unroll_info['covered_mutants']
    killed_mutants = loop_unroll_info['killed_mutants']

    n_covered_mutants = len(covered_mutants)
    n_killed_mutants = len(killed_mutants)

    print(f'covered: {n_covered_mutants}')
    print(f'killed: {n_killed_mutants}')


def compare():

    base = '/Users/ambergorzynski/Documents/cfg/repo/control_flow_fleshing/evaluation'

    names = ['adce', 'default<O3>', 'lcssa', 'loop-rotate', 'loop-simplifycfg', 'loop-unroll', 'loop-unroll-and-jam']

    for n in names:

        csmith_folder = f'{base}/work_csmith_{n}/killed_mutants'
        fuzzflesh_folder = f'{base}/work_flesh_{n}/killed_mutants'

        csmith_killed = set([name for name in os.listdir(csmith_folder) if os.path.isdir(os.path.join(csmith_folder, name))])
        fuzzflesh_killed = set([name for name in os.listdir(fuzzflesh_folder) if os.path.isdir(os.path.join(fuzzflesh_folder, name))])

        csmith_and_fuzzflesh = csmith_killed.intersection(fuzzflesh_killed)
        csmith_only = csmith_killed.difference(fuzzflesh_killed)
        fuzzflesh_only = fuzzflesh_killed.difference(csmith_killed)

        print(f'Optimisation: {n}')
        print(f'    Both killed: {len(csmith_and_fuzzflesh)}')
        print(f'    Csmith only killed: {len(csmith_only)}')
        print(f'    FuzzFlesh only killed: {len(fuzzflesh_only)}')


if __name__=="__main__":
    compare()