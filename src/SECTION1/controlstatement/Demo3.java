package SECTION1.controlstatement;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter first number");
        int n1= sc1.nextInt();
        System.out.println("enter second number");
        int n2= sc1.nextInt();
        compare(n1,n2);
    }
    static void  compare(int n1,int n2){
        if (n1>n2){
            System.out.println("first number is large");
        } else if (n1<n2) {
            System.out.println("second number is large");

        }
        else {
            System.out.println("both number are equal");
        }

    }
}
