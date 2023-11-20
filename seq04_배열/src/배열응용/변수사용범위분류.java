package 배열응용;

public class 변수사용범위분류 {
	static int count = 0;

	// 선언할때 램에 저장공간이 생김.
	// 선언하는방법 : 데이터타입 변수명;
	// count 변수를 포함하고 있는 괄호 바로 아래에서 사용 가능
	// --> 클래스 바로 아래에서 선언되었다라는 애기는 클래스 전체영역에서 사용 가능하다라는 뜻
	// 사용가능!(전역변수,global변수)
	public static void main(String[] args) {
		//클래스 바로 아래 선언된 변수가 아닌 변수들은 선언된 괄호안에서만 사용되기 때문에 지역변수라고 부른다.
		//지역변수,local 변수
		int sum = 0; //지역 변수
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i);
			//i변수 - for문 지역안에서만 사용할 수 있는 범위, 지역변수
			
		}
	}

}
