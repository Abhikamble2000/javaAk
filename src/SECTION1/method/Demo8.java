package SECTION1.method;

public class Demo8 {
    public static void main(String[] args) {
        Incriment();
    }
    static double calculateSal(double basic,double hra){
        basic=12000;
        hra=6000;
        double tSal=basic+hra;
        return tSal;
    }
    static void Incriment(){
        double ISal= calculateSal(12000,6000);
        double IncSal=ISal*0.25+ISal;
        System.out.println(IncSal);
    }
}
