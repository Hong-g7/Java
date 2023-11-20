package 연습파일;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pw1 = JOptionPane.showInputDialog("비밀번호를 입력하시오");
		
		char pw2  = pw1.charAt(0);
		
		char pw3 = 'p';
				
		if(pw2 == pw3) {
			System.out.println("pass!");
		}else {
			System.out.println("재입력!");
		}
	
		
		String tod = JOptionPane.showInputDialog("몸무게 입력.");
		int yed = 50;
		
		Double tod1 =Double.parseDouble(tod)-yed;
		
		
		if(tod1>2) {
			System.out.println("다이어트 성공");
		}else {
			System.out.println("다이어트 실패");
		}
		if(pw2 == pw3 && tod1>2) {
			System.out.println("오늘은 성공");
		}else {
			System.out.println("내일 다시도전!");
		}
	}

}
