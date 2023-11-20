package 스태틱;

public class 나의일과 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 3, "집");
		System.out.println(Day.count);
		Day day2 = new Day("여행", 4, "서울");
		System.out.println(Day.count);
		Day day3 = new Day("토익공부", 7, "카페");
		System.out.println(Day.count);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	
		System.out.println(Day.sum);
		System.out.println(Day.sum/Day.count);
	}

}
