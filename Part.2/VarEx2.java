package part2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp= 0;
        System.out.printf("x:"+ x+ "y:"+y);
        tmp=x;
        x=y;
        y=tmp;
        System.out.printf("x:"+x+"y:"+y);
    }
}
