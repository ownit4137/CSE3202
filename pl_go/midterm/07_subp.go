package main

import "fmt"

func sum_quiz_arr(ns [3]int) int{
	r := 0
	for i := 0 ; i<len(ns); i++ {
		r = r + ns[i]
	}
	return r
}

func sum_quiz_slice(ns []int) int{
	r := 0
	for i := 0 ; i<len(ns); i++ {
		r = r + ns[i]
	}
	return r
}

func sum_quiz_var(ns ...int) int{
	r := 0
	for i := 0 ; i<len(ns); i++ {
		r = r + ns[i]
	}
	return r
}


func main(){
	arr := [3]int {1,5,3}
	arrslice := []int {1,2,3}

	// arr 사용
	fmt.Println(sum_quiz_arr(arr))

	// slice 사용
	fmt.Println(sum_quiz_slice(arrslice))

	// variable arg 사용
	fmt.Println(sum_quiz_var(1,5,3))

	// slice + variable arg 사용
	fmt.Println(sum_quiz_var(arrslice...))
}
