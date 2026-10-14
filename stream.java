
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// class demo1 implements Predicate<Integer>
// {
//    public boolean test(Integer i) 
//    {
//     return i%2==0;
//    }
// }

public class stream {
   public static void main(String[] args) {
     List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8);
//      Predicate<Integer> p1=new Predicate<Integer>(){
//          public boolean test(Integer i) 
//    {
//             return i%2==0;
//    }
    //  };
     Stream<Integer> s1=l1.stream().filter(i->i%2==0);
     s1.forEach(System.out::println);
    //  System.out.println(s1);
    // s1.forEach( i-> System.out.println(i));
    // s1.forEach(System.out::println);

   }  
}
