#include<stdio.h>

extern void run_cfg(int* directions, int* output);

bool cmp(int* expected, int* actual, int size);

int main() {

	int expected[4];
	int out[4];
	int directions[1];
	bool result;

	directions[0] = 0;
	expected[0] = 0;
	expected[1] = 1;
	expected[2] = 2;
	expected[3] = 7;

	run_cfg(directions, out);

	result = cmp(expected, out, 4);

	printf("result is %d\n", result);
	printf("out 0 is %d\n", out[0]);
	printf("out 3 is %d\n", out[3]);

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
