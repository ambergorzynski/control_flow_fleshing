import xml.etree.ElementTree as et 
import pandas as pd
import numpy as np
from pathlib import Path
import collections, functools, operator
import math


class Summary():
    def __init__(self, decompiler : str, one : str, two : str, empty = False):
        self.decompiler : str = decompiler
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

    def get_pct_instruction_coverage(self):
        return {k : int(round((v / self.total_instructions)*100, 0)) for k,v in self.instr_covered.items()}
    
    def get_pct_branch_coverage(self):
        return {k : int(round((v / self.total_branches)*100, 0)) for k,v in self.branches_covered.items()}
        

class Data():
    def __init__(self, 
            _decompiler : str,
            _src : str,
            _one : pd.DataFrame,
            _one_id : str,
            _two : pd.DataFrame,
            _two_id : str):
        self.decompiler : str = _decompiler
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

            return (Summary(self.decompiler, self.one_id, self.two_id, empty=True), pd.DataFrame())

        df['total_i'] = df[f'ci_{self.one_id}'] + df[f'mi_{self.one_id}'] 
        df['total_b'] = df[f'cb_{self.one_id}'] + df[f'mb_{self.one_id}'] 

        df['total_b2']= df[f'cb_{self.two_id}'] + df[f'mb_{self.two_id}'] 
        '''
        print(df.loc[~(df['total_b'] == df['total_b2'])])
        print((df.loc[~(df['total_b'] == df['total_b2'])]).shape)
        print(f'name: {self.sourcefile}')
        '''
        assert df['total_b'].equals(df['total_b2'])

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

        summary = Summary(self.decompiler, self.one_id, self.two_id)
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


def make_overall_latex_table_java(overall_coverage : list[Summary]) -> str:

    instr_data = {x.decompiler : x.get_pct_instruction_coverage() for x in overall_coverage}
    branch_data = {x.decompiler : x.get_pct_branch_coverage() for x in overall_coverage}

    rows = {
        'CFR' : 'cfr',
        'FernFlower' : 'fernflower',
        'JADX' : 'jadx'
        }

    col_config = {
        'FuzzFlesh' : 'by_ff_only',
        'JD-Tester' : 'by_jd_only',
        'Both' : 'by_both',
        'Neither' : 'by_neither'
        }

    cols = [f'instr_{v}' for k,v in col_config.items()] 
    cols.extend([f'branch_{v}' for k,v in col_config.items()])

    df = pd.DataFrame(columns=cols, 
            index = [v for k,v in rows.items()])
    
    for decomp in [v for k,v in rows.items()]:

        # instruction coverage
        for c, config in col_config.items():
            try:
                df.loc[decomp, f'instr_{config}'] = instr_data[decomp][config]
            except:
                df.loc[decomp, f'instr_{config}'] = '-'

        # branch coverage
        for  c, config in col_config.items():
            try:
                df.loc[decomp, f'branch_{config}'] = branch_data[decomp][config]
            except:
                df.loc[decomp, f'branch_{config}'] = '-'

    code = f'''
\\begin{{table*}}[htbp]
\caption{{Unique coverage comparison (\%)}}
\label{{tab:unique_coverage_java}}
\\begin{{tabular}}{{m{{1.7cm}}|M{{1.3}}M{{1.4}}M{{0.7}}M{{1}}|M{{1.3}}M{{1.4}}M{{0.7}}M{{1}}}}

\\toprule
& \multicolumn{{4}}{{c|}}{{Instructions covered by}}  %
    & \multicolumn{{4}}{{c}}{{Branches covered by}} \\\\
        Decompiler %
        & \mC{{1.3}}{{FuzzFlesh}} %
        & \mC{{1.4}}{{JD-Tester}} %
        & \mC{{0.7}}{{Both}} %
        & \multicolumn{{1}}{{ N{{1}}|}}{{Neither}}  %        
        & \mC{{1.3}}{{FuzzFlesh}} %  
        & \mC{{1.4}}{{JD-Tester}} % 
        & \mC{{0.7}}{{Both}} %       
        & \mC{{1}}{{Neither}} \\\\ %
        \midrule  '''
    for r, decomp in rows.items():
        code += f'''
    {r} '''
        for c in cols:
            if not pd.isna(df.loc[decomp,c]):
                code += f''' & {df.loc[decomp, c]} '''
            else:
                code += ''' & - '''
        
        code += '''\\\\
'''

    code += '''
\\bottomrule
\end{tabular}
\end{table*}
    '''
    return code


