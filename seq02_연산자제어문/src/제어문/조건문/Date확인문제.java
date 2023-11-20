package 제어문.조건문;

import java.util.Date;

public class Date확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
        int year = date.getYear() + 1900;

        switch (year) {
            case 2000:
                System.out.println("밀레니엄 세대시군요.");
                break;
            default:
                System.out.println("밀레니엄 세대가 아니시군요.");
                break;
		}
		int date1 = date.getDate();
		switch (date1) {
		case 5:
			System.out.println("쉬~~~자!");
			break;
		case 6:
			System.out.println("쉬~~~자!");
			break;

		default:
			System.out.println("열~~심히 공부하자!");
			break;
		}
		int month = date.getMonth();
		switch (month) {
		case 2:
			System.out.println("30일 까지");
			break;
		case 4:
			System.out.println("30일 까지");
			break;
		case 6:
			System.out.println("30일 까지");
			break;
		case 9:
			System.out.println("30일 까지");
			break;
		case 11:
			System.out.println("30일 까지");
			break;

		default:
			System.out.println("31일 까지");
			break;
			
		}
        }       
}
