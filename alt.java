
import java.util.Scanner;

public class alt{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr={1,2,3,4,5};
          for(int i=arr.length-1;i>0;i--){
             if(arr[i]<arr[i-1]){
                System.out.println(" not sorted");
                break;
             }
            
          }
          System.out.println("sorted");
         }
        }
