from bs4 import BeautifulSoup
from lxml import html
import pandas as pd
import numpy as np

def main():

    base = '/Users/ambergorzynski/Documents/cfg/coverage_results'
    html_doc = '/Users/ambergorzynski/Documents/cfg/coverage_results/coverage_fleshing_tests_clang/index.html'

    test_set = {'cfgf':'coverage_fleshing_tests_clang',
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
    big_df = pd.merge(df_join, llvm_frames['All'], how='left', on=['transform', 'file'])
    #print(big_df)

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
    print(sorted_df.head(15))


if __name__=="__main__":
    main()