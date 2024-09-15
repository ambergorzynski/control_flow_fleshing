#!/bin/sh

# Path to checkout of CFR with coverage from https://github.com/ambergorzynski/cfr_cov 
CFR=/data/dev/cfr_cov

# Run tests
cd $CFR
mvn clean test
mvn jacoco:report

# View interactive coverage results
open target/site/index.html