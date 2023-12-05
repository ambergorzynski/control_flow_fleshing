#include<stdio.h>
#include<fstream>
#include<iostream>
using namespace std;

extern "C" void run_cfg(int* actual_output, int* directions);

bool cmp(int* expected, int* actual, int size);

void read_in(const char* filename, int** directions, int** expected_output, int** actual_output, int& out_size);

void record_output(ofstream& output_file, char* name, bool result, int* expected_output, int* actual_output, int size);

int main(int argc, char** argv) {

	int* expected_output;
	int* actual_output;
	int* directions;
	bool result;
	int size;
	ofstream output_file, output_file_differences;

	read_in(argv[1], &directions, &expected_output, &actual_output, size);

	// directions are not passed to fn because they are hard-coded already
	run_cfg(actual_output, directions);

	result = cmp(expected_output, actual_output, size);

	// set up output files to record all output and only output that differs
	output_file.open(argv[2], ios::app);
	output_file_differences.open(argv[3], ios::app);

	// record all output
	record_output(output_file, argv[1], result, expected_output, actual_output, size);

	// record output if a difference between expected and actual was found
	if(!result){
		record_output(output_file_differences, argv[1], result, expected_output, actual_output, size);
	}

	output_file.close();
	output_file_differences.close();

	// deallocate memory for dynamic arrays
	delete [] directions;
	delete [] actual_output;
	delete [] expected_output;
	
	// return 1 if difference found - change to execption
	if(!result){
		return 1;
	}
	
	return 0;
}

bool cmp(int* expected, int* actual, int size) {

	// check that actual and expected path are the same
	for(int i = 0; i < size; i++) {
		if(expected[i] != actual[i]) {
			return false;
		}
	}

	// check that there was no overflow; rest of actual array should be -1
	for(int i = size; i < 2*size; i++){
		if(actual[i] != -1) {
			return false;
		}
	}

	return true;
}

void read_in(const char* filename, int** directions, int** expected_output, int** actual_output, int& out_size) {

	ifstream in;
	int dir_size;

	// open file
	in.open(filename);

	if(in.fail()) {
		printf("Error opening input file\n");
		exit(1);
	}

	// first line in file gives direction array size
	in >> dir_size;

	// second line in file gives expected output array size
	in >> out_size;

	// allocate arrays
	*directions = new int[dir_size];
	*expected_output = new int[out_size];
	*actual_output = new int[2*out_size]; // allocate 2x size to allow for overflow

	// third line in file gives directions
	for(int i = 0; i < dir_size; i++){
		in >> (*directions)[i];
	}

	// fourth line in file gives expected output
	for(int i = 0; i < out_size; i++){
		in >> (*expected_output)[i];
	}

	in.close();

	// initialise actual output to -1
	for(int i = 0; i < 2*out_size; i++) {
		(*actual_output)[i] = -1;
	}
}

void record_output(ofstream &output_file, char* name, bool result, int* expected_output, int* actual_output, int size){

	output_file << name << endl;
	output_file << "	Results: Expected and actual output are ";
	(result) ? output_file << "the same\n" : output_file << "not the same\n";

	printf("expected and actual output are ");
	(result) ? printf("the same\n") : printf("not the same\n");

	output_file << "	Expected output:";
	printf("expected output:");

	for(int i = 0; i < size; i++) {
		output_file << " " << expected_output[i];
		printf(" %d", expected_output[i]);
	}

	output_file << "\n	Actual output:  ";
	printf("\nactual output:  ");

	for(int i = 0; i < 2*size; i++) {
		output_file << " " << actual_output[i];
		printf(" %d", actual_output[i]);
	}

	output_file << "\n\n";
	printf("\n");

}


