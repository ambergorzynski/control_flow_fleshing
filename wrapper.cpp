#include<stdio.h>

extern void run_cfg(int* directions, int* output);

bool cmp(int* expected, int* actual, int size);

int main() {

	int expected[3] = {1, 2, 4};
	int out[4];
	int directions[1];
	bool result;

	directions[0] = 1;

	run_cfg(directions, out);

	result = cmp(expected, out, 3);

	printf("result is %d\n", result);

	for(int i = 0; i < 3; i++) {
		printf("out %d is %d\n", i, out[i]);
	}

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
