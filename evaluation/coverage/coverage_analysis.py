from bs4 import BeautifulSoup
from lxml import html
import pandas as pd
import numpy as np

def get_overall_coverage_opt_unknown():
    
    base = '/Users/ambergorzynski/Documents/cfg/coverage_results'

    
    test_set = {'known' :'coverage_cfg_opt_tests',
             'unknown' : 'coverage_cfg_opt_tests_unknown_dir_out'}
            
    cfgf_frames = {}
    unknown_frames = {}

    all_frames = {'known': cfgf_frames, 
                  'unknown': unknown_frames}
    
    for test in test_set.keys():

        html_doc = f'{base}/{test_set[test]}/index.html'

        with open(html_doc, "r") as f:
            page = f.read()
        tree = html.fromstring(page)

        # get all coverage file names
        coverFilesElems = tree.xpath('//td[@class="coverFile"]')
        files = [i[0].text for i in coverFilesElems]

        # get all coverage percentages
        rowElems = tree.xpath('//td[contains(@class, "coverPer")]')
        rows=[i.text for i in rowElems]

        # make dataframe from rows
        lines = [rows[i] for i in range(len(rows)) if i%2 == 0]
        functions = [rows[i] for i in range(len(rows)) if i%2 == 1]

        df = pd.DataFrame(
        {'folder': files,
        f'line_cov_pct_{test}': lines,
        f'function_cov_pct_{test}': functions
        })

        # convert line and coverage data from string to num

        for c in [f'line_cov_pct_{test}', f'function_cov_pct_{test}']:
            df[c] = np.where(df[c].str.contains("%"), df[c].str[:-2], df[c])
            df[c] = np.where(df[c].str.contains("-"), '0', df[c])
            df[c] = df[c].astype(float)

        # put dataframe into dictionary
        all_frames[test] = df

    # create dataframe for each transform - all files match, they are present in all dfs
    big_df = pd.merge(all_frames['known'], all_frames['unknown'], how='left', on=['folder'])

    print(big_df)

    filtered_df = big_df[big_df["folder"].str.contains("lib/Transforms")]
    filtered_df['folder'] = filtered_df['folder'].str[15:]
    filtered_df = filtered_df.sort_values(by=['line_cov_pct_known'], ascending=False)


    print(filtered_df)
    filtered_df.to_csv('/Users/ambergorzynski/Documents/cfg/results/opt_unknown.csv')


def get_overall_coverage_clang():
    
    base = '/Users/ambergorzynski/Documents/cfg/coverage_results'


    test_set = {'cfgf':'coverage_fleshing_tests_clang',
                'cfgf_c' : 'coverage_c_dirs_known_clang_out',
             'csmith' : 'coverage_csmith_tests_clang',
             'llvm' : 'coverage_llvm_test_suite_out'}

        
    cfgf_frames = {}
    cfgf_c_frames = {}
    csmith_frames = {}
    llvm_frames = {}

    all_frames = {'cfgf': cfgf_frames, 
                  'cfgf_c' : cfgf_c_frames,
                  'csmith': csmith_frames, 
                  'llvm' :llvm_frames}

    for test in test_set.keys():

        html_doc = f'{base}/{test_set[test]}/index.html'

        with open(html_doc, "r") as f:
            page = f.read()
        tree = html.fromstring(page)

        # get all coverage file names
        coverFilesElems = tree.xpath('//td[@class="coverFile"]')
        files = [i[0].text for i in coverFilesElems]

        # get all coverage percentages
        rowElems = tree.xpath('//td[contains(@class, "coverPer")]')
        rows=[i.text for i in rowElems]

        # make dataframe from rows
        lines = [rows[i] for i in range(len(rows)) if i%2 == 0]
        functions = [rows[i] for i in range(len(rows)) if i%2 == 1]

        df = pd.DataFrame(
        {'folder': files,
        f'line_cov_pct_{test}': lines,
        f'function_cov_pct_{test}': functions
        })

        # convert line and coverage data from string to num

        for c in [f'line_cov_pct_{test}', f'function_cov_pct_{test}']:
            df[c] = np.where(df[c].str.contains("%"), df[c].str[:-2], df[c])
            df[c] = np.where(df[c].str.contains("-"), '0', df[c])
            df[c] = df[c].astype(float)

        # put dataframe into dictionary
        all_frames[test] = df

    # create dataframe for each transform - all files match, they are present in all dfs
    df_join = pd.merge(all_frames['cfgf'], all_frames['cfgf_c'], how='left', on=['folder'])
    big_df = pd.merge(df_join, all_frames['csmith'], how='left', on=['folder'])
    big_df = pd.merge(big_df, all_frames['llvm'], how='left', on=['folder'])

    print(big_df)

    filtered_df = big_df[big_df["folder"].str.contains("llvm/lib/Transforms")]
    filtered_df['folder'] = filtered_df['folder'].str[20:]
    filtered_df = filtered_df.sort_values(by=['line_cov_pct_cfgf'], ascending=False)


    print(filtered_df)
    filtered_df.to_csv('/Users/ambergorzynski/Documents/cfg/results/clang_extra.csv')


