package 연습.part4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        System.out.printf("성적을 입력하십시오:%n");
        int score = 0;
        char grade = ' ', opt = '0';
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();
        System.out.printf("당신의 점수는%d입니다.%n",score);

        if(score>=90){
            grade = 'A';
            if(score>=98){
                opt = '+';
            } else if (score<94) {
                opt = '-';
            }
        } else if (score>=80) {
            grade = 'B';
            if (score>=88){
                grade = '-';
            } else if (grade<84) {
                opt = '-';
            } else {
                grade = 'c';
            }

        }
        System.out.printf(" 당신의 학점은 %c%c 입니다.",grade,opt );

    }
}
