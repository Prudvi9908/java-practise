interface i{
    int add(int a,int b); 
   
}
interface j{
     int sub(int a, int b);
}


public class anon{
public static void main(String[] args) {
  i obj= (int a,int b)->a+b;
  j obj1=(int a, int b)->a-b;
  System.out.println(obj.add(9,8));
  System.out.println(obj1.sub(7,1));
}
}