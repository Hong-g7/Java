package 연습.part4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.printf("주민번호를 입력하세요 %n");
        Scanner sc = new Scanner(System.in);
        String regN = sc.nextLine();
        char gender = regN.charAt(7);

        switch (gender){
            case '1': case '3':
                System.out.printf("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.printf("당신은 여자입니다.");
                break;
            default:
                System.out.printf(" 유효하지않은 번호입니다.");
        }
    }
}
