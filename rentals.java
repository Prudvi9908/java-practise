class rental{
    String name;
    String proof;
    int nodays;
    double pricePerDay;
    double total;
    rental(String name,String proof,int nodays,double pricePerDay){
      this.name=name;
      this.proof=proof;
      this.nodays=nodays;
      this.pricePerDay=pricePerDay;
    }
   void details(){
    System.out.println(name+" "+proof+" "+nodays+" "+pricePerDay);
   }
   void total(){
    total=nodays*pricePerDay;
    System.out.println("total "+name+ " price:"+(total));
    if(nodays>=5){
        total=total-((pricePerDay*0.10)*nodays);
        System.out.println("after discount "+total);
    }
   }
}

public class rentals{
    public static void main(String[] args) {
        rental r1=new rental("prudvi","licence",3,300);
        rental r2=new rental("balu","licence",5,300);
        r1.details();
        r2.details();
        r1.total();
        r2.total();
    }
}