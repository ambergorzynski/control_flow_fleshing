GRAPH=4
ROUTE=2

SRC=/data/dev/fuzzflesh/src
#DIR=/data/work/fuzzflesh/output/out/graph_{$GRAPH}
DIR=/data/work/fuzzflesh/interesting_programs/fernflower/possible_misdecompilation/graph_4/reduce_2

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

python src/fuzzflesh/run_reducer.py \
    ${DIR}/interesting_graph.p \
    ${DIR}/interesting_input_4.json \
    /data/dev/fuzzflesh/src/fuzzflesh/reducer/interesting_scripts/interesting_fernflower.sh \
    ${DIR}/reduce_${ROUTE} \
    --language='javabc'
 
