#!/bin/sh

DECFUZZER=/data/dev/decfuzzer

cd $DECFUZZER

# Must start the server as root
# sudo service sql start

source venv/bin/activate

export HOME=/data/dev

# get start time
SECONDS=0

python run.py

# get end time
echo "Time elapsed is: ${SECONDS}"

# original run: time elapsed is 5295 seconds, although it appears tht the EMI did not run after this?
