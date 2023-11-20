package 제어문복습;

import java.util.Scanner;

public class 반복문정리문제 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      
       int iu = 0;
       int yu = 0;
       int bts = 0;
      
       while (true) {
		System.out.println("1번 아이유 2번 유재석 3번 방탄소년단 4번 종료.");
		System.out.println("선택하시오.");
		int ans = sc.nextInt();
		
		switch (ans) {
		case 1:
			iu++;
			break;
		case 2:
			yu++;
			break;
		case 3:
			bts++;
			break;

		default:
			break;
		}
		
		System.out.println("그만하시겠습니까?(y/n)");
		String dd = sc.next();
		
		if (dd.equals("y")) {
			System.out.println("아이유 득표수>>" + iu);
			System.out.println("유재석 득표수>>" + yu);
			System.exit(0);
		}
	}
        }
    }
