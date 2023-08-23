import json

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


if __name__=="__main__":
    main()