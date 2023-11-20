package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class random배열정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42);
		

		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1001);
		}
		// 배열 프린트
		System.out.println(Arrays.toString(arr));

		// 평균
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("평균은>>" + (double) sum / arr.length);

		// 갯수별 변수
		int thr = 0;
		int four = 0;
		int five = 0;
		int six = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 300) {
				thr++;
			} else if (arr[i] == 400) {
				four++;
			} else if (arr[i] == 500) {
				five++;
			} else if (arr[i] == 600) {
				six++;
			}
		}
		System.out.println("300이상의 갯수는>>>" + thr);
		System.out.println("400이상의 갯수는>>>" + four);
		System.out.println("500이상의 갯수는>>>" + five);
		System.out.println("600이상의 갯수는>>>" + six);

		// 오름차순으로 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 최대값,최소값
		System.out.println("최대값은>>" + arr.length);
		System.out.println("최소값은>>" + arr[0]);
		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				max++;
			} else if (arr[i] == min) {
				min++;
			}
		}
		System.out.println("최대값을 가진 사람의 숫자>>" + max);
		System.out.println("최소값을 가진 사람의 숫자>>" + min);
	}

}
