package main

import (
	"fmt"
	"os"
)

var lookahead int = 0

func match(c int){
	if c == lookahead {
		nexttoken()
	} else {
		fmt.Println("wrong")
		os.Exit(0)
	}
}

func d(){
	if lookahead != 0 {
		p()
		match('\r')
		match('\n')
		d()
	}
}

func p() {
	if lookahead == '(' {
		match('(')
		p()
		match(')')
		p()
	}
}

func nexttoken(){
	fmt.Scanf("%c", &lookahead)
}


func main(){
	nexttoken()
	d()
}

