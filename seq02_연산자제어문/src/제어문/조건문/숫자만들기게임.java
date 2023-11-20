package 제어문.조건문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자만들기게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		//int target = r.nextline(); //+-21억
		//int target = r.nextline(10); //0부터 지정한값보다 하나 적게설정 가능!
		//int target = r.nextline(100); //0부터 지정한값보다 하나 적게설정 가능!
		//0 -99 까
		int target = r.nextInt(99);
		// System.out.println(target); -> 정답을 보여주는 값!
		 while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력하시오");
			//데이터 타입이 동일해야 비교 가능하다.!
			int data2 = Integer.parseInt(data);
			if (target == data2) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("정답이 아닙니다.");
				//정답보다 높은지 낮은지 힌트를 주세요.!
				if(target>data2) {
					System.out.println("정답보다 작습니다.");
				}else {
					System.out.println("정답보다 큽니다.");
				}
			} 
		}

	}

}
