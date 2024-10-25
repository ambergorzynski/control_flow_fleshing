from pathlib import Path 
import pandas as pd 

def get_overall_coverage(df):

    df['filename_short'] = df['filename'].map(lambda filename: filename[filename.rfind('/')+1:])
    df['group'] = 'ghidra'

    # Drop columns at lower granularity and drop percentages becuase they must be
    # recalculated at the overall level from the raw number of lines, branches etc.
    drop_cols = ['filename',
                'filename_short']

    drop_cols.extend(list(df.filter(regex='percent')))

    overall_coverage = df.drop(columns=drop_cols).groupby(['group']).sum().reset_index()

    for metric in ['line', 'branch', 'function']:
        overall_coverage[f'{metric}_percent'] = overall_coverage[f'{metric}_covered'] / overall_coverage[f'{metric}_total']

    return overall_coverage

def remove_non_ghidra_coverage(df):

    # keep only the ghidra-native coverage
    df = df[df['filename'].str.contains('ghidra-native')==True]

def main():

    # import coverage csv files
    base = Path('/data/work/fuzzflesh/coverage/ghidra')

    ff_coverage = pd.read_csv(Path(base,'ff','oct_20', 'coverage.csv'))
    df_coverage = pd.read_csv(Path(base,'decfuzzer','coverage_oct_19_first_1000_csmith_progs.csv'))

    # need to clean the r2ghidra files out of the coverage analysis
    remove_non_ghidra_coverage(df_coverage)

    overall_ff_coverage = get_overall_coverage(ff_coverage)
    overall_df_coverage = get_overall_coverage(df_coverage)

    print(overall_ff_coverage.head())
    print(overall_df_coverage.head())
    
    # write out latex table


    # find which classes and packages FuzzFlesh covers more code in

    print(ff_coverage.head())

    keep = ['group','filename_short','line_percent']
    pct_ff = ff_coverage[keep]
    pct_df = df_coverage[keep]
    pct_compare = pd.merge(pct_ff, pct_df,
                    left_on=['group','filename_short'],
                    right_on=['group', 'filename_short'],
                    suffixes=('_FF','_DF'))
    
    pct_compare['FF_HIGHER_COV'] = pct_compare.apply(compare_coverage, axis=1)
    comparison = pct_compare['FF_HIGHER_COV'].value_counts()

    print(comparison)

    ff_higher_coverage = pct_compare.query("FF_HIGHER_COV == 'FF_GREATER_THAN_DF'")
    print(ff_higher_coverage)
    #ff_higher_coverage.to_csv(Path(base,f'ghidra_files_for_which_ff_has_higher_cov_than_jd.csv'))
    pct_compare.to_csv(Path(base,f'ghidra_files_line_coverage_comparison.csv'))
    
    return

def compare_coverage(row):
    ff = 'line_percent_FF'
    df = 'line_percent_DF'

    if row[ff] > row[df]:
        return 'FF_GREATER_THAN_DF'
    if row[ff] == row[df]:
        return 'FF_EQUAL_TO_DF'
    if row[ff] < row[df]:
        return 'FF_LESS_THAN_DF'




if __name__=="__main__":
    main()