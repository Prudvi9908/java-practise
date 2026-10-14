
import java.util.ArrayDeque;


public class arrdeq {
    public static void main(String[] args) {
        ArrayDeque <Integer> q1=new ArrayDeque<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.isEmpty());
        System.out.println(q1.size());
        System.out.println(q1.contains(30));
    }
}
