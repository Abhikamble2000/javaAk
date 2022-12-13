package SECTION1.variable;

public class Demo5 {
    public static void main(String[] args) {
        double basicSal=12000;
        double HRA=6000;
        double pf=800;
        double incentives=3000;
        double pTax=200;
        double netSal=basicSal+HRA+incentives-pf-pTax;
        System.out.println("net salary :"+netSal);
        double grossSal=basicSal+HRA+incentives;
        System.out.println("gross salary:"+grossSal);
    }
}
