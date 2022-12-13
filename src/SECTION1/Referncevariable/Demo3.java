package SECTION1.Referncevariable;

public class Demo3 {
    void  gmail(){
        System.out.println("Accessing gmail");
    }

    public static void main(String[] args) {
        Demo3 d=new Demo3();
        d.gmail();
        Demo3 d1=d;
        d1.gmail();
    }
}
