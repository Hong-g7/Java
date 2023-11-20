package 연습파일;

import javax.swing.JOptionPane;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String phone = JOptionPane.showInputDialog("통신사를 입력하시오.");
	String number = JOptionPane.showInputDialog("전화번호를 입력하시오.");
	String name = JOptionPane.showInputDialog("이름을 입력하시오.");
	
	String result =(name+"은"+ phone+"에" + number);
	
	System.out.println(result+"로 가입되셨습니다.");
	}

}
