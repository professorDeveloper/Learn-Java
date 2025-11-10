package module4.workingWithThreads;

public class ThreadInterruption {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable, "Thread 1");
        thread.start();
        System.out.println("Hello pdp");
        thread.interrupt();
    }
}
