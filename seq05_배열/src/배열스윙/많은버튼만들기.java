package 배열스윙;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 400);
		f.setTitle("나의버튼들");
		f.setLayout(null);

		JButton[] buttons = new JButton[200];
		// 모든 기본형을 제외한 참조형 배열은 초기값이 null이다.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼" + i);
		}
		for (int i = 0; i < buttons.length; i++) {
			// 랜덤을 사용해서 x좌표와y좌표를 설정한다.
			Random r = new Random();
			int x = r.nextInt(1200);
			int y = r.nextInt(800);
			buttons[i].setBounds(x, y, 100, 100);
			// 가로위치-세로위치-가로크기-세로크기
			buttons[i].setBackground(Color.yellow);
			buttons[i].setForeground(Color.red);
			// 맥북에서는 버튼에 색을넣으려면 쓰는 코드들.
			buttons[i].setOpaque(true);
			buttons[i].setBorderPainted(false);
			f.add(buttons[i]);
		}

		// x버튼을 눌렀을때 프로그램이 종료되도록 만드는 함수.(원래는 백그라운드에서 돌아감.)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible은 항상 맨아래로 보내기!
		f.setVisible(true);
	}

}
