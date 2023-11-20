package 배열스윙;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화관배열 {
	// 전역변수로 선언하자.
	static int count; // 전역변수는 자동초기화!
	static String num = " "; // 전역변수는 자동초기화!

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1600, 800);
		f.setTitle("랜덤버튼배열2");
		f.setLayout(new FlowLayout()); // FlowLayout 사용

		JButton[] b = new JButton[500];
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton();
			// b[i].setText(" "+i);
			b[i].setText(String.valueOf(i));

			b[i].setBackground(Color.gray);
			b[i].setForeground(Color.black);
			b[i].setOpaque(true); // 불투명 설정
			b[i].setBorderPainted(false);
			f.add(b[i]);

			b[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					String s = e.getActionCommand(); // 버튼 위의 텍스트 가져오기
					num = num + s + ",";
					int pay = count * 10000;
					JOptionPane.showMessageDialog(f, s + "번을 클릭하셨군요.!\n 현재 결제금액은 " + 
							pay + "원입니다.\n 좌석번호는"+num+"입니다.");
			
					JButton b2 = (JButton)e.getSource();//object
					b2.setBackground(Color.blue);
					b2.setEnabled(false);
				}
				
			});
			
			
		}
		// 맨 마지막으로!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}



