package 메서드활용;

public class 내카페4 {

    public static void main(String[] args) {
        cal4 bb = new cal4();
        int t1 = bb.sum(5,2000);
        System.out.println("커피가격은>>"+t1);
        
        cal4 bb2 = new cal4();
        int t2 = bb2.sum(2, 3000);
        System.out.println("밀크티 가격은>>"+t2);
        
        cal4 bb3 = new cal4();
        int t3 = bb2.total(t1, t2);
        System.out.println("음료 총 가격은>>"+t3);

        cal4 bb4 = new cal4();
        int t4 = bb2.div(t3, 7);
        System.out.println("1인당 결제금액은 >>"+t4);
        
        
    }
}
