package module4.threads.workingWithThreads;

public class ThreadPriorities {
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(() -> {
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread for test");
        th1.setPriority(8);
        th1.start();
        System.out.println(th1.getPriority());
    }
}