def make_overall_latex_table_c(overall_coverage : list[Summary]) -> str:

    line_data = {x.decompiler : x.get_pct_instruction_coverage() for x in overall_coverage}
    branch_data = {x.decompiler : x.get_pct_branch_coverage() for x in overall_coverage}

    rows = {
        'Ghidra' : 'ghidra11',
        }

    col_config = {
        'FuzzFlesh' : 'by_ff_only',
        'DecFuzzer' : 'by_df_only',
        'Both' : 'by_both',
        'Neither' : 'by_neither'
        }

    cols = [f'instr_{v}' for k,v in col_config.items()] 
    cols.extend([f'branch_{v}' for k,v in col_config.items()])

    df = pd.DataFrame(columns=cols, 
            index = [v for k,v in rows.items()])
    
    for decomp in [v for k,v in rows.items()]:

        # instruction coverage
        for c, config in col_config.items():
            try:
                df.loc[decomp, f'instr_{config}'] = line_data[decomp][config]
            except:
                df.loc[decomp, f'instr_{config}'] = '-'

        # branch coverage
        for  c, config in col_config.items():
            try:
                df.loc[decomp, f'branch_{config}'] = branch_data[decomp][config]
            except:
                df.loc[decomp, f'branch_{config}'] = '-'

    code = f'''
\\begin{{table*}}[htbp]
\caption{{Unique coverage comparison (\%)}}
\label{{tab:unique_coverage_java}}
\\begin{{tabular}}{{m{{1.7cm}}|M{{1.3}}M{{1.4}}M{{0.7}}M{{1}}|M{{1.3}}M{{1.4}}M{{0.7}}M{{1}}}}

\\toprule
& \multicolumn{{4}}{{c|}}{{Instructions covered by}}  %
    & \multicolumn{{4}}{{c}}{{Branches covered by}} \\\\
        Decompiler %
        & \mC{{1.3}}{{FuzzFlesh}} %
        & \mC{{1.4}}{{DecFuzzer}} %
        & \mC{{0.7}}{{Both}} %
        & \multicolumn{{1}}{{ N{{1}}|}}{{Neither}}  %        
        & \mC{{1.3}}{{FuzzFlesh}} %  
        & \mC{{1.4}}{{DecFuzzer}} % 
        & \mC{{0.7}}{{Both}} %       
        & \mC{{1}}{{Neither}} \\\\ %
        \midrule  '''
    for r, decomp in rows.items():
        code += f'''
    {r} '''
        for c in cols:
            if not pd.isna(df.loc[decomp,c]):
                code += f''' & {df.loc[decomp, c]} '''
            else:
                code += ''' & - '''
        
        code += '''\\\\
'''

    code += '''
\\bottomrule
\end{tabular}
\end{table*}
    '''
    return code


def make_overall_latex_table_single_metric(metric : str, overall_coverage : list[Summary]) -> str:

    if metric == 'instructions':
        data = {x.decompiler : x.get_pct_instruction_coverage() for x in overall_coverage}
    elif metric == 'branches':
        data = {x.decompiler : x.get_pct_branch_coverage() for x in overall_coverage}

    rows = {
        'CFR' : 'cfr',
        'FernFlower' : 'fernflower',
        'JADX' : 'jadx'
        }

    cols = {
        'FuzzFlesh' : 'by_ff_only',
        'JD-Tester' : 'by_jd_only',
        'Both' : 'by_both',
        'Neither' : 'by_neither'
        }

    df = pd.DataFrame(columns=[v for k,v in cols.items()], 
            index = [v for k,v in rows.items()])
    
    for decomp in [v for k,v in rows.items()]:
        for config in [v for k,v in cols.items()]:
            try:
                df.loc[decomp, config] = data[decomp][config]
            except:
                df.loc[decomp, config] = '-'

    code = f'''
\\begin{{table*}}[htbp]
\caption{{Unique {metric} coverage comparison (\%)}}
\label{{tab:instruction_coverage}}
\\begin{{tabular}}{{m{{1.7cm}}|M{{2}}M{{2}}M{{2}}M{{2}}}}

\\toprule
& \multicolumn{{4}}{{c}}{{{metric.title()} covered by}} \\\\
        Decompiler %
        & \mC{{2}}{{FuzzFlesh}} %
        & \mC{{2}}{{JD-Tester}} %
        & \mC{{2}}{{Both}} %
        & \mC{{2}}{{Neither}} \\\\
\midrule '''
    for r, decomp in rows.items():
        code += f'''
    {r} '''
        for c, config in cols.items():
            if not pd.isna(df.loc[decomp,config]):
                code += f''' & {df.loc[decomp, config]} '''
            else:
                code += ''' & - '''
        
        code += '''\\\\
'''

    code += '''
\\bottomrule
\end{tabular}
\end{table*}
    '''
    return code

