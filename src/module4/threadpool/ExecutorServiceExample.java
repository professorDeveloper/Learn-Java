package module4.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 200; i++) {
            Runnable r = () -> System.out.println("Thread " + Thread.currentThread().getName() + " is running");
            Thread.sleep(5);
            service.execute(r);
        }
    }
}
