package 연습파일;

import javax.swing.JOptionPane;

public class 연습문제6 {public static void main(String[] args) {
	String a1 = JOptionPane.showInputDialog("입력하시오");
	String b1 = JOptionPane.showInputDialog("입력하시오");
	
	int r1 = Integer.parseInt(a1);
	int r2 = Integer.parseInt(b1);
	
	int result = r1+r2;
	
	System.out.println(result);
	
	String tem = JOptionPane.showInputDialog("현재 온도를 입력하시오");
	
	Double result1 = Double.parseDouble(tem);
	if(result1 > 25) {
		System.out.println("너무 더워요");
	}else {
		System.out.println("괜찮아요.");
	}
}

}
