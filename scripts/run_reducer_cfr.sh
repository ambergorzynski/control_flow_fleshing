GRAPH=0
ROUTE=1

SRC=/data/dev/fuzzflesh/src
#DIR=/data/work/fuzzflesh/output/out/graph_{$GRAPH}
DIR=/data/work/fuzzflesh/interesting_programs/cfr/bug_3_decompiler_fail/reduced/reduce_1/hand_reduce_1/reduce_1

. $SRC/venv/bin/activate

PYTHONPATH=$SRC/fuzzflesh

#python src/fuzzflesh/run_reducer.py \
#    ${DIR}/graph_${GRAPH}.p \
#    ${DIR}/inputs_graph_${GRAPH}_path_${ROUTE}.json \
#    /data/dev/fuzzflesh/src/fuzzflesh/reducer/interesting_scripts/interesting_cfr.sh \
#    ${DIR}/reduce_${ROUTE} \
#    --dirs_known \
#    --language='javabc'

python src/fuzzflesh/run_reducer.py \
    ${DIR}/interesting_graph.p \
    ${DIR}/interesting_inputs.json \
    /data/dev/fuzzflesh/src/fuzzflesh/reducer/interesting_scripts/interesting_cfr.sh \
    ${DIR}/reduce_${ROUTE} \
    --dirs_known \
    --language='javabc'
 
