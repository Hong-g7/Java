package 연습.part4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();
        if(score>=90) {
            grade = 'a';
        } else if (score>=80) {
            grade = 'b';
        } else if (score>=70) {
            grade = 'c';
        } else {
            grade = 'd';
        } System.out.printf("당신의 학점은"+grade+"입니다.");
    }
}
