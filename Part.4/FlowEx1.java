package 연습.part4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일떄 , 참인것은%n", x);

        if(x==0) System.out.printf("x==0");
        if(x!=0) System.out.printf("x!=0");
        if(!(x==0)) System.out.printf("!(x==0)");
        if(!(x!=0)) System.out.printf("!(x!=0)");

        x = 1;
        System.out.printf("x=%d일떄, 참인것은%n,", x);
        if(x==0) System.out.printf("x!==0");
        if(x!=0) System.out.printf("x!=0");
        if(!(x==0)) System.out.printf("!(x==0");
        if(!(x!=0)) System.out.printf("!(x!=0)");
    }
}

