package 스태틱;

public class Day {
	public String 하는일;
	public int 시간;
	public String 장소;
	public static int count = 0;
	public static int sum = 0;

	// 객체생성시 초기값을 자동으로 넣어주고 싶을때
	// 생성자 메서드
	public Day(String 하는일, int 시간, String 장소) {
		super();
		this.하는일 = 하는일;
		this.시간 = 시간;
		this.장소 = 장소;
		count++;
		sum=sum+시간;
	}

	//객체생성후, 값들 출력하고 싶을 때
	//toString
	@Override
	public String toString() {
		return "Day [하는일=" + 하는일 + ", 시간=" + 시간 + ", 장소=" + 장소 + "]";
	}
}
