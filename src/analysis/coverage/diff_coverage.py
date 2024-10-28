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

            return (Summary(self.one_id, self.two_id, empty=True), pd.DataFrame())

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
        self.data_one : str = one
        self.data_two : str = two
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
        Dataset 1: {self.data_one}\n
        Dataset 2: {self.data_two}\n
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

def get_overall_coverage_summary(src_summary : list[Summary]):

    one_id = src_summary[0].data_one
    two_id = src_summary[0].data_two

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

def get_difference_df(dfs : dict[str,list[pd.DataFrame]]):

    ''' param is a dictionary with sourcefile names as keys
        and dataframes containing coverage information as 
        values 
    '''

    frames = [df.assign(sourcefile=key) for key, df in dfs.items() if not df.empty]
    
    # check all columns are consistent across datasets
    columns = [x.columns.tolist() for x in frames]
    assert all([x == columns[0] for x in columns])

    all_dfs = pd.concat(frames, ignore_index = True)

    # keep rows where different coverage exists for instructions or branches
    filtered_df = all_dfs[(~all_dfs['ci'].str.contains('=')) | (~all_dfs['cb'].str.contains('=')) ]

    filtered_df = filtered_df.reset_index(drop = True)

    return filtered_df

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

    src_summary = {}
    src_df = {}

    for data in src_compare:
        (summary, df) = data.compare()

        src_summary[data.sourcefile] = summary
        src_df[data.sourcefile] = df

    # Don't need to know src file names for overall coverage so just pass a 
    # list of Summary objects
    overall_coverage = get_overall_coverage_summary([v for k, v in src_summary.items()])

    detailed_difference_df = get_difference_df(src_df)

    return (overall_coverage, detailed_difference_df)


    
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
    (overall_coverage, detailed_difference_df) = compare(fernflower['jd_javafuzzer_120'], 'jd',
        fernflower['ff_dirs_known_120'], 'ff')

    print(overall_coverage)
    #with open(Path(output, 'overall_differential_coverage.csv'),'w') as f:
    #    f.write(overall_coverage)

    detailed_difference_df.to_csv(Path(output, 'detailed_differential_coverage.csv'))

    # write results to latex file as table
    # TODO make visualisation e.g. venn diagram

if __name__=="__main__":
    main()