
import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        s1.add(10);
        s1.add(20);
         s1.add(30);
          s1.add(40);
           s1.add(220);
           System.out.println(s1);
          s1.remove(220);
          System.out.println(s1);
          System.out.println(s1.size());
          System.out.println(s1.contains(20));

    }
}
