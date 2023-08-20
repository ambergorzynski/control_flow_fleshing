#include<iostream>

using namespace std;

extern char hi_there();

int main() {

	char result;
	printf("hello\n");
	result = hi_there();
	cout << result << endl;
	return 0;
}
