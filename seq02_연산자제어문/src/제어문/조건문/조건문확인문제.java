package 제어문.조건문;

import java.util.Scanner;

public class 조건문확인문제 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("당신이 먹고싶은 점심 메뉴는(짜장면,라면,회)");
	
	String menu = sc.nextLine();
	
	switch (menu) {
	case "짜장면":
		System.out.println("중국집으로 가요.");
		break;
	case "라면":
		System.out.println("분식집으로 가요.");
		break;
	case "회":
		System.out.println("횟집으로 가요.");
		break;

	default:
		System.out.println("아니면 그냥 안먹어요.");
		break;
	}
}

}
