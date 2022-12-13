package SECTION1.Referncevariable;

public class Demo1 {
    int i=20;
    void test(){
        System.out.println("test method");
    }

    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        System.out.println("i:"+d1.i);
        d1.test();
        Demo1 d2=new Demo1();
        System.out.println(d1);
        d2.test();
        System.out.println(d2);
    }
}
