package SECTION1.controlstatement;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter any number");
        int n1= sc1.nextInt();
        check(n1);
    }
     static void check(int n1){
        if (n1%2==0){
            if (n1>0){
                System.out.println("it is a positive number");
                System.out.print("this is even number");
            }


        }
        if (n1%2!=0 ) {
            if (n1<0){
                System.out.println("it is a negative number");
                System.out.println("this is odd number");
            }



        }
        if (n1==0) {
            System.out.println("it is a constant");

        }
     }
}
