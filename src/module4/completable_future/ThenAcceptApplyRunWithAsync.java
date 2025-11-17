package module4.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class ThenAcceptApplyRunWithAsync {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread :: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Saikou";
        }, service).thenApplyAsync(name -> {
            System.out.println("Thread :: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return name + " Azamov";
        },service).thenAcceptAsync(fullName -> {
            System.out.println("Thread :: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Info " + fullName);
        },service).thenRunAsync(() -> {
            System.out.println("Thread :: " + Thread.currentThread().getName());
            System.out.println("Bye");
        },service);
        Thread.sleep(2000);
    }

}
