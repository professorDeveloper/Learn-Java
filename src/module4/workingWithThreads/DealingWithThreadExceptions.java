package module4.workingWithThreads;

public class DealingWithThreadExceptions {
    public static void main(String[] args) throws InterruptedException {
        var th1 = new MyThread("Thread 1");
        var th2 = new MyThread("Thread 2");
        var th3 = new MyThread("Thread 3");
        th1.start();
        th2.start();
        th3.start();
        Thread.sleep(120);
        throw new RuntimeException("Main thread interrupted");
    }
}

class MyThread extends Thread {
    private final String name;

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
            if (name.equalsIgnoreCase("thread 1") && i == 3) {
                throw new RuntimeException("Thread interrupted");
            } else System.out.println(this);
        }
    }

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "-> ";
    }
}