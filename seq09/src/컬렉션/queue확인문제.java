package 컬렉션;

import java.util.LinkedList;

public class queue확인문제 {

	public static void main(String[] args) {
		LinkedList subjects = new LinkedList();
		subjects.add("국어");
		subjects.add("수학");
		subjects.add("영어");
		subjects.add("컴퓨터");

		// 1일차 시험
		subjects.remove("국어");

		System.out.println("1일차 시험본 후 남은 과목 :" + subjects);

		// 2일차 시험
		subjects.remove("영어");

		System.out.println("2일차 시험본 후 남은 과목 :" + subjects);
		// 3일차 시험
		subjects.remove("컴퓨터");
		
		System.out.println("3일차 시험본 후 남은 과목 :" + subjects);
	}
}
