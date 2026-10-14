
import java.util.Scanner;

class bank{
    static int balance=1000;
    void showBalance(){
        System.out.println("balance :"+balance);
    }
    void deposit( int n){
        balance+=n;
        System.out.println("amount deposited:"+n);
        System.out.println("total amount:"+balance);

    }
    void withdraw(int n){
        if(n>balance){
            System.out.println("insufficient balance");

        }else{
            balance-=n;
            System.out.println("amount withdrawn:"+n);
            System.out.println("total balance:"+balance);
        }
    }
}
public class atm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount");
        int amount=sc.nextInt();
        bank b1=new bank();
        b1.showBalance();
        b1.deposit(amount);
         


    }
}