public class constr{
    String name;
    String colour;
    constr(String n,String c){
      name=n;
      colour=c;
    }
    void details(){
        System.out.println(name+" "+colour);
    }
    public static void main(String[] args) {
        constr c1=new constr("hero","black");
        constr c2=new constr("pulsar","black");
        c1.details();
        c2.details();
    }
}