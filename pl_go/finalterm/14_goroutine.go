package main

import (
	"fmt"
	"time"
)

func x(){
	for i := 0; i < 10; i++{
		fmt.Print("x")
	}
}

func y(){
	for i := 0; i < 10; i++{
		fmt.Print("y")
	}
}



func main(){
	go x()
	go y()
	time.Sleep(time.Second * 2)
	fmt.Println("end main")
}
