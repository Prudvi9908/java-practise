

class busBooking{
    String name;
    String gender;
    String source;
    String destination;
    String date;
    double Price;

busBooking(String name,String gender,String source,String destination,String date) {
this.name=name;
this.gender=gender;
this.source=source;
this.destination=destination;
this.date=date;
// this.Price=Price;
    }
void show(){
    System.out.println("DETAILS"+" "+name+" "+gender+" "+source+" "+ destination+" "+date);
}
void price()
{
    if(source.equals("hyderabad"))
    {
       if(destination.equals("banglore"))
       {
        Price=1000;
        System.out.println("price:"+Price);
       }
    }
    else 
    {
       Price=800;
        System.out.println("price:"+Price);

    }
}
    
}
    public class travel{
        public static void main(String[] args) {
            busBooking b1=new busBooking("prudvi","male","banglore","hyderabad","23/09/26");
            b1.show();
            b1.price();

        }
    }