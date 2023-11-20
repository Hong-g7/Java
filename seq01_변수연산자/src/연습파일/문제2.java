package 연습파일;

import javax.swing.JOptionPane;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubinte
		String height = JOptionPane.showInputDialog("키를 입력하시오.");
		
		Double result = Double.parseDouble(height);
		
		System.out.println("적정 몸무게는"+((result-100)*0.9)+"입니다.");
		
	}
	

}
