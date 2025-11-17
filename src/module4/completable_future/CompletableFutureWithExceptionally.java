package module4.completable_future;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureWithExceptionally {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        method();
        CompletableFuture<Integer> wrongFuture = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            if (random.nextBoolean()) {
                throw new RuntimeException("Something went wrong");
            }
            return 12 / 4;
        }).handle(
                (result, exception) -> {
                    if (exception != null) {
                        System.out.println("Exception: " + exception.getMessage());
                        return 0;
                    }
                    System.out.println("Result: " + result);
                    return result;
                });
    }


    private static void method() throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> wrongFuture = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            if (random.nextBoolean()) {
                throw new RuntimeException("Something went wrong");
            }
            return 12 / 4;
        }).exceptionally((exception) -> {
            System.out.println("Exception: " + exception.getMessage());
            return 0;
        });
        System.out.println(wrongFuture.get());
    }
}
