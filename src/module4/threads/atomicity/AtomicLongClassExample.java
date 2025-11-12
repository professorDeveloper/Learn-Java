package module4.threads.atomicity;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongClassExample {
    public static void main(String[] args) throws InterruptedException {
        var counter = new AtomicLong();
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + counter.incrementAndGet());
                try {
                    Thread.sleep(5);
                } catch (Exception ignored) {
                }
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(r).start();
        }
        Thread.sleep(2000);
        System.out.println(counter.get());
    }
}
