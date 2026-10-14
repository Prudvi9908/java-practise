class vehicle{
String fuel_type;
int seats;
vehicle(String fuel_type,int seats){
   this.fuel_type=fuel_type;
   this.seats=seats;

}
void vdetail(){
    System.out.println("vehicle info:"+fuel_type+" "+seats);
}

}

class car extends vehicle{
  String model;
  String colour;
  double price;
car(String fuel_type,int seats,String model,String colour,double price){
    super(fuel_type,seats);
    this.model=model;
    this.colour=colour;
    this.price=price;

  }
  void cdetails(){
    System.out.println("details:"+fuel_type+" "+ seats+" "+model+" "+colour+" "+price);
  }
}
public class inherit{
    public static void main(String[] args) {
       car c1=new car("cng",4,"hhyndai","black",200000);
       c1.cdetails();
       c1.vdetail();
    }
}