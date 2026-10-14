class person{
  String name="Ajay";
  int age=24;
}
class dog{
    String name="tommy";
    String color="black";
}
public class oopss{
public static void main(String[] args) {
    person p1=new person();
    dog d1=new dog();
    System.out.println("name"+d1.name);
    System.out.println("name:"+p1.name);
    System.out.println("age:"+p1.age);
}
}