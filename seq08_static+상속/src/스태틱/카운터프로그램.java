package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {
	public static int count; //전역변수라서 0으로 초기화가됨.

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 400);

		// FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout());

		JButton plus = new JButton("1더하기");
		JButton minus = new JButton("1빼기");
		JButton reset = new JButton("0으로초기화");
		JLabel number = new JLabel("0");
		number.setForeground(Color.red);

		Font font = new Font("궁서", Font.BOLD, 50);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);

		number.setFont(new Font("궁서", Font.BOLD, 150));

		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count+" ");
				
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count=0;
				number.setText(count+" ");
				
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count+" ");
				
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		// public class JFrame{
		// public String title;

		// public JFrame(String title) {
		// this.title=title;
		// }
	}

}
