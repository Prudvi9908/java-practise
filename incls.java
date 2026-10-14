class a{
    class b{
        void display(){
            System.out.println("inner class");
        }
    }
   
    void show(){
        System.out.println("outer class");
        
    }
    void outer(){
         b b1=new b();
    b1.display();
    }
}



public class incls{
    public static void main(String[] args) {
        a a1=new a();
        a1.show();
        a1.outer();
        // a.b b1 =new a().new b();
        // b1.display();
    }
}