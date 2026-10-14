class one extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("first");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }}
}
class two extends Thread{
    public void run(){
    for(int i=0;i<2;i++){   
   System.out.println("second");
   try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
}
}
 
public class thread1 {
    public static void main(String[] args) {
         one obj=new one();
         two obj1=new two();
         obj.start();
         obj1.start();
    }
}
