#!/bin/bash

BASE="/data/dev/fuzzflesh"

cd $BASE

docker build -t agg22/fuzzflesh-ecoop-2025:latest -f docker/Dockerfile .

