package 스태틱;

public class 직원 {
	public String 이름;
	public int 나이;
	public String 성별;
	public static int count = 0;
	public static int age = 0;
	
	
	public 직원(String 이름, int 나이, String 성별) {
		super();
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
		count++;
		age=age+나이;
		
	}
	@Override
	public String toString() {
		return "직원 [이름=" + 이름 + ", 나이=" + 나이 + ", 성별=" + 성별 + "]";
	}
	
	//평균을 구해주는 메서드를 만들어보자
	public static int getavg(){
		//static 메서드 안에서 instance를 쓰면 에러가난다 이유는 static메서드안에서는 static변수만 써야하기 때문이다.
		return age/count;
	}
}
