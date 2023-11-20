package 배열응용;

import java.util.Arrays;

public class 깊은복사성적문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sub = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		// 배열의 깊은 복사 이용
		int[] term2 = { 22, 66, 88, 99, 100 };
		// 0번 전체학기 성적 프린트
		System.out.println(Arrays.toString(term1));
		System.out.println(Arrays.toString(term2));
		// 1번 1학기,2학기 성적중 동일한 성적 과목수
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count++;
			}
		}
		System.out.println("동일한 성적과목수는>>" + count);
		// 2번 2학기 성적중 오른 과목수
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count2++;
				System.out.println("2학기 성적이 오른 인덱스 :"+i);
				System.out.println("2학기 성적이 오른 과목 :" +sub[i]);// 3번 1학기,2학기 성적 중 오른 과목명
				
			}
		}
	}

}
