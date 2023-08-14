package 연습.part4;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        System.out.printf("숫자하나를 입력하십시오.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input==0) {
            System.out.printf("입력하신숫자는 %d 이 맞습니다.", input);
        } else {
            System.out.printf("입력하신 숫자는 %d 이며 0이 아닙니다.", input);
        }
    }
}
