DIR="large_test_270224_v5"

python run_reducer.py \
    /data/work/ghidra/reducer/${DIR}/test_graph.p \
    /data/work/ghidra/reducer/${DIR}/inputs.txt \
    /data/work/ghidra/reducer/dummy_run_interesting.sh \
    /data/work/ghidra/reducer/${DIR}/output
