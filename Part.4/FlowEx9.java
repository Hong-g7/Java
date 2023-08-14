package 연습.part4;

import java.util.Scanner;
public class FlowEx9 {
    public static void main(String[] args) {

        char grade = ' ';
        System.out.printf("당신의 점수를 입력하시오.");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        switch (score){
            case 100: case 99:
                grade = 'A';
                break;
            case 98: case 97:
                grade = 'B';
                break;
            default:
                grade = 'F';

        } System.out.println("당신의 성적은"+grade+"입니다.");
    }
}
