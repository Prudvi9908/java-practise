import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();
        if(num>0){
            if(num%2==0){
                System.out.println("num is postive even");
            }else{
                System.out.println("num is postive odd");
            }
        }
        else{
            if(num%2==0){
                System.out.println("num is neg even");
        }else
        System.out.println("num is neg odd");
        }
    }
}