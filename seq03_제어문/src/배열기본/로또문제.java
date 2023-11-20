package 배열기본;

import java.util.Arrays;
import java.util.Random;

public class 로또문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] n2 = new int[1001];
		for (int i = 0; i < 1001; i++) {
			n2[i] = r.nextInt(100);
			//System.out.println(n);
		}
		System.out.println(Arrays.toString(n2));
		int sum = 0;
		for (int x : n2) {
			sum = sum + x;
			
		}System.out.println(sum+" "+(double)sum/n2.length);
	}

}
