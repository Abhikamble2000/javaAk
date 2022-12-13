package SECTION1.method;

public class Demo6 {
    public static void main(String[] args) {
      mconvert(1);
      kmconvert(1000);
    }
    static void mconvert(double a){
        double result=a*1000;
        System.out.println(result+"\tmeter");
    }
    static void kmconvert(double b){
        double result=b*0.001;
        System.out.println(result+"\tkilometer");
    }
}
