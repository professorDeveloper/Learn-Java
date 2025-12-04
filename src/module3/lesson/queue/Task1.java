package module3.lesson.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        queue.remove();
        queue.add(100);
        System.out.println(queue);
    }
}
