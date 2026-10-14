
import java.util.PriorityQueue;
import java.util.Queue;

public class queu {
    public static void main(String[] args) {
        Queue <Integer> q1=new PriorityQueue<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(40);
        q1.offer(50);
        q1.poll();
        System.out.println(q1.peek());
        System.out.println(q1);
        
    }
}
