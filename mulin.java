class animal{
String type;
String name;
animal(String type,String name)
{
this.type=type;
this.name=name;
}
void details(){
    System.out.println("deteails:"+type+" "+name);
}
}
class dog extends animal{
   String breed;
   dog(String type,String name,String breed){
super(type,name);
this.breed=breed;
   }
   void ddetails(){
        System.out.println("deteails:"+type+" "+name +" "+breed);
   }
}
class baby extends dog{
 String colour;
 baby(String type,String name,String breed,String colour){
   super(type,name,breed);
   this.colour=colour;
 }
 void babdetails(){
    System.out.println("deteails:"+type+" "+name +" "+breed+" "+colour);
 }
}


public class mulin{
    public static void main(String[] args) {
        baby b1=new baby("non-veg","dog","rotveller","black");
        b1.babdetails();
        b1.ddetails();
        b1.details();
    }
}