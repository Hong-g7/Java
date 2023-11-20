package 상속_문제;

public class 증가감소쓰레드 {

	public static void main(String[] args) {
		증가쓰레드 pp = new 증가쓰레드();
		감소쓰레드 mm = new 감소쓰레드();
		
		pp.start();
		mm.start();

	}

}
