package 컬렉션;

import java.util.HashMap;

public class 맵연습1 {

	public static void main(String[] args) {
		//map - 맵핑시킨다. 연결시킨다.
		// 키 : 값의 쌍으로 맵핑시켜서 연결시켜 저장한다.
		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melon", "멜론");
		map.put("ice", "아이스크림");
		
		System.out.println(map);
		System.out.println(map.get("apple"));
		map.put("apple", "파란사과");
		System.out.println(map);
		map.replace("ice", "아이스크림");
		System.out.println(map);
	}

}
