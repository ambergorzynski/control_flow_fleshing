import os

def main():

    directory = '/Users/ambergorzynski/Documents/cfg/repo/control_flow_fleshing/evaluation'
    names = ['work_csmith_adce',
             'work_csmith_default<O3>',
             'work_csmith_lcssa',
             'work_csmith_loop-rotate',
             'work_csmith_loop-simplifycfg',
             'work_csmith_loop-unroll',
             'work_csmith_loop-unroll-and-jam']
    f_names = ['work_flesh_adce',
             'work_flesh_default<O3>',
             'work_flesh_lcssa',
             'work_flesh_loop-rotate',
             'work_flesh_loop-simplifycfg',
             'work_flesh_loop-unroll',
             'work_flesh_loop-unroll-and-jam']
    for name in f_names:
        folder = f'{directory}/{name}/killed_mutants/'

        sub_folders = [name for name in os.listdir(folder) if os.path.isdir(os.path.join(folder, name))]

        print(f'{name}: {len(sub_folders)}')

if __name__=="__main__":
    main()