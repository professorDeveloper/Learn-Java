package module4.lessons.threads.workingWithThreads;

import module4.lessons.threads.daemonthread.ExceptionHandler;

public class ThreadInterruption {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler());
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread = new Thread(runnable, "Thread 1");
        thread.start();
        System.out.println("Hello pdp");
        thread.interrupt();
    }
}
