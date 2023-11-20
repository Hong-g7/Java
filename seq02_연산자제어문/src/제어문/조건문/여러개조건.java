package 제어문.조건문;

public class 여러개조건 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score = 75;
	String result = "";
			
	if(score>=90) {
		result = "A학점입니다.";
	}else if (score >= 80) {
		result = "B학점입니다.";
	}else if (score >= 70) {
		result = "C학점입니다.";
	}else if (score >= 60) {
		result = "D학점입니다.";
	}else {
		result ="F학점입니다.";
	}
	System.out.println(result);

	}

}
