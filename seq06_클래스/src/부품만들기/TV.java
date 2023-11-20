package 부품만들기;
public class TV {

		// TV라는 부류의 공통적인 특징을 가지고 틀을 만들 예정
		//속성(특성, 성질) - 채널, 볼륨, 온오프상태 ==> 멤버 변수로 표현
		//기능(동작) = 채널을 바꾸다, 유튜브 보다 ==> 멤버메서드(멤버함수)로 표현
		
		public int ch;
		public int vol;
		public boolean onOff;
		
		//TV tv1 = new TV();
		//주소는 4,int 4*2, boolean 1 ==> 13.
		
		public void 채널을바꾸다()  {
			int change = 1; // 지역변수, local변수 , 로컬변수
			System.out.println(ch+change+"채널을 바꾸는 기능 처리");
	}
		public void 유튜브보다()  {
			System.out.println(vol+"볼륨을 키워서 동영상을 보다.");
		}

}
