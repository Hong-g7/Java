package 부품사용하기;

import 부품만들기.전화기;

public class 전화기사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		전화기 p1 = new 전화기();
		p1.size=11;
		p1.speaker="바나나사";
		System.out.println("p1>>"+p1);
		System.out.println("사이즈는 "+p1.size+ ",회사는 "+p1.speaker);
		
		전화기 p2 = new 전화기();
		p2.size=9;
		p2.speaker="메론사";
		System.out.println("p2>>"+p2);
		System.out.println("사이즈는 "+p2.size+ ",회사는 "+p2.speaker);
		p2.인터넷하다();
	}

}
