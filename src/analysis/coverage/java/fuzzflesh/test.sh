#!/bin/sh

CHECKS="HI THERE"

for CHECK in $CHECKS
do 
    if [ $CHECK = "HI" ]; then
        echo "$CHECK"
    fi
    echo "$CHECK"
done
