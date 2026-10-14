 class one implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){

        System.out.println("one");
      try {
          Thread.sleep(5000);
      } catch (Exception e) {
      }
        }
    }
 }
public class interth {
    public static void main(String[] args) {
        one o=new one();
        Thread t1=new Thread(o);
        t1.start();
        
    }
}
