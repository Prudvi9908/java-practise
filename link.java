import java.util.List;
import java.util.Vector;

public class link {
    public static void main(String[] args) {
        List <Integer> l1=new Vector<>();
        l1.add(20);
        l1.add(10);
        l1.add(40);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);
    }
}
