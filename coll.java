//collection   

import java.util.*;

public class coll {
    public static void main(String[] args) {
        List <Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(1,40 );
        l1.addFirst(90);
        l1.removeLast();

        System.out.println(l1);
        System.out.println(l1.size());
        l1.set(2, 60);
        System.out.println(l1);
        System.out.println(l1.reversed());
        System.out.println(l1.contains(50));
        System.out.println(l1.toString());
        
    }
}
