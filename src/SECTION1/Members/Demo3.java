package SECTION1.Members;

import java.util.Scanner;

public class Demo3 {
      static double pi=3.14;
      void area(double radius){
        double result=pi*radius*radius;
        System.out.println("area"+result);

    }
    void circumFernce(double radius){
        double result=2*pi*radius;
        System.out.println("area"+result);

    }

    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter radius");
        double radius= sc1.nextDouble();
        System.out.println("select mode");
        System.out.println("1:area");
        System.out.println("2:circumfernce");
        int choice= sc1.nextInt();
        if(choice==1){
            new Demo3().area(radius);
        } else if (choice==2) {
            new Demo3().circumFernce(radius);

        } else {
            System.out.println("invalid choice");
        }
    }
}
