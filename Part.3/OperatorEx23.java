package 연습.part3;

public class OperatorEx23 {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc".equals("abc"));
        System.out.printf("str1==\"abc\" ? %b%n", str1.equals("abc"));
        System.out.printf("str2==\"abc\" ? %b%n", str2.equals("abc"));

    }
}
