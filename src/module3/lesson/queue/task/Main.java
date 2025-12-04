package module3.lesson.queue.task;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        var users = new PriorityQueue<User>();
        users.add(new User("Test1", "+998990000000", 16));
        users.add(new User("Test2", "+998990101121", 21));
        System.out.println(users.poll());
        System.out.println(users.peek());
    }
}
