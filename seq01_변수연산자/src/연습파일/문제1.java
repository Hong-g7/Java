package 연습파일;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ga = JOptionPane.showInputDialog("가로넓이 입력.");
		String sae = JOptionPane.showInputDialog("세로넓이 입력.");
		
		int gae1=Integer.parseInt(sae);
		int sae2=Integer.parseInt(ga);
		
		int result = (sae2*gae1);
		
		JOptionPane.showConfirmDialog(null, "가로넓이는"+gae1+"입니다." );
		JOptionPane.showConfirmDialog(null, "세로넓이는"+sae2+"입니다." );
		
		
		System.out.println(result);
	}

}