def get_overall_coverage_opt():
    
    base = '/Users/ambergorzynski/Documents/cfg/coverage_results'

    '''
    test_set = {'cfgf':'coverage_fleshing_tests_clang',
             'csmith' : 'coverage_csmith_tests_clang',
             'llvm' : 'coverage_llvm_test_suite_out'}
    '''
    
    '''
    test_set = {'cfgf':'coverage_cfg_opt_tests',
             'csmith' : 'coverage_csmith_ll_without_optnone',
             'llvm' : 'coverage_llvm_test_suite_out'}
    '''
    test_set = {'cfgf':'coverage_cfg_opt_tests',
            'csmith' : 'coverage_csmith_ll_without_optnone',
            'llvm' : 'coverage_llvm_test_suite_out'}
        
    cfgf_frames = {}
    csmith_frames = {}
    llvm_frames = {}

    all_frames = {'cfgf': cfgf_frames, 
                  'csmith': csmith_frames, 
                  'llvm' :llvm_frames}

    for test in test_set.keys():

        html_doc = f'{base}/{test_set[test]}/index.html'

        with open(html_doc, "r") as f:
            page = f.read()
        tree = html.fromstring(page)

        # get all coverage file names
        coverFilesElems = tree.xpath('//td[@class="coverFile"]')
        files = [i[0].text for i in coverFilesElems]

        # get all coverage percentages
        rowElems = tree.xpath('//td[contains(@class, "coverPer")]')
        rows=[i.text for i in rowElems]

        # make dataframe from rows
        lines = [rows[i] for i in range(len(rows)) if i%2 == 0]
        functions = [rows[i] for i in range(len(rows)) if i%2 == 1]

        df = pd.DataFrame(
        {'folder': files,
        f'line_cov_pct_{test}': lines,
        f'function_cov_pct_{test}': functions
        })

        # convert line and coverage data from string to num

        for c in [f'line_cov_pct_{test}', f'function_cov_pct_{test}']:
            df[c] = np.where(df[c].str.contains("%"), df[c].str[:-2], df[c])
            df[c] = np.where(df[c].str.contains("-"), '0', df[c])
            df[c] = df[c].astype(float)

        # put dataframe into dictionary
        all_frames[test] = df

    # create dataframe for each transform - all files match, they are present in all dfs
    df_join = pd.merge(all_frames['cfgf'], all_frames['csmith'], how='left', on=['folder'])
    big_df = pd.merge(df_join, all_frames['llvm'], how='left', on=['folder'])

    print(big_df)

    filtered_df = big_df[big_df["folder"].str.contains("lib/Transforms")]
    filtered_df['folder'] = filtered_df['folder'].str[15:]
    filtered_df = filtered_df.sort_values(by=['line_cov_pct_cfgf'], ascending=False)


    print(filtered_df)
    filtered_df.to_csv('/Users/ambergorzynski/Documents/cfg/results/opt.csv')



