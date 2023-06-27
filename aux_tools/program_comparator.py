from difflib import Differ
import os

def blank(input):

	chars = [input[i] for i in range(1,len(input)) if input[i] != ' ' and input[i] != '\n']

	return len(chars) == 0

def main():

	path = 'fuzzing/fuzzing_270623'
	results_folder = f'{path}/running'
	n_results = 40
	diff_counter = 0
	line_counter_unopt = 0
	line_counter_opt = 0
	filename = f'{path}/running/comparison_opt_unopt'

	f = open(filename, 'a')

	for i in range(0,n_results):

		unopt = f'{results_folder}/run_cfg_{i}_out_unopt.ll'
		opt = f'{results_folder}/run_cfg_{i}_opt.ll'
		
		with open(unopt) as f1, open(opt) as f2:

			differ = Differ()

			for line in differ.compare(f1.readlines(), f2.readlines()):

				if (line[0] == ' '):
					line_counter_unopt += 1
					line_counter_opt += 1

				if (line[0] == '+' or line[0] == '-') and not blank(line):

					# increment relevant line counter
					if (line[0] == '-'):
						line_counter_unopt += 1
					else:
						line_counter_opt += 1

					print(line)
					diff_counter += 1

		pct_diff = round((diff_counter / line_counter_unopt)*100,1)

		f.write(f'Graph: {i}\n')
		f.write(f'	N lines unopt: {line_counter_unopt}\n')
		f.write(f'	N lines opt:   {line_counter_opt}\n')
		f.write(f'	N differences: {diff_counter}\n')
		f.write(f'	Pct diff:      {pct_diff}%\n')

		print(f'diff counter for files is: {diff_counter}')
		print(f'n lines in unopt is: {line_counter_unopt}')
		print(f'n lines in opt is: {line_counter_opt}')
		print(f'% difference in lines in terms of unopt is: {(pct_diff)}')

	f.close()

if __name__ == "__main__":
	main()
