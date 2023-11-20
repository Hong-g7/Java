package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		int[] arr = new int[10001];
		for (int i = 0; i < 10001; i++) {
			arr[i] = r.nextInt(451);

		}

		System.out.println(Arrays.toString(arr));
		System.out.println("==========");

		double sum = 0;
		for (int x : arr) {
			sum += x;
		}
		System.out.println("평균은 >>" + sum / arr.length);
		// 최댓값,최솟값???
		// 오름차순으로 정렬해보자.!
		Arrays.sort(arr); // ==>파괴형 함수.
		// 램에 들어있는 10000개의 데이터위치를 옮겨 정렬해줌! integer.parseint값과 달리 ram에 저장된값을 변경해버리는 함수.
		System.out.println(Arrays.toString(arr));
		int min = arr[0];
		int max = arr[arr.length - 1];

		System.out.println("최솟값>>" + min);
		System.out.println("최댓값>>" + max);
		//점수가 최소값인 사람의 수, 점수가 최대값인 사람의 수 프린트
		//배열을 순서대로 순화해서 데이터 접근.
		int mincount=0, maxcount=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==min) {
				mincount++ ;
			}else if(arr[i]==max) {
				maxcount++;
			}
		}
		System.out.println("최하점의 인원수"+mincount);
		System.out.println("최고점의 인원수"+maxcount);
		
		int thr = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==300) {
				thr++;
			}
		}System.out.println("300점 인원수"+thr);
	}

}
