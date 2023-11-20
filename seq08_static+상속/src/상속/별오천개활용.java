package 상속;

import 상속_문제.별오천개쓰레드;
import 상속_문제.이름오천번쓰레드;

public class 별오천개활용 {

	public static void main(String[] args) {
		별오천개쓰레드 별 = new 별오천개쓰레드();
		이름오천번쓰레드 이름 = new 이름오천번쓰레드();

		별.start();
		이름.start();
	}

}
