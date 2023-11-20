package 컬렉션;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		// 1.set
		HashSet trip = new HashSet(5);
		trip.add("파리");
		trip.add("뉴욕");
		trip.add("런던");
		trip.add("서울");
		trip.add("도쿄");
		trip.add("도쿄");
		System.out.println(trip);

		// 2. map
		HashMap room = new HashMap();
		room.put("안방", "tv");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		room.put("거실", "쇼파");

		System.out.println(room);
		System.out.println(room.get("현관"));
		System.out.println(room.replace("거실", "책상"));
		System.out.println(room);

		// 3. list
		LinkedList todo = new LinkedList();
		todo.add("밥먹기");
		todo.add("손씻기");
		todo.add("샤워하기");
		todo.add("운동가기");
		todo.add("토익공부하기");
		System.out.println(todo);
		System.out.println(todo.get(0));
		System.out.println(todo.get(todo.size()-1));
		todo.set(1, "청소");
		System.out.println(todo);

	}
}
