package 제어문.조건문;

import java.util.Random;

public class 랜덤Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		//int target = r.nextline(); //+-21억
		//int target = r.nextline(10); //0부터 지정한값보다 하나 적게설정 가능!
		//int target = r.nextline(100); //0부터 지정한값보다 하나 적게설정 가능!
		//0 -99 까
		int target = r.nextInt(99);
		System.out.println(target);

	}

}
