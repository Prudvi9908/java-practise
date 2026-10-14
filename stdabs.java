abstract class doctor{
    String name;
    int age;
    doctor(String name,int age){
        this.name=name;
        this.age=age;
    }
    abstract void card1();
    abstract void ent1();


}
class cardio extends doctor{
    cardio(String name,int age){
     super(name,age);
    }
    void card1()
 {
    System.out.println("im a cardio");
    System.out.println("name:"+name+" "+"age:"+age);
 }
 void ent1(){
    System.out.println("im an ent");
    System.out.println("name:"+name+" "+"age:"+age);
}
}



public class stdabs{
    public static void main(String[] args)
     {
        cardio car=new cardio("balu",26);
        car.card1();
    }
}