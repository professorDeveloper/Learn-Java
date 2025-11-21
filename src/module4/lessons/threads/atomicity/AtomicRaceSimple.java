package module4.lessons.threads.atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicRaceSimple {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Final count: " + count.get());
    }
}
