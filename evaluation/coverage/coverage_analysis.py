from bs4 import BeautifulSoup
from lxml import html
import pandas as pd
import numpy as np

def main():
    html_doc = '/Users/ambergorzynski/Documents/cfg/coverage_results/coverage_fleshing_tests_clang/index.html'

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

    print(df['line_cov_pct'][0])

    for c in ['line_cov_pct', 'function_cov_pct']:
        df[c] = np.where(df[c].str.contains("%"), df[c].str[:-2], df[c])
        df[c] = np.where(df[c].str.contains("-"), '0', df[c])
        df[c] = df[c].astype(float)

    print(df)

if __name__=="__main__":
    main()