def get_coverage(xml : Path, lang : str) -> dict[str, pd.DataFrame]:
    # Create a dictionary with:
    #   key = java file name
    #   value = dataframe containing cols: [
    #           line number, 
    #           instructions covered, instructions missed, 
    #           branches covered, branches missed ]
    # Should be able to match on dictionary key with other
    # coverage data, and then match on line number to check
    # differential coverage

    try:
        tree = et.parse(xml)

    except:
        print(f'No coverage xml available for {xml}')
        return {}

    if lang == 'jacoco':
        return get_jacoco_coverage(tree)

    elif lang == 'gcov':
        return get_gcov_coverage(tree)

def get_jacoco_coverage(tree : et.ElementTree) -> dict[str, pd.DataFrame]:

    root = tree.getroot()
    sourcefiles = root.findall('.//sourcefile')

    data = {}

    for s in sourcefiles:

        lines = s.findall('./line')
        datalines = [x.attrib for x in lines]
        df = pd.DataFrame(datalines)
        data[s.attrib['name']] = df.astype(int)

    return data

def hits_to_ci(hits : str):
    if hits == '0':
        return 0
    else:
        return 1

def hits_to_mi(hits : str):
    if hits == '0':
        return 1
    else:
        return 0

def branch_to_cb(branch):
    if str(branch) == 'nan':
        return 0
    else:
        return int(branch[branch.find('(')+1:branch.find('/')])

def branch_to_mb(branch):
    if str(branch) == 'nan':
        return 0
    else:
        total = int(branch[branch.find('/')+1:branch.find(')')])
        covered = int(branch[branch.find('(')+1:branch.find('/')])
        return (total - covered)

def get_gcov_coverage(tree : et.ElementTree) -> dict[str, pd.DataFrame]:

    root = tree.getroot()

    classes = root.findall('.//class')

    data = {}

    for clazz in classes:
        
        lines = clazz.findall('.//line')
        datalines = [x.attrib for x in lines]
        df = pd.DataFrame(datalines)
        if 'condition-coverage' not in df:
            df['condition-coverage'] = 'nan'

        # convert data to same format as jacoco for ease of analysis
        df = df.rename(columns={'number':'nr'})
        df['ci'] = df['hits'].apply(hits_to_ci)
        df['mi'] = df['hits'].apply(hits_to_mi)
        df['cb'] = df['condition-coverage'].apply(branch_to_cb)
        df['mb'] = df['condition-coverage'].apply(branch_to_mb)
        
        data[clazz.attrib['name']] = df

    return data

def get_overall_coverage_summary(src_summary : list[Summary]):

    decompiler = src_summary[0].decompiler
    one_id = src_summary[0].data_one
    two_id = src_summary[0].data_two

    overall_coverage = Summary(decompiler, one_id, two_id)
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

