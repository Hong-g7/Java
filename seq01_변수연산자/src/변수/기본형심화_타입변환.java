package 변수;

public class 기본형심화_타입변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	byte age = 127;
	int age1 = age;
	//큰방 <-- 작은방 : 자동으로 알아서 들어감
	
	int age3 =127; //4바이트
	//byte age4 = age3; //1바이트
	byte age4 = (byte)age3; //강제로 잘라서 넣어준다
	//강제 타입 변환(강제형변환, casting)

	}

}
