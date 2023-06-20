#include<stdio.h>
#include<fstream>
#include<iostream>
using namespace std;

extern void run_cfg(int* directions, int* actual_output);

bool cmp(int* expected, int* actual, int size);

void read_in(const char* filename, int** directions, int** expected_output, int** actual_output, int& out_size);

int main(int argc, char** argv) {

	int* expected_output;
	int* actual_output;
	int* directions;
	bool result;
	int size;

	read_in(argv[1], &directions, &expected_output, &actual_output, size);

	run_cfg(directions, actual_output);

	result = cmp(expected_output, actual_output, size);

	printf("expected and actual output are ");

	(result) ? printf("the same\n") : printf("not the same\n");

	printf("expected output:");

	for(int i = 0; i < size; i++) {
		printf(" %d", expected_output[i]);
	}

	printf("\nactual output:  ");

	for(int i = 0; i < 2*size; i++) {
		printf(" %d", actual_output[i]);
	}

	printf("\n");

	// deallocate memory for dynamic arrays
	delete [] directions;
	delete [] actual_output;
	delete [] expected_output;

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
