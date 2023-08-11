package 연습.part3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자하나를 입력하십시어.>");

        String input = sc.nextLine();
        ch = input.charAt(0);

        if ('0'<+ ch && ch <+ '9') {
            System.out.printf("입력하신 문자는 숫자입니다. %n");
        }

        if(('a'<+ ch && ch <+'z') || ('A'<+ ch && ch <+'z')) {
            System.out.printf("입력하신 문자는 영문자입니다. %n");
        }
    } //main
}
