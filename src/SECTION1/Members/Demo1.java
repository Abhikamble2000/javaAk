package SECTION1.Members;

public class Demo1 {

        static int k=10;
        static void test(){
            System.out.println("test method");
        }
        static void  info(){
            double result=10+45;
            System.out.println("info method");
            System.out.println("addition is:"+result);
        }

    public static void main(String[] args) {
        System.out.println("k values is:"+Demo1.k);
        Demo1.test();
        Demo1.info();
    }


}
