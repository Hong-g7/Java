package 연산자;

public class 연산시주의점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 5;
		int n2 = 4;
		
		//int 3 = n1 + n2;
		//자바의 연산시 정수와 정수 연산은 무조건 정수 
		int sum = n1+n2;
		//자바의 연산시 하나라도 실수 이면 무조건 실
		int n4 = (sum/2);
		
		Double avg = sum / 2.0;
		
		System.out.println("제대로 평균은" + avg);
		
	}

}
