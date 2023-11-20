package 배열기본;

import java.util.Iterator;

public class 배열만들기타입별로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = {200,100,50,10};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]+ " ");
		}System.out.println();
		for (int x : age) {
			System.err.println(x+" ");
		}
		System.out.println();
		
		double[] weight = {99.9, 88.8, 77.7, 66.6};
		for (int i = 0; i < weight.length; i++) {
			System.out.println(weight[i]+ " ");
		}System.out.println();
		for (Double d : weight) {
			System.err.println(d+" ");
		}
		//이름
		String[] name = {"아빠","엄마","아들","딸"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+" ");
		}
		//성별
		char[] gender = {'남','여','남','여'};
		for (int i = 0; i < gender.length; i++) {
			char c = gender[i];
			System.out.println(c+ " ");
		}
		//아침여부
		boolean[] food = {true , false, true, false};
		for (boolean b : food) {
			System.out.println(b+" ");
		}
		}
}