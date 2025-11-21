package module4.lessons.volatile_learn.tasks;

public class VolatileStopper implements Runnable {
    private volatile boolean running = true;

    @Override
    public void run() {
        running = true;
        System.out.println("Ishlayapman...");
        while (running) {
        }
        System.out.println(Thread.currentThread() + ":: finished !");

    }

    void stop() {
        running = false;
    }

    public static void main(String[] args) throws Exception {
        VolatileStopper s = new VolatileStopper();
        s.run();
        var thread = new Thread(s, "Thread1");
        var thread2 = new Thread(s, "Thread2");
        thread2.start();
        thread.start();
        Thread.sleep(1000);
        Thread.sleep(9100);
        s.stop();
    }
}
