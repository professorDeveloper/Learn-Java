package module4.lessons.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FeatureMethodsExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> {
            System.out.println("Connecting to API...");
            Thread.sleep(2000);
            return "Response from API";
        });

        while (!future.isDone()) {
            System.out.println("Waiting for response...");
            Thread.sleep(200);
            future.cancel(true);
        }
        if (!future.isCancelled()) {
            System.out.println("Response is: " + future.get());
        } else {
            System.out.println("Response is cancelled");
        }

        executorService.shutdown();

    }
}
