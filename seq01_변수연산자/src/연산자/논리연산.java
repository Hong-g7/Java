package 연산자;

public class 논리연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//&&, ||, !
		// 회원가입시 입
		int id = 1111;
		int pw = 2222;
		//&& 에서 맨앞 조건의 결과가 false인경우, 뒤에 있는 조건의 비교는 불필요
		//|| 에서 맨앞 조건의 결과가 true인 경우, 뒤에 있는 조건의 비교는 불필
		int id2 = 1111;
		int pw2 = 2222;
		
		if(id==id2) {
			System.out.println("로그인 ok");
		}else {
			System.out.println("로그인 not");
		}
	}

}
