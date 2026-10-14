 class products{
    String name="ice cream";
    double price=100;
    int quantity=3;
    double total;
    void display(){
        System.out.println(name+" "+price+" "+quantity);
    }
    void total(){
         total= price*quantity;
        System.out.println(total);
    }
    void offer(){
        if(total>=500){
          System.out.println("after discount:"+(total-150));
        }else if(total>=300){
System.out.println("after discount:"+(total-70));
        }else{
            System.out.println("after discount:"+(total));
        }
    }
}

public class zepto{
public static void main(String[] args) {
    products p1=new products();
    p1.display();
    p1.total();
    p1.offer();

}
}