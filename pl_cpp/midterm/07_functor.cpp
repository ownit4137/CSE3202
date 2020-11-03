#include <iostream>

using namespace std;

class Biggest {
private:
	int cur;
public:
	Biggest() {
		cur = 0;
	}
	void operator()(int next) {
		if (next > cur) {
			cur = next;
		}
		cout << cur << "\n";
	}
};


int main() {
	Biggest big;
	
	big(100);
	big(25);
	big(410);
}