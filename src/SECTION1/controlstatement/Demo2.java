package SECTION1.controlstatement;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner (System.in);
        System.out.println("enter your name");
        String name=sc1.next();
        System.out.println("enter your roll no");
        int rooNo= sc1.nextInt();
        System.out.println("enter first subject marks");
        double m1= sc1.nextDouble();
        System.out.println("enter second subject marks");
        double m2= sc1.nextDouble();
        System.out.println("enter third subject marks");
        double m3= sc1.nextDouble();
        info(m1,m2,m3);
    }
    static void info(double m1, double m2,double m3){
        double total=m1+m2+m3;
        System.out.println("total marks:"+total);
        double per=total/3;
        if (per>=80){
            System.out.println("you are pass with very good marks"+"\n"   +"your percentage is:"+per);
        } else if (per>=60) {
            System.out.println("you are pass with good marks"+"\n"+"your percentage is:"+per);

        } else if (per>=40) {
            System.out.println("you are pass"+"\n"+"your percentage is:"+per);

        }
    }
}
