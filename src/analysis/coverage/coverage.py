from pathlib import Path 
import pandas as pd 

DECOMPILERS_JAVA = ['cfr','fernflower','jadx']
DECOMPILERS_C = ['ghidra11', 'ghidra9']
TOOLS = ['fuzzflesh','jdtester','decfuzzer']

TIMES = ['120']
BASE : Path = Path('/data/work/fuzzflesh/coverage/coverage_results')

def import_java_ff():
    df = {}

    for decomp in DECOMPILERS_JAVA:
        for dirs in ['dirs_known', 'dirs_unknown', 'dirs_mixed']:
            for time in TIMES:
                try:
                    datapath = Path(BASE,
                            'ff',
                            f'fuzzflesh_{decomp}_{dirs}_{time}',
                            'coverage.csv')
                    data = pd.read_csv(datapath)
                except:
                    data = None
                
                df[f'{decomp}_{dirs}_{time}'] = data

    return df

def import_java_jd():
    df = {}

    for decomp in DECOMPILERS_JAVA:
        for generator in ['javafuzzer', 'hephaestus']:
            for time in TIMES:
                try:
                    datapath = Path(BASE,
                            'jd',
                            f'jdtester_{decomp}_{generator}_{time}',
                            'coverage.csv')
                    data = pd.read_csv(datapath)
                except Exception as e:
                    print(e)
                    data = None
                
                df[f'{decomp}_{generator}_{time}'] = data

    return df

def import_c_df():
    df = {}

    for decomp in DECOMPILERS_C:
            for time in TIMES:
                try:
                    datapath = Path(BASE,
                            'df',
                            f'decfuzzer_{decomp}_{time}',
                            'coverage.csv')
                    data = pd.read_csv(datapath)
                except Exception as e:
                    print(e)
                    data = None
                
                df[f'{decomp}_{time}'] = data

    return df

def import_c_ff():
    df = {}

    for decomp in DECOMPILERS_C:
        for dirs in ['dirs_known', 'dirs_unknown', 'dirs_mixed']:
            for time in TIMES:
                try:
                    datapath = Path(BASE,
                            'ff',
                            f'fuzzflesh_{decomp}_{dirs}_{time}',
                            'coverage.csv')
                    data = pd.read_csv(datapath)
                except Exception as e:
                    print(e)
                    data = None
                
                df[f'{decomp}_{time}'] = data

    return df

def get_overall_coverage(data : dict[str,pd.DataFrame], lang : str):
    if lang == 'java':
        return get_jacoco_overall_coverage(data)
    elif lang == 'c':
        return get_gcov_overall_coverage(data)

def get_jacoco_overall_coverage(cov : dict[str, pd.DataFrame]):

    result = {}

    for (id, data) in cov.items():

        if data is None:
            result[id] = None
        else:
            result[id] = data.drop(columns=['CLASS','PACKAGE']).groupby(['GROUP']).sum().reset_index()
        
            for metric in ['INSTRUCTION', 'BRANCH', 'LINE', 'METHOD', 'COMPLEXITY']:
                result[id][f'{metric}_COVERED_PCT'] = result[id][f'{metric}_COVERED'] / (result[id][f'{metric}_MISSED'] + result[id][f'{metric}_COVERED'])


    return result

def get_gcov_overall_coverage(cov : dict[str, pd.DataFrame]):

    result = {}

    for (id, data) in cov.items():
        if data is None:
            result[id] = None
        else:
            result[id] = data
            result[id]['group'] = 'ghidra'
            # Drop columns at lower granularity and drop percentages becuase they must be
            # recalculated at the overall level from the raw number of lines, branches etc.

            drop_cols = ['filename']
            drop_cols.extend(list(data.filter(regex='percent')))         
            
            result[id] = result[id].drop(columns=drop_cols).groupby(['group']).sum().reset_index()

            for metric in ['line', 'branch', 'function']:
                result[id][f'{metric}_percent'] = result[id][f'{metric}_covered'] / result[id][f'{metric}_total']
        
    return result

def pct(num : float) -> float or None:
    if num is None:
        return None

    return round(num*100, 1)

def get_metric(df : pd.DataFrame, metric : str) -> float or None:
    if df is None:
        return None
    
    return df[metric].iloc[0]

