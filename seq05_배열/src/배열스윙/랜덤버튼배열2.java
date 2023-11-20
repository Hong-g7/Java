package 배열스윙;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(1600,800);
		f.setTitle("랜덤버튼배열2");
		f.setLayout(null);
		f.setBackground(Color.DARK_GRAY);
	
		
		JButton[] b = new JButton[500];
		for (int i = 0; i < b.length; i++) {
			b[i]= new JButton();
			b[i].setText("버튼"+i);
		}
		for (int i = 0; i < b.length; i++) {
			Random r = new Random();
			int x = r.nextInt(1000);
			int y = r.nextInt(900);
			b[i].setBounds(x, y, 100, 100); //위치 설정
			b[i].setBackground(Color.blue);
			b[i].setForeground(Color.red);
			b[i].setOpaque(true);//불투명 설정
			b[i].setBorderPainted(false);
			f.add(b[i]);
			b[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s =e.getActionCommand();//버튼위에 글자를 가지고 와줘요.!
					JOptionPane.showMessageDialog(f, s+"번을 클릭함.");
					
				}
			});
			
		}
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
