package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 스트림활용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("일,월,화 날씨를 순서대로 입력해보세요.");
		//입력
		String a = sc.next(); 
	
		//갯수세기
		String[] a2 = a.split(",");
		System.out.println(Arrays.toString(a2));
		
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < a2.length; i++) {
			if(a2[i].equals("맑음")) {
				count++;
			}else {
				count2++;
			}
		}
		System.out.println("흐림의 갯수는>>"+count2);
		System.out.println("맑음의 갯수는>>"+count);
	}

	}
