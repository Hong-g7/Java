package 메서드기본;

public class 내카페 {
	public static void main(String[] args) {

		// 계산기의 add()의 기능을 사용하고 싶으면 램에 계산기 원본을 이용해서 대상을 가져다 놓고 난 다음
		// 필요한 메서드를 사용한다 이것들을 객체생성이라고 한다.
		// 객체 생성 먼저 한후, 필요한 메서드를 선택해서 사용하면 된다.
		// cal 변수 안에 계산기 생성된 것의 위치(주소)가 들어있음.
		// 생성된 주소가 있어야 메서드 사용이 가능!

		계산기 cal = new 계산기(); // <-- 우선적으로 주소를 입력받을수있게 변수를 선언하고
		cal.add(); // <-- 변수를 사용해서 메서드를 사용할수있다. /ex)계산기.add()절대 안됨!! 오류!!이유는 주소를 받는 변수가 없어서!

		// 할인 기간이면 계산된 금액에서 1000원을 할인해주기

		int total = cal.add2(); // void X-> int return / 변수를 선언해서 불러온 값을 저장하기 !
		System.out.println(total - 1000);

		int total2 = cal.add3(3500, 5); // 괄호 안에 값을 입력해놓은상태에서 함수만 불러다가 계산함 이러한것을 매게변수(parameter)라고 부른다.
		System.out.println(total2 - 1000);

		int total3 = cal.add4(10000);// 입력한 값 10000원에 미수금 2000원을 더해서 리턴한 다음 1000을 뺴서 출력
		System.out.println(total3-1000);
	}
}
