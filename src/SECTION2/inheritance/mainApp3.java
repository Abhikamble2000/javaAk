package SECTION2.inheritance;

public class mainApp3 {
    public static void main(String[] args) {
        paramentemployee p1=new paramentemployee();
        p1.getinfo(101,3000);
        p1.getjob("Analyst");
        contractemployee c1=new contractemployee();
        System.out.println("===============");
        c1.getinfo(102,5000);
        c1.getdetail(24);

    }
}
