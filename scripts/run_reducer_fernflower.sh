SRC=/data/dev/fuzzflesh/src
DIR=/data/dev/fuzzflesh/data/reduction_example

PYTHONPATH=$SRC/fuzzflesh

python3.10 src/fuzzflesh/run_reducer.py \
    ${DIR}/interesting_graph.p \
    ${DIR}/interesting_input_4.json \
    /data/dev/fuzzflesh/src/fuzzflesh/reducer/interesting_scripts/interesting_fernflower.sh \
    ${DIR}/reduce_2 \
    --language='javabc'
 
