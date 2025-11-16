package module4.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // one way for creating completable future
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
        }, executorService);
    }
}
