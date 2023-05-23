#include<stdio.h>
//#include"old_run_cfg.cpp"
using namespace std;

extern void run_cfg(int* directions, int* actual_output);
//void run_cfg(int* directions, int* actual_output);
bool cmp(int* expected, int* actual, int size);

void read_in(const char* filename, int** directions, int** expected_output, int** actual_output);

int main(int argc, char** argv) {

	int* expected_output;
	int* actual_output;
	int* directions;
	bool result;

	read_in(argv[1], &directions, &expected_output, &actual_output);

	printf("expected_output 0 is %d\n", expected_output[0]);
	printf("expected_output 1 is %d\n", expected_output[1]);
	printf("expected_output 2 is %d\n", expected_output[2]);
	
	run_cfg(directions, actual_output);

	result = cmp(expected_output, actual_output, 3);

	printf("result is %d\n", result);

	for(int i = 0; i < 3; i++) {
		printf("out %d is %d\n", i, actual_output[i]);
	}

	// deallocate memory for dynamic arrays
	delete [] directions;
	delete [] actual_output;
	delete [] expected_output;

	return 0;
}

bool cmp(int* expected, int* actual, int size) {

	for(int i = 0; i < size; i++) {
		if(expected[i] != actual[i]) {
			return false;
		}
	}

	return true;
}

void read_in(const char* filename, int** directions, int** expected_output, int** actual_output) {

	*directions = new int[1];
	*expected_output = new int[3];
	*actual_output = new int[3];

	for(int i = 0; i < 3; i++) {
		(*actual_output)[i] = -1;
	}

	(*directions)[0] = 0;
	(*expected_output)[0] = 1;
	(*expected_output)[1] = 2;
	(*expected_output)[2] = 4;

}
