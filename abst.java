abstract class demo{
abstract void fun();
}
class demo1 extends demo{
 void fun(){
    System.out.println("having fun");
 }
}
public class abst
{
    public static void main(String[] args) {
        demo1 obj=new demo1();
        obj.fun();
    }
}