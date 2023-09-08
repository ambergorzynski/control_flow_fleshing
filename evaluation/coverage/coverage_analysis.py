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

    files = ['AggressiveInstCombine',
             'IPO',
             'InstCombine',
             'Scalar',
             'Utils',
             'Vectorize']
    
    # for test in test_set:
    test = 'cfgf'

    cfgf_frames = {}

    for file in files:

        html_doc = f'{base}/{test_set[test]}/{base_folder}/{file}/index.html'

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
        {'file': files,
        'line_cov_pct': lines,
        'function_cov_pct': functions
        })

        # convert line and coverage data from string to num

        for c in ['line_cov_pct', 'function_cov_pct']:
            df[c] = np.where(df[c].str.contains("%"), df[c].str[:-2], df[c])
            df[c] = np.where(df[c].str.contains("-"), '0', df[c])
            df[c] = df[c].astype(float)

        # put dataframe into dictionary
        cfgf_frames[file] = df

    print((cfgf_frames['Scalar']).head)


if __name__=="__main__":
    main()