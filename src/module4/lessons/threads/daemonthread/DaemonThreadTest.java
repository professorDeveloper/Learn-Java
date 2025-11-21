package module4.lessons.threads.daemonthread;

public class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 40; i++) {
                    System.out.println("Thread active count: " + Thread.activeCount() + ", i= " + i);
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
        var th1 = new Thread(runnable);
        th1.setDaemon(true);
        th1.start();
        System.out.println("Hello pdp");
        Thread.sleep(210);

    }
}
