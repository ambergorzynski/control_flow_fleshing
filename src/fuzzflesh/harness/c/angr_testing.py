import angr


def do_angr_cfg_analysis():

    p = angr.Project('/data/work/fuzzflesh/output/angr/messing_around/prog.o', auto_load_libs=False)
    cfg = p.analyses.CFGFast()
    print(cfg.graph)

    original_cfg = CFG(filename='/data/work/fuzzflesh/llvm/graphs/graph_0.p')
    original_di_cfg = nx.DiGraph(original_cfg.graph)
    print(original_di_cfg)

    print('\n')

    print(f'original graph edges: {len(original_di_cfg.edges())}')
    print(f'recovered graph edges: {len(cfg.graph.edges())}')

    print('\n')

    for e in original_di_cfg.edges():
        print(e)

    print('\n')

    for e in cfg.graph.edges():
        print(e)

    exit()
