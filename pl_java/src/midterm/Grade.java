package midterm;

import java.util.*;
// 과제
// if문 X, else문 X, 출력구문 1개만, : 사용금지, break 사용금지, 캐스팅 X
// 위 조건을 최대한 만족시키면서 아래 코드와 같은 결과를 내는 코드를 Stream, 람다식등을 써서 작성하시오.

public class Grade {

	public static void main(String[] args) {
		System.out.print("점수 입력 : ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		List<Integer> scoreList = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
		List<String> gradeList = Arrays.asList("F","F","F","F","F","E","D","C","B","A","A");

		scoreList.stream()
				.filter(s -> s == score/10)
				.forEach(s -> System.out.println(gradeList.get(s)));



// Modern jdk14 support
//		String grade = switch(score/10) {
//			case 10, 9 -> "A";
//			case 8 -> "B";
//			case 7 -> "C";
//			case 6 -> "D";
//			default -> "F";
//		};
//		System.out.println(grade);


	}
}