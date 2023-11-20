package 제어문.조건문;

import java.util.Scanner;

public class 복습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("a값을 입력하시오.");
		int a = sc.nextInt();
		System.out.println("b값을 입력하시오.");
		int b = sc.nextInt();
		
		while (true) {
			if (a == b) {
				System.out.println("a가b와 동일합니다.");
			}else if(a>b) {
				System.out.println("a가b보다 큽니다.");
			}else {
				System.out.println("b가 a보다 큽니다.");
			}
			System.out.println("더 하시겠습니가??");
			String choice = sc.next();
			
			if(choice.equals("x")||choice.equals("X")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
	}

}
