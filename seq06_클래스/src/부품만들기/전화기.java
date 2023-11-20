package 부품만들기;

public class 전화기 {
	// 멤버변수+멤버메서
	public int size; //기본형변수, 전역변수
	public String speaker;//전역변수는 자동초기화 0또는 null로 지정되어있음.

	public void 인터넷하다() {
		System.out.println("크롬으로 인터넷을 하다.");
		// 상속받은 메서드가 8개가 있음.
		// 눈에 안보임.
		// 상속받은 메서드를 재정의해서 마음대로 고쳐서 쓸수있음 == override.

	}

	@Override
	public String toString() {
		return "size=" + size + ", speaker=" + speaker+"입니다.";
	}
	
}
