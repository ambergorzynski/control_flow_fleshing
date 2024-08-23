GRAPH=5
ROUTE=0

SRC=/data/dev/fuzzflesh/src
DIR=/data/work/fuzzflesh/dev_testing/output/08_13_no_dirs/out/graph_${GRAPH}

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python src/fuzzflesh/run_reducer.py \
    ${DIR}/graph_${GRAPH}.p \
    ${DIR}/inputs_graph_${GRAPH}_path_${ROUTE}.json \
    /data/dev/fuzzflesh/src/fuzzflesh/reducer/interesting.sh \
    ${DIR}/reduce_${ROUTE} 
