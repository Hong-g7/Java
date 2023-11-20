package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 놀러가고싶은곳우선순위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] last = new String[3];
		String[] year = new String[3];
		
		for (int i = 0; i < year.length; i++) {
			System.out.println("작년에가고싶었던 여행지 입력>>>");
			last[i]=sc.next();
		}
		
		for (int i = 0; i < year.length; i++) {
			System.out.println("올해에가고싶었던 여행지 입력>>>");
			year[i]=sc.next();
		}
		
		int count = 0;
		int diff = 0;
		for (int i = 0; i < year.length; i++) {
			if(last[i].equals(year[i])) {
				count++;
			}else {
				diff++;
			}
		}
		System.out.println("동일한곳은>>"+count);
		System.out.println("다른곳은>>"+diff);
	}
}
