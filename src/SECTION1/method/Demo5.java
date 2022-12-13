package SECTION1.method;

public class Demo5 {
    public static void main(String[] args) {
    Bill(5,600,50);
    }
    static void Bill(int qty, double price,double charges){
        double total =qty*price;
        System.out.println(total);
        double gstAmt=total+total*0.05;
        System.out.println(gstAmt);
        double finalAmt=gstAmt+charges;
        System.out.println(finalAmt);
    }
}
