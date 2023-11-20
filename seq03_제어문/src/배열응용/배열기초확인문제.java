package 배열응용;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[200];

		a[0] = 1000;
		a[1] = 2000;
		a[2] = 3000;
		a[a.length - 1] = 5000;

		for (int i = 0; i < 200; i++) {
			int j = a[i];

		}
		for (int x : a) {
			System.out.println(x);
		}
		System.out.println();
		Double[] d = new Double[300];
		d[0] = 10.1;
		d[1] = 20.2;
		d[2] = 30.2;
		d[d.length - 1] = 50.5;

		for (int i = 0; i < 300; i++) {
			Double double1 = d[i];

		}
		for (Double x : d) {
			System.out.println(x);
		}
	}

}
