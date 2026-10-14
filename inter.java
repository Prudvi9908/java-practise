interface animal{
    public void eat();
    default void sleep(){
        System.out.println("slepping");
    }
    void run(); 
    static void swim(){
        System.out.println("i can");
    }

}
interface carni{
   void calm();
}
class dog implements animal,carni{
   public  void eat(){
    System.out.println("eat non-veg");
    }
    public  void run(){
    System.out.println("very fast");
    }
   public void calm(){
        System.out.println("im an saint");
    }
}
public class inter{
    public static void main(String[] args) {
        dog d1=new dog();
        d1.run();
        d1.eat();
        animal.swim();
        d1.sleep();
        d1.calm();
    }
}