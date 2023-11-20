package 연습파일;

import javax.swing.JOptionPane;

public class 연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = JOptionPane.showInputDialog("오늘이 몇요일인가요?");
		String day1 = JOptionPane.showInputDialog("오늘 뭐할 예정인가요?");
	
		String result = "오늘"+day+"에 수업후 나는"+day1+"할 예정";
		
		System.out.println(result);
		

		int num1 = 30;
		int num2 = 40;
		
	    Double r1 = Double.valueOf(num1);
	    Double r2 = Double.valueOf(num2);
	   
	   
		
		System.out.println("두수의 더한값은"+r1+r2+"입니다.");
		System.out.println("두수의 나눈값은"+r1/r2+"입니다.");
		System.out.println("두수의 나눈값 나머지는"+ r1%r2 +"입니다.");
	}

}
