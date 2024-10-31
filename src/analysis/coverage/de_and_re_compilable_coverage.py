from pathlib import Path 
import subprocess
import os
import pandas as pd 
import glob
from datetime import datetime, timedelta

def parse_xml(xml : Path):
    # xml cannot be parsed with element tree because
    # sometimes it has a junk format

    with open(xml,'r') as f:
        data = f.read()

    timestamp = data[data.find('Timestamp=') + len('Timestamp="') : data.find('"><OnesFailinginCompilation')]

    num1_tag = data.find('num="1"')
    tag_start = data[:num1_tag].rfind("<")

    result = data[tag_start + 1: num1_tag - 1]

    return (result, timestamp)

def get_programs(directory : Path) -> dict[Path, str]:
    
    programs={}
    
    for dir in directory.glob('*'):    
        xml = glob.glob(f'{dir}/*.xml')
        if len(xml) == 1:
            (test_result, time) = parse_xml(xml[0])
            time = time[:time.find('.')]
            time = datetime.strptime(time, '%Y-%m-%d %H:%M:%S')
            programs[dir] = (test_result, time)

    return programs

def write_fuzzing_config(paths, outpath):
    
    outpath.mkdir(exist_ok=True)

    with open(Path(outpath,'fuzzer_classes.xml'),'w') as f:
        f.write('<classes>\n')
        for path in paths:
            f.write('\t<class>\n')
            f.write(f'\t\t<path>{path}/eposide-1/1/original-1</path>\n')
            f.write(f'\t\t<name>Test.class</name>\n')
            f.write('\t</class>\n')
        f.write('</classes>')

def get_coverage(decompiler, fuzzer_xml_dir):

    if decompiler == 'cfr':
        outpath = fuzzer_xml_dir
        
        cov_cmd = ['/bin/bash',
            './java/get_cfr_coverage.sh',
            str(outpath),
            str(fuzzer_xml_dir),
            'jdtester']

        subprocess.run(cov_cmd)


def main():

    output : Path = Path('/data/work/fuzzflesh/coverage/coverage_results/de_and_recompilable/cfr')
    directory : Path = Path('/data/dev/jdtester/results/jdtester_cfr_javafuzzer_480')

    decompiler_fail = ['OnesFailinginCompilation', 'OnesFailinginDecompilation']
    recompilation_fail = ['OnesFailinginRecompilation']
    execution_fail = ['OnesFailinginExecutionChecking']
    success = ['SuccessOnes']

    programs = get_programs(directory)

    decompilable = {k : v for k,v in programs.items() if v[0] not in decompiler_fail}

    recompilable = {k : v for k,v in decompilable.items() if v[0] not in recompilation_fail}

    youngest = min([y for k,(x,y) in programs.items()])

    two_hour = youngest + timedelta(hours=2)

    decompilable_2hrs = {k : v for k,v in decompilable.items() if v[1] < two_hour}
    recompilable_2hrs = {k : v for k,v in recompilable.items() if v[1] < two_hour}

    write_fuzzing_config(decompilable_2hrs, Path(output,'decompilable_2hrs'))
    write_fuzzing_config(recompilable_2hrs, Path(output,'recompilable_2hrs'))

    print(len(recompilable))
    print(len(recompilable_2hrs))

    get_coverage('cfr', Path(output,'decompilable_2hrs'))
    get_coverage('cfr', Path(output,'recompilable_2hrs'))


if __name__=="__main__":
    main()