def get_all_coverage():

    base = '/Users/ambergorzynski/Documents/cfg/coverage_results'
    html_doc = '/Users/ambergorzynski/Documents/cfg/coverage_results/coverage_fleshing_tests_clang/index.html'
    '''
    test_set = {'cfgf':'coverage_fleshing_tests_clang',
             'csmith' : 'coverage_csmith_tests_clang',
             'llvm' : 'coverage_llvm_test_suite_out'}
    '''
    test_set = {'cfgf':'coverage_c_dirs_known_clang_out',
             'csmith' : 'coverage_csmith_tests_clang',
             'llvm' : 'coverage_llvm_test_suite_out'}

    base_folder = 'llvm/lib/Transforms'

    transforms = ['AggressiveInstCombine',
             'IPO',
             'InstCombine',
             'Scalar',
             'Utils',
             'Vectorize']
    
    cfgf_frames = {}
    csmith_frames = {}
    llvm_frames = {}

    all_frames = {'cfgf': cfgf_frames, 
                  'csmith': csmith_frames, 
                  'llvm' :llvm_frames}

    for test in test_set.keys():

        for transform in transforms:

            print(transform)

            html_doc = f'{base}/{test_set[test]}/{base_folder}/{transform}/index.html'

            with open(html_doc, "r") as f:
                page = f.read()
            tree = html.fromstring(page)

            # get all coverage file names
            coverFilesElems = tree.xpath('//td[@class="coverFile"]')
            files = [i[0].text for i in coverFilesElems]

            # get all coverage percentages
            rowElems = tree.xpath('//td[contains(@class, "coverPer")]')
            rows=[i.text for i in rowElems]

            # make dataframe from rows
            lines = [rows[i] for i in range(len(rows)) if i%2 == 0]
            functions = [rows[i] for i in range(len(rows)) if i%2 == 1]

            df = pd.DataFrame(
            {'transform' : transform,
            'file': files,
            f'line_cov_pct_{test}': lines,
            f'function_cov_pct_{test}': functions
            })

            # convert line and coverage data from string to num

            for c in [f'line_cov_pct_{test}', f'function_cov_pct_{test}']:
                df[c] = np.where(df[c].str.contains("%"), df[c].str[:-2], df[c])
                df[c] = np.where(df[c].str.contains("-"), '0', df[c])
                df[c] = df[c].astype(float)

            # put dataframe into dictionary
            all_frames[test][transform] = df

    cfgf_frames['All']      = pd.concat([i for i in cfgf_frames.values()])
    csmith_frames['All']    = pd.concat([i for i in csmith_frames.values()])
    llvm_frames['All']      = pd.concat([i for i in llvm_frames.values()])

    # create dataframe for each transform - all files match, they are present in all dfs
    df_join = pd.merge(cfgf_frames['All'], csmith_frames['All'], how='left', on=['file','transform'])
    big_df = pd.merge(df_join, llvm_frames['All'], how='left', on=['file','transform'])

    print(big_df)

    # subset the files for which cfgf has higher line or function coverage than either csmith or llvm 
    # only one file... SimplifyCFG.pass... :(
    query_str = '(line_cov_pct_cfgf > line_cov_pct_csmith) or '
    query_str += '(line_cov_pct_cfgf > line_cov_pct_llvm) or '
    query_str += '(function_cov_pct_cfgf > function_cov_pct_csmith) or '
    query_str += '(function_cov_pct_cfgf > function_cov_pct_llvm)'
    
    query_str = 'line_cov_pct_cfgf > line_cov_pct_llvm'

    cfgf_bigger_df = big_df.query(query_str)

    print(cfgf_bigger_df)
    
    # sort to see files for which cfgf has the highest coverage
    print(big_df.columns)
    sorted_df = big_df.sort_values(by=['line_cov_pct_cfgf'], ascending=False)
    print(sorted_df.head(200))

    filtered_df = sorted_df.head(200)

    sorted_df.to_csv('/Users/ambergorzynski/Documents/cfg/results/clang_all_covered.csv')
    



