package 부품사용하기;

import 부품만들기.TV;

public class 우리집 {

	public static void main(String[] args) {
		//틀-클래스 ==> 실제-객체 
		TV myTv = new TV(); //4개 
		myTv.ch =7;
		myTv.vol = 9;
		myTv.onOff = false;
		
		TV yourTv = new TV(); //4개 
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		
		//new => 객체만들어주는 주는 키워드 
		//       객체생성 
		// Ram에 주소 + 멤버변수를 힙영역에 만들어준다. 4개.
		System.out.println(myTv.ch);
		System.out.println(myTv.vol);
		System.out.println(myTv.onOff);
	}

}