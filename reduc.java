
import java.util.Arrays;
import java.util.List;

// class demo4 implements BinaryOperator<Integer>{
//     public Integer apply(Integer i,Integer j){
//            return i+j;
//     }
// }

public class reduc {
  public static void main(String[] args) {
    List<Integer> l1=Arrays.asList(1,2,3,4,5,6);
    // BinaryOperator<Integer> obj=new BinaryOperator<Integer>(){
    //     public Integer apply(Integer i,Integer j){
    //        return i+j;
    // }
    // };
    
    int r=l1.stream().filter(i->i%2==0).reduce(0,(i,j)->i+j); 
    System.out.println(r);
    
  }
}
