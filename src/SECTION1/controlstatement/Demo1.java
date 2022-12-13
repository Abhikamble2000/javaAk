package SECTION1.controlstatement;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc1.next();
        System.out.println("enter your age");
        int age=sc1.nextInt();
        info(name,age);
    }
    static void info(String name,int age){
        if(age>=18){
            System.out.println(name+" your age is "+age+" you are eligible for voting ");
            //System.out.println("you are eligible for voting");
        }
        else {
            System.out.println(name+" your age is "+ age+ " you are not eligible for voting");
        }
    }
}
