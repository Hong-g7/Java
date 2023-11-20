package 메서드연습;

import java.io.FileWriter;
import java.io.IOException;

public class 파일에쓰기테스트 {

    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("text4.txt");
            file.write("hi" + "\n");
            file.write("hello" + "\n");
            file.write("goodbye" + "\n");
            file.close();
            System.out.println("파일이 정상적으로 생성되었습니다.");
        } catch (IOException e) {
            System.out.println("에러발생함: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
