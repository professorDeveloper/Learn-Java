package module3.lesson.queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        var pq =new PriorityQueue<String>();
        pq.add("Hello");
        pq.add("World");
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
    }
}
