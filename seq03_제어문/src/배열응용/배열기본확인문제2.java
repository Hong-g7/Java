package 배열응용;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class 배열기본확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] trip = new String[5];
		trip[0] = "바다";
		trip[1] = "뉴욕";
		trip[2] = "집";
		trip[3] = "일본";
		trip[4] = "멕시코";
		for (String x : trip) {
			System.out.println(x);
		}
		
		char[] color = new char[5];
		color[0] = 'r';
		color[1] = 'b';
		color[2] = 's';
		color[3] = 'e';
		color[4] = 'y';
		for (char y : color) {
			System.out.println(y);
		}
		
		int[] height = new int[5];
		height[0] = 183;
		height[1] = 184;
		height[2] = 185;
		height[3] = 186;
		height[4] = 187;
		for (int z : height) {
			System.out.println(z);
		}
	}

}
