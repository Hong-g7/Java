package 메서드기본;

import java.lang.reflect.Array;

public class 계산기2 {

	public int add(int x, int y) {
		return x + y;
	}

	public double add(int x, double y) {
		return x + y;
	}

    public double add(double x ,double y) {
		return x + y ;
    }
    public String add( String x, int y) {
		return x + y ;
	}
    public int[] add() {
    	int[] num = {1,2,3};
    	return num;
    }
}