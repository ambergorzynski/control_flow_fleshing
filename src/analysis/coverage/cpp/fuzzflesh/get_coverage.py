from pathlib import Path 
import subprocess
import os
import xml.etree.ElementTree as et 

DIRS='dirs_unknown'
TIME=120

xml=Path(f'/data/work/fuzzflesh/coverage/fuzzer_outputs/ff/fuzzflesh_ghidra11_{DIRS}_{TIME}/out/fuzzer_classes.xml')
outdir=Path(f'/data/work/fuzzflesh/coverage/coverage_results/ff/fuzzflesh_ghidra11_{DIRS}_{TIME}')

GHIDRA=f'/data/dev/ghidra_cov'
DECOMPILER_ROOT=f'{GHIDRA}/Ghidra/Features/Decompiler'

decompiler_path=f'{GHIDRA}/build/dist/ghidra_11.0.3_DEV/support/analyzeHeadless'

outdir.mkdir(exist_ok=True)

# remove .gcda files from gcov
result = subprocess.run(['/bin/bash','remove_gcda.sh'])
if result.returncode != 0:
    print('Problem removing .gcda files!')
    exit()

# read paths from fuzzer_xml
tree = et.parse(xml)
root = tree.getroot()
programs = root.findall('.//path')
programs = [p.text for p in programs]

# get program filepaths 
for program in programs:
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


