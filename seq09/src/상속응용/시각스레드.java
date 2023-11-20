package 상속응용;

import java.util.Date;

public class 시각스레드 extends Thread{
	@Override
	public void run() {
		//동시에 처리하고 싶은 내용!
		for (int i = 500; i >= 0; i--) {
			Date date = new Date();
			System.out.println("시각>> " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace(); // 에러출력
				// 이메일을 보내는 처리
				// 문자로 보내는 처리
			}
		}
	}
}