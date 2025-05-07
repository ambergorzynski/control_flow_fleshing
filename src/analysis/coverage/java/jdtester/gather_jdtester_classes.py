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
    parser.add_argument('--time')
    parser.add_argument('--fuzzer')

    args = parser.parse_args()

    datadir = Path(args.datadir)
    fuzzer_xml = Path(args.xmldir, 'fuzzer_classes.xml')
    os.makedirs(Path(args.xmldir),exist_ok=True)
    
    classpaths = {}
    for dir in datadir.glob('*'):
        if args.fuzzer == 'javafuzzer':
            num=Path(dir).stem
            classpath = Path(dir, f'original-{num}')
            if Path(classpath, 'Test.class').exists():
                classpaths[classpath] ='Test.class'
            elif Path(classpath, 'Test.jar').exists():
                classpaths[classpath] = 'Test.jar'

        elif args.fuzzer == 'hephaestus':
            for rounds in dir.glob('*'):
                for num in rounds.glob('*'):
                    print(num)
                    id=Path(num).stem
                    classpath = Path(num, f'original-{id}')
                    if Path(classpath, 'Test.jar').exists():
                        classpaths[classpath] = 'Test.jar'

    print(f'There are a total of {len(classpaths)} classpaths')

    keys = list(classpaths.keys())[:int(args.time)]
    classpaths = {k : classpaths[k] for k in keys}
    
    with open(fuzzer_xml, 'w') as f:
        f.write('<classes>')

        for classpath, name in classpaths.items():
            if '.class' in name:
                name = name[:-6]
            content = f'''
            <class>
                <path>{classpath}</path>
                <name>{name}</name>
            </class>
            '''
            f.write(content)
            
        f.write('''</classes>''')

    print(fuzzer_xml)

if __name__=="__main__":
    main()