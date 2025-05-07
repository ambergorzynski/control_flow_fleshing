from pathlib import Path 
import argparse
import subprocess
import os
import xml.etree.ElementTree as et 
import time
from datetime import datetime, timedelta

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument('time')
    parser.add_argument('output')
    parser.add_argument('ghidra_cov')
    args = parser.parse_args()

    TIME=args.time

    binary_path=Path(f'/data/dev/fuzzflesh/external/decfuzzer/experiments')
    outdir=Path(args.output,f'decfuzzer_ghidra11_{TIME}')

    GHIDRA=args.ghidra_cov
    DECOMPILER_ROOT=f'{GHIDRA}/Ghidra/Features/Decompiler'

    decompiler_path=f'{GHIDRA}/Ghidra/RuntimeScripts/Linux/support/analyzeHeadless'

    outdir.mkdir(parents=True, exist_ok=True)

    programs = {}

    # get program paths from the binary directory
    # generating 10,000 programs took 6 hours (timed separately due to the way that DecFuzzer generates)
    # so on average each program takes 10,000 / (60*60) seconds to generate
    for dir in binary_path.glob('*'):
        dir = str(dir)
        num = dir[dir.find('_') + 1:]
        programs[f'{dir}/{num}'] = int(num)*(10000/(60*60))

    stoptime = int(TIME)*60 # in seconds

    programs = [k for k,v in programs.items() if v < stoptime] # filter for programs within the given time

    # get program filepaths 
    for program in programs:
        print(f'Program name: {program}')
        env=os.environ.copy()
        
        env['JAVA_HOME']='/usr/lib/jvm/java-17-openjdk-amd64/'

        ghidra_cmd = [str(decompiler_path),
            str(outdir),
            "Project",
            "-import",
            program,
            "-overwrite"]

        result = subprocess.run(ghidra_cmd, env=env)


    # produce csv summary of coverage
    cov_cmd = ['gcovr',
            '-r',
            '.',
            '--gcov-ignore-parse-errors=all',
            '--csv',
            f'{outdir}/coverage.csv',
            '--xml',
            f'{outdir}/coverage.xml']

    result = subprocess.run(cov_cmd, cwd=DECOMPILER_ROOT)

if __name__=="__main__":
    main()
