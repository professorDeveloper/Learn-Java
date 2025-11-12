package module4.threads.atomicity;

public class Counter {
    private int counter = 0;

    public void inc() {
        counter = counter + 1;
    }

    public static void main(String[] args) {
        // Thread 1 va Thread2 bir vaqtda implementatsiya bo`lsa race condition problem bo`ladi.
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(25);
                    counter.inc();
                    System.out.println(counter.counter);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    counter.inc();
                    Thread.sleep(50);
                    System.out.println(counter.counter);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }

}
