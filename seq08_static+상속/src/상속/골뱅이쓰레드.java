package 상속;

import java.util.Iterator;

public class 골뱅이쓰레드 extends Thread {
	// 동시에 처리하고 싶은 코드를 넣어주세요

	@Override // 보기좋게 표시
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+"@");

		}
	}

}
