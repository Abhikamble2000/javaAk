package SECTION1.Scannersclass;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter Student name");
        String name=sc1.next();
        System.out.println("enter student roll no");
        int rollNo= sc1.nextInt();
        System.out.println("enter first subject  marks: ");
        double m1= sc1.nextDouble();
        System.out.println("enter second subject marks: ");
        double m2= sc1.nextDouble();
        System.out.println("enter third subject marks: ");
        double m3= sc1.nextDouble();
        totalMarks(m1,m2,m3);
    }
    static void totalMarks(double m1, double m2,double m3){
         double total= m1+m2+m3;
        System.out.println("the total marks are:"+total);
        double percent=total/3;
        System.out.println("percentage is: "+percent);
    }
}
