package SECTION3.Object_class;

public class Demo1 {
    int bookId;
    String bookName;
    double bookPrice;
    public Demo1(int bookId,String bookName,double bookPrice){
        this.bookId=bookId;
        this.bookName=bookName;
        this.bookPrice=bookPrice;
    }

    @Override
    public String toString() {
        return bookId+"\t\t"+bookName+"\t"+bookPrice;
    }
}
