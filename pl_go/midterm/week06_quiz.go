package main

import "fmt"

func main(){
	var subject map[string]string
	subject = make(map[string]string)

	subject["pl"] = "김인하"
	subject["oop2"] = "이인하"


	/*
	subject := map[string]string {
		"pl" : "김인하",
		"oop2" : "이인하",
		"statistics" : "최인하",
	}*/

	var subj, prof string

	for {
		fmt.Println("과목명 : ")
		fmt.Scanln(&subj)

		fmt.Println("담당교수 : ")
		fmt.Scanln(&prof)

		val, exists := subject[subj]

		if exists {
			if val == prof {
				fmt.Println("수강신청 되었습니다.")
				break
			} else{
				fmt.Println("교수명을 확인하세요")
			}
		} else {
			fmt.Println("해당 과목은 존재하지 않습니다")
		}
	}
}