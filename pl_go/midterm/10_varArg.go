package main

import "fmt"

func sum(numbers ... int) int{
	res := 0
	for _, r := range numbers{
		res += r
	}
	return res
}

func main(){
	// var arrayTest [7]int // array
	var sliceTest []int // slice
	sliceTest = make([]int, 7)

	//sliceTest := []int{1,2,3,4,5}

	sliceTest[1] = 10



	fmt.Print(sum(1,2,3))
	fmt.Print(sum(4,5))
}
