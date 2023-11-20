package 연습파일;

import javax.swing.JOptionPane;

public class 연습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String  kg = JOptionPane.showInputDialog("몸무게를 입력하십시오.");
		String cm = JOptionPane.showInputDialog("키를 입력하십시오.");
		
		Double r1 = Double.parseDouble(kg);
		Double r2 = Double.parseDouble(cm);
		
		double result = r1*(r2*r2);
		
		System.out.println("bmi는"+result+"입니다.");
		
		int gp = 3000;
		double pp = 33.3;
		
		double result1 = gp+pp;
		
		System.out.println("최종 포인트는 ="+result1);
		}
}
