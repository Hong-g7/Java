package 배열기본;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		
		//반복해서 저장해야하는 공간은 (반복변수)는 배열을 사용해야한다.
		int[] n3 = new int[3];
		
		for (int i = 0; i < 3; i++) {
			// TODO Auto-generated method stub
			//입력5개 받아서 --> 저장 --> 꺼내서 누적연
			String n = JOptionPane.showInputDialog("숫자입력");//"100" ram에는 str형식으로 저장됨
			//입력한 값을 string으로 프로그램 안으로 가지고 오는 것  까지.
			n3[i] = Integer.parseInt(n);
			//int n2;//Integer.parseInt(n); cpu에서 숫자형식으로 변환함
		}//for배열에 저장
		//출력 --> 내용만 확인 가능
		//String list = Arrays.toString(n3);
		//syso(list);
		System.out.println(Arrays.toString(n3));
		
		int sum = 0;
		for (int x : n3) {
			sum = sum +x;
		}
		System.out.println((double)sum/n3.length);
	}

}
