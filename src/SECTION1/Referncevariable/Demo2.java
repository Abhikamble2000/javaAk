package SECTION1.Referncevariable;

public class Demo2 {
    String bookName;
    double bookPrice;
    void info(String name, double price){
        bookName=name;
        bookPrice=price;
    }
    void display(){
        System.out.println("book name:"+bookName);
        System.out.println("book price:"+bookPrice);
    }

    public static void main(String[] args) {
        Demo2 d=new Demo2();
        d.info("java",1500);
        d.display();

    }

}
