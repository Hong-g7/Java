package 생성자;

public class TV2 {
	public int ch;
	public int vol;
	public boolean onOff;

	public TV2(int c, boolean o, int v) {
		ch = c;
		vol = v;
		onOff = o;
	}
	// 생성자는 무조건 void라서 쓰지않고 오히려 쓰면 에러남 클래스 이름과 동일해야 객체 생성시 자동호출되기때문에 대문자로 입력해야한다.
	// 생성자 메서드(생성자), constructor

	public void change() {
		System.out.println("채널을 바꿉니다.");
	}

	@Override
	public String toString() {
		return "TV2 [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
 	}

	// 클래스를 만들면 기본 8개 정도의 메서드는 가지고 시작한다. 하지만 보이지 않기때문에 tostring을 사용한다.
	// toString()은 참조형변수 tv2를 프린트할 때 자동으로 프린트할 스트링을 만들어서 리턴해주는 메서드이다.

}
