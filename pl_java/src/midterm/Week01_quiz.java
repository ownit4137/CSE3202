package midterm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Week01_quiz {
	public static void main(String[] args) {
		Scanner scv = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = scv.nextInt();

	/*


	
//		ArrayList<String> gradelist = new ArrayList<String>();
//		gradelist.add("A");
//		gradelist.add("A");
//		gradelist.add("B");
//		gradelist.add("C");
//		gradelist.add("D");
//		gradelist.add("F");
		
		List<String> gradelist = Arrays.asList("A", "A", "B", "C", "D", "F");
		String grade = gradelist.stream()
				.filter((e) -> (gradelist.indexOf(e) <= 9 - score/10 + 1))
				//.sorted(Comparator.reverseOrder())
				.sorted((a,b) -> b.compareTo(a))
				.findFirst().orElse(null);
		System.out.println(grade);

		gradelist.stream().filter(e -> (gradelist.indexOf(e) <= 9-score/10+1))
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);*/
	}
}