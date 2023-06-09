from CFG import CFG
import pickle

def main():

    # hard coded example graph 1 - next step is to use cmd line args
    
    graph1 = pickle.load(open("graph_1.p", "rb"))

    cfg = CFG(graph1)

    cfg.fleshout()

    if (cfg.save_llvm_to_file("run_cfg_wip_1.ll")):
        print("Fleshed CFG created successfully!")
    
    else:
        print("Problem saving fleshed CFG")

    # hard coded example graph 2 - next step is to use cmd line args
    
    graph2 = pickle.load(open("graph_2.p", "rb"))

    cfg = CFG(graph2)

    cfg.fleshout()

    if (cfg.save_llvm_to_file("run_cfg_wip_2.ll")):
        print("Fleshed CFG created successfully!")
    
    else:
        print("Problem saving fleshed CFG")

if __name__=="__main__":
    main()
