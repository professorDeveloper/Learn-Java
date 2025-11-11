package module4.tasks;

import static java.lang.Thread.sleep;

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }


    public synchronized int addCount() throws InterruptedException {
        int old = this.count;
        sleep(100);
        this.count = old + 1;
        return old;
    }


}

class RaceCounterApp {
    public static void main(String[] args) {
        Counter counter = new Counter(1);
        Thread th1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
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
                    Thread.sleep(200);
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
                    Thread.sleep(150);
                    System.out.println(counter.addCount());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread 3");
        th3.start();
    }

}
