package module4.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      /*  // one way for creating completable future
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.complete("Hello");
        System.out.println(completableFuture.get());

        // second way for using completable future;
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        CompletableFuture.runAsync(() -> {
            System.out.println("Running Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello FromRunAsync");
        }, executorService);*/
        register();
        System.out.println(returnSuccessMessage());
        for (int i = 0; i < 10; i++) {
            System.out.println("Message " + i);
            Thread.sleep(20);
        }
    }

    private static String returnSuccessMessage() {
        try {
            Thread.sleep(500);
            return "Sucessfully Registered Check Your Email";
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void register() {
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        CompletableFuture.runAsync(() -> {
            System.out.println("User data sent to database :: Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("User data saved to database :: Thread: " + Thread.currentThread().getName());
        }, service);
        CompletableFuture.runAsync(() -> {
            System.out.println("Email Sending :: Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Email Sent :: Thread: " + Thread.currentThread().getName());
        }, service);
    }
}
