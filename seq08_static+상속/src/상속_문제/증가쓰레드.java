package 상속_문제;

public class 증가쓰레드 extends Thread {
	public int plus = 0;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			plus++;
			System.out.println("증가>>"+plus);
		}
	}
}
