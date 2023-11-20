package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] 답안 = new int[990];
		int[] 내답 = new int[990];
		
		Random r = new Random();
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4);
			내답[i] = r.nextInt(4);
		}
		System.out.println(Arrays.toString(답안));
		System.out.println(Arrays.toString(내답));
		
		//하나 맞을때 점수가 1점
		//저는 몇점 일까요??
		
		int count = 0;
		for (int i = 0; i < 내답.length; i++) {
			if(답안[i]==내답[i]) {
				count++;
			}
		}System.out.println(count);
	}
	
}
