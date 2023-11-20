package 부품사용하기;

import 부품만들기.계좌정보부품;

public class 계좌정보 {
	public static void main(String[] args) {
		계좌정보부품 아버지 = new 계좌정보부품();
		아버지.계좌이름 = "튼튼적금";
		아버지.이름 = "아버지";
		아버지.금액 = 10000;

		계좌정보부품 어머니 = new 계좌정보부품();
		어머니.계좌이름 = "튼튼예금";
		어머니.이름 = "어머니";
		어머니.금액 = 20000;

		계좌정보부품 형 = new 계좌정보부품();
		형.계좌이름 = "다음적금";
		형.이름 = "아버지";
		형.금액 = 30000;

		System.out.println(아버지);
		System.out.println(형);
		System.out.println(어머니);
	}

}
