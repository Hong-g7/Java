package seq10_형변환개념;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 참조형 형변환은 상속관계에서만 가능하다. 가변길이, 타입 여러개일 떄 사용
		// list = {a,b,c};
		// list = {b,c}; 데이터 변경이 있을 때 자리를 옮긴다.
		// list = {b,d,c}; 자리를 옮긴다.
		// 데이터 변경이 너무 많을 땐 불편함
		// ===>Arraylist를 권장

		ArrayList list = new ArrayList();
		list.add("나는스트링"); //object(큰)<--String(작)
		list.add(100);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		String s = (String)list.get(0); // object
		//cpu가 강제로 string 타입으로 변환해서 변수에 넣어줌 
		//강제형변환
		//casting(캐스팅)
		
		list.add(new JButton("냐는 버튼"));
		JButton b1 = (JButton)list.get(2);
		
	}

}
