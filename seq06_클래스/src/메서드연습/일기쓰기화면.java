package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기쓰기화면 {
	public static void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.yellow);
		f.setTitle("일기장쓰기 화면");
		f.setSize(600, 500);
		f.setLayout(new FlowLayout());

		Font font = new Font("궁서", Font.BOLD, 24);

		JLabel label1 = new JLabel("오늘의 날짜");
		label1.setFont(font);
		JTextField t1 = new JTextField(20);
		t1.setFont(font);
		t1.setForeground(Color.blue);

		JLabel label2 = new JLabel("오늘의 제목");
		label2.setFont(font);
		JTextField t2 = new JTextField(20);
		t2.setFont(font);
		t2.setForeground(Color.blue);

		JLabel label3 = new JLabel("오늘의 내용");
		label3.setFont(font);
		JTextArea t3 = new JTextArea(10, 20);
		t3.setFont(font);
		t3.setForeground(Color.blue);

		JButton saveButton = new JButton("파일에 일기 저장");
		saveButton.setFont(font);
		saveButton.setBackground(Color.pink);
		saveButton.setOpaque(true); // 불투명 true
		saveButton.setBorderPainted(false);// 버튼 주변의 테두리를 표시하지 않도록 설정

		f.add(label1);
		f.add(t1);
		f.add(label2);
		f.add(t2);
		f.add(label3);
		f.add(t3);
		f.add(saveButton);

		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				try {
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close();
					JOptionPane.showMessageDialog(f, "일기저장완료");
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
