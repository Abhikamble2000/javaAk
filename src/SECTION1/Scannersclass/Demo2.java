package SECTION1.Scannersclass;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter first number");
        int n1=sc1.nextInt();
        System.out.println("enter second number");
        int n2= sc1.nextInt();
        addition(n1,n2);
        subtraction(n1,n2);
        multiplication(n1,n2);
        division(n1,n2);

    }
    static void addition(double n1,double n2){
        double result=n1+n2;
        System.out.println("addition  is :"+result);
    }
    static void subtraction(double n1,double n2){
        double result=n1-n2;
        System.out.println("subtraction is:"+result);
    }
    static void multiplication(double n1,double n2){
        double result=n1*n2;
        System.out.println("multiplication is:"+result);
    }
    static void division(double n1,double n2){
        double result=n1/n2;
        System.out.println("division is:"+result);
    }
}
