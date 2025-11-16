package module4.completable_future;

import java.util.concurrent.CompletableFuture;

public class AnotherWayThenAcceptRunApply {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Saikou";
        }).thenApply(name -> {
            System.out.println("Processing...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return name + " Azamov";
        }).thenAccept(fullName -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Info " + fullName);
        }).thenRun(() -> {
            System.out.println("Bye");
        });
        Thread.sleep(2000);
    }
}
