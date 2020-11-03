package main

import "fmt"

func main(){
	var score int = 0

	if score >= 90{
		fmt.Print("A")
	} else{
		fmt.Print("F")
	}

	switch score / 10 {
	case 10:
		fmt.Print("A")
	case 9:
		fmt.Print("A")
	case 8:
		fmt.Print("B")
	default:
	}

	//default
	for i:=0; i<3; i++ {
		fmt.Print("hi")
	}

	// 인자 1개
	i := 0
	for i<3{
		i++
	}


	// while
	for {
		break
	}

}