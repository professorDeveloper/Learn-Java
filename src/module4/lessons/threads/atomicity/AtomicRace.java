package module4.lessons.threads.atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicRace {
    private static class Counter {
        private AtomicInteger count = new AtomicInteger();

        public void increment() {
            count.incrementAndGet();
        }

        public int getCount() {
            return count.get();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }, "Thread 1");
        th1.start();
        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }, "Thread 2");
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