def compare(
        decompiler : str,
        one : dict[str, pd.DataFrame], 
        one_id : str,
        two : dict[str, pd.DataFrame],
        two_id : str):

    keys1 = one.keys()
    keys2 = two.keys()

    if decompiler == 'ghidra11':
        k1 = set(keys1)
        k2 = set(keys2)

        print(f'Files only in {one_id}: {k1.difference(k2)}')
        print(f'Files only in {two_id}: {k2.difference(k1)}')

        # for ghidra there are some coverage differences in the 
        # interface between r2ghidra and standalone ghidra. we are
        # interested in the decompiler part of ghidra, so drop these
        # differences
        for k in k1.difference(k2):
            one.pop(k, None)
        for k in k2.difference(k1):
            two.pop(k, None)


    if keys1 != keys2:
        print('Sourcefiles do not match!')
        exit()

    k1 = set(keys1)
    k2 = set(keys2)
    
    # Make a list of Data objects that contain the matched dfs for 
    # each sourcefile
    src_compare = []

    for src, data in one.items():
        src_compare.append(Data(decompiler, src, data, one_id, two[src], two_id))

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

def filter_for_ff(df : pd.DataFrame, value : str):
    return df[(df['ci'] == value) | (df['cb'] == value)]
    
def get_java_coverage():

    base : Path = Path('/data/work/fuzzflesh/coverage/coverage_results')
    output : Path = Path(base, 'analysis')

    decompilers = ['cfr', 'fernflower', 'jadx']
    jdfuzzer = 'javafuzzer'
    dirs = 'dirs_known'
    time = 120

    configs = {}
    coverage = {}

    for decomp in decompilers:
        configs[decomp] = {
            'jd' : Path(base, 'jd', f'jdtester_{decomp}_{jdfuzzer}_{time}', 'coverage.xml'),
            'ff' : Path(base, 'ff', f'fuzzflesh_{decomp}_{dirs}_{time}', 'coverage.xml')
        }

        coverage[decomp] = {}

    for decomp in decompilers:
        for config, config_path in configs[decomp].items():
            coverage[decomp][config] = get_coverage(config_path, 'jacoco')

    # compare coverage
    all_cov = {}
    detailed_df = {}

    for decomp in decompilers:
        (all_cov[decomp], detailed_df[decomp]) = compare(decomp, 
                                        coverage[decomp]['jd'], 'jd',
                                        coverage[decomp]['ff'], 'ff')
    
    latex_code = make_overall_latex_table_java([v for k,v in all_cov.items()])

    with open(Path(output, 'unique_coverage_java.tex'), 'w') as f:
        f.write(latex_code)

    #detailed_difference_df.to_csv(Path(output, 'detailed_differential_coverage.csv'))
    for decomp in decompilers:
        detailed_df[decomp] = filter_for_ff(detailed_df[decomp], 'jd < ff')
        detailed_df[decomp] = detailed_df[decomp].reset_index(drop=True)
        detailed_df[decomp].to_csv(Path(output, f'ff_only_coverage_df_{decomp}'), sep = '\t')

def get_c_coverage():

    base : Path = Path('/data/work/fuzzflesh/coverage/coverage_results')
    output : Path = Path(base, 'analysis')

    decompilers = ['ghidra11']
    dirs = 'dirs_known'
    time = 120

    configs = {}
    coverage = {}

    for decomp in decompilers:
        configs[decomp] = {
            'df' : Path(base, 'df', f'decfuzzer_{decomp}_{time}', 'coverage.xml'),
            'ff' : Path(base, 'ff', f'fuzzflesh_{decomp}_{dirs}_{time}', 'coverage.xml')
        }

        coverage[decomp] = {}

        for config, config_path in configs[decomp].items():
            coverage[decomp][config] = get_coverage(config_path, 'gcov')


    # compare coverage
        all_cov = {}
        detailed_df = {}

        for decomp in decompilers:
            (all_cov[decomp], detailed_df[decomp]) = compare(decomp, 
                                            coverage[decomp]['df'], 'df',
                                            coverage[decomp]['ff'], 'ff')
        
    
    latex_code = make_overall_latex_table_c([v for k,v in all_cov.items()])

    print(latex_code)

    with open(Path(output, 'unique_coverage_c.tex'), 'w') as f:
        f.write(latex_code)
    
    for decomp in decompilers:
        detailed_df[decomp] = filter_for_ff(detailed_df[decomp], 'df < ff')
        detailed_df[decomp] = detailed_df[decomp].reset_index(drop=True)
        detailed_df[decomp].to_csv(Path(output, f'ff_only_coverage_df_{decomp}'), sep = '\t')


def main():
    get_c_coverage()
    #get_java_coverage()
    # TODO make visualisation e.g. venn diagram

if __name__=="__main__":
    main()