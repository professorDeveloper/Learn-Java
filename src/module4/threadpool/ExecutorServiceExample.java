package module4.threadpool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService service = Executors.newFixedThreadPool(10); // Fixed orqali ochilgan thread pool   appda exception bo`lmasa u o`lmaydi.
//        for (int i = 0; i < 200; i++) {
//            final int i1 = i;
//            Runnable r = () -> System.out.println("Thread " + Thread.currentThread().getName() + " is running"+ "taskID: " + i1);
//            Thread.sleep(5);
//            service.execute(r);
//        }
////        service.execute(()->{
////            System.out.println(
////                    "Fuck all"
////            );
////        });
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 200; i++) {
            final int i1 = i;
            Thread.sleep(5);
            Runnable r = () -> System.out.println("Thread " + Thread.currentThread().getName() + " is running" + "taskID: " + i1 + " Date: " + new Date().toString());
            service.submit(r);
        }

        service.shutdown();// Shutdowndan keyin yangi execute bo`lmaydi.
        if (service.awaitTermination(1, TimeUnit.SECONDS)) {// 1 sekunddan keyin ishga tushadi.
            service.shutdownNow();
        }

    }
}
