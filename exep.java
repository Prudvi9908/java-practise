
public class exep {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,8};
        try {
          System.out.println(arr[6]);
        } 
        catch(ArithmeticException e){
            System.out.println("divivde by zero");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
  
    }
}
