import xml.etree.ElementTree as et 
import pandas as pd
import numpy as np
from pathlib import Path
import collections, functools, operator


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
class Data():
    def __init__(self, _src : str,
            _one : pd.DataFrame,
            _one_id : str,
            _two : pd.DataFrame,
            _two_id : str):
        self.sourcefile : str = _src
        self.one_id : str = _one_id
        self.one : pd.DataFrame = _one
        self.two_id : str = _two_id 
        self.two : pd.DataFrame = _two
        self.result : pd.DataFrame = None
    
    def __str__(self):
        return f"Data object for sourcefile: {self.sourcefile}"

    def compare(self):
        try:
            df = self.one.merge(self.two, 
                            how = 'outer',
                            left_on = 'nr',
                            right_on = 'nr',
                            suffixes = (f'_{self.one_id}', f'_{self.two_id}'))
        except:
            print(f'Merge failed for sourcefile: {self.sourcefile}')
            if self.one.empty and self.two.empty:
                print(f'Both dataframes are empty')
            else:
                print(f'Some data here! Check manually')

            return (Summary(self.one_id, self.two_id, empty=True), [])

        df['total_i'] = df[f'ci_{self.one_id}'] + df[f'mi_{self.one_id}'] 
        df['total_b'] = df[f'cb_{self.one_id}'] + df[f'mb_{self.one_id}'] 

        for metric in ['ci', 'cb']:
            conditions = [(df[f'{metric}_{self.one_id}'] > df[f'{metric}_{self.two_id}']),
                    (df[f'{metric}_{self.one_id}'] < df[f'{metric}_{self.two_id}']),
                    (df[f'{metric}_{self.one_id}'] == df[f'{metric}_{self.two_id}'])]

            choices = [f'{self.one_id} > {self.two_id}',
                    f'{self.one_id} < {self.two_id}',
                    f'{self.one_id} = {self.two_id}']

            df[metric] = np.select(conditions, choices)

            df[f'{metric}_{self.one_id}_minus_{self.two_id}'] = df[f'{metric}_{self.one_id}'] - df[f'{metric}_{self.two_id}']
        
        self.result = df

        summary = Summary(self.one_id, self.two_id)
        summary.total_instructions = df['total_i'].sum()
        summary.total_branches = df['total_b'].sum()

        summary.instr_covered['by_both'] = df[[f'ci_{self.one_id}', f'ci_{self.two_id}']].min(axis=1).sum()
        summary.instr_covered[f'by_{self.one_id}_only'] = df.loc[df['ci'] == f'{self.one_id} > {self.two_id}', f'ci_{self.one_id}_minus_{self.two_id}'].sum()
        summary.instr_covered[f'by_{self.two_id}_only'] = -1 * df.loc[df['ci'] == f'{self.one_id} < {self.two_id}', f'ci_{self.one_id}_minus_{self.two_id}'].sum()
        summary.instr_covered['by_neither']= df[[f'mi_{self.one_id}', f'mi_{self.two_id}']].min(axis=1).sum()

        assert sum(summary.instr_covered.values()) == summary.total_instructions

        summary.branches_covered['by_both']= df[[f'cb_{self.one_id}', f'cb_{self.two_id}']].min(axis=1).sum()
        summary.branches_covered[f'by_{self.one_id}_only']= df.loc[df['cb'] == f'{self.one_id} > {self.two_id}', f'cb_{self.one_id}_minus_{self.two_id}'].sum()
        summary.branches_covered[f'by_{self.two_id}_only']= -1 * df.loc[df['cb'] == f'{self.one_id} < {self.two_id}', f'cb_{self.one_id}_minus_{self.two_id}'].sum()
        summary.branches_covered['by_neither']= df[[f'mb_{self.one_id}', f'mb_{self.two_id}']].min(axis=1).sum()

        assert sum(summary.branches_covered.values()) == summary.total_branches

        return (summary, self.result)

