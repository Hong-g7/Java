package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random(100);
		// r.setSeed(100);
		int[] arr = new int[1001];
		for (int i = 0; i < 1001; i++) {
			arr[i] = r.nextInt(100);

		}
		//배열 프린트
		System.out.println(Arrays.toString(arr));
	}

}
