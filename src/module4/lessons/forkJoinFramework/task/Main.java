package module4.lessons.forkJoinFramework.realTask;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        Order[] orders = new Order[100_000_000];
        for (int i = 0; i < orders.length; i++) {
            orders[i] = new Order(Math.random() * 1000);
        }
        OrderTask orderTask = new OrderTask(Arrays.stream(orders).toList(), 0, orders.length);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long begin = System.currentTimeMillis();
        forkJoinPool.invoke(orderTask);
        double join = orderTask.join();
        long end = System.currentTimeMillis();
        System.out.println(join + "::" + (end - begin));

        begin = System.currentTimeMillis();
        join = 0;
        for (Order order : orders) {
            join += order.getAmount();
        }
        end = System.currentTimeMillis();
        System.out.println(join + "::" + (end - begin));
    }
}
