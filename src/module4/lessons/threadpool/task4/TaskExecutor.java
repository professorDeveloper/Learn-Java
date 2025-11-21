package module4.lessons.threadpool.task4;

import java.util.concurrent.*;

public class TaskExecutor {
    private final ExecutorService executor;

    public TaskExecutor() {
        executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    public <T> T executeTask(Callable<T> task) {

        Future<T> future = executor.submit(task);

        try {
            System.out.println("Is task done? " + future.isDone());

            T result = future.get();

            System.out.println("Task finished. Result = " + result);

            return result;

        } catch (InterruptedException | ExecutionException ignored) {
        }
        return null;
    }

}
