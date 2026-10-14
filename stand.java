


class customer extends Thread{
    String cname;
    String caddress;
    customer(String cname,String caddress){
       this.cname=cname;
       this.caddress=caddress; 
    }
     public void run(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    
     System.out.println("customer name is "+ cname +" and address "+caddress+" "+"your order is confirmed");
       }
}
class order extends Thread{
 String orderid;
 String item;
 double price;
 order(String orderid,String item,double price){
  this.orderid=orderid;
  this.item=item;
  this.price=price;

 }
 public void run(){
     try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    
    System.out.println("orderid"+orderid+" "+" and ur order is:"+item);
 }


}
class dpartner extends Thread{

    String dname;
    long phone;
    dpartner(String dname,long phone){
        this.dname=dname;
        this.phone=phone;


    }
    public void run(){
         try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }
    
        System.out.println("name:"+dname+" "+" and his number:"+phone);
    }

}
public class stand {
    public static void main(String[] args) {
        customer c1=new customer("prudvi","tata strive");
        order o=new order("xyz","cb",200);
        dpartner d1=new dpartner("prudvi",990860655);
        c1.start();
        o.start();
        d1.start();

    }
}