def get_all_coverage_unknown():

    base = '/Users/ambergorzynski/Documents/cfg/coverage_results'
    html_doc = '/Users/ambergorzynski/Documents/cfg/coverage_results/coverage_fleshing_tests_clang/index.html'

    test_set = {'known':'coverage_cfg_opt_tests',
             'unknown' :'coverage_cfg_opt_tests_unknown_dir_out'}
        
    base_folder = 'lib/Transforms'

    transforms = ['AggressiveInstCombine',
             'IPO',
             'InstCombine',
             'Scalar',
             'Utils',
             'Vectorize']
    
    cfgf_frames = {}
    unknown_frames = {}
    llvm_frames = {}

    all_frames = {'known': cfgf_frames, 
                  'unknown': unknown_frames}
    
    for test in test_set.keys():

        for transform in transforms:

            print(transform)

            html_doc = f'{base}/{test_set[test]}/{base_folder}/{transform}/index.html'

            with open(html_doc, "r") as f:
                page = f.read()
            tree = html.fromstring(page)

            # get all coverage file names
            coverFilesElems = tree.xpath('//td[@class="coverFile"]')
            files = [i[0].text for i in coverFilesElems]

            # get all coverage percentages
            rowElems = tree.xpath('//td[contains(@class, "coverPer")]')
            rows=[i.text for i in rowElems]

            # make dataframe from rows
            lines = [rows[i] for i in range(len(rows)) if i%2 == 0]
            functions = [rows[i] for i in range(len(rows)) if i%2 == 1]

            df = pd.DataFrame(
            {'transform' : transform,
            'file': files,
            f'line_cov_pct_{test}': lines,
            f'function_cov_pct_{test}': functions
            })

            # convert line and coverage data from string to num

            for c in [f'line_cov_pct_{test}', f'function_cov_pct_{test}']:
                df[c] = np.where(df[c].str.contains("%"), df[c].str[:-2], df[c])
                df[c] = np.where(df[c].str.contains("-"), '0', df[c])
                df[c] = df[c].astype(float)

            # put dataframe into dictionary
            all_frames[test][transform] = df

    cfgf_frames['All']      = pd.concat([i for i in cfgf_frames.values()])
    unknown_frames['All']    = pd.concat([i for i in unknown_frames.values()])

    # create dataframe for each transform - all files match, they are present in all dfs
    big_df = pd.merge(cfgf_frames['All'], unknown_frames['All'], how='left', on=['file','transform'])
    #print(big_df)

    '''
    # subset the files for which cfgf has higher line or function coverage than either csmith or llvm 
    # only one file... SimplifyCFG.pass... :(
    query_str = '(line_cov_pct_cfgf > line_cov_pct_csmith) or '
    query_str += '(line_cov_pct_cfgf > line_cov_pct_llvm) or '
    query_str += '(function_cov_pct_cfgf > function_cov_pct_csmith) or '
    query_str += '(function_cov_pct_cfgf > function_cov_pct_llvm)'
    
    query_str = 'line_cov_pct_cfgf > line_cov_pct_llvm'

    cfgf_bigger_df = big_df.query(query_str)

    print(cfgf_bigger_df)
    '''

    # sort to see files for which cfgf has the highest coverage
    print(big_df.columns)
    sorted_df = big_df.sort_values(by=['line_cov_pct_known'], ascending=False)
    print(sorted_df.head(20))

def main():
    get_all_coverage()

if __name__=="__main__":
    main()