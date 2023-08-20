#include<stdio.h>
#include"external.ll"


extern char hi_there();

int main() {

	char result;
	printf("hello\n");
	result = hi_there();
	printf("%c",result);
	return 0;
}
