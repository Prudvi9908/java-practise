
import java.util.Scanner;

public class arr{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        System.out.println("enter arr elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int min=arr[0];
        System.out.println("elements are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    System.out.println("\n reverse");
    for(int i=n-1;i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }
    }
}