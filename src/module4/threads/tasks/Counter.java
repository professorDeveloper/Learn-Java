package module4.threads.tasks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class Counter {
    private int count;
//    private final Lock lock = new ReentrantLock();

    public Counter(int count) {
        this.count = count;
    }


    public int addCount() throws InterruptedException {
//        lock.lock();
        try {
            count++;
            Thread.sleep(10);
            return count;
        } finally {
//            lock.unlock();
        }

    }


}

class RaceCounterApp {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        Thread th1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(30);
                    System.out.println(counter.addCount());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread 1");
        th1.start();
        Thread th2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                    System.out.println(counter.addCount());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread 2");
        th2.start();
        Thread th3 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(50);
                    System.out.println(counter.addCount());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread 3");
        th3.start();
    }

}
