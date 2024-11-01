# This script looks in the JD-Tester output directories
# and collects the path locations of the relevant
# .class files

from pathlib import Path
import os
import argparse

def main():
    parser = argparse.ArgumentParser()

    parser.add_argument('--datadir')
    parser.add_argument('--xmldir')

    args = parser.parse_args()

    datadir = Path(args.datadir)
    fuzzer_xml = Path(args.xmldir, 'fuzzer_classes.xml')

    os.makedirs(Path(args.xmldir),exist_ok=True)
    
    classpaths = {}

    for dir in datadir.glob('*'):
        classpath = Path(dir, 'eposide-1/1/original-1')

        if Path(classpath, 'Test.class').exists():
            classpaths[classpath] ='Test.class'
        elif Path(classpath, 'Test.jar').exists():
            classpaths[classpath] = 'Test.jar'

    with open(fuzzer_xml, 'w') as f:
        f.write('<classes>')

        for classpath, name in classpaths.items():
            content = f'''
            <class>
                <path>{classpath}</path>
                <name>{name}</name>
            </class>
            '''
            f.write(content)
            
        f.write('''</classes>''')

if __name__=="__main__":
    main()