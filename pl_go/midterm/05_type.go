package main

import "fmt"

var myScore struct{
	name string
	id int
	grade float32
}

type generalScore struct{
	name string
	id int
	grade float32
}

func main(){
	// 구조체 모두를 출력 %#v
	fmt.Printf("%#v\n", myScore)

	var kim generalScore
	kim.id = 12
	kim.grade = 'A'
	fmt.Printf("%#v\n", kim)


	ranks := map[string]int {
		"bronze":1,
		"gold":2,
		"silver":4 }

	fmt.Println(ranks["bronze"])

}