#!/bin/bash

# Set parameters
BASE=/data/work/fuzzflesh/coverage
OUTPUTDIR=${BASE}/results

OUTPUT_FF_FERNFLOWER=${BASE}/ff_fernflower
OUTPUT_FF_CFR=${BASE}/ff_cfr
OUTPUT_FF_JADX=${BASE}/ff_jadx

OUTPUT_JD_FERNFLOWER=${BASE}/jd_fernflower
OUTPUT_JD_CFR=${BASE}/jd_cfr
OUTPUT_JD_JADX=${BASE}/jd_jadx

FUZZER_XML_FF_FERNFLOWER=${OUTPUT_FF_FERNFLOWER}/out
FUZZER_XML_FF_CFR=${OUTPUT_FF_CFR}/out
FUZZER_XML_FF_JADX=${OUTPUT_FF_JADX}/out

FUZZER_XML_JD_FERNFLOWER=${OUTPUT_JD_FERNFLOWER}
FUZZER_XML_JD_CFR=${OUTPUT_JD_CFR}
FUZZER_XML_JD_JADX=${OUTPUT_JD_JADX}

MINUTES=1

# Make output directories
mkdir -p $OUTPUTDIR

for tool in FF JD
do
  for decompiler in FERNFLOWER CFR JADX
    do
        folder=OUTPUT_${tool}_${decompiler}
        mkdir -p ${!folder}
    done
done


# Run FuzzFlesh to get programs for coverage
:'
/bin/bash 01a_run_fuzzflesh_on_cfr.sh $OUTPUT_FF_CFR $MINUTES
/bin/bash 01b_run_fuzzflesh_on_fernflower.sh $OUTPUT_FF_FERNFLOWER $MINUTES
/bin/bash 01c_run_fuzzflesh_on_jadx.sh $OUTPUT_FF_JADX $MINUTES 
'
# Run JD-Tester to get programs for coverage
# TODO

# Run python script to gather JD-Tester class locations

# Get coverage
:'
/bin/bash 03a_cfr_coverage.sh $OUTPUTDIR $FUZZER_XML_FF_CFR fuzzflesh
/bin/bash 03b_fernflower_coverage.sh $OUTPUTDIR $FUZZER_XML_FF_FERNFLOWER fuzzflesh
/bin/bash 03c_jadx_coverage.sh $OUTPUTDIR $FUZZER_XML_FF_JADX fuzzflesh
'
/bin/bash 03a_cfr_coverage.sh $OUTPUTDIR $FUZZER_XML_JD_CFR jdtester
:'
/bin/bash 03b_fernflower_coverage.sh $OUTPUTDIR $FUZZER_XML_JD_FERNFLOWER jdtester
/bin/bash 03c_jadx_coverage.sh $OUTPUTDIR $FUZZER_XML_JD_JADX jdtester
'