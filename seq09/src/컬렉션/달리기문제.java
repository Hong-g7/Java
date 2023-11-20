package 컬렉션;

import java.util.ArrayList;

public class 달리기문제 {

	public static void main(String[] args) {
		ArrayList run = new ArrayList();
		
		run.add("박소정");
		run.add("김정만");
		run.add("소지현");
		run.add("김개념");
		System.out.println(run);
		
		for (int i = 0; i < run.size(); i++) {
			System.out.println((1+i)+"등:"+run.get(i));
		}
		
		System.out.println("-----------");
		
		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.println((1+i)+"등:"+run.get(i));
		}
		System.out.println(run.contains("김정만"));
		System.out.println(run.indexOf("박소정")+1+"등");
		run.set(1,"소혜련");
		System.out.println(run);
		

	}

}
