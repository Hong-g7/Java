package part2;

public class VarEx4 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c ='A';

        int finger = 10;
        long big = 100_000_000_000L; // long big = 1000000000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL ;

        int octNum =010;
        int hexNum =0x10;
        int biNum =0b10;

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[-%5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
    }
}
