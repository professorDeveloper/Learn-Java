package module4.lessons.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainBlockWithGet {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        withAsync();
        withSync();
    }

    private static void withSync() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> f = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 10;
        });
        System.out.println("Started");
        System.out.println(f.get());
        System.out.println("Finished");
    }

    private static void withAsync() {
        ExecutorService service = Executors.newFixedThreadPool(4);
        CompletableFuture<Integer> f = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 10;
        }, service);
        System.out.println("Started");

        f.thenAccept(result -> {
            System.out.println("Result = " + result);
        });

        System.out.println("Finished");
        service.shutdown();
    }
}
