package 배열기본;

import java.util.Iterator;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[5];

		// 2
		System.out.println(ar.length);
		// 3
		ar[0] = 100;
		// 4
		ar[(ar.length) - 1] = 500;
		// 5
		ar[2] = 100;
		// 6
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		// 7
		System.out.println();
		for (int x : ar) {
			System.out.print(x + " ");

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
			System.out.println(">>>"+ ar[1]);
		}
	}

}
