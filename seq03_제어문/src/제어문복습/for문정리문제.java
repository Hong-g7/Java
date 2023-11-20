package 제어문복습;

import java.util.Iterator;

public class for문정리문제 {

	public static void main(String[] args) {
		//모두 더하는 문제
		int sum1 = 0;
		
		for (int i = 33; i < 223; i++) {
			sum1 += i;
		}System.out.println(sum1); //모두더한값은 for문에서 벗어난지점에서 작성해야 결과값만 나온
		System.out.println(" ");
		
		//2씩 점프하는 문제
		int sum2 = 0;
		for (int i = 55; i < 4501; i+=2) {
			sum2 += i;
			System.out.println(sum2); //더하는 과정들을 보기위해서는 for문 안에 적어야한다.
		}
		System.out.println(" ");
		
		// for문 정리문제 5씩 점프하는
		int sum3 = 0; 
		for (int i = 33; i < 223; i+=5) {
			sum3 +=i; 
			System.out.println(sum3);
		}

		//문제2
		int sum4 = 0;
		for (int i = 1; i < 1001; i+=3) {
			sum4 += i;
			if(i%5 !=0) //5의 배수를 입력하는값은 5 + % 그리고 부정의 의미인 !를 입력하면된다.
				{
				sum4 +=i;
			}
			if(i==100) {
				System.exit(i);
			}System.out.println(i);
		}
		
	}

}
 