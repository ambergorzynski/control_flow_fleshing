from pathlib import Path 
import subprocess
import os
import xml.etree.ElementTree as et 
import time
from datetime import datetime, timedelta

TIME=120

binary_path=Path(f'/data/dev/decfuzzer/experiments')
outdir=Path(f'/data/work/fuzzflesh/coverage/coverage_results/df/decfuzzer_ghidra11_{TIME}')

GHIDRA=f'/data/dev/ghidra_cov'
DECOMPILER_ROOT=f'{GHIDRA}/Ghidra/Features/Decompiler'

decompiler_path=f'{GHIDRA}/build/dist/ghidra_11.0.3_DEV/support/analyzeHeadless'

outdir.mkdir(exist_ok=True)

# remove .gcda files from gcov
result = subprocess.run(['/bin/bash','../remove_gcda.sh', GHIDRA])
if result.returncode != 0:
    print('Problem removing .gcda files!')
    exit()

programs = {}

# get program paths from the binary directory
for dir in binary_path.glob('*'):
    creation_time = os.path.getctime(dir)
    dir = str(dir)
    num = dir[dir.find('_') + 1:]
    programs[f'{dir}/{num}'] = datetime.fromtimestamp(creation_time)

youngest = min([v for k,v in programs.items()])
stoptime = youngest + timedelta(hours=2)

programs_2hrs = [k for k,v in programs.items() if v < stoptime]

print(len(programs_2hrs))

for x in programs_2hrs:
    print(x)


print(len(programs_2hrs))

exit()
# get program filepaths 
for program in programs_2hrs:
    print(program)
    env=os.environ.copy()
    
    env['JAVA_HOME']='/usr/lib/jvm/java-19-openjdk-amd64/'

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
        f'{outdir}/coverage.xml',
        '--html',
        '--html-details',
        f'{outdir}/coverage.html']

result = subprocess.run(cov_cmd, cwd=DECOMPILER_ROOT)


