class demo{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}


public class poly{
    public static void main(String[] args) {
        demo obj=new demo();
        obj.add(2,4);
        obj.add(2,5,6);
    }
}