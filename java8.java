
//     public void accept(Integer i){
//         System.out.println(i);

//     }
// }

import java.util.Arrays;
import java.util.List;

public class java8 {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,2,3,4);
//         Consumer<Integer> obj1= new Consumer<Integer>(){
//          public void accept(Integer i){
//              System.out.println(i);
//   }
//         };
// Consumer<Integer> obj1 = i -> System.out.println(i);
// obj1.accept(1);
l1.forEach(i->System.out.println(i));
 
       
    }
}
