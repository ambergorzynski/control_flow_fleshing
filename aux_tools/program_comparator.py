from difflib import Differ

def blank(input):

	chars = [input[i] for i in range(1,len(input)) if input[i] != ' ' and input[i] != '\n']

	return len(chars) == 0

def compare_optimised(n_results, input_folder, results_folder, output_filename):

	diff_counter = 0
	line_counter_unopt = 0
	line_counter_opt = 0

	f = open(f'{results_folder}/{output_filename}.txt', 'a')

	for i in range(0,n_results):

		unopt = f'{input_folder}/run_cfg_{i}.ll'
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

					diff_counter += 1

		pct_diff = round((diff_counter / line_counter_unopt)*100,1)

		f.write(f'Graph: {i}\n')
		f.write(f'	N lines unopt: {line_counter_unopt}\n')
		f.write(f'	N lines opt:   {line_counter_opt}\n')
		f.write(f'	N differences: {diff_counter}\n')
		f.write(f'	Pct diff:      {pct_diff}%\n')

	f.close()

def main():

	path = 'fuzzing/fuzzing_280623'
	input_folder = f'{path}/llvm'
	results_folder = f'{path}/running'
	n_results = 40
	output_filename = 'comparison_opt_unopt'

	compare_optimised(n_results, input_folder, results_folder, output_filename)


if __name__ == "__main__":
	main()
