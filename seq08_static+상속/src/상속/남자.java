package 상속;

public class 남자 extends 사람{
	//사람 클래스를 확장해서 남자 클래스를 만들었다.
	
	//몇개의 매개변수와 매개메서드를 가지고 태어났는가?
	//매개 변수 2개 멤버 메서드 3개 ->5개를 가지고 태어남.
	int speed;
	public void 빨리달리다() {
		System.out.println("매우 빨리달리다.");
	}
}
