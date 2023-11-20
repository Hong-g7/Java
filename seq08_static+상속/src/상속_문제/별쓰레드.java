package 상속_문제;

import java.util.Iterator;

public class 별쓰레드 extends Thread{
	//동시에 돌아가는 부품이 됨.
	//run()
	//start() -> 동시에 시작하렴!
	
	@Override // 보기좋게 표시
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+"*");
			
		}
	}

}
