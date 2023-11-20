package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		JOptionPane.showConfirmDialog(null,"당신의 이름은"+ name+"이군요.");
		System.out.println("당신의 이름은"+ name+"이군요.");
		
		String name1 = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		JOptionPane .showConfirmDialog(null, "홍길동님의 취미는"+name1+"입니다.");
		System.out.println("홍길동님의 취미는"+name1+"입니다.");
		
		String name3 = JOptionPane.showInputDialog("당신은 몇시에 일어나시나요?");
		JOptionPane.showConfirmDialog(null, " 테니스를 "+name3+"시 부터 시작할수 있군요!");
		System.out.println("테니스를"+name3+"시 부터 시작할수 있군요!");
		
	
		
	}

}