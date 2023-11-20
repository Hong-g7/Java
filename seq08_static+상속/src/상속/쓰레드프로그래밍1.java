package 상속;

import 상속_문제.별쓰레드;

public class 쓰레드프로그래밍1 {

	public static void main(String[] args) {
		별쓰레드 t1 = new 별쓰레드();
		골뱅이쓰레드 t2 = new 골뱅이쓰레드();
		
		t1.toString();
		t2.start();
	}

}
