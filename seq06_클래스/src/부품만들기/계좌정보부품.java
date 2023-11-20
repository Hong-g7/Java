package 부품만들기;

public class 계좌정보부품 {
	public String 이름;
	public String 계좌이름;
	public int 금액;
public void 입금하다() {
	System.out.println("입금하다.");
}
public void 출금하다() {
	System.out.println("출금하다.");
}
@Override
public String toString() {
	return "계좌정보부품 [이름=" + 이름 + ", 계좌이름=" + 계좌이름 + ", 금액=" + 금액 + "]";
}
}
//tostring()은 언제 사용 되나??
//참조형 변수를 프린트 할 때 자동으로 호출됨.

