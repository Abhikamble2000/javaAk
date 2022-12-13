package SECTION1.method;
public class Demo4 {
    public static void main(String[] args) {
        System.out.println("main method");
        triangle(10,10);
        circle(10);
    }
    public static void triangle(double b,double h){
        double area=0.5*b*h;
        System.out.println("area of triangle:"+area);
    }
    public static void circle(double r){
        double area=3.14*r*r;
        System.out.println("area of circle:"+area);
    }
}
