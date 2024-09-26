# This script looks in the JD-Tester output directories
# and collects the path locations of the relevant
# .class files

from pathlib import Path

def main():
    outputdir : Path = Path('/data/dev/jdtester/cfr_output/eposide-1')
    fuzzer_xml : Path = Path('/data/work/fuzzflesh/coverage/cfr/jdtester/javafuzzer/fuzzer_classes.xml')
    classpaths = []

    for dir in outputdir.glob('*'):
        num = dir.stem
        classpath = Path(dir, f'original-{num}')
        classpaths.append(classpath)

    with open(fuzzer_xml, 'w') as f:
        f.write('<classes>')

        for classpath in classpaths:
            content = f'''
            <class>
                <path>{classpath}</path>
                <name>Test</name>
            </class>
            '''
            f.write(content)
            
        f.write('''</classes>''')


if __name__=="__main__":
    main()