package 상속_문제;

public class 감소쓰레드 extends Thread {
	public int minus = 0;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			minus--;
			System.out.println("감소>>"+minus);
		}
	}
}
