package 상속_문제;

public class 별오천개쓰레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(i+"권홍");
		}
	}
}
