package 제어문.조건문;

import java.util.Date;
import java.util.Scanner;

public class 금요일문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date da = new Date();
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("시간을 입력하세요");
		//int time1 = sc.nextInt();
		
		int time = da.getHours();
		
		switch (time) {
		case 11:
			System.out.println("굿모닝!");
			break;
			
		case 15:
			System.out.println("굿애프터눈!");
			break;
	
		case 19:
			System.out.println("굿이브닝!");
			break;

		default:
			System.out.println("굿나잇");
			break;
		}

	}

}
