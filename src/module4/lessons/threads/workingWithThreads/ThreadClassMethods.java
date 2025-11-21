package module4.lessons.threads.workingWithThreads;

public class ThreadClassMethods {
    public static void main(String[] args) throws InterruptedException {
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
        Thread thread1 = new Thread(runnable, "Thread One");
        Thread thread2 = new Thread(runnable, "Thread Two");
        thread1.start();
        thread1.join(1000);
        thread2.start();
        System.out.println("We don`t say Hello world!");
    }
}
