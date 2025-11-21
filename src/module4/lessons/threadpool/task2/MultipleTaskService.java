package module4.lessons.threadpool.task2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleTaskService {
    private final ExecutorService service;

    public MultipleTaskService() {
        service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    public void executeTask(Runnable run) {
        service.execute(run);
    }

    public <T> Future<T> submitTask(Callable<T> callable) {
        return service.submit(callable);
    }

    public void shutDown() {
        service.shutdown();
        System.out.println("Service shut down");
    }

}
