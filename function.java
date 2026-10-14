
import java.util.Scanner;

class fun{
     public int sum(int a,int b){
            return a+b;
        }
}
public class function{
    public static int mul(int a,int b){
        return a*b;
    }
    public void greet(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
       fun f1=new fun();
       function f2=new function();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a and b values");
       int a=sc.nextInt();
       int b=sc.nextInt();

       System.out.println(f1.sum(a,b));
       f2.greet();
         System.out.println(mul(a,b ));
       
    }
}