package 메서드기본;

public class 계산기 {
	// public x -> 같은 패키지에서만 사용가능 but public o -> 어디서든 사용가능
	// add라고 하는 명령어(함수/메서드)에 대한 처리내용을 쭉 써주게 된다.
	public void add() {
		System.out.println("더하기 기능");
	}
	public int add2() {
		int price = 5000;
		int count = 3;
		int sum = price*count; // 아무리 코드가 복잡해도 많더라도 결국 리턴해줄 변수 앞에있는 type값을 보면됨
		return sum;
	}
	public int add3(int price,int count) {
		int sum = price * count ;
		return sum;
	}
	public int add4(int price) {
		int sum = price - 2000;
		return sum;
	}
}