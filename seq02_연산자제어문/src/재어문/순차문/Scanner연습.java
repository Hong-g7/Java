package 재어문.순차문;

import java.util.Scanner;

public class Scanner연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력>>");
		
		String name = sc.next();
		
		System.out.println("당신의 이름은 "+name);
		
		System.out.println("나이를 입력하시오,");
		int age = sc.nextInt();
		System.out.println("당신의 내년 나이"+(age+1));
		
		
		
	}

}
