package SECTION1.variable;

public class Demo4 {
    public static void main(String[] args) {
        int qty=20;
        double price=600;
        double total=qty*price;
        System.out.println("total:"+total);
        double discount=total*0.1;
        System.out.println("discount:"+discount);
        double finalAmt=total-discount;
        System.out.println("final Amount:"+finalAmt);
    }
}
