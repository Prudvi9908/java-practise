class vehicle{
  String type;
  int wheels;
  vehicle(String type,int wheels){
    this.type=type;
    this.wheels=wheels;
  }
  void details(){
    System.out.println("details:"+type+" "+wheels);
  }
}
class car extends vehicle{
    String model;
    String reg;
    car(String type,int wheels,String model,String reg){
        super(type,wheels);
        this.model=model;
        this.reg=reg;

    }
    void cdetails(){
         System.out.println("details:"+type+" "+wheels+" "+model+" "+reg);
    }
}

class bike extends vehicle{
   String model;
   String reg;
   bike(String type,int wheels,String model,String reg){
      super(type,wheels);
      this.model=model;
      this.reg=reg;
   }
   void bdetails(){
    System.out.println("details:"+type+" "+wheels+" "+model+" "+reg);
   }
}

public class hierar{
    public static void main(String[] args) {
        bike b1=new bike("electrial",2,"pulsar","ap26ce3953");
        b1.bdetails();
        b1.details();
        car c1=new car("petrol",4,"bmw","xx123");
        c1.cdetails();
        c1.details();
        }
}