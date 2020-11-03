#include <iostream>
#include <cstdio>
#include <cstdlib>

using namespace std;
int lookahead = 0;

void K(), S();
int nexttoken();
void match(int);
void error(char c);

int main() {
	lookahead = nexttoken();
	K();
	return 0;
}

int nexttoken() {
	return getchar();
}

void match(int token) {
	if (lookahead == token) {
		lookahead = nexttoken();
	}
	else {
		error(lookahead);
	}
}

void error(char c) {
	cout << "Syntax Error : '" << c << "'\n";
	exit(-1);
}

void K() {
	if (lookahead == EOF) {
		;
	}
	else {
		S();
		match('\n');
		K();
	}
}

void S() {
	if (lookahead == '(') {
		match('('); S(); match(')'); S();
	}
}