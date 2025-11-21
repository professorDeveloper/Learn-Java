package module4.lessons.threads.workingWithThreads;

public class ThreadInterruptException {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 9; i++) {
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(Thread.currentThread() + " -> " + i);
            }
        };
        Thread thread = new Thread(runnable, "Thread 1");
        thread.start();
        System.out.println("Hello GG");
    }
}
