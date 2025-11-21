package module4.lessons.volatile_learn;

public class WithoutVolatile {
    public static void main(String[] args) throws InterruptedException {
        var runnable = new WithoutVolatileRunnable();
        var thread = new Thread(runnable, "Thread1");
        var thread2 = new Thread(runnable, "Thread2");
        thread2.start();
        thread.start();
        Thread.sleep(1000);
        runnable.stop();
    }

}

class WithoutVolatileRunnable implements Runnable {
    private boolean active;

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