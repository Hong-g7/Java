package 제어문.조건문;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hour = date.getHours();
		int m = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour+"시"+m+"분"+sec+"초");
		
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int today = date.getDate();
		System.out.println(year+" "+month+" "+today);
		
		//요일
		int day = date.getDay();//요일
		System.out.println(day);
	}

}
