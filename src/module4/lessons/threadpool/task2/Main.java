package module4.lessons.threadpool.task2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MultipleTaskService service = new MultipleTaskService();
        service.executeTask(() -> {
            try {
                System.out.println("Task 1 is running with Runnable");
                Thread.sleep(1000);
                System.out.println("Task 1 is Done with Runnable");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        Future<String> future = service.submitTask(() -> {
            try {
                System.out.println("Task 2 is running with Callable");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Task 2 is Done with Callable";
        });

        System.out.println(future.get());
        service.shutDown();
    }
}
