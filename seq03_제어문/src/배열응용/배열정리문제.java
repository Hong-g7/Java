package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주십시오.");
		int[] x = new int[5];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		x[3] = sc.nextInt();
		x[4] = sc.nextInt();
		System.out.println(x[0]+x[2]);
		
		String[] a = new String[3];
		a[0]="자바";
		a[1]="스프링";
		a[2]="jsp";
		System.out.println(a[0]+"보다는"+a[1]);
	}

}
