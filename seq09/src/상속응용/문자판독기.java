package 상속응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.omg.CORBA.PUBLIC_MEMBER;

public class 문자판독기 extends JFrame {
	JLabel ch, words, chCount, wordsCount;
	JTextArea area; // null==> 주소없음. 저장해놓은 위치가 아직 없는상태
	JButton b1, b2, b3;

	// 전역변수는 자동초기화, 참조형변수(); ==>null로 초기화
	public 문자판독기() {
		setTitle("문자판독기");
		setSize(700, 500);

		ch = new JLabel("글수>>");
		words = new JLabel("단어수>>");
		chCount = new JLabel("문자수 결과 들어갈 자리");
		wordsCount = new JLabel("단어수 결과 들어갈 자리");

		area = new JTextArea(5, 10); // 세로5줄, 가로 10글자

		b1 = new JButton("글자수카운트");
		b2 = new JButton("배경색변경");
		b3 = new JButton("글자색변경");

		setLayout(new FlowLayout());

		add(ch);
		add(chCount);
		add(words);
		add(wordsCount);
		add(area);
		add(b1);
		add(b2);
		add(b3);

		Font font = new Font("맑은고딕", Font.BOLD, 40);
		ch.setFont(font);
		chCount.setFont(font);
		words.setFont(font);
		wordsCount.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		area.setBackground(Color.yellow);
		area.setForeground(Color.BLUE);

		getContentPane().setBackground(Color.green);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을때 처리할 내용
				// 모의코드(수도코드, peseudo code)
				// 입력한 문자열을 가지고 와서 저장한후에 글자수를 카운트, 문자수 카운트 다음 각각의 라벨에 넣어주기
				String s = area.getText();

				// 글자수를 카운트 해주세요
				int num = s.length();

				// 단어수를 계산해주세요
				String[] s2 = s.split(" ");
				int num2 = s2.length;

				// 각각의 라벨에 넣어주세요
				chCount.setText(num + " ");
				wordsCount.setText(num2 + " ");

			}
		});
		b2.addActionListener(new ActionListener() {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 눌렀을때 바탕색이 바뀌어야한다.

				if (count == 1) {
					area.setBackground(Color.blue);
					count++;

				} else {
					area.setBackground(Color.white);
					count++;
				}
				if (count == 3) {
					area.setBackground(Color.yellow);
					count = 0; 
				}

			}
		});
		
		b3.addActionListener(new ActionListener() {
			int count2 = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 눌렀을때 바탕색이 바뀌어야한다.

				if (count2 == 1) {
					area.setForeground(Color.pink);
					count2++;

				} else {
					area.setForeground(Color.gray);
					count2++;
				}
				if (count2 == 3) {
					area.setForeground(Color.cyan);
					count2 = 0; 
				}

			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		문자판독기 name = new 문자판독기();

	}

}

