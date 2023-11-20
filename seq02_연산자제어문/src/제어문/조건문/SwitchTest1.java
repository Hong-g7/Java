package 제어문.조건문;

public class SwitchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "자바";
		
		switch (name) {
		case "자바":
			System.out.println("1101호로 go!");
			break; //break를 포함하고있는 괄호를 찾으세요!
		case "파이"://벗어나겠다 라는 뜻.
			System.out.println("1102호로 go!");
			break;
		case "리눅스":
			System.out.println("1103호로 go!");
			break;

		default:
		System.out.println("카운터로 go!");
			break;
		}

	}

}