class Summary():
    def __init__(self, one : str, two : str, empty = False):
        self.total_instructions : int 
        self.instr_covered : dict = {
            'by_both' : None,
            f'by_{one}_only' : None,
            f'by_{two}_only' : None,
            'by_neither' : None
        }
        self.total_branches : int 
        self.branches_covered : dict = {
            'by_both' : None,
            f'by_{one}_only' : None,
            f'by_{two}_only' : None,
            'by_neither' : None
        }
        if empty:
            self.total_instructions = 0
            self.total_branches = 0
            self.instr_covered = {k : 0 for (k,v) in self.instr_covered.items()}
            self.branches_covered = {k : 0 for (k,v) in self.branches_covered.items()}        

    def __str__(self):
        return f'''
        Total instructions: {self.total_instructions}\n
        Total branches: {self.total_branches}\n
        Instruction coverage by tool: {self.instr_covered}\n
        Branch coverage by tool: {self.branches_covered}\n'''

def get_coverage(xml : Path) -> dict[str, pd.DataFrame]:
    # Create a dictionary with:
    #   key = java file name
    #   value = dataframe containing cols: [
    #           line number, 
    #           instructions covered, instructions missed, 
    #           branches covered, branches missed ]
    # Should be able to match on dictionary key with other
    # coverage data, and then match on line number to check
    # differential coverage

    tree = et.parse(xml)
    root = tree.getroot()
    sourcefiles = root.findall('.//sourcefile')

    data = {}

    for s in sourcefiles:

        lines = s.findall('./line')
        datalines = [x.attrib for x in lines]
        df = pd.DataFrame(datalines)
        data[s.attrib['name']] = df.astype(int)

    return data

def compare(one : dict[str, pd.DataFrame], 
        one_id : str,
        two : dict[str, pd.DataFrame],
        two_id : str):

    keys1 = one.keys()
    keys2 = two.keys()

    if keys1 != keys2:
        print('Error! Sourcefiles do not match')
        exit(1)
    
    # Make a list of Data objects that contain the matched dfs for 
    # each sourcefile
    src_compare = []

    for src, data in one.items():
        src_compare.append(Data(src, data, one_id, two[src], two_id))

    src_summary = []
    src_df = []

    for src in src_compare:
        (summary, df) = src.compare()
        src_summary.append(summary)
        src_df.append(df)

    overall_coverage = Summary(one_id, two_id)
    overall_coverage.total_instructions = sum([ x.total_instructions for x in src_summary])
    overall_coverage.total_branches = sum([x.total_branches for x in src_summary])
    
    instr_covered_list = [x.instr_covered for x in src_summary]
    overall_coverage.instr_covered = dict(functools.reduce(operator.add, map(collections.Counter, instr_covered_list)))

    branches_covered_list = [x.branches_covered for x in src_summary]
    overall_coverage.branches_covered = dict(functools.reduce(operator.add, map(collections.Counter, branches_covered_list)))

    assert sum(overall_coverage.instr_covered.values()) == overall_coverage.total_instructions
    assert sum(overall_coverage.branches_covered.values()) == overall_coverage.total_branches

    return overall_coverage

    
def main():

    base : Path = Path('/data/work/fuzzflesh/coverage/coverage_results')
    output : Path = Path(base, 'analysis')

    fernflower_configs = {
        'jd_javafuzzer_120' : Path(base, 'jd', 'jdtester_fernflower_javafuzzer_120', 'coverage.xml'),
        'ff_dirs_known_120' : Path(base, 'ff', 'fuzzflesh_fernflower_dirs_known_120', 'coverage.xml')
    }

    fernflower = {}

    for config, config_path in fernflower_configs.items():
        fernflower[config] = get_coverage(config_path)

    # compare coverage
    overall_coverage : Summary = compare(fernflower['jd_javafuzzer_120'], 'jd',
        fernflower['ff_dirs_known_120'], 'ff')

    print(overall_coverage)

    

    # write results to latex file as table
    # TODO make visualisation e.g. venn diagram

if __name__=="__main__":
    main()