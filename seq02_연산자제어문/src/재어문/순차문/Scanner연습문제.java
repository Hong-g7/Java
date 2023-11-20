package 재어문.순차문;

import java.util.Scanner;

public class Scanner연습문제 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력하시오");
			String name = sc.next();
			System.out.println("키를 입력하시오");
			Double height = sc.nextDouble();
			System.out.println("몸무게를 입력하시오");
			int weight = sc.nextInt();
			System.out.println("저녁을 먹었는지 입력하시오");
			Boolean dinner = sc.nextBoolean();
			System.out.println("좌우명을 입력하시오");
			sc.nextLine();
			String we = sc.nextLine();
			
			System.out.println("내이름은"+name);
			System.out.println("내 내년 키는"+(1+height));
			System.out.println("내 몸무게는"+weight);
			System.out.println("나는 저녁을"+dinner);
			System.out.println("내 좌우명은"+we);
}
}