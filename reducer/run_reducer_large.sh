DIR="large_test_280224_v3"

python run_reducer.py \
    /data/work/ghidra/reducer/${DIR}/test_graph.p \
    /data/work/ghidra/reducer/${DIR}/inputs.txt \
    /data/work/ghidra/reducer/interesting.sh \
    /data/work/ghidra/reducer/${DIR}/output
