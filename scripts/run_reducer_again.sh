GRAPH=0
ROUTE=0

SRC=/data/dev/fuzzflesh/src
DIR=/data/work/fuzzflesh/dev_testing/output/08_13_no_dirs/out/graph_${GRAPH}/reduce_${ROUTE}/reduce_${ROUTE}/reduce_${ROUTE}

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python src/fuzzflesh/run_reducer.py \
    ${DIR}/interesting_graph.p \
    ${DIR}/interesting_input.json \
    /data/dev/fuzzflesh/src/fuzzflesh/reducer/interesting.sh \
    ${DIR}/reduce_${ROUTE} 
