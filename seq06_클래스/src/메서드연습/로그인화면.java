package 메서드연습;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("로그인화면");
		f.setSize(400,900); // void

		// 라벨3개, 텍스트필드2개, 버튼2개
		
		JLabel top = new JLabel();
		
		//top.setText("<<<이미지들어가는 곳>>>"); // void
		
		JLabel id1 = new JLabel();
		id1.setText("ID: ");
		JLabel pw1 = new JLabel();
		pw1.setText("PW: ");

		JTextField id2 = new JTextField(10);
		JTextField pw2 = new JTextField(10);

		JButton login = new JButton();
		login.setText("로그인");
		JButton reset = new JButton();
		reset.setText("지우기");
		
		// 레이아웃 flowlayout
		
		// 폰트
		
		Font font = new Font("맑은 고딕", 1, 35);
		top.setFont(font);
		id1.setFont(font);
		pw1.setFont(font);
		id2.setFont(font);
		pw2.setFont(font);
		login.setFont(font);
		reset.setFont(font);

		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		top.setIcon(icon1);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // void

		f.add(top); // void
		f.add(id1); // 라벨
		f.add(id2); // 텍스트필드
		f.add(pw1); // 라벨
		f.add(pw2); // 텍스트필드
		f.add(login); // 버튼
		f.add(reset); // 버튼

		// 버튼에 이벤트 기능을 붙혀주는것
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// login버튼을 눌렀을 떄 실행할 내용을 넣어주세요.
				// 버튼 하나당 함수 하나로 매칭!!
				System.out.println("로그인버튼 클릭함");
				// 1. id2, pw2에서 입력한 데이터를 가지고온다
				String id3 = id2.getText();
				String pw3 = pw2.getText();
				// 2. id2의 값이 root 인지, pw2의 값이 1234인지 확인
				// 둘다맞으면 맞다 출력 둘중 하나라도 틀리면 틀려요 출력
				if (id3.equals("root") && pw3.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인성공했어요.");
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인에 실패했습니다 다시입력하십시오.");
				}
			}
		}); // login 끝나는부분

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("리셋버튼 클릭함");
				// 1. id2,pw2 내용을 지우기
				id2.setText(" ");
				// void <--> string id3 = id2.gettext(): void xxx
				pw2.setText(" ");
			}
		});// reset 끝나는부분

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 위에서 설정한 것을 다 보여라.!
		f.setVisible(true); // void
	}
}