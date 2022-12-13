package SECTION1.Members;

public class Demo2 {
    int j=20;
    void info(){
        System.out.println("info method");
    }


    public static void main(String[] args) {
        System.out.println("j value"+new Demo2().j);
        new Demo2().info();
    }

    }
