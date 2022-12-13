package PRATICES;
//factorial program
public class Prog4 {
    public static void main(String[] args) {
        int i,fact=1;
        int number=10;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+number+" is :"+fact);
    }
}
