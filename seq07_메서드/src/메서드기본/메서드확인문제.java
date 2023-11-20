package 메서드기본;

public class 메서드확인문제 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; //오전
		int count2 = 4; //오후
		
		int total = cal3.add(count1,count2);
		System.out.println("1.오늘온 손님의 총합은 "+total+"명 입니다.");
		
		int total1 = cal3.minus(count1, count2);
		System.out.println("2.손님수 차이는 "+total1+"명 입니다.");
		
		int total2 = cal3.곱하기(price, count1);
		System.out.println("3.오전에 결제금액은 "+total2+"원 입니다.");
		
		int total3 = cal3.곱하기(price, count2);
		System.out.println("4.오후에 결제금액은 "+total3+"원 입니다.");
		
		int total4 = cal3.add(total2,total3);
		System.out.println("5.오늘하루 총 결제 금액은 "+total4+"원 입니다.");
		
		int total5 = cal3.나누기(total4,total);
		System.out.println("6.1인당 결제 금액은 "+total5+"원 입니다.");
	}
}
