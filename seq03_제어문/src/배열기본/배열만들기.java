package 배열기본;

import java.util.Iterator;

public class 배열만들기 {
	public static void main(String[] args) {
		// 1. 배열 만들때 기준 - 값을 모르고 있는 경우.
		int[] s = new int[5];
		
		// 2. 배열 만들때 기준 - 값을 이미 알고 있는 경우.
		int[] s1 = { 1, 2, 3, 4, 5 };

		// s가 가르키고 있는 첫번째 값에다가 100을 넣어보자.
		s[0] = 100;
		
		// s가 가르키고 있는 첫번째 값에다가 200을 넣어보자.
		s[2] = 200;
		
		// s가 가르키고 있는 첫번째 값에다가 300을 넣어보자.
		s[s.length - 1] = 300;

		// s와 s1의 개수(사이즈 size,길이 length)를 프린트
		System.out.println(s.length);
		System.out.println(s1.length);
		
		// s가 가르키는 첫번째 값 프린트
		System.out.println(s[0]);
		
		// s가 가르키는 세번째 값 프린트
		System.out.println(s[2]);
		
		// s가 가르키는 마지막 값 프린트
		System.out.println(s[s.length - 1]); // 마지막값을 입력할때는 -1을 한 값을 넣어주면된다.
		
		//s가 가르키고 있는 첫번째 값과 세번째 값을 더해서 프린트
		System.out.println(s[0]+s[2]);
		//s가 가르키고 있는 첫번째 값과 세번째 값이 동일한지 프린트
		System.out.println(s[0]== s[2]);
		
		//c언어에서 사용하던 for문 문법
		for (int i = 0; i < s1.length; i++) {
			System.out.println(i);
		}
		for (int x : s) {
			//출력용으로만 사용!
			System.out.println(x);
		}
	}
}
