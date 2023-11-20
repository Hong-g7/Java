package 제어문복습;

import java.util.Scanner;

public class 제어문정리문제심화 {public static void main(String[] args) {
	//3.심화문제
	Scanner sc = new Scanner(System.in);
	
	System.out.println("시작값을 입력하시오.");
	int start1 = sc.nextInt();
	
	System.out.println("종료값을 입력하시오.");
	int end1 = sc.nextInt();
	
	int sum1 = 0;
	
	for (int i = start1; i < end1; i++) {
		sum1+= i;
	}
	System.out.println("시작값 부터 종료값 까지 모두 더한값은>>"+sum1);
	
	//4.심화문제
	System.out.println("시작값을 입력하시오.");
	int start2 = sc.nextInt();
	
	System.out.println("종료값을 입력하시오.");
	int end2 = sc.nextInt();
	
	System.out.println("점프값을 입력하시오.");
	int jump2 = sc.nextInt();
	
	int sum2 = 0;
	
	for (int i = start2; i < end2; i+=jump2) {
		sum2+= i;
		System.out.println("시작값 부터 종료값 까지 모두 더한값은>>"+sum2);
	}
	
	
	//5.심화문제
	System.out.println("시작값을 입력하시오.");
	int start3 = sc.nextInt();
	
	System.out.println("종료값을 입력하시오.");
	int end3 = sc.nextInt();
	
	System.out.println("점프값을 입력하시오.");
	int jump3 = sc.nextInt();
	
	int sum3 = 0;
	
	for (int i = start3; i < end3; i+=jump3) {
		sum3+= i;
		System.out.println("시작값 부터 종료값 까지 모두 더한값은>>"+sum3);
		if(sum3==99) {
			System.exit(0);
		}
	}
	
	
}

}
