package 배열응용고급;

public class 전화번호입력문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String call = "011-245-1234";
		String a1 = call.trim();
		String[] a2 = call.split("-");
		
			if (a2[0].length() >=4) {
				System.out.println("최신폰");
			}
			else {
				System.out.println("올드폰");
			}
			int sum = 0;
			for (String x : a2) {
				sum = sum+x.length();
			}
			if(sum>=10) {
				System.out.println("유효한 전화번호");
			}else {
			System.out.println("유효하지않은 전화번호");
			}
			}

}
