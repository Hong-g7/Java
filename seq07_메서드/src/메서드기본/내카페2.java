package 메서드기본;

import java.util.Random;

public class 내카페2 {

	public static void main(String[] args) {
		계산기2 Cal2 = new 계산기2();
		// 메서드 이름이 하나로 다 똑같지만 입력형태가 다양하다 즉 하나의 이름으로 다양한 형태로 만들수있는것이 자바의 특징(=다형성)이다.
		// 다형성(오버로딩)제공 즉 여러개의 메서드가 불러지는것 주의할점은 똑같은 타입의 매서드가 여러개 있는건 안됨 and 파이썬 -> X

		int total = Cal2.add(200, 300); // 입력값의 타입을 통해 같은이름의 메서드를 결정
		System.out.println(total);

		double total2 = Cal2.add(300, 11.2);
		System.out.println(total2);

		System.out.println(Cal2.add(11.1, 22.2));
		
		double total3 = Cal2.add(100, 200) + Cal2.add(100, 22.2);
		System.out.println(total3);
		
		int[] total4 = Cal2.add();
		System.out.println(total4[0]+100);
		
		Random r = new Random();
		int x = r.nextInt();
		double y = r.nextInt();
	}

}
