
import java.util.Collections;
import java.util.PriorityQueue;

public class useOfPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(7);
        pq.add(4);
        System.out.println(pq);

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
    }
    
}
