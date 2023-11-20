package 제어문복습;

import java.util.Scanner;

public class 제어문정리문제기본 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id = "root";
		int pw = 1234;
		
		System.out.println("아이디를 입력하시오.");
		String dd = sc.next();
		System.out.println("비밀번호를 입력하시오.");
		int yy = sc.nextInt();
		
		if(dd.equals(id) && yy==pw) {
			System.out.println("로그인에 성공하셨습니다!.");
		}else {
			System.out.println("로그인에 실패하셨습니다.!");
		}
		System.out.println("사과구매갯수를 적으시오.");
		int apple = sc.nextInt();
		System.out.println("사과한개당 가격을 적으시오.");
		int apple2 = sc.nextInt();
		
		int result1 = apple * apple2;
		
		System.out.println("딸기구매갯수를 적으시오.");
		int straw = sc.nextInt();
		System.out.println("딸기한개당 가격을 적으시오.");
		int straw1= sc.nextInt();
		
		int result2 = straw * straw1;
				
		System.out.println("사과 구매가격은"+result1+"입니다.");
		System.out.println("딸기 구매가격은"+result2+"입니다.");
		System.out.println("전체 구매 가격은"+(result2+result1)+"입니다.");
	}

}
