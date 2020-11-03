package main

import "fmt"

func main(){
	// var 변수 자료형 = 값
	var a int = 0
	var x, y, z float32 = 0, 2, 3

	// 여러 개 선언할 때
	var (
		u int = 0
		v string
	)

	// 추론 기능 : 컴파일 타임에 결정
	i := "hello"
	j := 3.4

	// 초기화 생략하면 자동으로 초기화(0, 0.0, nil)
	fmt.Print(a, x, y, z, u, v, i, j)

	id := 55

	var pid *int
	if pid == nil {
		// <nil>
		fmt.Println(pid)
	}

	pid = &id
	fmt.Println(*pid)

	var str string
	// ""
	fmt.Println(str)

	str = "123"
	// str := "123"  // 추론 기능
	// str[1] = '1'  // 수정할 수 없음

	// go는 멀티리턴이 가능
	fmt.Println(len(str))
	for idx, rn := range str {
		fmt.Println(idx, rn)
	}

	fmt.Println(len("가나다"))  // 9
	for idx, rn := range "가나다" {
		// 한 글자당 3byte
		fmt.Println(idx, rn)
	}
}