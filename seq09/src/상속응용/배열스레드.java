package 상속응용;

public class 배열스레드 extends Thread{
//run(), start(), .....
	@Override
	public void run() {
		//동시에 처리하고 싶은 내용!
		String[] list = {"1.png", "2.png","3.png","4.png", "5.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지>> " + list[i]);
			try {
				Thread.sleep(5000);//밀리세컨즈, 5초
			} catch (InterruptedException e) {
				e.printStackTrace(); //에러출력 
			}
		}
	}
}
			// 외부의 자원 cpu을 연결할때는 아주 위험한 순간이기 때문에 위험한 순간이 발생되었을대 어떻게 처리할지 명시해줘야함
		