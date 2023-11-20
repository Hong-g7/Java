package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동",25,"여");
		직원 work2 = new 직원("김길동",24,"남");
		직원 work3 = new 직원("송길동",26,"여");
		
		System.out.println("우리회사 직원수는>>"+직원.count);
		System.out.println("우리회사 직원 각각 정보는>>"+work1);
		System.out.println("우리회사 직원 각각 정보는>>"+work2);
		System.out.println("우리회사 직원 각각 정보는>>"+work3);
		System.out.println("우리회사 직원평균 나이는>>"+직원.age/3);
		System.out.println(직원.getavg()); //평균나이 구하는 메서드를 이용함
	}

}
