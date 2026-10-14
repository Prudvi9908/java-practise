class parent{
void  mobile(String name){
    System.out.println("name"+name);
}


}
class child extends parent{
void mobile(String name,int storage){
System.out.println("name "+name+" storage "+storage+"gb");
}
}

public class ingri{
    public static void main(String[] args) {
        child c1=new child();
        c1.mobile("samsung");
          c1.mobile("Nokia",128);
    }
}