package 제어문.조건문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보지정 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int totalGames = 0;
        int myWins = 0;

        while (true) {
            int com = r.nextInt(3);
            System.out.println("0부터 2까지 숫자를 입력하시오.");
            int me = sc.nextInt();
            totalGames++;

            if (me >= 0 && me <= 2) {
                if (me == com) {
                    System.out.println("무승부!");
                } else if ((me == 0 && com == 2) || (me == 1 && com == 0) || (me == 2 && com == 1)) {
                    System.out.println("내가 승리!");
                    myWins++;
                } else {
                    System.out.println("컴퓨터가 승리!");
                }
            } else {
                System.out.println("0부터 2까지의 숫자를 입력하세요.");
            }

            System.out.println("그만하시겠습니까? (y/n)");
            String choice = sc.next();
            if (choice.equals("y")) {
                System.out.println("종료되었습니다.");
                System.out.println("전체 게임 횟수: " + totalGames);
                System.out.println("내 승리 횟수: " + myWins);
                break; // 루프 종료
            }
        }
    }
}
