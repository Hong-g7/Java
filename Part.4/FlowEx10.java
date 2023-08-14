package 연습.part4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int a = 0;

        System.out.printf("*을 출력할 라인의 수를 입려가세요.");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        a = Integer.parseInt(tmp);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j<i; j++){
                System.out.printf("*");}
            System.out.println();
        }
    }
}