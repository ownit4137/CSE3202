#include <iostream>

using namespace std;

int sumOfSquare(int& a, int& b) {
	a = a * a;
	b = b * b;
	return a + b;
}

void pbr_swap(int& x, int& y) {
	int t = x;
	x = y;
	y = t;	// y���� test[0]�� �ּҰ� ��� �����Ƿ�
			// k�� ���ص� �׻� test[0]�� ���� �ٲ�
}


int main() {
	int x = 2;
	int y = 5;
	//cout << sumOfSquare(x, x);

	int test[5] = { 1,2,3,4,5 };
	int k = 0;
	pbr_swap(k, test[k]);


	//pbn_swap
	/*
	int t = k;	// t = 0�̵�
	k = test[k] // k = 1�̵�
	test[k] = t // test[1]�� ���� �ٲ�
	*/

	cout << k << "\n";
	
	cout << test[0] << " ";
	cout << test[1] << " ";
	cout << test[2] << " ";
	cout << test[3] << " ";
	cout << test[4] << " ";

	return 0;
}