def make_overall_latex_table(java_jd : dict[str, pd.DataFrame],
            java_ff : dict[str, pd.DataFrame],
            c_df : dict[str, pd.DataFrame],
            c_ff : dict[str, pd.DataFrame],
            metric : str, 
            time : int) -> str:

    jacoco_metric = metric
    
    match metric:
        case 'INSTRUCTION' | 'LINE': 
            gcov_metric = 'line'
        case 'BRANCH' : 
            gcov_metric = 'branch'
        case 'METHOD' : 
            gcov_metric = 'function'
    

    df = pd.DataFrame(columns=[
            'ff_dirs_known', 
            'ff_dirs_unknown', 
            'ff_dirs_mixed',
            'df',
            'jd_javafuzzer',
            'jd_hep'], 
            index = [
            'ghidra11',
            'ghidra9',
            'cfr',
            'fernflower',
            'jadx'])

    for decomp in ['cfr', 'fernflower', 'jadx']:
        df.loc[decomp, 'jd_javafuzzer']     = pct(get_metric(java_jd[f'{decomp}_javafuzzer_{time}'], f'{jacoco_metric}_COVERED_PCT'))
        df.loc[decomp, 'jd_hep']            = pct(get_metric(java_jd[f'{decomp}_hephaestus_{time}'], f'{jacoco_metric}_COVERED_PCT'))
        df.loc[decomp, 'ff_dirs_known']     = pct(get_metric(java_ff[f'{decomp}_dirs_known_{time}'], f'{jacoco_metric}_COVERED_PCT'))
        df.loc[decomp, 'ff_dirs_unknown']   = pct(get_metric(java_ff[f'{decomp}_dirs_unknown_{time}'], f'{jacoco_metric}_COVERED_PCT'))
        df.loc[decomp, 'ff_dirs_mixed']     = pct(get_metric(java_ff[f'{decomp}_dirs_mixed_{time}'], f'{jacoco_metric}_COVERED_PCT'))

    for decomp in ['ghidra11', 'ghidra9']:
        df.loc[decomp, 'ff_dirs_known'] = 1
        df.loc[decomp, 'ff_dirs_unknown'] = 1
        df.loc[decomp, 'ff_dirs_mixed'] = 1
        df.loc[decomp, 'df']                = pct(get_metric(c_df[f'{decomp}_{time}'], f'{gcov_metric}_percent'))

    print(df)


    code = '''
\\begin{{table*}}[htbp]
\caption{{Line coverage comparison (\%)}}
\label{{tab:instruction_coverage}}
\\begin{{tabular}}{{m{{1.7cm}}|M{{1.65}}M{{1.65}}M{{1.65}}M{{1.65}}M{{1.65}}M{{1.65}}}}

\\toprule
& \multicolumn{{6}}{{c}}{{Testing tool}} \\\\
        Decompiler %
        & \mC{{1.65}}{{FuzzFlesh \footnotesize{{path known}}}} %
        & \mC{{1.65}}{{FuzzFlesh \footnotesize{{path unknown}}}} %
        & \mC{{1.65}}{{FuzzFlesh \footnotesize{{path mixed}}}} %
        & \mC{{1.65}}{{DecFuzzer}} %
        & \mC{{1.65}}{{JD-Tester \footnotesize{{JavaFuzzer}}}} %
        & \mC{{1.65}}{{JD-tester \footnotesize{{Hephaestus}}}} \\\\
\midrule
Ghidra 11   & {}          & {}          & {}                      & 39        & -           & -           \\\\
Ghidra  9   & {}          & {}          & {}                      & {}        & -           & -           \\\\
CFR         & {}          & {}          & {}                      & -         & {}          & {}          \\\\
FernFlower  & {}          & {}          & {}                      & -         & {}          & {}          \\\\
JADX        & {}          & {}          & {}                      & -         & {}          & {}         \\\\
\\bottomrule
\end{{tabular}}
\end{{table*}}
    '''

    return code

def main():

    input : Path = BASE
    output : Path = Path(BASE, 'analysis')

    raw_java_jd = import_java_jd()
    raw_java_ff = import_java_ff()
    raw_c_df = import_c_df()
    raw_c_ff = import_c_ff()

    overall_java_jd = get_overall_coverage(raw_java_jd, 'java')
    overall_java_ff = get_overall_coverage(raw_java_ff, 'java')
    overall_c_df = get_overall_coverage(raw_c_df, 'c')
    overall_c_ff = get_overall_coverage(raw_c_ff, 'c')

    make_overall_latex_table(overall_java_jd,
                    overall_java_ff,
                    overall_c_df,
                    overall_c_ff,
                    metric='BRANCH',
                    time=120)

if __name__=="__main__":
    main()