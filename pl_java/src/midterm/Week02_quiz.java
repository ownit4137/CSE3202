package midterm;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Week02_quiz {

	public static void main(String[] args) {

		//1.  큰 숫자 입력에 대한 올바른 처리가 되도록 자바 코드를 수정하시오. factorial 100


		//2. 아래 조건을 보고 identfier을 EBNF로 표현

		int aa = 0xFCFFFF_FF;
		int bb = 0X13FF_FfbF;
		//불가// int cf = 0xfFFFFFFF_;
		//불가// int df = 0xFFFKFFFF;
		//불가// int ef = 0x_FFFBaFF;
		int ff = 0x07FBaF6F;

		/*
		 * <digit> ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9" 
		 * <hexdigit> ::= <digit> | "a" ... "f" | "A" ... "F"  
		 * <hexadecimal> ::= "0" ( "x" | "X" ) <hexdigit> [{(["_"] | <hexdigit>)} <hexdigit>]
		 */

		int input = 0;

		BigInteger res = Stream.iterate(BigInteger.ONE, a -> a.add(BigInteger.ONE)).limit(input).reduce(BigInteger.ONE, (a, b) -> a.multiply(b));
		System.out.println(res);
	}
}