package module4.lessons.volatile_learn;

public class FieldVisibilityProblem {
    public static void main(String[] args) throws InterruptedException {
        var runnable = new MyRunnable();
        var thread = new Thread(runnable, "Thread1");
        var thread2 = new Thread(runnable, "Thread2");
        thread2.start();
        thread.start();
        Thread.sleep(1000);
        runnable.stop();
    }
}

class MyRunnable implements Runnable {
    private volatile boolean active = false;

    @Override
    public void run() {
        active = true;
        while (active) {
        }
        System.out.println(Thread.currentThread() + ":: finished !");
    }

    public void stop() {
        active = false;
    }
}
