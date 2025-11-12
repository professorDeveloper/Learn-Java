package module4.threads.atomicity;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntTask {
    public static void main(String[] args) throws InterruptedException {
        var counter = new AtomicInteger();
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {

                System.out.println(Thread.currentThread().getName() + " -> " + counter.incrementAndGet());
                try {
                    Thread.sleep(1);
                } catch (Exception ignored) {
                }
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(r).start();
        }
        Thread.sleep(2000);
        System.out.println(counter.get());
        Random random = new Random();
        int b = random.nextInt(9000, 11000);
        System.out.println(b);
//        counter.set(Math.max(counter.get(), b));
        counter.accumulateAndGet(b,Math::max);
        System.out.println(counter.get());
    }
}
