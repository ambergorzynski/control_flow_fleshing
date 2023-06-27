#include<iostream>
#include<fstream>
using namespace std;

/*	Program to compare two files and report the % of
	characters that differ between them. The purpose
	of this is to understand whether LLVM optimisations
	have had any effect on the program
*/

double pct_file_differences(ifstream& unopt, ifstream& opt);

int main() {

	double diff;
	ifstream file_unopt, file_opt;

	file_unopt.open("run_cfg_99_out_unopt.bc");
	file_opt.open("run_cfg_99_out_opt.bc");

	if(file_unopt.fail() || file_opt.fail()) {
		cout << "Problem opening a file!\n";
	}

	else {

		diff = pct_file_differences(file_unopt, file_opt);

		cout << "Proportion of different chars in file is: ";
		cout << diff << "%\n";

	}

	file_unopt.close();
	file_opt.close();

	return 0;
}

double pct_file_differences(ifstream& unopt, ifstream& opt) {

	char c1, c2;
	int size1, size2;

	size1 = file_size(unopt);
	size2 = file_size(opt);





}
