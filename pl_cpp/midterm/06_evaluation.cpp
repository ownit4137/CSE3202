#include <iostream>
using namespace std;

int a = 1;

int f() {
	a = 2;
	return 5;
}

int sub(int a, int b) {
	return a - b;
}


int main() {

	cout << a + f() << "\n";

	int temp = 7;
	int r = sub(temp++, temp);

	cout << r << "\n";


	int a = 2, b = 1;
	if ((a > b) || (a++ > 1)) cout << "??\n";
	cout << a << "\n";

	return 0;
}