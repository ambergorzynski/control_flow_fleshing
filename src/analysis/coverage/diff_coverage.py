import xml.etree.ElementTree as et 
import pandas as pd

xml = '/data/dev/fernflower/intellij-community-cov/plugins/java-decompiler/engine/build/customJacocoReportDir/test/jacocoTestReport.xml'

tree = et.parse(xml)

root = tree.getroot()
'''
for i in root:
    print(i.attrib)

print(f'\n\n\{root.tag}')

for child in root:
    print(child.tag, child.attrib)
    for c in child:
        print(f'\t{c.tag, c.attrib}')
        for cc in c:
            print(f'\t\t{cc.tag, cc.attrib}')
'''

# Create a dictionary with:
#   key = java file name
#   value = dataframe containing cols: [
#           line number, 
#           instructions covered, instructions missed, 
#           branches covered, branches missed ]
# Should be able to match on dictionary key with other
# coverage data, and then match on line number to check
# differential coverage

sourcefiles = root.findall('.//sourcefile')

data = {}

for s in sourcefiles:

    lines = s.findall('./line')
    datalines = [x.attrib for x in lines]
    df = pd.DataFrame(datalines)

    data[s.attrib['name']] = df

print(data['MethodProcessorRunnable.java'])

