package module4.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class ThenApplyTheAcceptThenRun {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> lastNameCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Thread: " + Thread.currentThread().getName());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Azamov";
        });
        CompletableFuture<String> fullNameCompletableFuture = lastNameCompletableFuture.thenApply(name -> {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Saikou " + name;
        });
        System.out.println(fullNameCompletableFuture.get());
        CompletableFuture<Void> voidCompletableFuture = fullNameCompletableFuture.thenAccept(name -> {
            System.out.println("My name is " + name);
        });
        voidCompletableFuture.thenRun(() -> {
            System.out.println("Bye");
        });
        Thread.sleep(1000);

    }
}
