package module4.lessons.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousCalculator {
    private static final ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Calculator Started..");
        Thread.sleep(2000);

        CompletableFuture<Integer> plusFuture = plus(5, 5);
        CompletableFuture<Integer> minusFuture = minus(10, 5);
        CompletableFuture<Integer> multiplyFuture = multiply(5, 5);
        CompletableFuture<Integer> divideFuture = divide(10, 0);

        plusFuture.thenAccept(result -> {
            System.out.println("Plus: " + result);
        });
        minusFuture.thenAccept(result -> {
            System.out.println("Minus: " + result);
        });
        multiplyFuture.thenAccept(result -> {
            System.out.println("Multiply: " + result);
        });
        divideFuture.thenAccept(result -> {
            System.out.println("Divide: " + result);
        });

        System.out.println("This will show before divide");

        service.shutdown();
    }

    public static CompletableFuture<Integer> plus(int a, int b) {
        return CompletableFuture.supplyAsync(() -> a + b, service);
    }

    public static CompletableFuture<Integer> multiply(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Testing Async...");
            return a * b;
        }, service);
    }

    public static CompletableFuture<Integer> divide(int a, int b) {
        return CompletableFuture.supplyAsync(() -> a / b, service).handle((result, exception) -> {
            if (exception != null) {
                System.out.println("Exception: " + exception.getMessage());
                return 0;
            }
            return result;
        });
    }

    public static CompletableFuture<Integer> minus(int a, int b) {
        return CompletableFuture.supplyAsync(() -> a - b, service);
    }
}
