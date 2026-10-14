
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

// class demo2 implements Function<Integer, Integer>{
//  public Integer apply(Integer i){
//     return i*2;
//  } 
// }

public class maps {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,2,3,4,5,6);
        // Function<Integer,Integer> obj=new Function<Integer, Integer>(){
        //   public Integer apply(Integer i){
        //      return i*2;
        //   } 
        // };
          Function<Integer,Integer> obj=i->i*2;
             
         
        Stream<Integer> s1=l1.stream().filter(i->i%2==0).map(obj);
        s1.forEach(System.out::println);
        
    }
}
